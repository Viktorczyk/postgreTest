package App.Service;

import App.Model.HeadersInvoices;
import App.Repository.HeaderInvRepo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class HeadersService {

    @Autowired
    private HeaderInvRepo headerInvRepo;

    public List<HeadersInvoices> invoicesList(){ return headerInvRepo.findAll();}

    public HeadersInvoices getHeader(Integer headersId){ return headerInvRepo.findOne(headersId);}

    public HeadersInvoices addHeader(HeadersInvoices newHeadId){
        return headerInvRepo.save(newHeadId);
    }

}
