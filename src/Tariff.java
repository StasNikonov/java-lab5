/**
 * Abstract class representing a mobile tariff.
 * It serves as a base class for specific tariff types like Internet, Call, or Mixed tariffs.
 */
public abstract class Tariff {
    private String name;
    private double monthlyFee;
    private int clientCount;

    /**
     * Constructor to initialize the tariff details.
     * @param name The name of the tariff.
     * @param monthlyFee The monthly subscription fee.
     * @param clientCount The number of clients subscribed to this tariff.
     * @throws IllegalArgumentException if monthlyFee or clientCount is negative.
     */
    public Tariff(String name, double monthlyFee, int clientCount) {
        if (monthlyFee < 0 || clientCount < 0) {
            throw new IllegalArgumentException("Monthly fee and client count cannot be negative.");
        }
        this.name = name;
        this.monthlyFee = monthlyFee;
        this.clientCount = clientCount;
    }

    /**
     * @return The name of the tariff.
     */
    public String getName() {
        return name;
    }

    /**
     * @return The monthly fee of the tariff.
     */
    public double getMonthlyFee() {
        return monthlyFee;
    }

    /**
     * @return The number of clients subscribed to this tariff.
     */
    public int getClientCount() {
        return clientCount;
    }

    /**
     * Abstract method to get the specific type of the tariff.
     * @return The type of the tariff as a string.
     */
    public abstract String getTariffType();
}
