package com.example.aaaaaaaa.meyve;

import com.example.aaaaaaaa.hal.Hal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeyveService {
    @Autowired
    MeyveRepository repo;
    public List<Meyve> findAllMeyve(){
        return repo.findAll();
    }

    public Meyve findMeyveById(Long id){
        return repo.findById(id).get();
    }
    public Meyve saveMeyve(Meyve meyve){
        return repo.save(meyve);
    }
    public void deleteMeyve(Long id){
        repo.deleteById(id);
    }
    public Meyve updateMeyve(Meyve requsetMeyve){
        Meyve existingmeyve= repo.findById(requsetMeyve.getId()).get();
        existingmeyve.setHal(requsetMeyve.getHal());
        existingmeyve.setId(requsetMeyve.getId());
        existingmeyve.setMeyve(requsetMeyve.getMeyve());
        return repo.save(existingmeyve);
    }
}
