package guru.springframework.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;


@Data
@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private BigDecimal amount;

    @ManyToOne
    private Recipe recipe;

    // Uni direktionale Beziehung
    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasure uom;

    public Ingredient() {
    }

    public Ingredient(String description, BigDecimal amount, Recipe recipe, UnitOfMeasure uom) {
        this.description = description;
        this.amount = amount;
        this.recipe = recipe;
        this.uom = uom;
    }

}
