package HomeWork.HomeWorkOOP.HW5.models;

import java.util.ArrayList;

public class Table {
    private static int counter = 10;
    private final int no; 

    {
        no = ++counter;
    }

    private final ArrayList<Reservation> reservations = new ArrayList<>();

    public int getNo() {
        return no;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    @Override
    public String toString() {
        return String.format("Столик #%d, резерв #%s", no, reservations);
    }
}