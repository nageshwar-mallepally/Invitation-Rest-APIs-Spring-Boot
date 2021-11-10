package com.cassini.InvitationApp.repository;

import com.cassini.InvitationApp.model.invitePerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface invitePersonRepo extends JpaRepository<invitePerson,Integer> {
}
