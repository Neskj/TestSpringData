package neskj.TestSprindData.Repository;

import neskj.TestSprindData.Model.Account;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface AccountRepository extends CrudRepository<Account,Integer> {

    @Query("Select * from account where name= :name")
    List<Account> findAccountByName(String name);

    @Modifying
    @Query("update account set amount= :amount where id= :id")
    void changeAmount(int id, BigDecimal amount);
}
