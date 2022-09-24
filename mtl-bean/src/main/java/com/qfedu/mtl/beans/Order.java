package com.qfedu.mtl.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Description
 * @Author 千锋涛哥
 * 公众号： Java架构栈
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    //     order_id	订单编号
    private int userId;
    //    user_id	用户ID
    private String orderId;
    //    order_total_price	订单总价格
    private int orderTotalPrice;
    //    user_addr	用户地址信息
    private String userAddr;
    //    user_name	用户姓名
    private String userName;
    //    user_tel	用户电话
    private String userTel;
    //    create_time	订单创建时间
    private Date createTime;
    //    order_desc	订单备注
    private String orderDesc;
    //    retrieve_type	回收类型: 1 快递， 2 上门验收
    private int retrieveType;
    //    order_status	订单状态：1 新订单，2 待指派，3 已指派，4 已完成，5 已关闭，6 用户已寄出，7 平台验收中，8 验收通过，9 待退回，10 已退回，11 用户已取消
    private String payName;
    private String payAccout;
    private int orderStatus;
    //    send_logistics_name	寄送物流名称
    private String sendLogisticsName;
    //    send_logistics_id	寄送物流单号
    private String sendLogisticsId;
    //    order_processor	订单指派处理人
    private String orderProcessor;
    //    back_text	退回原因
    private String backText;
    //    back_logistics_name	退回物流名称
    private String backLogisticsName;
    //    back_logistics_id	退回物流单号
    private String backLogisticsId;

}
