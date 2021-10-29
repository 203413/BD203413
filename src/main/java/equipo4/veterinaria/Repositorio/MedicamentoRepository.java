package equipo4.veterinaria.Repositorio;

import equipo4.veterinaria.Modelo.Medicamento;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MedicamentoRepository  extends CrudRepository<Medicamento,Integer> {

    List<Medicamento> findAll();

  // Medicamento findByMedicamentoCodigo(int codigo);

    Medicamento save(Medicamento medicamento);
}
