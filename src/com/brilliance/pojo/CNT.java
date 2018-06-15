/**
 * Copyright (C) 2006-2012 Tuniu All rights reserved
 * Author: 
 * Date: Sat Apr 07 15:48:03 GMT+08:00 2018
 * Description:
 */
package com.brilliance.pojo;

/**
 *  CNT
 *  TB_CNT
 */
public class CNT {
    /**
     * null
     * TB_CNT.name
     */
    private String name;

    /**
     * null
     * TB_CNT.strp
     */
    private Short strp;

    /**
     * null
     * TB_CNT.value
     */
    private Short value;

    /**
     * @return TB_CNT.name
     */
    public String getName() {
        return name;
    }

    /**
     * @param Object name (TB_CNT.name )
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return TB_CNT.strp
     */
    public Short getStrp() {
        return strp;
    }

    /**
     * @param Short strp (TB_CNT.strp )
     */
    public void setStrp(Short strp) {
        this.strp = strp;
    }

    /**
     * @return TB_CNT.value
     */
    public Short getValue() {
        return value;
    }

    /**
     * @param Short value (TB_CNT.value )
     */
    public void setValue(Short value) {
        this.value = value;
    }

	public CNT() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CNT(String name, Short strp, Short value) {
		super();
		this.name = name;
		this.strp = strp;
		this.value = value;
	}
    
    
    
    
}