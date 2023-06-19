package HomeWork.HomeWorkOOP.HW5;

import HomeWork.HomeWorkOOP.HW5.models.TableModel;
import HomeWork.HomeWorkOOP.HW5.presenters.BookingPresenter;
import HomeWork.HomeWorkOOP.HW5.views.BookingView;
//import HomeWork.HomeWorkOOP.HW5.presenters.Model;
//import HomeWork.HomeWorkOOP.HW5.presenters.View;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        BookingView bookingView = new BookingView();
        TableModel tableModel = new TableModel();
        BookingPresenter bookingPresenter = new BookingPresenter(bookingView, tableModel);
        bookingPresenter.showTables();
        bookingView.reservationTable(new Date(), 13, "MyName");
        bookingPresenter.showTables();
        bookingView.changeReservationTable(1001, new Date(), 13, "MyName");
        bookingPresenter.showTables();
    }

}
