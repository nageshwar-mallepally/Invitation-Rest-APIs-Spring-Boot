package com.cassini.InvitationApp.repository;

import com.cassini.InvitationApp.model.person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface personRepo extends JpaRepository<person,Integer> {
}
