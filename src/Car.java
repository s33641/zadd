public class Car extends Vehicle {
    private int numberOfSeats;

    public int getnumberOfSeats() {
   return numberOfSeats;
    }
public void setnumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
}
public void start(){
        System.out.println("Car start");
}
public void stop(){
        System.out.println("Car stop");
}
}