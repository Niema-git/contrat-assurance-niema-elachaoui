package org.sid.contratassurance.dtos;

import lombok.Data;
import org.sid.contratassurance.enums.NiveauCouverture;

@Data
public class ContratSanteDTO extends ContratDTO {
    private int nombrePersonnes;
    private NiveauCouverture niveau;
}