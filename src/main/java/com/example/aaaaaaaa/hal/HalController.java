package com.example.aaaaaaaa.hal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dukkan/hal")
public class HalController {
    @Autowired
    HalService service;

    private static final Logger logger = LoggerFactory.getLogger(HalController.class);

    @GetMapping
    public List<Hal> findAllHal() {
        try {
            logger.info("\nTüm Hal verisi getirildi.");
            return service.findAllHal();
        } catch (Exception e) {
            logger.error("\nTüm Hal verileri getirilirken HATA OLUŞTU!", e);
            return null;
        }
    }

    @GetMapping("/{id}")
    public Hal findHalById(@PathVariable Long id) {
        try {
            logger.info("\n" + id + "'li Halin verileri getirildi.");
            return service.findHalById(id);
        } catch (Exception e) {
            logger.error("\n" + id + "'li Halin verilerinin getirilmesi sırasında HATA OLUŞTU!", e);
            return null;
        }
    }

    @PostMapping
    public Hal saveHal(@RequestBody Hal hal) {
        try {
            logger.info("\n" + hal + "\nisimli halin kayıt işlemi tamamlandı.");
            return service.saveHal(hal);
        } catch (Exception e) {
            logger.error("\n" + hal + "\nisimli halin kayıt işleminde HATA OLUŞTU!", e);
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteHal(@PathVariable Long id) {
        try {
            logger.info("\n" + id + "ID'li Halin silinme işlemi gerçekleşti");
            service.deleteHal(id);
        } catch (Exception e) {
            logger.error("\n" + id + "ID'li Halin silinme işlemi sırasında HATA OLUŞTU!", e);
        }
    }

    @PutMapping
    public Hal updateHal(@RequestBody Hal hal) {
        try {
            logger.info("\n" + hal + " \nisimli Halin update işlemi tamamlandı.");
            return service.updateHal(hal);
        } catch (Exception e) {
            logger.error("\n" + hal + " \nisimli Halin update işlemi sırasında HATA OLUŞTU!", e);
            return null;
        }
    }


}
