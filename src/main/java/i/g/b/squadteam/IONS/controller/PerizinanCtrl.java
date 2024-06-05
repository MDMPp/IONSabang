package i.g.b.squadteam.IONS.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import i.g.b.squadteam.IONS.model.entity.Perizinan;
import i.g.b.squadteam.IONS.repository.PerizinanRepository;

@RestController
@RequestMapping("/perizinan")
public class PerizinanCtrl {

    // panggil repository
    @Autowired
    private PerizinanRepository perizinanRepository;
    
    // buat fungsi save / update
    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestHeader String bearerToken, Perizinan perizinan){
        // validasi bearerToken

        // simpan
        // cek apakah ada noAju
        if(perizinan.getNoAju()== null){
            // new record
            perizinan.setUuidPerizinan(UUID.randomUUID().toString());
            perizinanRepository.save(perizinan);
        } else {
            //update
            perizinanRepository.save(perizinan);
        }

        // kembalikan response ke client
        return ResponseEntity.ok().body("success");
    }
}