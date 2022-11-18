package com.project.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@NoArgsConstructor
public class City extends Auditable {
    private String name;

    @OneToMany
    private List<Theatre> theatre = new ArrayList<>();
}
