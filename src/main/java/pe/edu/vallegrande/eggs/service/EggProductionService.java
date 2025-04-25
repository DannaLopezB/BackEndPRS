package pe.edu.vallegrande.eggs.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.vallegrande.eggs.model.EggProductionModel;
import pe.edu.vallegrande.eggs.repository.EggProductionRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class EggProductionService {
    
    private final EggProductionRepository repository;
    
    // Listar todos los registros
    public Flux<EggProductionModel> getAll() {
        return repository.findAll();
    }
    
    // Obtener un registro por ID
    public Mono<EggProductionModel> getById(Integer id) {
        return repository.findById(id);
    }
    
    // Crear un nuevo registro
    public Mono<EggProductionModel> create(EggProductionModel model) {
        return repository.save(model);
    }
    
    // Actualizar un registro existente
    public Mono<EggProductionModel> update(Integer id, EggProductionModel model) {
        return repository.findById(id)
                .flatMap(existing -> {
                    model.setId(id);
                    return repository.save(model);
                });
    }
    
    // Eliminar un registro
    public Mono<Void> delete(Integer id) {
        return repository.deleteById(id);
    }
}