package HomeWork.HomeWorkOOP.HW5.presenters;

import HomeWork.HomeWorkOOP.HW5.models.Table;

import java.util.ArrayList;
import java.util.Date;

public class BookingPresenter implements ViewObserver {
    private final View bookingView;
    private final Model tableModel;

    public BookingPresenter(View bookingView, Model tableModel){
        this.bookingView = bookingView;
        this.tableModel = tableModel;
        bookingView.setObserver(this);
    }

    private ArrayList<Table> loadTables(){
        return tableModel.loadTables();
    }
    public void showTables() {
        bookingView.updateTablesView(loadTables());
    }

    private void showReservationTableResalt(int reservationNo) {
        bookingView.updateReservationTableResalt(reservationNo);
    }

    private void showChangeReservationTableResalt(int newReservationNo) {
        bookingView.updateReservationTableResalt(newReservationNo);
    }


    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        int reservationNo = tableModel.resrevationTable(orderDate, tableNo, name);
        showReservationTableResalt(reservationNo);
    }

    @Override
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        int newReservationNo = tableModel.changeReservationTable(oldReservation, reservationDate, tableNo, name);
        showChangeReservationTableResalt(newReservationNo);
    }
}