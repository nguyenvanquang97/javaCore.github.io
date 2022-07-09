import java.time.LocalDate;

public class HistoryTrading {
    private String accountNumber;
    private String idTrading;
    private LocalDate dateTrading;
    private String describe;
    private String acooutNumberTake;
    private long moneyTrading;

    public HistoryTrading() {
    }

    public HistoryTrading(String accountNumber, String idTrading, LocalDate dateTrading, String describe, String acooutNumberTake, long moneyTrading) {
        this.accountNumber = accountNumber;
        this.idTrading = Util.randomIdTrading(8);
        this.dateTrading = dateTrading;
        this.describe = describe;
        this.acooutNumberTake = acooutNumberTake;
        this.moneyTrading = moneyTrading;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIdTrading() {
        return idTrading;
    }

    public void setIdTrading(String idTrading) {
        this.idTrading = idTrading;
    }

    public LocalDate getDateTrading() {
        return dateTrading;
    }

    public void setDateTrading(LocalDate dateTrading) {
        this.dateTrading = dateTrading;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getAcooutNumberTake() {
        return acooutNumberTake;
    }

    public void setAcooutNumberTake(String acooutNumberTake) {
        this.acooutNumberTake = acooutNumberTake;
    }

    public long getMoneyTrading() {
        return moneyTrading;
    }

    public void setMoneyTrading(long moneyTrading) {
        this.moneyTrading = moneyTrading;
    }

    @Override
    public String toString() {
        return idTrading + " - "+dateTrading+ " - "+describe+" - "+
                acooutNumberTake+" - "+moneyTrading;
    }
}
