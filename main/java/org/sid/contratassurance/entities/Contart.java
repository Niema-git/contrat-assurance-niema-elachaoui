package org.sid.contratassurance.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.contratassurance.enums.ContratStatus;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Data @NoArgsConstructor
@AllArgsConstructor
@DiscriminatorColumn(name="TYPE", length = 4 )
public class Contart {
    @Id
    private String id ;
    private Date dateSouscription ;
    @Enumerated(EnumType.STRING)
    private ContratStatus status;
    private Date dateValidation;
    private double montant;
    private int duree;
    private double tauxCouverture;
    @ManyToOne
    private Client client;
    @OneToMany(mappedBy = "contrat")
    private List<Paiment> paiments;}



