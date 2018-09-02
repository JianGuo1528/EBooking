package com.ustrip.entity;

import java.io.Serializable;
import java.util.Date;

public class Operation implements Serializable {
    private static final long serialVersionUID = 5384403676918090496L;

    private Integer id;

    private Integer userId;

    private Date date;

    private String method;

    private String request;

    private String response;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "id=" + id +
                ", userId=" + userId +
                ", date=" + date +
                ", method='" + method + '\'' +
                ", request='" + request + '\'' +
                ", response='" + response + '\'' +
                '}';
    }
}