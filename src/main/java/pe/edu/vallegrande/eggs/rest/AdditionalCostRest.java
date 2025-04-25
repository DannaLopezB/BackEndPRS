package pe.edu.vallegrande.eggs.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.eggs.model.AdditionalCostModel;
import pe.edu.vallegrande.eggs.service.AdditionalCostService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin("*")
@RestController
@RequestMapping("/additional-cost")
@RequiredArgsConstructor
public class AdditionalCostRest {

    private final AdditionalCostService service;

    // Get all costs
    @GetMapping
    public Flux<AdditionalCostModel> getAll() {
        return service.getAll();
    }

    // Get cost by ID
    @GetMapping("/{id}")
    public Mono<AdditionalCostModel> getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    // Create new cost
    @PostMapping
    public Mono<AdditionalCostModel> create(@RequestBody AdditionalCostModel cost) {
        return service.create(cost);
    }

    // Update cost by ID
    @PutMapping("/{id}")
    public Mono<AdditionalCostModel> update(@PathVariable Integer id, @RequestBody AdditionalCostModel cost) {
        return service.update(id, cost);
    }

    // Delete cost by ID
    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable Integer id) {
        return service.delete(id);
    }
}