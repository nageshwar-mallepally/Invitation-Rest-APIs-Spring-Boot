package com.cassini.InvitationApp.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.hibernate.type.ObjectType;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;


public abstract class cassiniObject implements Serializable {

    @Id
    @Column(name = "OBJECT_ID",nullable = false)
    private Integer objectId;

    @Column(name = "CREATED_DATE",nullable = false)
    @CreatedDate
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    private Date  createDate = new Date();

    @Column(name = "MODIFIED_DATE",nullable = false)
    @LastModifiedDate
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    private Date  modifiedDate = new Date();

    @Column(name = "OBJECT_TYPE",nullable = false)
    private ObjectType objectType;



    public cassiniObject(InvitationObjectType person) {

    }


    public ObjectType getObjectType() {
        return objectType;
    }

    public void setObjectType(ObjectType objectType) {
        this.objectType = objectType;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}
