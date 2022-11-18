package com.project.bookmyshow.models;

import com.project.bookmyshow.enums.TicketStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
@Table
@Entity
public class Ticket extends Auditable {

    @ManyToOne
    private Show show;

    @ManyToOne
    private User user;

    @ManyToMany       // Cancellation Scenario
    private List<ShowSeat> seats = new ArrayList<>();

    private Double amount;

    @Enumerated
    private TicketStatus status;

    @OneToOne
    private Payment payment;

}
