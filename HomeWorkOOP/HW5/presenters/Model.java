package HomeWork.HomeWorkOOP.HW5.presenters;

import HomeWork.HomeWorkOOP.HW5.models.Table;

import java.util.ArrayList;
import java.util.Date;

public interface Model {

    ArrayList<Table> loadTables();
    int resrevationTable(Date reserationDate, int tableNo, String name);
    int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
}
