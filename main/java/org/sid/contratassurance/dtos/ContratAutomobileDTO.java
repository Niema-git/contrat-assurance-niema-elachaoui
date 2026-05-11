package org.sid.contratassurance.dtos;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.contratassurance.entities.Contart;

@Entity
@DiscriminatorValue("CA")
@Data

@NoArgsConstructor @AllArgsConstructor
public class ContratAutomobileDTO extends Contart {
    private  String matricule;
     private String marque;
     private String modele;

}
