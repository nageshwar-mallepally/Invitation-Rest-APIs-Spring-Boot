package com.cassini.InvitationApp.service;

import com.cassini.InvitationApp.model.invitation;
import com.cassini.InvitationApp.model.person;
import com.cassini.InvitationApp.repository.invitationRepo;
import com.cassini.InvitationApp.repository.personRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class invitationService {

    @Autowired
    private invitationRepo invitationRepo;

    /*-----------SaveinvitationPerson---------------*/
    public invitation saveInvitationPerson(invitation newInvitation)
    {
        return invitationRepo.save(newInvitation);
    }

    /*-----------GetAllinvitationPersons---------------*/
    public List<invitation> getAllInvitationPersons()
    {
        return invitationRepo.findAll();
    }

    /*-----------DeleteinvitationPerson---------------*/
    public void delete(Integer id)
    {
        invitationRepo.deleteById(id);
    }

    /*-----------UpdatePerson---------------*/
    public invitation updateInvitationPerson(Integer id,invitation invitation )
    {
        invitation.setId(id);
        return invitationRepo.save(invitation);
    }

    /*-----------GetByid---------------*/
    public Optional<invitation> findByid(Integer id)
    {
        return invitationRepo.findById(id);
    }
}
