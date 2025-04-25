package pe.edu.vallegrande.eggs.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Table("ADDITIONAL_COST")
public class AdditionalCostModel {

    @Id
    private Integer id;
    private String costType;
    private BigDecimal amount;
    private LocalDate registrationDate;
    private String description;
}
