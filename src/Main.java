
public class Main {
    public static void main(String[] args) {
        makeDeposit(50000,10000, 1000);
        User batman = new User("Bruce", "Wayne", "bwayne@dc.com", "IamBatman#3");
        User superman = new User("kal-El", "Kent", "kkent@dc.com", "Kryptonite#1");

        superman.setFirstName("clark");
        System.out.println(superman.getFirstName());

        batman.setPassword("DarkKnight#1");
        System.out.println(batman.getPassword());
    }

    public static String makeDeposit(int savingsAccountBalance, int indexFundBalance, int depositAmount) {
        String message = "";
        if (savingsAccountBalance > 50000 ) {
            indexFundBalance += depositAmount;
            message += "Index Fund account updated. New balance: $" + indexFundBalance;
            System.out.println(message);
            return message;

        }
        else if (savingsAccountBalance < 50000 && savingsAccountBalance + depositAmount <= 50000) {
            savingsAccountBalance += depositAmount;
            message += "Savings account updated. New balance: $" + savingsAccountBalance;
            System.out.println(message);
            return message;

        }
        else if (savingsAccountBalance + depositAmount > 50000 ){
            int x =0;
            int surplus = 50000;
            x = savingsAccountBalance + depositAmount;
            indexFundBalance = indexFundBalance + x - surplus;
            savingsAccountBalance = surplus;
            message += "Both account's updated. New available balances are:"
                    + "\nSavings: $" + savingsAccountBalance + "\n" + "IndexFund: $" + indexFundBalance;
            System.out.println(message);
            return message;
        }
        else{
            message = "Sorry, can't make a deposit of 0 dollars.";
            System.out.println(message);
            return message;
        }

    }

}