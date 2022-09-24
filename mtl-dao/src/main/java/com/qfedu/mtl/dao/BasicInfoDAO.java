package com.qfedu.mtl.dao;

import com.qfedu.mtl.beans.BasicInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description 商品评估项数据库操作
 * @Author 千锋涛哥
 * 公众号： Java架构栈
 */
public interface BasicInfoDAO {

    public List<BasicInfo> selectBasicInfosByGoodsId(@Param("goodsId") int goodsId,
                                                     @Param("step") int step);

    public List<BasicInfo> selectInfoDetailsByIds(String ids);
}
