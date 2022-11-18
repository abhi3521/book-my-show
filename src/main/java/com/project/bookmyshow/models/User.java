package com.project.bookmyshow.models;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;


@Getter
@Entity
@Table(name = "USERS")
public class User extends Auditable {
    private String email;

}
