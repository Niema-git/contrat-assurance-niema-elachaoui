package org.sid.contratassurance.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.contratassurance.enums.NiveauCouverture;
@Entity
@DiscriminatorValue("SA")
@Data

@NoArgsConstructor
@AllArgsConstructor
public class ContratSante extends Contrat {
    private int nombrePersonne;
    @Enumerated(EnumType.STRING)
    private NiveauCouverture niveau;


}
