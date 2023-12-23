package com.example.aaaaaaaa.meyve;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dukkan/meyve")
public class MeyveController {

    @Autowired
    MeyveService service;

    private static final Logger logger = LoggerFactory.getLogger(MeyveController.class);

    @GetMapping
    public List<Meyve> findAllMeyve() {
        try {
            logger.info("\nTüm meyveleri getirme işlemi gerçekleşti.");
            return service.findAllMeyve();
        } catch (Exception e) {
            logger.error("\nTüm meyveleri getirme işlemi HATALI!", e);
            return null;
        }
    }

    @PostMapping
    public Meyve saveMeyve(@RequestBody Meyve meyve) {
        try {
            logger.info("\n" + meyve + "\n isimli meyve kayıt edildi.");
            return service.saveMeyve(meyve);
        } catch (Exception e) {
            logger.error("\n" + meyve + " \nisimli meyve kaydetme işlemi HATALI!", e);
            return null;
        }
    }

    @GetMapping("/{id}")
    public Meyve findMeyveById(@PathVariable Long id) {
        try {
            logger.info("\n" + id + "ID'li meyveyi getirme işlemi gerçekleşti.");
            return service.findMeyveById(id);
        } catch (Exception e) {
            logger.error("\n" + id + "ID'li meyveyi getirme işlemi HATALI!", e);
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteMeyve(@PathVariable Long id) {
        try {
            logger.info("\n" + id + "ID'li meyvenin silinme işlemi gerçekleşti.");
            service.deleteMeyve(id);
        } catch (Exception e) {
            logger.error("\n" + id + "ID'li meyvenin silinme işlemi HATALI!", e);
        }
    }

    @PutMapping("/{id}")
    public Meyve updateMeyve(@RequestBody Meyve meyve) {
        try {
            logger.info("\n" + meyve + " \nisimli meyvenin update işlemi gerçekleşti.");
            return service.updateMeyve(meyve);
        } catch (Exception e) {
            logger.error("\n" + meyve + "\n isimli meyvenin update işlemi HATALI!", e);
            return null;
        }
    }

}
