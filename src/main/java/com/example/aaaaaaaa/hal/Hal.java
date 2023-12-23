package com.example.aaaaaaaa.hal;

import com.example.aaaaaaaa.meyve.Meyve;
import com.example.aaaaaaaa.sebze.Sebze;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "hal")
@Data
public class Hal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "hal_id")
    private Long id;

    @Column(name = "hal_isim")
    private String hal_isim;

    @OneToMany(mappedBy = "hal",orphanRemoval = true,cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Meyve> meyve;

    @OneToMany(mappedBy = "hal",orphanRemoval = true,cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Sebze> sebze;
}
