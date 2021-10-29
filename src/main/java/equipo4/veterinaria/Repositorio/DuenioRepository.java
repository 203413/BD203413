package equipo4.veterinaria.Repositorio;

import equipo4.veterinaria.Modelo.Duenio;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DuenioRepository extends CrudRepository<Duenio,Integer> {

    List<Duenio> findAll();
}
