package org.sid.contratassurance.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@DiscriminatorValue("CA")
@Data

@NoArgsConstructor @AllArgsConstructor
public class ContratAutomobile extends Contart {
    private  String matricule;
     private String marque;
     private String modele;

}
