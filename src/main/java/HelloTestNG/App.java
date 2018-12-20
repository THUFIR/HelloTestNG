package HelloTestNG;

import java.util.logging.Logger;

public class App {

    private static final Logger LOG = Logger.getLogger(App.class.getName());

    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        //   System.out.println(new App().getGreeting());

        //    RandomEmailGenerator obj = new RandomEmailGenerator();
        //    String email = obj.generate();
        //  Assert.assertNotNull(email);
        //  Assert.assertEquals(email, "feedback@yoursite.com");
        new App().foo();
    }

    private double calculateInterest(double amount) {
        LOG.info(String.valueOf(amount));
        assert amount > 0 && amount <= 1_000;
        assert amount > 0;

        double interest = 0.0;

        // calculate interest
        return interest;
    }

    private void foo() {
        double bar = calculateInterest(-5.3);
        LOG.info("bar" + bar);
    }
}
