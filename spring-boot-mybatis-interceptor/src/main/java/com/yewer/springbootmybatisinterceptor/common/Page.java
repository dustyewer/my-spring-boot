package com.yewer.springbootmybatisinterceptor.common;

import lombok.Data;

@Data
public class Page {
    protected int page = 1;// 页码，默认是第一页
    protected int rows = 10;// 每页显示的记录数，默认是10
    protected int total;
    protected String sortBy;
    protected String rank = "DESC";

}
