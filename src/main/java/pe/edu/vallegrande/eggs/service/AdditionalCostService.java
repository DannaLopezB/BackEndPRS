package pe.edu.vallegrande.eggs.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.vallegrande.eggs.model.AdditionalCostModel;
import pe.edu.vallegrande.eggs.repository.AdditionalCostRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AdditionalCostService {
    
    private final AdditionalCostRepository repository;
    
    // Get all additional costs
    public Flux<AdditionalCostModel> getAll() {
        return repository.findAll();
    }
    
    // Get cost by ID
    public Mono<AdditionalCostModel> getById(Integer id) {
        return repository.findById(id);
    }
    
    // Create a new cost
    public Mono<AdditionalCostModel> create(AdditionalCostModel cost) {
        return repository.save(cost);
    }
    
    // Update an existing cost
    public Mono<AdditionalCostModel> update(Integer id, AdditionalCostModel cost) {
        return repository.findById(id)
                .flatMap(existing -> {
                    cost.setId(id);
                    return repository.save(cost);
                });
    }
    
    // Delete cost by ID
    public Mono<Void> delete(Integer id) {
        return repository.deleteById(id);
    }
}