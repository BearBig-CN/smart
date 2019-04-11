package com.smart.mvc.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 键值对存储模型
 *
 * @author Joe
 */
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Item implements Itemable {

    private String label;
    private Object value;

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public Object getValue() {
        return value;
    }
}
