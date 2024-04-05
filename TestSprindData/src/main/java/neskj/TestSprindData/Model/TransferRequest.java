package neskj.TestSprindData.Model;

import java.math.BigDecimal;

public class TransferRequest {

    private int senderAccountId;
    private int reviverAccountId;
    private BigDecimal amount;

    public int getSenderAccountId() {
        return senderAccountId;
    }

    public int getReviverAccountId() {
        return reviverAccountId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setSenderAccountId(int senderAccountId) {
        this.senderAccountId = senderAccountId;
    }

    public void setReviverAccountId(int reviverAccountId) {
        this.reviverAccountId = reviverAccountId;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
