package com.ustrip.entity;

import java.io.Serializable;

public class Dict implements Serializable {
    private static final long serialVersionUID = -8395415063151881241L;

    private Integer id;

    private String type;

    private String typeName;

    private String typeNameZh;

    private Integer hotelId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeNameZh() {
        return typeNameZh;
    }

    public void setTypeNameZh(String typeNameZh) {
        this.typeNameZh = typeNameZh;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    @Override
    public String toString() {
        return "Dict{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", typeName='" + typeName + '\'' +
                ", typeNameZh='" + typeNameZh + '\'' +
                ", hotelId=" + hotelId +
                '}';
    }
}