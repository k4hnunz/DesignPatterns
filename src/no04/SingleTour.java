package no04;

public class SingleTour implements Tour {

    private String name;
    private double price;
    private int allSeats;
    private int reservedSeats = 1;

    public SingleTour() {
    }

    public SingleTour(String name, double price, int allSeats) {
        this.name = name;
        this.price = price;
        this.allSeats = allSeats;
    }

    public void reservedTour(int reservedSeats){
        this.reservedSeats = reservedSeats;
        if (allSeats > reservedSeats){
            allSeats -= reservedSeats;
        }
        else{
            System.out.println("seats have no enough");
        }
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        price = price*reservedSeats;
        return price;
    }

    @Override
    public int getAvailableSeats() {
        return allSeats;
    }
}
