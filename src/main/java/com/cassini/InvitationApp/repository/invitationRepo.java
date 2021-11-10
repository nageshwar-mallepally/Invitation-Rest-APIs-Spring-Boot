package com.cassini.InvitationApp.repository;

import com.cassini.InvitationApp.model.invitation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface invitationRepo extends JpaRepository<invitation,Integer> {
}
