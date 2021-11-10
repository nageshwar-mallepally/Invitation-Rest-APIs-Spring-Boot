package com.cassini.InvitationApp.controller;

import com.cassini.InvitationApp.model.person;
import com.cassini.InvitationApp.service.personService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/person")
@CrossOrigin
public class personController {


    @Autowired
    private personService personService;

    @RequestMapping(value = "/newperson",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public person Create(@RequestBody person person)
    {
        return personService.savePerson(person);
    }

    @RequestMapping(value = "/getall",method = RequestMethod.GET)
    public List<person> getAllPersons()
    {
        return personService.getAllPersons();
    }

    @RequestMapping(value = "/{personId}",method = RequestMethod.DELETE)
    public void delete(@PathVariable("personId") Integer  id)
    {
        personService.delete(id);
    }

    @RequestMapping(value = "/{personId}",method = RequestMethod.PUT)
    public person update(@PathVariable("personId") Integer id,@RequestBody person person)
    {
        return   personService.updatePerson(id, person);
    }

   /* @RequestMapping(value = "/{personId}", method = RequestMethod.GET)
    public person get(@PathVariable("personId") Integer personId) {
        return personService.get(personId);
    }*/


}
