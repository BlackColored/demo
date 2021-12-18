package com.demo.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @version: V1.0
 * @author: AIOps
 **/
@Data
public class Groups implements Serializable {

    private Long id;
    private String groupName;

}
