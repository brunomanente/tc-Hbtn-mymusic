package com.ciandt.summit.bootcamp2022.adapter.rest;

import com.ciandt.summit.bootcamp2022.domain.dtos.MusicasDTO;
import com.ciandt.summit.bootcamp2022.domain.ports.interfaces.MusicasServicePort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/music")
public class MusicController {

    private final MusicasServicePort musicasServicePort;

    public MusicController(MusicasServicePort musicasServicePort) {
        this.musicasServicePort = musicasServicePort;
    }

    @GetMapping
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("67f5976c-eb1e-404e-8220-2c2a8a23be47");
    }

    //para teste: http://localhost:8080/api/v1/music/filtro?nome=Prince
    @GetMapping("/filtro")
    public List<MusicasDTO> getMusicas(@RequestParam ("nome") String nome){
       return musicasServicePort.buscaMusicas(nome);
    }

}
