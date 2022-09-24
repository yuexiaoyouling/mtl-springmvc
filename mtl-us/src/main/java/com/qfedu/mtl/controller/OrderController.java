package com.qfedu.mtl.controller;

import com.qfedu.mtl.beans.BasicInfo;
import com.qfedu.mtl.beans.Goods;
import com.qfedu.mtl.beans.Order;
import com.qfedu.mtl.beans.User;
import com.qfedu.mtl.service.BasicInfoService;
import com.qfedu.mtl.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Description
 * @Author 千锋涛哥
 * 公众号： Java架构栈
 */
@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private BasicInfoService basicInfoService;
    @Autowired
    private OrderService orderService;

    @RequestMapping("/create")
    public String createOrder(Goods goods, @RequestParam(defaultValue = "0") int price, String ids, Model model) {
        //basicInfoLlist 查询出来的就是当前商品（手机）选中的评估项及选项详情
        List<BasicInfo> basicInfoLlist = basicInfoService.listInfoDetailByIds(ids);
        model.addAttribute("goods", goods);
        model.addAttribute("ids", ids);
        model.addAttribute("price", price);
        model.addAttribute("basicInfoLlist", basicInfoLlist);
        return "trade";
    }

    @RequestMapping("/save")
    public String saveOrder(Order order, Integer goodsId, String ids, HttpServletRequest request) {
        //获取当前登录的用户id，存放到order
        User user = (User) request.getSession().getAttribute("user");
        order.setUserId(user.getUserId());
        String orderId = orderService.addOrder(order, goodsId, ids);
        if (orderId != null) {
            request.setAttribute("orderId", orderId);
            request.setAttribute("tips", "订单提交成功！");
        } else {
            request.setAttribute("tips", "订单提交失败！");
        }
        return "order-tips";
    }

}
