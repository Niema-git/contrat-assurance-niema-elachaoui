package org.sid.contratassurance.dtos;

import lombok.Data;

@Data
public class ContratAutomobileDTO extends ContratDTO {
    private String matricule;
    private String marque;
    private String modele;
}