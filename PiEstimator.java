<<<<<<< HEAD
import java.util.Random;
=======
import java.util.concurrent.ThreadLocalRandom;
>>>>>>> f8044d7b171c4ba8946ea636f59e66325d7f5e92

public class PiEstimator {

    public static void main(String[] args) {
        try {
            if (args.length != 1) {
                throw new IllegalArgumentException("Exactly one argument required");
            }
<<<<<<< HEAD
            int darts = Integer.parseInt(args[0]);
            if (Integer.parseInt(args[0]) == 0) {
                System.err.println("At least one dart required");
            }
            System.out.println(estimate(darts));
        } catch (NumberFormatException e) {
            System.err.println("Argument must be an integer");

        } catch (IllegalArgumentException e) {
            System.err.println("Exactly one argument required");

=======
            //
            // TODO: Parse the command line argument and call your estimate function
            //
          int darts =  Integer.parseInt(args[0]);
            estimate(darts);
        } catch (NumberFormatException e) {
            System.err.println("Entry format was wrong");
            //
            // TODO: Take care of a possible non-integer argument.
            //
        } catch (IllegalArgumentException e) {
            System.err.println("Fix formatting of argument");
            //
            // TODO: Take care of the exception you threw above.
            //
>>>>>>> f8044d7b171c4ba8946ea636f59e66325d7f5e92
        }
    }

    public static double estimate(int darts) {
<<<<<<< HEAD
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
=======
     double[] dartThrows = new double [darts];
     double sumofDarts = 0.0;
     double sumofArea = 4.0 * darts;
     for (int i = 0; i < darts; i++) { 
         dartThrows[i] = ThreadLocalRandom.current().nextDouble(0.0, 4.0 + 1);
         sumofDarts += dartThrows[i];
           
         }
    double result = sumofDarts / sumofArea * 4;
    System.out.println(result);

    
   
     
 return result;

} 
}

    

    //
    // Don't be afraid to put in some private "helper" methods. You don't have to, of
    // course, but they could be useful and keep your code modular.
    //

>>>>>>> f8044d7b171c4ba8946ea636f59e66325d7f5e92
