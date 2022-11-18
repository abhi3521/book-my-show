package com.project.bookmyshow.models;

import com.project.bookmyshow.enums.Language;
import com.project.bookmyshow.enums.MovieFeature;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Entity
public class Show extends Auditable {

    @ManyToOne
    private Movie movie;

    @Enumerated
    private Language language;

    private Date startTime;

    private Date EndTime;

    @ManyToOne
    private Hall hall;

    @ElementCollection
    @Enumerated
    private List<MovieFeature> movieFeatures = new ArrayList<>();

    @OneToMany
    private List<ShowSeat> showSeats = new ArrayList<>();


}
