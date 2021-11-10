package com.cassini.InvitationApp.service;

import com.cassini.InvitationApp.model.invitePerson;
import com.cassini.InvitationApp.model.person;
import com.cassini.InvitationApp.repository.invitePersonRepo;
import com.cassini.InvitationApp.repository.personRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class invitePersonService {

    @Autowired
    private invitePersonRepo invitePersonRepo;


    /*-----------SavePerson---------------*/

    public invitePerson saveinvitePerson(invitePerson invitePerson)
    {
        return invitePersonRepo.save(invitePerson);
    }

    /*-----------GetAllPersons---------------*/
    public List<invitePerson> getAllinvitePersons()
    {
        return invitePersonRepo.findAll();
    }

    /*-----------DeletePerson---------------*/
    public void delete(Integer id)
    {
        invitePersonRepo.deleteById(id);
    }

    /*-----------UpdatePerson---------------*/
    public invitePerson updateinvitePerson(Integer id,invitePerson invitePerson )
    {
        invitePerson.setId(id);
        return invitePersonRepo.save(invitePerson);
    }

    /*-----------GetByid---------------*/
    public Optional<invitePerson> findByid(Integer id)
    {
        return invitePersonRepo.findById(id);
    }
}
