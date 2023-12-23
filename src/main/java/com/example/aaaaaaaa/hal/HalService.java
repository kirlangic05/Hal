package com.example.aaaaaaaa.hal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HalService {

    @Autowired
    HalRepository repo;

    public List<Hal> findAllHal(){
        return repo.findAll();
    }

    public Hal findHalById(Long id){
        return repo.findById(id).get();
    }
    public Hal saveHal(Hal hal){
        return repo.save(hal);
    }
    public void deleteHal(Long id){
        repo.deleteById(id);
    }
    public Hal updateHal(Hal requsetHal){
        Hal existingHal= repo.findById(requsetHal.getId()).get();
        existingHal.setHal_isim(requsetHal.getHal_isim());
        existingHal.setId(requsetHal.getId());
        existingHal.setMeyve(requsetHal.getMeyve());
        existingHal.setSebze(requsetHal.getSebze());
        return repo.save(existingHal);
    }
}
