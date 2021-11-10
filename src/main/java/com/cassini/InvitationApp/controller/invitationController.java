package com.cassini.InvitationApp.controller;

import com.cassini.InvitationApp.model.invitation;
import com.cassini.InvitationApp.service.invitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping(value = "/invitation")
@CrossOrigin
public class invitationController {

    @Autowired
    private invitationService invitationService;




    @RequestMapping(value = "/new",method = RequestMethod.POST)
    public invitation newInvitation(@ModelAttribute @Valid invitation invitation)
    {
        return invitationService.saveInvitationPerson(invitation);
    }

    @RequestMapping(value = "/getAllInvitationPerson",method = RequestMethod.GET)
    public List<invitation> getAllInvitationPerson()
    {
        return invitationService.getAllInvitationPersons();
    }

    @RequestMapping(value = "/{invitePersonId}",method = RequestMethod.DELETE)
    public void delete(@PathVariable("invitePersonId") Integer  id)
    {
        invitationService.delete(id);
    }

    @RequestMapping(value = "/{invitePersonId}",method = RequestMethod.PUT)
    public invitation update(@PathVariable("invitePersonId") Integer id,@RequestBody invitation invitation)
    {
        return   invitationService.updateInvitationPerson(id, invitation);
    }


}
