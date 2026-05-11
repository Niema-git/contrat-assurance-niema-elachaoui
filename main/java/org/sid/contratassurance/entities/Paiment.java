package org.sid.contratassurance.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    private PaymentType type;

    //son id, sa date, son montant,
    // son type : Mensualité, Paiement annuel,
    //Paiement exceptionnel
}
