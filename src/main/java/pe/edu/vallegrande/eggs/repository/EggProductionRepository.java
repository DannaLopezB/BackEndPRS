package pe.edu.vallegrande.eggs.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.vallegrande.eggs.model.EggProductionModel;

@Repository
public interface EggProductionRepository extends ReactiveCrudRepository<EggProductionModel, Integer> {
    // Using only default ReactiveCrudRepository methods
}