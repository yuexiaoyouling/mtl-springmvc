package com.qfedu.mtl.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description 品牌实体类
 * @Author 千锋涛哥
 * 公众号： Java架构栈
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Brand implements Serializable {

    private int brandId;
    private String brandName;
    private String brandLogo;
    private String brandDesc;
    private Date brandCreateTime;
    private int brandStatus;

}
