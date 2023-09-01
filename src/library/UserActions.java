package library;

public interface UserActions {
    String getLibraryCardInfo();

    String checkOutBook();

    String returnBook();

    String addLateFee();

    String reduceLateFee();

    String payBalance();
}
