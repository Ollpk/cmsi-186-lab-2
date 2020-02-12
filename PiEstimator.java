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
      double[] specificThrow;
        for (int i = 0; i < darts; i++) {
      specificThrow[i] =  (Math.PI / 4);
        }
        double resolved = 1 - Math.pow(((4 - Math.PI)/4), darts);

        //
        // TODO: Do the main work here. I've just returned 0.0 as a place holder
        // so the code compiles. It isn't right though. Remove the return here and
        // implement the whole method on your own.
        //
        return resolved;
    }

    //
    // Don't be afraid to put in some private "helper" methods. You don't have to, of
    // course, but they could be useful and keep your code modular.
    //
}
