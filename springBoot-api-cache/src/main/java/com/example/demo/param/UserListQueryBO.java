package com.example.demo.param;

import lombok.Data;

import java.io.Serializable;

/**
 * @author mengq
 * @date 2020-04-29 16:13
 * @desc
 */
@Data
public class UserListQueryBO extends PageQueryBO implements Serializable {
    private static final long serialVersionUID = -8758578428651798120L;

    private String userName;

    private Integer status;
}