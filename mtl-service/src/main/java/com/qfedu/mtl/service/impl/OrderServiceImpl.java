package com.qfedu.mtl.service.impl;

import com.qfedu.mtl.beans.*;
import com.qfedu.mtl.dao.BasicInfoDAO;
import com.qfedu.mtl.dao.GoodsDAO;
import com.qfedu.mtl.dao.OrderDAO;
import com.qfedu.mtl.dao.OrderItemDAO;
import com.qfedu.mtl.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Description
 * @Author 千锋涛哥
 * 公众号： Java架构栈
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDAO orderDAO;
    @Autowired
    private GoodsDAO goodsDAO;
    @Autowired
    private OrderItemDAO orderItemDAO;
    @Autowired
    private BasicInfoDAO basicInfoDAO;

    @Transactional
    public String addOrder(Order order, int goodsId, String ids) {
        //1.生成订单编号（唯一性）
        String orderId = UUID.randomUUID().toString().replace("-", "");
        order.setOrderId(orderId);
        order.setCreateTime(new Date());
        //设置默认订单状态
        // 快递：1待寄送,2已寄出,3待检测, -- 4待付款,5已完成
        //                          --  6待退回,7待退回签收,8已退回
        // 上门：9待上门交易,5已完成
        // 取消订单： 10 已取消
        int orderStatus = order.getRetrieveType() == 1 ? 1 : 9;
        order.setOrderStatus(orderStatus);

        //2.保存订单
        int i = orderDAO.insertOrder(order);

        //3.保存快照
        if (i > 0) {
            Goods goods = goodsDAO.selectGoodsById(goodsId);
            List<BasicInfo> basicInfoList = basicInfoDAO.selectInfoDetailsByIds(ids);
            String goodsInfo = ""; //  颜色：白色 |
            for (int m = 0; m < basicInfoList.size(); m++) {
                BasicInfo basicInfo = basicInfoList.get(m);
                goodsInfo += basicInfo.getBasicInfoName() + ":";   // 配件：
                List<InfoDetail> infoDetailList = basicInfo.getInfoDetailList();
                for (int n = 0; n < infoDetailList.size(); n++) {
                    goodsInfo += infoDetailList.get(n).getInfoDetailName(); // 配件：耳机、数据线 |
                    if (n < infoDetailList.size() - 1) {
                        goodsInfo += "、";
                    } else {
                        goodsInfo += " | ";
                    }
                }
            }
            OrderItem orderItem = new OrderItem(0, orderId, goods.getGoodsId(), goods.getGoodsName(), goods.getGoodsImg(), goodsInfo, order.getOrderTotalPrice(), 0);
            int j = orderItemDAO.insertOrderItem(orderItem);
            if (j > 0) {
                return orderId;
            }
        }
        return null;
    }

}
