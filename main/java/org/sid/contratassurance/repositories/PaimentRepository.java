package org.sid.contratassurance.repositories;

import org.sid.contratassurance.entities.Paiment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PaimentRepository extends JpaRepository<Paiment, Long> {
    List<Paiment> findByContratId(String contratId);
}