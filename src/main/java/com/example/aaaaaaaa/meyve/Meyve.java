package com.example.aaaaaaaa.meyve;

import com.example.aaaaaaaa.hal.Hal;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "meyveler")
@Data
public class Meyve {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "meyve_id")
    private Long id;

    @Column(name = "meyveler")
    private String meyve;

    @ManyToOne
    @JoinColumn(name = "halId")
    @JsonBackReference
    private Hal hal;
}
