package com.cassini.InvitationApp.model;

import javax.persistence.*;


@Entity(name = "INVITE_PERSON")
public class invitePerson extends cassiniObject {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "INVITATION",nullable = false)
    private Integer invitation;

    @Column(name = "PERSON",nullable = false)
    private Integer person;

    public invitePerson() {
        super(InvitationObjectType.INVITE_PERSON);
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInvitation() {
        return invitation;
    }

    public void setInvitation(Integer invitation) {
        this.invitation = invitation;
    }

    public Integer getPerson() {
        return person;
    }

    public void setPerson(Integer person) {
        this.person = person;
    }
}
