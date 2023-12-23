package com.example.aaaaaaaa.hal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HalRepository extends JpaRepository<Hal,Long> {
}
