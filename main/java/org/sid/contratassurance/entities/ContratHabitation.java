package org.sid.contratassurance.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.contratassurance.enums.LogementType;
@Entity
@DiscriminatorValue("HA")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContratHabitation extends Contrat {
    @Enumerated(EnumType.STRING)
    private LogementType typeLogement;
    private String adresse;
    private double superficie;

}
