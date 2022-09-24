package com.qfedu.mtl.service.impl;

import com.qfedu.mtl.beans.Brand;
import com.qfedu.mtl.dao.BrandDAO;
import com.qfedu.mtl.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description 品牌业务实现
 * @Author 千锋涛哥
 * 公众号： Java架构栈
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandDAO brandDAO;

    public List<Brand> listBrandsByCategoryId(int categoryId) {
        return brandDAO.selectBrandsByCategoryId(categoryId);
    }
}
