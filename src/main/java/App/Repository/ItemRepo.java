package App.Repository;

import App.Model.Items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo   extends JpaRepository<Items,Integer>
 {
}
