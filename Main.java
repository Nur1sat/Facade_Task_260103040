public class Main {
    public static void main(String[] args) {
        FlightBookingFacade facade = new FlightBookingFacade();
        String card = "4532015112830366";

        System.out.println("=== Test 1: Valid Booking ===");
        System.out.println("Result 1: " + facade.bookFlight(
                "Amina Suleimenova", "KZ204", "14B", 320.0, 2, 24.5, "EUR", card));

        System.out.println("\n=== Test 2: Blocked Seat ===");
        System.out.println("Result 2: " + facade.bookFlight(
                "Daniyar Kassymov", "KZ204", "13A", 320.0, 1, 15.0, "USD", card));

        System.out.println("\n=== Test 3: Payment Failure and Rollback ===");
        System.out.println("Result 3: " + facade.bookFlight(
                "Timur Bekov", "KC101", "08C", 320.0, 1, 18.0, "KZT", "1234"));

        System.out.println("\n=== Test 4: SILVER Loyalty Booking ===");
        System.out.println("Result 4: " + facade.bookFlight(
                "Madina Nurgali", "KZ204", "18F", 400.0, 3, 30.0, "EUR", card, "SILVER"));
    }
}
