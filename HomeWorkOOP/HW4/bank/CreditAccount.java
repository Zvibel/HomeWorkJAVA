package HomeWork.HomeWorkOOP.HW4.bank;

public class CreditAccount<T extends PersonalData> extends Account<T> {

    public CreditAccount(T data, double amount) {
        super(data, amount);
    }
}
