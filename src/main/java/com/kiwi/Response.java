package com.kiwi;

import java.util.List;

/**
 * Created by malithi on 12/27/16.
 */
public class Response<T> {

    private String status;
    private String message;
    private List<T>  data;
//    private T singleData;

    public Response(String status, String message, List<T> all) {
        this.status = status;
        this.message = message;
        this.data = all;
    }

//    public Response(String status, String message, T singleData) {
//        this.status = status;
//        this.message = message;
//        this.singleData = singleData;
//    }


    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public List<T>  getData() {
        return data;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(List<T>  data) {
        this.data = data;
    }

//    public T getSingleData() {
//        return singleData;
//    }
//
//    public void setSingleData(T singleData) {
//        this.singleData = singleData;
//    }
}