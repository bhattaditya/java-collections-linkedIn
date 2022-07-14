package github.bhattaditya;

import java.util.*;

public class Application {

    public static void main(String[] args) {

        Guest john = new Guest("John", "Doe", false);
        Guest bob = new Guest("Bob", "Doe", false);
        Guest sonia = new Guest("Sonia", "Doe", true); //loyalty program
        Guest siri = new Guest("Siri", "Doe", true); //loyalty program

        Queue<Guest> guestArrayDeque = new ArrayDeque<>();
        guestArrayDeque.addAll(List.of(john, bob, sonia, siri));
        System.out.println(guestArrayDeque);

        Comparator<Guest> guestComparator = Comparator.comparing(Guest::isLoyaltyProgramMember).reversed();
        Queue<Guest> guestsPriorityQueue = new PriorityQueue<>(guestComparator);
        guestsPriorityQueue.addAll(List.of(john, bob, sonia, siri));
        System.out.println(guestsPriorityQueue);

    }

    public static void print(Queue<Guest> queue) {

        System.out.format("%n--Queue Contents--%n");

        int x = 0;
        for(Guest guest : queue) {
            System.out.format("%x: %s %s %n", x++, guest.toString(), x == 1 ? "(Head)":"");
        }

        System.out.println("");

    }
}