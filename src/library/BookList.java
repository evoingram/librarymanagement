package library;

import logger.*;

import java.util.*;

public class BookList {
    // List = by Author
    List<Book> byAuthors;
    // Set = by Title
    Set<Book> byTitle;
    // Map = by Publication Year
    Map<Book, Integer> byPublicationYear;
    // ArrayList = by main genre
    ArrayList<Book> byFirstGenre;
    // LinkedList = by main tag
    LinkedList<Book> byMainTag;
    // HashSet = by pages
    HashSet<Book> byPages;
    // TreeSet = by isbn
    TreeSet<Book> byIsbn;
    // HashMap = by publisher
    HashMap<Book, String> byPublisher;
    // TreeMap = by format
    TreeMap<Book, String> byFormat;

    public BookList(
            List<Book> byAuthors,
            Set<Book> byTitle,
            Map<Book, Integer> byPublicationYear,
            ArrayList<Book> byFirstGenre,
            LinkedList<Book> byMainTag,
            HashSet<Book> byPages,
            TreeSet<Book> byIsbn,
            HashMap<Book, String> byPublisher,
            TreeMap<Book, String> byFormat
    ) {
        this.byAuthors = byAuthors;
        this.byTitle = byTitle;
        this.byPublicationYear = byPublicationYear;
        this.byFirstGenre = byFirstGenre;
        this.byMainTag = byMainTag;
        this.byPages = byPages;
        this.byIsbn = byIsbn;
        this.byPublisher = byPublisher;
        this.byFormat = byFormat;
    }

    public List<Book> getByAuthors() {
        return byAuthors;
    }

    public void setByAuthors(List<Book> byAuthors) {
        this.byAuthors = byAuthors;
    }

    public Set<Book> getByTitle() {
        return byTitle;
    }

    public void setByTitle(Set<Book> byTitle) {
        this.byTitle = byTitle;
    }

    public Map<Book, Integer> getByPublicationYear() {
        return byPublicationYear;
    }

    public void setByPublicationYear(Map<Book, Integer> byPublicationYear) {
        this.byPublicationYear = byPublicationYear;
    }

    public ArrayList<Book> getByFirstGenre() {
        return byFirstGenre;
    }

    public void setByFirstGenre(ArrayList<Book> byFirstGenre) {
        this.byFirstGenre = byFirstGenre;
    }

    public LinkedList<Book> getByMainTag() {
        return byMainTag;
    }

    public void setByMainTag(LinkedList<Book> byMainTag) {
        this.byMainTag = byMainTag;
    }

    public HashSet<Book> getByPages() {
        return byPages;
    }

    public void setByPages(HashSet<Book> byPages) {
        this.byPages = byPages;
    }

    public TreeSet<Book> getByIsbn() {
        return byIsbn;
    }

    public void setByIsbn(TreeSet<Book> byIsbn) {
        this.byIsbn = byIsbn;
    }

    public HashMap<Book, String> getByPublisher() {
        return byPublisher;
    }

    public void setByPublisher(HashMap<Book, String> byPublisher) {
        this.byPublisher = byPublisher;
    }

    public TreeMap<Book, String> getByFormat() {
        return byFormat;
    }

    public void setByFormat(TreeMap<Book, String> byFormat) {
        this.byFormat = byFormat;
    }

    public List<Book> iterateBookListByAuthors() {
        List<Book> bookList = this.byAuthors;
        LibraryLogger logger = new LibraryLogger();
        bookList.sort(sortByAuthor);
        for (Book currentBook: bookList) {
            logger.logInfo("BOOK:  " + currentBook.getTitle() + ", " + currentBook.getAuthors().get(0));
        }
        return bookList;
    }
    public Set<Book> iterateBookListByTitle() {
        LibraryLogger logger = new LibraryLogger();
        List<Book> booksList = new ArrayList<>(this.byTitle);
        booksList.sort(sortByTitle);
        Set<Book> bookList = new HashSet<>(booksList);
        for (Book currentBook: bookList) {
            logger.logInfo("BOOK:  " + currentBook.getTitle());
        }
        return bookList;
    }
    public Map<Book, Integer> iterateBookListByPublicationYear() {
        LibraryLogger logger = new LibraryLogger();
        List<Map.Entry<Book, Integer>> booksList = new ArrayList<>(this.byPublicationYear.entrySet());
        booksList.sort(sortByPublicationYear);
        LinkedHashMap<Book, Integer> sortedBooksMap = new LinkedHashMap<>();
        for (Map.Entry<Book, Integer> currentBook : booksList) {
            sortedBooksMap.put(currentBook.getKey(), currentBook.getValue());
        }
        for (Map.Entry<Book, Integer> currentBook : sortedBooksMap.entrySet()) {
            logger.logInfo("BOOK:  " + currentBook.getKey().getTitle() + ", publication year " + currentBook.getKey().getPublicationYear());
        }
        return sortedBooksMap;
    }
    public ArrayList<Book> iterateBookListByFirstGenre() {
        LibraryLogger logger = new LibraryLogger();
        ArrayList<Book> bookList = this.byFirstGenre;
        for (Book currentBook: bookList) {
            logger.logInfo("BOOK:  " + currentBook.getTitle() + ", " + currentBook.getGenres().get(0));
        }
        return bookList;
    }
    public LinkedList<Book> iterateBookListByMainTag() {
        LibraryLogger logger = new LibraryLogger();
        LinkedList<Book> bookList = this.byMainTag;
        for (Book currentBook: bookList) {
            logger.logInfo("BOOK:  " + currentBook.getTitle() + ", " + currentBook.getTags().get(0));
        }
        return bookList;
    }
    public HashSet<Book> iterateBookListByPages() {
        LibraryLogger logger = new LibraryLogger();
        HashSet<Book> bookList = this.byPages;
        for (Book currentBook: bookList) {
            logger.logInfo("BOOK:  " + currentBook.getTitle() + ", " + currentBook.getPages());
        }
        return bookList;
    }
    public TreeSet<Book> iterateBookListByIsbn() {
        LibraryLogger logger = new LibraryLogger();
        TreeSet<Book> bookList = this.byIsbn;
        for (Book currentBook: bookList) {
            logger.logInfo("BOOK:  " + currentBook.getTitle() + ", " + currentBook.getIsbn());
        }
        return bookList;
    }
    public HashMap<Book, String> iterateBookListByPublisher() {
        LibraryLogger logger = new LibraryLogger();
        HashMap<Book, String> bookList = this.byPublisher;
        for (Map.Entry<Book, String> currentBook : bookList.entrySet()) {
            logger.logInfo("BOOK:  " + currentBook.getKey().getTitle() + ", publisher " + currentBook.getKey().getPublisher());
        }
        return bookList;
    }
    public TreeMap<Book, String> iterateBookListByFormat() {
        LibraryLogger logger = new LibraryLogger();
        TreeMap<Book, String> bookList = this.byFormat;
        for (Map.Entry<Book, String> currentBook : bookList.entrySet()) {
            logger.logInfo("BOOK:  " + currentBook.getKey().getTitle() + ", format " + currentBook.getKey().getFormats().get(0));
        }
        return bookList;
    }

    Comparator<Book> sortByAuthor = new Comparator<Book>() {
        @Override
        public int compare(Book book1, Book book2) {
            // Get the authors lists from both books
            List<String> authors1 = book1.getAuthors();
            List<String> authors2 = book2.getAuthors();

            // Compare the authors lists (assuming lexicographical order)
            return String.join(",", authors1).compareTo(String.join(",", authors2));
        }
    };

    Comparator<Book> sortByTitle = new Comparator<Book>() {
        @Override
        public int compare(Book book1, Book book2) {
            // Compare the titles of the books
            return book1.getTitle().compareTo(book2.getTitle());
        }
    };
    Comparator<Map.Entry<Book, Integer>> sortByPublicationYear = new Comparator<Map.Entry<Book, Integer>>() {
        @Override
        public int compare(Map.Entry<Book, Integer> entry1, Map.Entry<Book, Integer> entry2) {
            return entry1.getValue().compareTo(entry2.getValue());
        }
    };
}
