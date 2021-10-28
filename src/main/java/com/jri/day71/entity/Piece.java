package com.jri.day71.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * piece
 * @author 
 */
@Data
public class Piece implements Serializable {
    private Integer id;

    private String name;

    private String gender;

    private String addr;

    private String info;

    private static final long serialVersionUID = 1L;
}