package com.cassini.InvitationApp.service;

import com.cassini.InvitationApp.model.person;
import com.cassini.InvitationApp.repository.personRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Service
public class personService {

    @Autowired
    private personRepo personRepository;


    /*-----------SavePerson---------------*/
    public person savePerson(person newPerson)
    {
        return personRepository.save(newPerson);
    }

    /*-----------GetAllPersons---------------*/
    public List<person> getAllPersons()
    {
        return personRepository.findAll();
    }

    /*-----------DeletePerson---------------*/
    public void delete(Integer id)
    {
        personRepository.deleteById(id);
    }

    /*-----------UpdatePerson---------------*/
    public person updatePerson(Integer id,person person )
    {
        person.setPersonId(id);
        return personRepository.save(person);
    }

    /*-----------GetByid---------------*/
    public Optional<person> findByid(Integer id)
    {
        return personRepository.findById(id);
    }

    /*@Override
    public person get(Integer id) {
        person person = personRepository.findById(id).get();

        return person;
    }*/

}
