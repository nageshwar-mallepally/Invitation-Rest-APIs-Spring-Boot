package com.cassini.InvitationApp.repository;

import com.cassini.InvitationApp.model.login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface loginRepo extends JpaRepository<login,Integer> {
}
