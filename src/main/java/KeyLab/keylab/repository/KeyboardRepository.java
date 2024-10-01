package KeyLab.keylab.repository;

import KeyLab.keylab.domain.item.Keyboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KeyboardRepository extends JpaRepository<Keyboard, Long> {

        List<Keyboard> findByCategoryName(String keyboardType);

}
