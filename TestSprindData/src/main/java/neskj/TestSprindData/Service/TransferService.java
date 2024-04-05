package neskj.TestSprindData.Service;

import neskj.TestSprindData.Exceptions.AccountNotFoundException;
import neskj.TestSprindData.Model.Account;
import neskj.TestSprindData.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;


@Service
public class TransferService {

    private final AccountRepository accountRepository;

    @Autowired
    TransferService(AccountRepository accountRepository){
        this.accountRepository=accountRepository;
    }
    @Transactional
    public void trancferMoney(int idSender, int idReciver, BigDecimal amount)  {

        Account sender=accountRepository.findById(idSender)
                .orElseThrow(()->new AccountNotFoundException());
        Account reciver=accountRepository.findById(idReciver)
                .orElseThrow(()->new AccountNotFoundException());

        BigDecimal senderNewBalance=sender.getAmount().subtract(amount);
        BigDecimal reciverNewBalance=reciver.getAmount().add(amount);

        accountRepository.changeAmount(idSender,senderNewBalance);
        accountRepository.changeAmount(idReciver,reciverNewBalance);
    }

    public Iterable<Account>getAllAcounts(){
        return accountRepository.findAll();
    }

    public List<Account> findAccountsByName(String name){
        return accountRepository.findAccountByName(name);
    }
}
