package com.qfedu.mtl.service.impl;

import com.qfedu.mtl.beans.Category;
import com.qfedu.mtl.dao.CategoryDAO;
import com.qfedu.mtl.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description 一级分类业务实现类
 * @Author 千锋涛哥
 * 公众号： Java架构栈
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDAO categoryDAO;

    public List<Category> listCategories() {
        List<Category> categoryList = categoryDAO.selectCategories();
        return categoryList;
    }

}
