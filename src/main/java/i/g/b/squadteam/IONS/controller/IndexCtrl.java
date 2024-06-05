package i.g.b.squadteam.IONS.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexCtrl {
    
    // buat halaman akses default
    @GetMapping("")
    public ResponseEntity<?> index() {
        return ResponseEntity.ok().body("Backend program IONS");
    }
}
