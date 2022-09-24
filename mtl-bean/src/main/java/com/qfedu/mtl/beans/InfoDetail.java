package com.qfedu.mtl.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Description 评估项的选项
 * @Author 千锋涛哥
 * 公众号： Java架构栈
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class InfoDetail {

    private int infoDetailId;
    private String infoDetailName;
    private String infoDetailDesc;

}
