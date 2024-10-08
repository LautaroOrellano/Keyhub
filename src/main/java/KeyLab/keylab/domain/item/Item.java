package KeyLab.keylab.domain.item;

import KeyLab.keylab.domain.category.Category;
import KeyLab.keylab.domain.itemAttribute.ItemAttribute;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity (name = "item") // Entidad de persistencia
@Data // Utilizacion de lombok para usar getters, setters, constructores, to string, equals
@Table(name = "items")
public class Item {

    @Id // Se marca en la tabla de base de datos como primaryKey
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Se auto incrementa el id en 1 en 1.
    private Long id;

    private String name;

    private Integer stock;

    private Float price;

    private String description;

    private String color;

    @ManyToMany(mappedBy = "items")
    @JsonIgnore
    private Set<ItemAttribute> itemAttributes;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

}
