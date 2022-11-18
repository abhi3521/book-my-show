package com.project.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
public class Hall extends Auditable {

    private Integer hallNumber;

    @OneToMany
    private List<Seat> seats = new ArrayList<>();
}
