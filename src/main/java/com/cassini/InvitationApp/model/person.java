package com.cassini.InvitationApp.model;

import org.hibernate.annotations.Type;
import org.springframework.data.annotation.Reference;

import javax.persistence.*;


@Entity(name = "PERSON")
public class person extends cassiniObject  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @PrimaryKeyJoinColumn(name = "PERSON_ID")
    @Column(name = "PERSON_ID")
    private Integer personId;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "MIDDLE_NAME")
    private String middleName;

    @Column(name = "PHONE_OFFICE")
    private Long phoneOffice;

    @Column(name = "PHONE_MOBILE")
    private Long phoneMobile;

    @Column(name = "EMAIL")
    @Reference()
    private String email;

    @Column(name = "IMAGE")
    @Lob
    @Type(type="org.hibernate.type.BinaryType")
    private byte[] image;

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public person() {
        super(InvitationObjectType.PERSON);
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Long getPhoneOffice() {
        return phoneOffice;
    }

    public void setPhoneOffice(Long phoneOffice) {
        this.phoneOffice = phoneOffice;
    }

    public Long getPhoneMobile() {
        return phoneMobile;
    }

    public void setPhoneMobile(Long phoneMobile) {
        this.phoneMobile = phoneMobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
