package com.qfedu.mtl.dao;

import com.qfedu.mtl.beans.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description 完成商品信息的数据库操作
 * @Author 千锋涛哥
 * 公众号： Java架构栈
 */
public interface GoodsDAO {

    public List<Goods> selectGoodsByBrandIdWithPage(@Param("brandId") int brandId,
                                                    @Param("start") int start,
                                                    @Param("limit") int limit);

    public int selectCountByBrandId(int brandId);

    public Goods selectGoodsById(int goodsId);
}
