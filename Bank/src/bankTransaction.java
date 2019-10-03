import java.time.LocalDateTime;

// Create bank transaction object.
class bankTransaction {
    String transTime;
    Double transAmount;
    Double transBalance;

    public bankTransaction(String t, Double m, Double b) {
        this.transTime = t;
        this.transAmount = m;
        this.transBalance = b;
    }

    public void printTransaction() {
        System.out.println(this.transTime + " | " + this.transAmount + " | " + this.transBalance);
    }
}
