package equipo4.veterinaria.Repositorio;

import equipo4.veterinaria.Modelo.Cita;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CitaRepository extends CrudRepository<Cita, Integer> {

    List<Cita> findAll();

    //Cita findByCitaId(int idCita);

    Cita save(Cita cita);


}
