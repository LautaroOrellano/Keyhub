package KeyLab.keylab.domain.cartItem;

import KeyLab.keylab.domain.item.Item;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity (name = "cart_item")
@Data
@Table(name = "cart_items")
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(
            name = "cart_item_x_item",
            joinColumns = @JoinColumn(name = "cart_item_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id")
    )
    private Set<Item> items;


}
