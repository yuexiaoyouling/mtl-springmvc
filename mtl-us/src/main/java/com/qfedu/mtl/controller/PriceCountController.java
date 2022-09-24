package com.qfedu.mtl.controller;

import com.qfedu.mtl.beans.Goods;
import com.qfedu.mtl.beans.InfoDetail;
import com.qfedu.mtl.service.GoodsService;
import com.qfedu.mtl.service.PriceCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description 计算价格的控制器
 * @Author 千锋涛哥
 * 公众号： Java架构栈
 */
@Controller
@RequestMapping("/price")
public class PriceCountController {

    @Autowired
    private PriceCountService priceCountService;
    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/count")
    public String count(Integer goodsId, String property, String descId, Model model) {
        String ids = property + "," + descId;
        Goods goods = goodsService.getGoodsById(goodsId);
        int price = priceCountService.countPrice(goodsId, ids);
        //商品信息
        model.addAttribute("goods", goods);
        model.addAttribute("price", price);
        model.addAttribute("ids", ids);
        return "price";
    }

}
