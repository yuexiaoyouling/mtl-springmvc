package com.qfedu.mtl.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * @Description 分页帮助类
 * @Author 千锋涛哥
 * 公众号： Java架构栈
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PageInfo<T> {

    private int pageNum;
    private int pageCount;
    private int count;
    private int prePage;
    private int nextPage;
    private List<T> list;
    public static final int PAGE_SIZE = 8;

}
