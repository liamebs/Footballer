import java.util.Random; // import random class
public class Footballer { // initialise private class variables
    Random random = new Random();
    private String firstName;
    private String lastName;
    private int age;
    private int appearances;
    private int goals;
    private String team;
    private int value;

    // set instance variables from above class variables
    public Footballer(String firstName, String lastName, int age,
                      int appearances, int goals, String team, int value) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.appearances = appearances;
        this.goals = goals;
        this.team = team;
        this.value = value;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getAppearances() {
        return appearances;
    }

    public int getGoals() {
        return goals;
    }

    public String getTeam() {
        return team;
    }

    public int getValue() {
        return value;
    }

    // method to print player statistics
    public void printStats() {
        System.out.println(getFirstName() + " " + getLastName() + " statistics:");
        System.out.println("Age: " + getAge());
        System.out.println("Team: " + getTeam());
        System.out.println("Appearances: " + getAppearances() + "  Goals: " + getGoals());
        System.out.println("Value: " + getValue());
        System.out.println();

    }

    // behavioural method
    public void nextSeason() {
        age ++;
        appearances = appearances + random.nextInt(38);
        goals = goals + random.nextInt(20);
        value = value + (random.nextInt(100)) * 100000;
        System.out.println("The stats for " + getFirstName() + " " + getLastName()
         + " have been updated!\n");
    }

}
