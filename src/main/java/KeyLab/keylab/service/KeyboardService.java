package KeyLab.keylab.service;

import KeyLab.keylab.domain.item.Keyboard;
import KeyLab.keylab.repository.KeyboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class KeyboardService {
    @Autowired
    private KeyboardRepository keyboardRepository;

    public List<Keyboard> getAllKeyboards() {

        return keyboardRepository.findAll();
    }

    public List<Keyboard> getKeyboardByCategory(String categoryName) {
        return  keyboardRepository.findByCategoryName(categoryName);
    }
}
