/**
 * Main class to demonstrate the functionality of TariffManager and its associated classes.
 */
public class Main {
    public static void main(String[] args) {
        try {
            TariffManager manager = new TariffManager();

            // Adding various tariffs
            manager.addTariff(new InternetTariff("Internet Basic", 20.0, 100, 50));
            manager.addTariff(new CallTariff("Call Standard", 15.0, 200, 300));
            manager.addTariff(new MixedTariff("Mixed Premium", 30.0, 150, 100, 500));

            // Calculating total clients
            System.out.println("Total clients: " + manager.calculateTotalClients());

            // Sorting tariffs by monthly fee
            System.out.println("Tariffs sorted by monthly fee:");
            manager.sortByMonthlyFee().forEach(t ->
                    System.out.println(t.getName() + " - $" + t.getMonthlyFee()));

            // Finding tariffs in a specific range
            System.out.println("Tariffs in the range $10 - $25:");
            manager.findTariffsInRange(10, 25).forEach(t ->
                    System.out.println(t.getName() + " - $" + t.getMonthlyFee()));
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
