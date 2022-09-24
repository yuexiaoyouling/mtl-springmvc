package com.qfedu.mtl.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * @Description 响应异步请求的vo类
 * @Author 千锋涛哥
 * 公众号： Java架构栈
 */
@Data
@ToString
public class ResultVO {

    private int code;
    private String msg;
    private Object data;

    public ResultVO(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultVO(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

}
