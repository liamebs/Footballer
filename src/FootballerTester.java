public class FootballerTester {
    public static void main(String[] args) {
        // Instantiate three players
        Footballer Player01 = new Footballer("Jim", "Johnson", 25, 123,
                45, "Manchester Argyle", 2000000);
        Footballer Player02 = new Footballer("Simon", "Watson", 28, 310,
                17, "London United", 3500000);
        Footballer Player03 = new Footballer("Rebecca", "Gemini", 23, 26,
                14, "Bristol Belles", 2400000);

        // call method to print statistics
        Player01.printStats();
        Player02.printStats();
        Player03.printStats();

        // call behavioural method to update stats to include a season of playing football
        Player01.nextSeason();
        Player02.nextSeason();
        Player03.nextSeason();

        // call stats method to show updated stats
        Player01.printStats();
        Player02.printStats();
        Player03.printStats();


    }
}