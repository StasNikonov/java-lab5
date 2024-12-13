/**
 * Class representing a Call tariff.
 * Extends the Tariff class to include specific properties like call minutes.
 */
class CallTariff extends Tariff {
    private int callMinutes;

    /**
     * Constructor to initialize the call tariff details.
     * @param name The name of the tariff.
     * @param monthlyFee The monthly subscription fee.
     * @param clientCount The number of clients subscribed to this tariff.
     * @param callMinutes The number of call minutes included in the tariff.
     * @throws IllegalArgumentException if callMinutes is negative.
     */
    public CallTariff(String name, double monthlyFee, int clientCount, int callMinutes) {
        super(name, monthlyFee, clientCount);
        if (callMinutes < 0) {
            throw new IllegalArgumentException("Call minutes cannot be negative.");
        }
        this.callMinutes = callMinutes;
    }

    /**
     * @return The type of the tariff as "Call Tariff".
     */
    @Override
    public String getTariffType() {
        return "Call Tariff";
    }

    /**
     * @return The number of call minutes included in the tariff.
     */
    public int getCallMinutes() {
        return callMinutes;
    }
}
