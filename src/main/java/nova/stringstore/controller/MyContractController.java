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
    public void storeString(@RequestBody String value, @RequestParam String privateKey) throws Exception {
        myContractService.storeString(value, privateKey);
    }

    @GetMapping("/get")
    public String getString(@RequestBody String privateKey) throws Exception {
        return myContractService.getString(privateKey);
    }
}