package com.qfedu.mtl.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description 訂單快照實體類
 * @Author 千锋涛哥
 * 公众号： Java架构栈
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {

    private int itemId;
    private String orderId;
    private int goodsId;
    private String goodsName;
    private String goodsImg;
    private String goodsInfo;
    private int goodsPrice;
    private int isComment;

}
