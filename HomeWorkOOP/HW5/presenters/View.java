package HomeWork.HomeWorkOOP.HW5.presenters;

import HomeWork.HomeWorkOOP.HW5.models.Table;

import java.util.ArrayList;

public interface View {
    void setObserver(ViewObserver observer);
    void updateTablesView(ArrayList<Table> tables);
    void updateReservationTableResalt(int reservationNo);
}