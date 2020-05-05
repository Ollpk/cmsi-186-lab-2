import java.lang.Math;

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
    }
  }

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
}
