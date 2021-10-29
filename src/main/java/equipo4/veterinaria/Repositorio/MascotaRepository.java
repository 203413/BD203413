package equipo4.veterinaria.Repositorio;

import equipo4.veterinaria.Modelo.Mascota;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MascotaRepository extends CrudRepository<Mascota, Integer> {

    List<Mascota> findAll();

    Mascota save(Mascota mascota);
}
