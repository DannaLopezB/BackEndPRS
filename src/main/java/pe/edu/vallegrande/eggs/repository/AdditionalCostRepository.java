package pe.edu.vallegrande.eggs.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.vallegrande.eggs.model.AdditionalCostModel;

@Repository
public interface AdditionalCostRepository extends ReactiveCrudRepository<AdditionalCostModel, Integer> {
    // Using only default ReactiveCrudRepository methods
}