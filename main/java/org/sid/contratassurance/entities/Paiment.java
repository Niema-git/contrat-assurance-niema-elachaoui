package org.sid.contratassurance.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.contratassurance.enums.PaymentType;

import java.util.Date;

@Entity
@Data @NoArgsConstructor
@AllArgsConstructor
public class Paiment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private String montant;
    @Enumerated(EnumType.STRING)
    private PaymentType type;
    @ManyToOne
    @JoinColumn(name = "contrat_id")
    private Contart contrat;

}
