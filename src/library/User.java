package library;

public class User implements LibraryActions, UserActions {
    @Override
    public String getLibraryCardInfo() {
        return "library card!";
    }

    @Override
    public String checkOutBook() {
        return null;
    }

    @Override
    public String returnBook() {
        return null;
    }

    @Override
    public String addLateFee() {
        return null;
    }

    @Override
    public String reduceLateFee() {
        return null;
    }

    @Override
    public String payBalance() {
        return null;
    }
}
