package library;

public class User implements LibraryActions, UserActions {
    @Override
    public String getLibraryCardInfo() {
        return "library card!";
    }
}
