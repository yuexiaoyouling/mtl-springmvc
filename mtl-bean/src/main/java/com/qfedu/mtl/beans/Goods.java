package com.qfedu.mtl.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Description 商品实体类
 * @Author 千锋涛哥
 * 公众号： Java架构栈
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Goods {

    private int goodsId;
    private String goodsName;
    private String goodsImg;
    //价格  在程序处理及数据库存储中使用int类型，单位为分
    private int goodsCost;
    private int goodsMinPrice;

}
