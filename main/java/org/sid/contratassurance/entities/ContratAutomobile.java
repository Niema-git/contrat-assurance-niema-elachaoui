package org.sid.contratassurance.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@DiscriminatorValue("CA")
@Enabled
@Data

@NoArgsConstructor @AllArgsConstructor
public class ContratAutomobile extends Contart {
    private  String matricule;
     private String marque;
     private String modele;

}
