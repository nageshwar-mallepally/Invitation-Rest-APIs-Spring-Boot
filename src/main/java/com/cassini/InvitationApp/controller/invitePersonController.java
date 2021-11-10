package com.cassini.InvitationApp.controller;

import com.cassini.InvitationApp.model.invitePerson;
import com.cassini.InvitationApp.service.invitePersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping(value = "/inviteperson")
@CrossOrigin
public class invitePersonController {

    @Autowired
    private invitePersonService invitePersonService;



    @RequestMapping(value = "/new",method = RequestMethod.POST)
    public invitePerson newInvitePerson(@ModelAttribute @Valid invitePerson invitePerson)
    {
        return invitePersonService.saveinvitePerson(invitePerson);
    }

    @RequestMapping(value = "/getAllInvitePerson",method = RequestMethod.GET)
    public List<invitePerson> getAllInvitePerson()
    {
        return invitePersonService.getAllinvitePersons();
    }

    @RequestMapping(value = "/{invitePersonId}",method = RequestMethod.DELETE)
    public void delete(@PathVariable("invitePersonId") Integer  id)
    {
        invitePersonService.delete(id);
    }

    @RequestMapping(value = "/{invitePersonId}",method = RequestMethod.PUT)
    public invitePerson update(@PathVariable("invitePersonId") Integer id,@RequestBody invitePerson invitePerson)
    {
        return   invitePersonService.updateinvitePerson(id, invitePerson);
    }

}
