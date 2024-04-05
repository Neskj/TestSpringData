package neskj.TestSprindData.Controller;

import neskj.TestSprindData.Model.Account;
import neskj.TestSprindData.Model.TransferRequest;
import neskj.TestSprindData.Service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PayController {

    private final TransferService transferService;

    @Autowired
    PayController(TransferService transferService){
        this.transferService=transferService;
    }

    @PostMapping("/pay")
    public void transferMoney(@RequestBody TransferRequest transferRequest){
        transferService.trancferMoney(transferRequest.getSenderAccountId(),transferRequest.getReviverAccountId(),transferRequest.getAmount());
    }

    @GetMapping("/accounts")
    public Iterable<Account> getAllAccounts(@RequestParam (required = false)String name){
        if(name==null){
            return transferService.getAllAcounts();
        }else{
            return transferService.findAccountsByName(name);
        }

    }
}
