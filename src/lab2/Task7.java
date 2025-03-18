package lab2;

public class Task7 {
    interface BankAccount {
        void deposit(double amount);
        void withdraw(double amount);
        double getBalance();
    }

    static class MyBankAccount implements BankAccount {
        private double balance;

        public MyBankAccount(double initialBalance) {
            this.balance = initialBalance;
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Текущий баланс: " + balance);
        }

        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Текущий баланс: " + balance);
            } else {
                System.out.println("Недостаточно средств");
            }
        }

        public double getBalance() {
            return balance;
        }
    }

    public static class Main {
        public static void main(String[] args) {
            BankAccount account = new MyBankAccount(0);

            account.deposit(500);
            account.withdraw(300);
            account.withdraw(1500);

            System.out.println("Текущий баланс: " + account.getBalance());
        }
    }
}
