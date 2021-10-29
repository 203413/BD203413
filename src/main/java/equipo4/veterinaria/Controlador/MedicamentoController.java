package equipo4.veterinaria.Controlador;


import equipo4.veterinaria.Modelo.Medicamento;
import equipo4.veterinaria.Repositorio.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MedicamentoController {

    @Autowired
    MedicamentoRepository medicamentoRepository;


    @GetMapping(value = "/listMedicamento")
    public List<Medicamento> getMedicamentos(){
        return medicamentoRepository.findAll();
    }

    @PostMapping(value = "/medicamento/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Medicamento addMedicamento(@RequestBody Medicamento medicamento){
        return medicamentoRepository.save(medicamento);
    }

}
