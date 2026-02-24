public class BPIAtm {

    public static void main(String[] args) {

        ATMDispenseChain atmDispenser = new ATMDispenseChain();

        int amount = 2970; // Try: 2970, 270, 250

        if (amount % 10 != 0) {
            System.out.println("Amount should be in multiples of 10.");
        } else {
            atmDispenser.dispense(new Currency(amount));
        }
    }
}