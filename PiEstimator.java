import java.util.concurrent.ThreadLocalRandom;

public class PiEstimator {

    public static void main(String[] args) {
        try {
            if (args.length != 1) {
                throw new IllegalArgumentException("Exactly one argument required");
            }
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
        }
    }

    public static double estimate(int darts) {
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

