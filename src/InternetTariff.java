/**
 * Class representing an Internet tariff.
 * Extends the Tariff class to include specific properties like data limit.
 */
class InternetTariff extends Tariff {
    private int dataLimit; // in GB

    /**
     * Constructor to initialize the internet tariff details.
     * @param name The name of the tariff.
     * @param monthlyFee The monthly subscription fee.
     * @param clientCount The number of clients subscribed to this tariff.
     * @param dataLimit The data limit in GB.
     * @throws IllegalArgumentException if dataLimit is negative.
     */
    public InternetTariff(String name, double monthlyFee, int clientCount, int dataLimit) {
        super(name, monthlyFee, clientCount);
        if (dataLimit < 0) {
            throw new IllegalArgumentException("Data limit cannot be negative.");
        }
        this.dataLimit = dataLimit;
    }

    /**
     * @return The type of the tariff as "Internet Tariff".
     */
    @Override
    public String getTariffType() {
        return "Internet Tariff";
    }

    /**
     * @return The data limit of the tariff in GB.
     */
    public int getDataLimit() {
        return dataLimit;
    }
}