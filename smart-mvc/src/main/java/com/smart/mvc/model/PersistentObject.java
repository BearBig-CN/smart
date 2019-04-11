package com.smart.mvc.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * 持久化基类
 *
 * @author Joe
 */
@Data
@ToString
public class PersistentObject implements Serializable {

    /**
     * 主键ID
     */
    private Integer id;
}