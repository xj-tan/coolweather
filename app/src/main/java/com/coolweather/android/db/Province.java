package com.coolweather.android.db;

import DataSupport;

/**
 * Created by nsctetan on 2018/5/16.
 */

public class Province extends DataSupport {
    private int id;
    private  String provinceName;
    private int provinceCode;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getProvinceName(){
        return provinceName;
    }

    public void setProvinceName(String provinceName){
        this.provinceName =provinceName;
    }

    public int getProvinceCode(){
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode){
        this.provinceCode=provinceCode;
    }
}