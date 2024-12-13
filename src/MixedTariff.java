/**
 * Class representing a Mixed tariff.
 * Extends the Tariff class to include properties for both data limit and call minutes.
 */
class MixedTariff extends Tariff {
    private int dataLimit;
    private int callMinutes;

    /**
     * Constructor to initialize the mixed tariff details.
     * @param name The name of the tariff.
     * @param monthlyFee The monthly subscription fee.
     * @param clientCount The number of clients subscribed to this tariff.
     * @param dataLimit The data limit in GB.
     * @param callMinutes The number of call minutes included in the tariff.
     * @throws IllegalArgumentException if dataLimit or callMinutes is negative.
     */
    public MixedTariff(String name, double monthlyFee, int clientCount, int dataLimit, int callMinutes) {
        super(name, monthlyFee, clientCount);
        if (dataLimit < 0 || callMinutes < 0) {
            throw new IllegalArgumentException("Data limit and call minutes cannot be negative.");
        }
        this.dataLimit = dataLimit;
        this.callMinutes = callMinutes;
    }

    /**
     * @return The type of the tariff as "Mixed Tariff".
     */
    @Override
    public String getTariffType() {
        return "Mixed Tariff";
    }

    /**
     * @return The data limit of the tariff in GB.
     */
    public int getDataLimit() {
        return dataLimit;
    }

    /**
     * @return The number of call minutes included in the tariff.
     */
    public int getCallMinutes() {
        return callMinutes;
    }
}
