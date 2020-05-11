import java.util.Random;

public class PiEstimator {

    public static void main(String[] args) {
        try {
            if (args.length != 1) {
                throw new IllegalArgumentException("Exactly one argument required");
            }
            int darts = Integer.parseInt(args[0]);
            if (Integer.parseInt(args[0]) == 0) {
                System.err.println("At least one dart required");
            }
            System.out.println(estimate(darts));
        } catch (NumberFormatException e) {
            System.err.println("Argument must be an integer");

        } catch (IllegalArgumentException e) {
            System.err.println("Exactly one argument required");

        }
    }

    public static double estimate(int darts) {
        double x;
        double y;
        double result;
        int numberInside = 0;
        int tries = 0;
        if (darts < 1) {
            throw new IllegalArgumentException("At least one dart required");
        }

        for (int i = 0; i < darts; i++) {
            Random r = new Random();
            x = 2 * r.nextDouble() - 1;
            y = 2 * r.nextDouble() - 1;
            if (x * x + y * y < 1) {
                numberInside++;

            }
            tries = tries + 1;

        }
        result = (double) numberInside / tries;

        return (double) 4.0 * result;

    }

}
