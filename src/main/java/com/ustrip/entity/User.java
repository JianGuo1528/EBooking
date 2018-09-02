package com.ustrip.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;

@SuppressWarnings("all")
public class User implements Serializable {
    private static final long serialVersionUID = -4406759948441638908L;

    private Integer userId;

    private String username;

    private String apiPassword;

    private String password;

    private String name;

    private String telPhone;

    private String cellPhone;

    private String email;

    private Date createdAt;

    private Integer role;

    private Integer status;

    private String hotelChain;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getApiPassword() {
        return apiPassword;
    }

    public void setApiPassword(String apiPassword) {
        this.apiPassword = apiPassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelPhone() {
        return telPhone;
    }

    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getHotelChain() {
        return hotelChain;
    }

    public void setHotelChain(String hotelChain) {
        this.hotelChain = hotelChain;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", apiPassword='" + apiPassword + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", telPhone='" + telPhone + '\'' +
                ", cellPhone='" + cellPhone + '\'' +
                ", email='" + email + '\'' +
                ", createdAt=" + createdAt +
                ", role=" + role +
                ", status=" + status +
                ", hotelChain='" + hotelChain + '\'' +
                '}';
    }

    public Map<String, Object> getMapData() {
        Map<String, Object> map = new LinkedHashMap<String, Object>();

        map.put("username", this.getUsername());
        map.put("apiPassword", this.getApiPassword());
        map.put("password", this.getPassword());
        map.put("name", this.getName());
        map.put("telPhone", this.getTelPhone());
        map.put("cellPhone", this.getCellPhone());
        map.put("email", this.getEmail());
        if (this.getCreatedAt() != null) {
            map.put("createdAt", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.getCreatedAt()));
        }
        map.put("role", this.getRole());
        map.put("status", this.getStatus());
        map.put("hotelChain", this.getHotelChain());
        return map;
    }
}