import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Class managing a collection of tariffs.
 * Provides functionality to sort, search, and calculate statistics.
 */
public class TariffManager {
    private List<Tariff> tariffs = new ArrayList<>();

    /**
     * Adds a new tariff to the collection.
     * @param tariff The tariff to add.
     */
    public void addTariff(Tariff tariff) {
        tariffs.add(tariff);
    }

    /**
     * Calculates the total number of clients across all tariffs.
     * @return The total number of clients.
     */
    public int calculateTotalClients() {
        return tariffs.stream().mapToInt(Tariff::getClientCount).sum();
    }

    /**
     * Sorts the tariffs by their monthly fee in ascending order.
     * @return The sorted list of tariffs.
     */
    public List<Tariff> sortByMonthlyFee() {
        tariffs.sort(Comparator.comparingDouble(Tariff::getMonthlyFee));
        return tariffs;
    }

    /**
     * Finds tariffs within a specified range of monthly fees.
     * @param min The minimum monthly fee.
     * @param max The maximum monthly fee.
     * @return A list of tariffs within the specified range.
     * @throws IllegalArgumentException if the range is invalid (e.g., min > max).
     */
    public List<Tariff> findTariffsInRange(double min, double max) {
        if (min < 0 || max < 0 || min > max) {
            throw new IllegalArgumentException("Invalid range for monthly fee.");
        }
        List<Tariff> result = new ArrayList<>();
        for (Tariff tariff : tariffs) {
            if (tariff.getMonthlyFee() >= min && tariff.getMonthlyFee() <= max) {
                result.add(tariff);
            }
        }
        return result;
    }

    /**
     * @return The list of all tariffs.
     */
    public List<Tariff> getAllTariffs() {
        return tariffs;
    }
}
