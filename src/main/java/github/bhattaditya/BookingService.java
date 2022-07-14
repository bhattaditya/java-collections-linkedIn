package github.bhattaditya;

import java.util.HashMap;
import java.util.Map;

public class BookingService {

    private Map<Room, Guest> bookings = new HashMap<>();

    public boolean book(Room room, Guest guest) {

        /*
         * 1. The provided Guest is placed in the bookings Map and
         * associated with the provided room, only if no other guest
         * is associated with the room.
         *
         * Returns a boolean that indicates if the Guest was
         * successfully placed in the room.
         */

        if (!bookings.containsKey(room)) {
            bookings.put(room, guest);
            return true;
        }
        return false;
    }

    public double totalRevenue() {

        /*
         * 2. Returns a double that totals the rate of each Room booked
         * in the bookings Map.
         */
        double totalRevenue = 0.0;

        for (Map.Entry<Room, Guest> entry: bookings.entrySet()) {
            Room r = entry.getKey();
            totalRevenue += r.getRate();
        }
        return totalRevenue;
    }

    public Map<Room, Guest> getBookings() {
        return bookings;
    }
}
