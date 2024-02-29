package nova.stringstore.controller;


import nova.stringstore.service.MyContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contract")
public class MyContractController {

    @Autowired
    private MyContractService myContractService;

    @PostMapping("/store")
    public void storeString(@RequestBody String value) throws Exception {
        String privateKey = "0x4e3e829be55d927b0db97bcca136521c7dae95fb94a1737273e4b2ad4e08292b";
        myContractService.storeString(value, privateKey);
    }

    @GetMapping("/get")
    public String getString() throws Exception {
        String privateKey = "0x4e3e829be55d927b0db97bcca136521c7dae95fb94a1737273e4b2ad4e08292b";
        return myContractService.getString(privateKey);
    }
}