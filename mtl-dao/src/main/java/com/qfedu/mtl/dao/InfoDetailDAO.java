package com.qfedu.mtl.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description
 * @Author 千锋涛哥
 * 公众号： Java架构栈
 */
public interface InfoDetailDAO {
    //  1
    // "1,3,58"
    public int countPriceInfoDetails(@Param("goodsId") int goodsId,
                                     @Param("ids") String ids);
}
