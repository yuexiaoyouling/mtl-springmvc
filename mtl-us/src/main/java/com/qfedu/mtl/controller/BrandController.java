package com.qfedu.mtl.controller;

import com.qfedu.mtl.beans.Brand;
import com.qfedu.mtl.service.BrandService;
import com.qfedu.mtl.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.print.Book;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Author 千锋涛哥
 * 公众号： Java架构栈
 */
@Controller
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    //控制器方法参数如果是简单类型，请使用其对应的封装类
    //针对处理异步请求的方法，返回的数据需要封装状态码和数据——VO封装 ViewObject
    @ResponseBody
    @RequestMapping("/list")
    public ResultVO list(@RequestParam(defaultValue = "0") Integer categoryId) {
        List<Brand> brandList = brandService.listBrandsByCategoryId(categoryId);
        ResultVO vo = new ResultVO(0, "success", brandList);
        return vo;
    }

}
