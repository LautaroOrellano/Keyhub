package KeyLab.keylab.dto;

import KeyLab.keylab.domain.category.Category;
import lombok.Data;

@Data
public class ItemDTO {

    private Long id;

    private String name;

    private Integer stock;

    private Float price;

    private String description;

    private String color;

    private Category category;

}
