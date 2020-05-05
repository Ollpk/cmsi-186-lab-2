import java.lang.Math;
<<<<<<< HEAD

public class SharedBirthday {

  public static void main(String[] args) {
    try {

      if (args.length != 3) {
        throw new IllegalArgumentException("Exactly three arguments required");
      }
      int people = Integer.parseInt(args[0]);
      if (people <= 2) {
        throw new IllegalArgumentException("At least two people required");
      }
      int days = Integer.parseInt(args[1]);
      if (days < 1) {
        throw new IllegalArgumentException("At least one day required");
      }
      int trials = Integer.parseInt(args[2]);
      if (trials < 1) {
        throw new IllegalArgumentException("At least one trial required");
      }
      System.out.println("Your probability is: " + probabilityEstimate(people, days, trials) + "%");

    } catch (NumberFormatException e) {
      System.err.println("Arguments must all be integers");
    } catch (IllegalArgumentException e) {
      System.err.println(e.getMessage());
=======
public class SharedBirthday {

    public static void main(String[] args) {
        try {
            if (args.length != 3) {
                throw new IllegalArgumentException("Exactly three arguments required");
            }
            int people = Integer.parseInt(args[0]);
            int days = Integer.parseInt(args[1]);
            int trials = Integer.parseInt(args[2]);
            System.out.println( "Your probability is: " + probabilityEstimate(people, days, trials) + "%");
        } catch (NumberFormatException e) {
            System.err.println("Arguments must all be integers");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
>>>>>>> f8044d7b171c4ba8946ea636f59e66325d7f5e92
    }
  }

<<<<<<< HEAD
  public static double probabilityEstimate(int people, int days, int trials) {
    if (people < 2) {
      throw new IllegalArgumentException("At least two people required");
    }
    if (days < 1) {
      throw new IllegalArgumentException("At least one day required");
    }
    if (trials < 1) {
      throw new IllegalArgumentException("At least one trial required");
    }

    int birthdayList[] = new int[days];
    int counter = 0;
    for (int i = 0; i < trials; i++) {
      int sharedBirthdays = 0;
      for (int j = 0; j < birthdayList.length; j++) {
        birthdayList[j] = 0;
      }
      for (int k = 1; k <= people; k++) {
        int randomBday = (int) Math.floor(Math.random() * days);
        birthdayList[randomBday]++;
      }
      for (int l = 0; l < days; l++) {
        if (birthdayList[l] > 1) {
          sharedBirthdays++;
        }
      }
      if (sharedBirthdays >= 1) {
        counter++;
      }
    }
    return ((double) counter / trials);
  }
=======
    public static double probabilityEstimate(int people, int days, int trials) {
      double resolved = 0.0;
      double[] resolvedArray = new double [trials];
      for (int i = 0; i < trials; i++ ) {
        int sharedBirthdays = 0;
        int[] myPeople = new int[people] ;
        for (int a = 0; a < people; a++) {
          myPeople[a] = (int) ((Math.random() * days) + 1);
        }
        for (int test = 0; test < people; test++) {
          for (int testTwo = test + 1; testTwo < people; testTwo++) {
            if (myPeople[test] == myPeople[testTwo]) {
              sharedBirthdays++;
            }
          }
        }

        resolvedArray[i] = sharedBirthdays/ (double) people;
      }
      Double sumProb = 0.0;
      for (int a = 0; a < resolvedArray.length; a++) {
        sumProb += resolvedArray[a];

      }




        return (sumProb / trials) * 100 ;





        // TODO: Do the main work here. I've just returned 0.0 as a place holder
        // so the code compiles. It isn't right though. Remove the return here and
        // implement the whole method on your own.




    //
    // TODO: Don't be afraid to write private helper methods to keep your code modular.
}
>>>>>>> f8044d7b171c4ba8946ea636f59e66325d7f5e92
}
