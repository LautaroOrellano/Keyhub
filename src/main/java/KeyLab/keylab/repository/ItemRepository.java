package KeyLab.keylab.repository;

import KeyLab.keylab.domain.item.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

        List<Item> findByCategoryName(String keyboardType);

}
