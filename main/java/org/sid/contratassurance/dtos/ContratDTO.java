package org.sid.contratassurance.dtos;


import lombok.Data;

import org.sid.contratassurance.enums.ContratStatus;

import java.util.Date;



@Data
public class ContratDTO {

    private String id ;
    private Date dateSouscription ;
    private ContratStatus status;
    private Date dateValidation;
    private double montant;
    private int duree;
    private String type;
    private ClientDTO clientDTO;
    private double tauxCouverture;}




