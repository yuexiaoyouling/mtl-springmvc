package com.qfedu.mtl.service;

import com.qfedu.mtl.beans.BasicInfo;

import java.util.List;

/**
 * @Description 商品评估项业务处理
 * @Author 千锋涛哥
 * 公众号： Java架构栈
 */
public interface BasicInfoService {

    public List<BasicInfo> listInfoByGoodsId(int goodsId, int step);

    /**
     * 根据已经选中的选项ID查询选项详情 以及选项对应的评估项
     *
     * @return
     */
    public List<BasicInfo> listInfoDetailByIds(String ids);

}
