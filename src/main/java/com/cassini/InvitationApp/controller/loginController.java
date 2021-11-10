package com.cassini.InvitationApp.controller;

import com.cassini.InvitationApp.model.login;
import com.cassini.InvitationApp.service.loginService;
import com.cassini.InvitationApp.service.personService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping(value = "/loginPersons")
@CrossOrigin
public class loginController {

    @Autowired
    private loginService loginService;

    @RequestMapping(value = "/newLoginPerson",method = RequestMethod.POST)
    public login newLoginPerson(@ModelAttribute @Valid login login)
    {
        return loginService.saveLoginPerson(login);
    }

    @RequestMapping(value = "/getAllLoginPersons",method = RequestMethod.GET)
    public List<login> getAllLoginPersons()
    {
        return loginService.getAllLoginPersons();
    }

    @RequestMapping(value = "/{loginId}",method = RequestMethod.DELETE)
    public void delete(@PathVariable("loginId") Integer  id)
    {
        loginService.delete(id);
    }

    @RequestMapping(value = "/{loginId}",method = RequestMethod.PUT)
    public login update(@PathVariable("loginId") Integer id,@RequestBody login login)
    {
        return   loginService.updateLoginPerson(id, login);
    }


}
