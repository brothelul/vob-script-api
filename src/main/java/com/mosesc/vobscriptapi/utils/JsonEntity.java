package com.mosesc.vobscriptapi.utils;

import java.io.Serializable;

public class JsonEntity<T> implements Serializable {
    T data;
    private int status = 200;
    private String message;

    public JsonEntity(){}
    public JsonEntity(T data){
        this.data = data;
    }
    public JsonEntity(String message){
        this.message = message;
    }
    public JsonEntity(int status, String message){
        this.status = status;
        this.message = message;
    }
    public JsonEntity(T data, int status, String message){
        this.status = status;
        this.message = message;
        this.data = data;
    }
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
