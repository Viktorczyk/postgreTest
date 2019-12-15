package App.Controller.RestController;

import App.Model.HeadersInvoices;
import App.Service.HeadersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inv")
public class Controller {

    @Autowired
    private HeadersService headersService;


    @GetMapping(value="/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<HeadersInvoices> headersInvoicesList() {return headersService.invoicesList();}

    @GetMapping(value="/list/one/{headersId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public HeadersInvoices getHeader(@PathVariable("headersId") Integer headersId){
        return headersService.getHeader(headersId);
    }

    @PostMapping(value="/post", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public HeadersInvoices addHeader(@RequestBody HeadersInvoices newHeaders)
    {
       HeadersInvoices addHeader = new HeadersInvoices();

       addHeader.setType(newHeaders.getType());
       addHeader.setNumber(newHeaders.getNumber());
       addHeader.setNumberString(newHeaders.getNumberString());
       addHeader.setDate(newHeaders.getDate());
       addHeader.setExchangeRate(newHeaders.getExchangeRate());
       addHeader.setPayMethod(newHeaders.getPayMethod());

       headersService.addHeader(newHeaders);
       return newHeaders;
    }
}
