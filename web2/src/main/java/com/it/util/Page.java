package com.it.util;

import java.util.List;

public class Page<T> {
    /**
     * 数据总数
     */
    private Integer totalSize;
    /**
     * 总页数
     */
    private Integer totalPages;
    /**
     * 当前页码
     */
    private Integer pageNo;
    /**
     * 每页显示的数据量
     */
    private  Integer pageSize;
    /**
     *  当前页的数据
     */
    private List<T> items;
    /**
     * 获取当前页起始行数
     */
    private Integer start;


    /**
     *
     * @param totalSize 当前页码
     * @param pageNo 每页显示的数据量
     * @param pageSize 总记录
     */
    public Page(Integer totalSize, Integer pageNo, Integer pageSize) {
        this.totalSize = totalSize;
        this.pageNo = pageNo;
        this.pageSize = pageSize;

        totalPages = totalSize / pageSize;
        if (totalSize % pageSize != 0){
            totalPages++;
        }
        if (pageNo > totalPages){
            this.pageNo = totalPages;
        }
        if (pageNo <= 0){
            this.pageNo = 1;
        }
        start = (pageNo - 1) * pageSize;

    }

    public Integer getTotalsize() {
        return totalSize;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public List<T> getItems() {
        return items;
    }

    public Integer getStart() {
        return start;
    }

    public void setItems(List<T> items){
        this.items = items;
    }
}
