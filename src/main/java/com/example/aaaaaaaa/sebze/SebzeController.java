package com.example.aaaaaaaa.sebze;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dukkan/sebze")
public class SebzeController {

    @Autowired
    SebzeService service;

    private static final Logger logger = LoggerFactory.getLogger(SebzeController.class);

    @GetMapping
    public List<Sebze> findAllSebze() {
        try {
            logger.info("\nSebzeleri getirme işlemi yapıldı.");
            return service.findAllSebze();
        } catch (Exception e) {
            logger.error("\nSebzeleri getirme işlemi HATALI!");
            return null;
        }
    }

    @GetMapping("/{id}")
    public Sebze findSebzeById(@PathVariable Long id) {
        try {
            logger.info("\n" + id +"ID ile Sebze getirme işlemi gerçekleşti.");
            return service.findSebzeById(id);
        } catch (Exception e) {
            logger.error("\n" + id +"ID ile Sebze getirme işlemi HATALI!");
            return null;
        }
    }

    @PostMapping
    public Sebze saveSebze(@RequestBody Sebze sebze) {
        try {
            logger.info("\n"+sebze+"\n isimli sebze kayıt işlemi gerçekleşti.");
            return service.saveSebze(sebze);
        } catch (Exception e) {
            logger.error("\n"+sebze+"\n isimli sebze kayıt işlemi HATALI!", e);
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteSebze(@PathVariable Long id) {
        try {
            logger.info("\n"+id + "ID'li sebze silme işlemi gerçekleşti");
            service.deleteSebze(id);
        } catch (Exception e) {
            logger.error("\n"+id+"ID'li sebze silme işlemi HATALI!",e);
        }
    }

    @PutMapping("/{id}")
    public Sebze updateSebze(@RequestBody Sebze sebze) {
        try {
            logger.info("\n"+sebze+" \nisimli sebze update işlemi gerçekleşti.");
            return service.updateSebze(sebze);
        }catch (Exception e){
            logger.error("\n"+sebze+" \nisimli sebze update işlemi HATALI!");
            return null;
        }
    }
}
