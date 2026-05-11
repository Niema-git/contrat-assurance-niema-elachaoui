package org.sid.contratassurance.dtos;

import lombok.Data;
import org.sid.contratassurance.enums.PaymentType;

import java.util.Date;

@Data
public class PaimentDTO {
    private Long id;
    private Date date;
    private double montant;
    private PaymentType type;
    private String contratId;
}