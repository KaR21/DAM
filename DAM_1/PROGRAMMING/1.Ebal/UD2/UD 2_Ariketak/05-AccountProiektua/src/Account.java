
public class Account {

    private int balance = 0;
    private String name;
    private String id;

    public Account(String id, String name) {
        this.name = name;
        this.id = id;
    }

    public Account(String id, String name, int balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int credit(int amount) {
        this.balance = this.balance + amount;

        return balance;
    }

    public int debit(int amount) {
        if (this.balance >= amount) {
           this.balance = this.balance - amount;
        } else {
            System.out.println("amount exceeded");
        }

        return balance;
    }

    public int transferTo(Account another, int amount) {
        if (this.balance >= amount) {
            this.debit(amount);
            another.credit(amount);
        } else {
            System.out.println("amount exceeded");
        }

        return balance;
    }

    @Override
    public String toString() {
        return "Account[" + "id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }

}
