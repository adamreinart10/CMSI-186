import java.time.LocalDate;

public class DateCounter {

    /**
     * Returns today's date as a three-element integer array in year-month-day order.
     */
     public static int[] today() {
         LocalDate now = LocalDate.now();
         return new int[] {
             now.getYear(), now.getMonth().getValue(), now.getDayOfMonth()
         };
     }

}
