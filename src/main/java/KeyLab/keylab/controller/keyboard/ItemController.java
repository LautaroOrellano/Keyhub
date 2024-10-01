package KeyLab.keylab.controller.keyboard;

import KeyLab.keylab.domain.item.Keyboard;
import KeyLab.keylab.service.KeyboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/keyboards")
public class ItemController {
    @Autowired
    private KeyboardService keyboardService;

    @GetMapping
    public List<Keyboard> getAllKeyboards() {
        return keyboardService.getAllKeyboards();
    }

    @GetMapping("/filter")
    public List<Keyboard> getKeyboardsByCategory(@RequestParam String category) {
        return keyboardService.getKeyboardByCategory(category);

    }

}
