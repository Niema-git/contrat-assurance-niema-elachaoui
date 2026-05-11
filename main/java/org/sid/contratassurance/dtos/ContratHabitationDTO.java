package org.sid.contratassurance.dtos;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.contratassurance.entities.Contart;
import org.sid.contratassurance.enums.LogementType;

@Entity
@DiscriminatorValue("HA")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContratHabitationDTO extends Contart {
    @Enumerated(EnumType.STRING)
    private LogementType type;
    private String adresse;
    private String superficie;

}
