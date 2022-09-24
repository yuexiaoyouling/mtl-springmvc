package com.qfedu.mtl.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * @Description 商品评估项（评估类目）
 * @Author 千锋涛哥
 * 公众号： Java架构栈
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BasicInfo {

    private int basicInfoId;
    private String basicInfoName;
    private int basicInfoStatus;
    private int basicInfoStep;

    private List<InfoDetail> infoDetailList;

}
