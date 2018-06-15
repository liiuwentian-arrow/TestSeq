/**
 * Copyright (C) 2006-2012 Tuniu All rights reserved
 * Author: 
 * Date: Sat Apr 07 15:43:39 GMT+08:00 2018
 * Description:
 */
package com.brilliance.pojo;

/**
 *  STU
 *  TB_STU
 */
public class STU {
    /**
     * null
     * TB_STU.inr
     */
    private String inr;

    /**
     * null
     * TB_STU.stunum
     */
    private String stunum;

    /**
     * @return TB_STU.inr
     */
    public String getInr() {
        return inr;
    }

    /**
     * @param String inr (TB_STU.inr )
     */
    public void setInr(String inr) {
        this.inr = inr == null ? null : inr.trim();
    }

    /**
     * @return TB_STU.stunum
     */
    public String getStunum() {
        return stunum;
    }

    /**
     * @param String stunum (TB_STU.stunum )
     */
    public void setStunum(String stunum) {
        this.stunum = stunum == null ? null : stunum.trim();
    }

	public STU() {
		super();
		// TODO Auto-generated constructor stub
	}

	public STU(String inr, String stunum) {
		super();
		this.inr = inr;
		this.stunum = stunum;
	}
    
    
    
}