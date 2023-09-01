import library.*;
import logger.*;

import java.util.*;
import java.util.logging.*;

import static java.util.UUID.*;
import static library.Formats.*;
import static library.Genres.*;

public class Main {
    static String BOOK_TYPE_KINDLE = "Kindle";
    static String BOOK_TYPE_PAPERBACK = "Paperback";
    static String BOOK_TYPE_PDF = "PDF";
    static String BOOK_TYPE_EPUB = "EPUB";
    static String BOOK_TYPE_HARDBACK = "Hardback";
    static String BOOK_TYPE_AUDIOBOOK = "Audiobook";
    public static void main(String[] args) {
        LibraryLogger logger = new LibraryLogger();
        logger.logInfo("Hello info world!");
        logger.logWarn("Hello warn world!");
        logger.logError("Hello error world!");
        logger.logMessage(Level.INFO, "Hello custom logging world!");

        // here, we are setting data for collections and then iterating through each one
        // need some books first
        Book effectiveJava = new Book(
                BOOK_TYPE_KINDLE,
                randomUUID(),
                "Effective Java",
                new ArrayList<>(),
                2003,
                "Publisher 1",
                "1234577290",
                430,
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>()
        );
        effectiveJava.addAuthor("Joshua Bloch");
        effectiveJava.addSingleGenre(NONFICTION);
        effectiveJava.setSizeTags();
        effectiveJava.addSingleFormat(KINDLE);
        effectiveJava.addSingleFormat(PAPERBACK);
        effectiveJava.addSingleFormat(HARDBACK);

        Book designingDataIntensiveApplications = new Book(
                BOOK_TYPE_PAPERBACK,
                randomUUID(),
                "Designing Data-Intensive Applications",
                new ArrayList<>(),
                2004,
                "Publisher 2",
                "9876543210",
                600,
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>()
        );
        designingDataIntensiveApplications.addAuthor("Martin Kleppman");
        designingDataIntensiveApplications.addSingleGenre(NONFICTION);
        designingDataIntensiveApplications.setSizeTags();
        designingDataIntensiveApplications.addSingleFormat(PAPERBACK);
        designingDataIntensiveApplications.addSingleFormat(KINDLE);

        Book springBootInAction = new Book(
                BOOK_TYPE_EPUB,
                randomUUID(),
                "Spring Boot In Action",
                new ArrayList<>(),
                2005,
                "Publisher 3",
                "4567891232",
                300,
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>()
        );
        springBootInAction.addAuthor("Craig Walls");
        springBootInAction.addSingleGenre(NONFICTION);
        springBootInAction.setSizeTags();
        springBootInAction.addSingleFormat(EPUB);
        springBootInAction.addSingleFormat(KINDLE);
        springBootInAction.addSingleFormat(PAPERBACK);

        Book wellGroundedRubyist = new Book(
                BOOK_TYPE_HARDBACK,
                randomUUID(),
                "The Well-Grounded Rubyist",
                new ArrayList<>(),
                2005,
                "Publisher 4",
                "1593578627",
                231,
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>()
        );
        wellGroundedRubyist.addAuthor("David A. Black");
        wellGroundedRubyist.addAuthor("Joseph Leo III");
        wellGroundedRubyist.addSingleGenre(NONFICTION);
        wellGroundedRubyist.setSizeTags();
        wellGroundedRubyist.addSingleFormat(HARDBACK);
        wellGroundedRubyist.addSingleFormat(KINDLE);
        wellGroundedRubyist.addSingleFormat(PAPERBACK);

        Book peopleware = new Book(
                BOOK_TYPE_PDF,
                randomUUID(),
                "Peopleware",
                new ArrayList<>(),
                2006,
                "Publisher 5",
                "9517538524",
                1100,
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>()
        );
        peopleware.addAuthor("Tom DeMarco");
        peopleware.addAuthor("Tim Lister");
        peopleware.addSingleGenre(NONFICTION);
        peopleware.setSizeTags();
        peopleware.addSingleFormat(PDF);
        peopleware.addSingleFormat(KINDLE);
        peopleware.addSingleFormat(PAPERBACK);

        Book buildingMicroservices = new Book(
                BOOK_TYPE_AUDIOBOOK,
                randomUUID(),
                "Building Microservices",
                new ArrayList<>(),
                2007,
                "Publisher 6",
                "6543219871",
                800,
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>()
        );
        buildingMicroservices.addAuthor("Sam Newman");
        buildingMicroservices.addSingleGenre(NONFICTION);
        buildingMicroservices.setSizeTags();
        buildingMicroservices.addSingleFormat(AUDIOBOOK);
        buildingMicroservices.addSingleFormat(KINDLE);
        buildingMicroservices.addSingleFormat(PAPERBACK);

        // now we are going to make some collections/lists
            // to add to a new BookList that we will sort later
        List<Book> byAuthors = new ArrayList<>();
        byAuthors.add(effectiveJava);
        byAuthors.add(designingDataIntensiveApplications);
        byAuthors.add(springBootInAction);
        byAuthors.add(wellGroundedRubyist);
        byAuthors.add(peopleware);
        byAuthors.add(buildingMicroservices);

        Set<Book> byTitle = new HashSet<>();
        byTitle.add(effectiveJava);
        byTitle.add(designingDataIntensiveApplications);
        byTitle.add(springBootInAction);
        byTitle.add(wellGroundedRubyist);
        byTitle.add(peopleware);
        byTitle.add(buildingMicroservices);

        Map<Book, Integer> byPublicationYear = new HashMap<>();
        byPublicationYear.put(effectiveJava, effectiveJava.getPublicationYear());
        byPublicationYear.put(designingDataIntensiveApplications, designingDataIntensiveApplications.getPublicationYear());
        byPublicationYear.put(springBootInAction, designingDataIntensiveApplications.getPublicationYear());
        byPublicationYear.put(wellGroundedRubyist, wellGroundedRubyist.getPublicationYear());
        byPublicationYear.put(peopleware, peopleware.getPublicationYear());
        byPublicationYear.put(buildingMicroservices, buildingMicroservices.getPublicationYear());

        ArrayList<Book> byFirstGenre = new ArrayList<>();
        byFirstGenre.add(effectiveJava);
        byFirstGenre.add(designingDataIntensiveApplications);
        byFirstGenre.add(springBootInAction);
        byFirstGenre.add(wellGroundedRubyist);
        byFirstGenre.add(peopleware);
        byFirstGenre.add(buildingMicroservices);

        LinkedList<Book> byMainTag = new LinkedList<>();
        byMainTag.add(effectiveJava);
        byMainTag.add(designingDataIntensiveApplications);
        byMainTag.add(springBootInAction);
        byMainTag.add(wellGroundedRubyist);
        byMainTag.add(peopleware);
        byMainTag.add(buildingMicroservices);

        HashSet<Book> byPages = new HashSet<>();
        byPages.add(effectiveJava);
        byPages.add(designingDataIntensiveApplications);
        byPages.add(springBootInAction);
        byPages.add(wellGroundedRubyist);
        byPages.add(peopleware);
        byPages.add(buildingMicroservices);

        TreeSet<Book> byIsbn = new TreeSet<>();
        byIsbn.add(effectiveJava);
        byIsbn.add(designingDataIntensiveApplications);
        byIsbn.add(springBootInAction);
        byIsbn.add(wellGroundedRubyist);
        byIsbn.add(peopleware);
        byIsbn.add(buildingMicroservices);

        HashMap<Book, String> byPublisher = new HashMap<>();
        byPublisher.put(effectiveJava, effectiveJava.getPublisher());
        byPublisher.put(designingDataIntensiveApplications, designingDataIntensiveApplications.getPublisher());
        byPublisher.put(springBootInAction, springBootInAction.getPublisher());
        byPublisher.put(wellGroundedRubyist, wellGroundedRubyist.getPublisher());
        byPublisher.put(peopleware, peopleware.getPublisher());
        byPublisher.put(buildingMicroservices, buildingMicroservices.getPublisher());

        TreeMap<Book, String> byFormat = new TreeMap<>();
        byFormat.put(effectiveJava, String.valueOf(effectiveJava.getFormats().get(0)));
        byFormat.put(designingDataIntensiveApplications, String.valueOf(designingDataIntensiveApplications.getFormats().get(0)));
        byFormat.put(springBootInAction, String.valueOf(springBootInAction.getFormats().get(0)));
        byFormat.put(wellGroundedRubyist, String.valueOf(wellGroundedRubyist.getFormats().get(0)));
        byFormat.put(peopleware, String.valueOf(peopleware.getFormats().get(0)));
        byFormat.put(buildingMicroservices, String.valueOf(buildingMicroservices.getFormats().get(0)));

        // now we put the book list together
        BookList bookList = new BookList(
                byAuthors,
                byTitle,
                byPublicationYear,
                byFirstGenre,
                byMainTag,
                byPages,
                byIsbn,
                byPublisher,
                byFormat
        );
        // now we need to sort each property's value of the booklist
        logger.logInfo("------------------------------------------");
        logger.logInfo("------------------------------------------");
        logger.logInfo("Here is the book list in type List<Book>, sorted by first author:");
        logger.logInfo(bookList.iterateBookListByAuthors().toString());
        logger.logInfo("------------------------------------------");
        logger.logInfo("------------------------------------------");
        logger.logInfo("Here is the book list in type Set<Book>, iterated by title:");
        logger.logInfo(bookList.iterateBookListByTitle().toString());
        logger.logInfo("------------------------------------------");
        logger.logInfo("------------------------------------------");
        logger.logInfo("Here is the book list in type Map<Book, Integer>, iterated by publication year:");
        logger.logInfo(bookList.iterateBookListByPublicationYear().toString());
        logger.logInfo("------------------------------------------");
        logger.logInfo("------------------------------------------");
        logger.logInfo("Here is the book list in type ArrayList<Book>, iterated by first genre:");
        logger.logInfo(bookList.iterateBookListByFirstGenre().toString());
        logger.logInfo("------------------------------------------");
        logger.logInfo("------------------------------------------");
        logger.logInfo("Here is the book list in type LinkedList<Book>, iterated by first tag:");
        logger.logInfo(bookList.iterateBookListByMainTag().toString());
        logger.logInfo("------------------------------------------");
        logger.logInfo("------------------------------------------");
        logger.logInfo("Here is the book list in type HashSet<Book>, iterated by page count:");
        logger.logInfo(bookList.iterateBookListByPages().toString());
        logger.logInfo("------------------------------------------");
        logger.logInfo("------------------------------------------");
        logger.logInfo("Here is the book list in type TreeSet<Book>, iterated by isbn:");
        logger.logInfo(bookList.iterateBookListByIsbn().toString());
        logger.logInfo("------------------------------------------");
        logger.logInfo("------------------------------------------");
        logger.logInfo("Here is the book list in type HashMap<Book, String>, iterated by publisher:");
        logger.logInfo(bookList.iterateBookListByPublisher().toString());
        logger.logInfo("------------------------------------------");
        logger.logInfo("------------------------------------------");
        logger.logInfo("Here is the book list in type TreeMap<Book, String>, iterated by first format:");
        logger.logInfo(bookList.iterateBookListByFormat().toString());
        logger.logInfo("------------------------------------------");
    }
}