package com.qfedu.mtl.dao;

import com.qfedu.mtl.beans.Brand;

import java.util.List;

/**
 * @Description 品牌信息的数据库操作
 * @Author 千锋涛哥
 * 公众号： Java架构栈
 */
public interface BrandDAO {

    public List<Brand> selectBrandsByCategoryId(int categoryId);

}
