package no04;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("- - - - - - - - Single Tour - - - - - - - - -");
        System.out.println(" ");
        SingleTour sin = new SingleTour("Ayuttaya",500,10);
        System.out.println("Tour Name : "+sin.getName());
        System.out.println(sin.getPrice());
        System.out.println("Available Seat : "+sin.getAvailableSeats());
        System.out.println("Reserved Seats 2 Seats");
        sin.reservedTour(2);
        System.out.println("Tour Price : "+sin.getPrice());
        System.out.println("Available Seat : "+sin.getAvailableSeats());
        System.out.println(" ");

        System.out.println("- - - - - - - - Package Tour - - - - - - - -");
        System.out.println(" ");


        List<Tour> tours = new ArrayList<>();
        tours.add(new SingleTour("Paris",10000,50));
        tours.add(new SingleTour("Rome",8000,40));
        tours.add(new SingleTour("London",12000,40));

        PackageTour pack = new PackageTour("Travel in Europe",tours);

        System.out.println(pack.getName());
        System.out.println("Package Price : "+pack.getPrice());
        System.out.println("Available Seat : "+pack.getAvailableSeats());
        pack.reservedSeat(10);
        System.out.println("Available Seat : "+pack.getAvailableSeats());

    }
}
