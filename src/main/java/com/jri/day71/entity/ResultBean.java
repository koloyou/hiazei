package com.jri.day71.entity;

import lombok.Data;

/**
 * Demo class
 *
 * @author hijri
 * @version V9.10
 * @date 2021/10/22
 */
@Data
public class ResultBean {

    private Integer code;
    private String message;
    private Object data;
}
