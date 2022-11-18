package com.project.bookmyshow.models;

import com.project.bookmyshow.enums.SeatStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Getter
@Entity
public class ShowSeat extends Auditable {

    private Double price;

    @Enumerated
    private SeatStatus status;

    @ManyToOne
    private Seat seat;
}
