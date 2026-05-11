package org.sid.contratassurance.repositories;

import org.sid.contratassurance.entities.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContratRepository extends JpaRepository<Contrat, String> {
    List<Contrat> findByClientId(Long clientId);
}

