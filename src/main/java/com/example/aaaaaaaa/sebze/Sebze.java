package com.example.aaaaaaaa.sebze;

import com.example.aaaaaaaa.hal.Hal;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "sebzeler")
public class Sebze {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sebze_id")
    private Long sebzeId;


    @Column(name = "sebze")
    private String sebze;

    @ManyToOne
    @JoinColumn(name= "halId")
    @JsonBackReference
    private Hal hal;
}
