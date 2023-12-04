package com.fzq.usercenter.common;

import lombok.Data;

import java.io.Serializable;

/**
 * Common page request param
 */
@Data
public class PageRequest implements Serializable {

    private static final long serialVersionUID = 5608222467395408646L;
    /**
     * Page size
     */
    protected int pageSize = 10;

    /**
     * Current page Num
     */
    protected int pageNum = 1;
}
