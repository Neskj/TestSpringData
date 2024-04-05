package neskj.TestSprindData.Model;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

public class Account {
    @Id
    private int id;
    private String name;
    private BigDecimal amount;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
