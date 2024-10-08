package KeyLab.keylab.controller;

import KeyLab.keylab.domain.item.Item;
import KeyLab.keylab.dto.ItemDTO;
import KeyLab.keylab.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.modelmapper.ModelMapper;


@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/")
    public List<Item> getAllItems() {
        return itemService.getAllItem();
    }

    @GetMapping("/filter")
    public List<Item> getKeyboardsByCategory(@RequestParam String category) {
        return itemService.getKeyboardByCategory(category);
    }

    @PostMapping("/")
    public ResponseEntity<ItemDTO> createItem(@RequestBody ItemDTO itemDTO) {
        ItemDTO newItem = itemService.createItem(modelMapper.map(itemDTO,Item.class));
        return ResponseEntity.ok(newItem);
    }
}
