package equipo4.veterinaria.Controlador;


import equipo4.veterinaria.Modelo.Duenio;
import equipo4.veterinaria.Repositorio.DuenioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DuenioController {

    @Autowired
    DuenioRepository duenioRepository;


    @GetMapping(value = "/listDuenio")
   public List<Duenio> getDuenios(){
        return duenioRepository.findAll();
    }


    @PostMapping(value = "/duenio/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Duenio addDuenio(@RequestBody Duenio duenio){
        return  duenioRepository.save(duenio);
    }
}
