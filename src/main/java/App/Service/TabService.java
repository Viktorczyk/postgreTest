package App.Service;

import App.Model.Items;
import App.Repository.ItemRepo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class TabService
{

     @Autowired
    private ItemRepo itemRepo;

    public List<Items> itemsList() {return itemRepo.findAll();}


}
