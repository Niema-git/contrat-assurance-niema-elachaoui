package org.sid.contratassurance.repositories;

import org.sid.contratassurance.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
