package com.project.bookmyshow.models;

import com.project.bookmyshow.enums.SeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.Getter;

@Getter
@Entity
public class Seat extends Auditable {
    private Integer rowNumber;
    private Integer columnNumber;

    @Enumerated
    private SeatType seatType;
}
