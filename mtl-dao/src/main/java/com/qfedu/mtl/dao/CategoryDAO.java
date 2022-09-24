package com.qfedu.mtl.dao;

import com.qfedu.mtl.beans.Category;

import java.util.List;

/**
 * @Description 定义一级分类的数据库操作
 * @Author 千锋涛哥
 * 公众号： Java架构栈
 */
public interface CategoryDAO {

    public List<Category> selectCategories();

}
