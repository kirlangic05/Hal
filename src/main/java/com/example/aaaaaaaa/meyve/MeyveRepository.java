package com.example.aaaaaaaa.meyve;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeyveRepository extends JpaRepository<Meyve,Long> {
}
