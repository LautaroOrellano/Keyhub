package KeyLab.keylab.service;

import KeyLab.keylab.domain.item.Item;
import KeyLab.keylab.dto.ItemDTO;
import KeyLab.keylab.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import org.modelmapper.ModelMapper;


@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<Item> getAllItem() {

        return itemRepository.findAll();
    }

    public List<Item> getKeyboardByCategory(String categoryName) {
        return  itemRepository.findByCategoryName(categoryName);
    }

    public ItemDTO createItem(Item item) {
        Item newItem = itemRepository.save(item);
        return modelMapper.map(newItem, ItemDTO.class);
    }
}


