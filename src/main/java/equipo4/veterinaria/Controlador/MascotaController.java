package equipo4.veterinaria.Controlador;


import equipo4.veterinaria.Modelo.Mascota;
import equipo4.veterinaria.Repositorio.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MascotaController {
    @Autowired
    MascotaRepository mascotaRepository;


    @GetMapping(value = "/listMascota")
    public List<Mascota> getMascotas(){
        return  mascotaRepository.findAll();
    }

    @PostMapping(value = "/mascota/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mascota addMascota(@RequestBody Mascota mascota){
        return mascotaRepository.save(mascota);

    }
}
