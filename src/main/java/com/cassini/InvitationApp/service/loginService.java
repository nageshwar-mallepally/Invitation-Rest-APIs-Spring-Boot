package com.cassini.InvitationApp.service;

import com.cassini.InvitationApp.model.login;
import com.cassini.InvitationApp.model.person;
import com.cassini.InvitationApp.repository.loginRepo;
import com.cassini.InvitationApp.repository.personRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class loginService {

    @Autowired
    private loginRepo loginRepo;


    /*-----------SaveLoginPerson---------------*/
    public login saveLoginPerson(login newLoginPerson)
    {
        return loginRepo.save(newLoginPerson);
    }

    /*-----------GetAllLoginPersons---------------*/
    public List<login> getAllLoginPersons()
    {
        return loginRepo.findAll();
    }

    /*-----------DeleteLoginPerson---------------*/
    public void delete(Integer id)
    {
        loginRepo.deleteById(id);
    }

    /*-----------UpdatePerson---------------*/
    public login updateLoginPerson(Integer id,login loginPersons )
    {
        loginPersons.setLoginId(id);
        return loginRepo.save(loginPersons);
    }

    /*-----------GetByid---------------*/
    public Optional<login> findByid(Integer id)
    {
        return loginRepo.findById(id);
    }


}
