package App.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class HeadersInvoices extends BaseModel implements Serializable {

    @Column(name="typeInv")
    private String type;

    @Column(name="number")
    private Integer number;

    @Column(name="numberString")
    private String numberString;

    @Column(name="dateInv")
    private Date date;

    @Column(name="payMethod")
    private String payMethod;

    @Column(name="exRate", precision = 5, scale = 4)
    private BigDecimal exchangeRate;

    @Column(name="exDate")
    private Date exDate;

    @Column(name="descInv")
    private String Desc;

}
