package App.Controller;

import App.Model.Items;
import App.Service.TabService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/all")
public class Tab {

    @Autowired
    private TabService tab;



    @GetMapping(value ="/headers", produces = MediaType.APPLICATION_JSON_VALUE)
   public List<Items> listItems() {return tab.itemsList();}

}


