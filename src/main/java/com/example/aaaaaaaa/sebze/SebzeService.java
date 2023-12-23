package com.example.aaaaaaaa.sebze;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SebzeService {

    @Autowired
    SebzeRepository repo;

    public List<Sebze> findAllSebze(){
        return repo.findAll();
    }

    public Sebze findSebzeById(Long id){
        return repo.findById(id).get();
    }

    public Sebze saveSebze(Sebze sebze){
        return repo.save(sebze);
    }

    public void deleteSebze(Long id){
        repo.deleteById(id);
    }
    public Sebze updateSebze(Sebze requestSebze){
        Sebze existingSebze=repo.findById(requestSebze.getSebzeId()).get();
        existingSebze.setSebzeId(requestSebze.getSebzeId());
        existingSebze.setSebze(requestSebze.getSebze());
        existingSebze.setHal(requestSebze.getHal());
        return repo.save(existingSebze);
    }

}
