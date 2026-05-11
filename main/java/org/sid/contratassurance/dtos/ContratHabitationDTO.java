package org.sid.contratassurance.dtos;

import lombok.Data;
import org.sid.contratassurance.enums.LogementType;

@Data
public class ContratHabitationDTO extends ContratDTO {
    private LogementType typeLogement;
    private String adresse;
    private double superficie;
}