package com.project.bookmyshow.models;

import com.project.bookmyshow.enums.PaymentMode;
import com.project.bookmyshow.enums.PaymentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.Getter;

@Getter
@Entity
public class Payment extends Auditable {
    private String referenceId;
    private Double amount;

    @Enumerated
    private PaymentMode mode;

    @Enumerated
    private PaymentStatus status;
}
