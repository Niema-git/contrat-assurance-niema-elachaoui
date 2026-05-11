package org.sid.contratassurance.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.contratassurance.enums.ContratStatus;

import java.util.Date;
import java.util.List;

@Entity
@Data @NoArgsConstructor
@AllArgsConstructor
public class Contart {
    private String id ;
    private Date dateSouscription ;
    @Enumerated(EnumType.STRING)
    private ContratStatus status;
    private Date dateValidation;
    private String montant;
    private String duree;
    private String tauxCouverture;
    @ManyToOne
    private Client client;
    @OneToMany(mappedBY="contrat", fetch = FetchType.LAZY)
    private List<Paiment> contartPaiments ;

