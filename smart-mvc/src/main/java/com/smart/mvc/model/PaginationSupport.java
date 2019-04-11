package com.smart.mvc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

/**
 * 分页基类
 *
 * @author Joe
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaginationSupport implements Serializable {

    /**
     * 默认显示页码数
     */
    public static final int DEFAULT_OFFSET_SIZE = 3;
    /**
     * 默认每页行数
     */
    public static final int DEFAULT_PAGE_SIZE = 20;

    /**
     * 显示页码数
     */
    private int offsetSize = DEFAULT_OFFSET_SIZE;
    /**
     * 每页行数
     */
    private int pageSize = DEFAULT_PAGE_SIZE;
    /**
     * 记录总数
     */
    private long rowCount;
    /**
     * 当前页码
     */
    private int pageNo = 1;

    /**
     * 第一条数据位置
     *
     * @return
     */
    public int getFirstResult() {
        return (pageNo - 1) * pageSize;
    }

    /**
     * 获取总页数
     */
    public long getPageCount() {
        if (rowCount % pageSize == 0) {
            return rowCount / pageSize;
        } else {
            return (rowCount / pageSize) + 1;
        }
    }

    public PaginationSupport(int pageNo, int pageSize) {
        this.pageSize = pageSize;
        this.pageNo = pageNo;
    }
}