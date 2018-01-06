package com.swjtu.bigdataacademy.Respond;

import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

public class Respond {

    @ApiModelProperty("错误码")
    private Integer code;

    @ApiModelProperty("消息")
    private List<Object> data;

    public Respond(){
        this.code = 0;
        this.data = new ArrayList<>();
    }

    private Respond(Integer code, List<Object> data){
        this.code = code;
        this.data = data;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void addData(Object oData) {
        this.data.add(oData);
    }
}
