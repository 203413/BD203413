package equipo4.veterinaria.Controlador;


import equipo4.veterinaria.Modelo.Cita;
import equipo4.veterinaria.Repositorio.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CitaController {

    @Autowired
    CitaRepository citaRepository;


    @GetMapping(value = "/listCitas")
    public List<Cita> getCitas(){
        return citaRepository.findAll();
    }


    @PostMapping(value = "/Cita/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Cita addCita(@RequestBody Cita cita){
        return citaRepository.save(cita);
    }
}
