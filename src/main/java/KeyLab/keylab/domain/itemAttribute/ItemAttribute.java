package KeyLab.keylab.domain.itemAttribute;

import KeyLab.keylab.domain.item.Item;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity(name = "item_attribute")
@Data
@Table(name = "item_attributes")
public class ItemAttribute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(
            name = "item_x_item_attribute", // Nombre de la tabla intermedia
            joinColumns = @JoinColumn(name = "item_attribute_id"), // Nombre de la primary key de itemAtrribute
            inverseJoinColumns = @JoinColumn(name = "item_id") // ombre de la primary key de item
    )
    private Set<Item> items;

    @Column(name = "attribute_name")
    private String attributeName;

    @Column(name = "attribute_value")
    private String atrributeValue;

}
