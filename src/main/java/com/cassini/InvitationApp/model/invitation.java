package com.cassini.InvitationApp.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


@Entity(name = "INVITATION")
public class invitation extends cassiniObject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    @PrimaryKeyJoinColumn(name = "ID")
    private Integer id;

    @Column(name = "NAME",nullable = false)
    private String name;

    @Column(name = "INFORMATION",nullable = false)
    private String information;

    @Column(name = "DATE_VALUE",nullable = false)
    @CreatedDate
    private Date dateValue;

    @Column(name = "TIME_VALUE",nullable = false)
    @DateTimeFormat
    private Time timeValue;

    @Column(name = "PHONE_MOBILE",nullable = false)
    private Long phoneMobile;

    @Column(name = "INVITEDBY",nullable = false)
    private Integer invitedBy;

    @Column(name = "ADDRESS",nullable = false)
    private String address;

    public invitation() {
        super(InvitationObjectType.INVITATION);
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public Date getDateValue() {
        return dateValue;
    }

    public void setDateValue(Date dateValue) {
        this.dateValue = dateValue;
    }

    public Time getTimeValue() {
        return timeValue;
    }

    public void setTimeValue(Time timeValue) {
        this.timeValue = timeValue;
    }

    public Long getPhoneMobile() {
        return phoneMobile;
    }

    public void setPhoneMobile(Long phoneMobile) {
        this.phoneMobile = phoneMobile;
    }

    public Integer getInvitedBy() {
        return invitedBy;
    }

    public void setInvitedBy(Integer invitedBy) {
        this.invitedBy = invitedBy;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
