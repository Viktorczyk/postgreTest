package App.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Items  {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name="id")
    protected Integer id;

    @Column(name="number")
    private String number;

    @Column(name="descript")
    private String descript;


    @Column(name="descript2")
    private String descript2;


}
