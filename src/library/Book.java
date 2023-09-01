package library;

import exceptions.*;
import logger.*;

import java.util.*;

public class Book extends Publication implements Comparable<Book> {
    UUID bookId;
    String title;
    List<String> authors;
    int publicationYear;
    String publisher;
    String isbn;
    int pages;
    List<Genres> genres;
    List<Tags> tags;
    List<Formats> formats;

    public Book(
            String type,
            UUID bookId,
            String title,
            List<String> authors,
            int publicationYear,
            String publisher,
            String isbn,
            int pages,
            List<Genres> genres,
            List<Tags> tags,
            List<Formats> formats
    ) {
        super(type);
        this.bookId = bookId;
        this.title = title;
        this.authors = authors;
        this.publicationYear = publicationYear;
        this.publisher = publisher;
        this.isbn = isbn;
        this.pages = pages;
        this.genres = genres;
        this.tags = tags;
        this.formats = formats;
    }

    public UUID getBookId() {
        return bookId;
    }

    public void setBookId(UUID bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public List<Genres> getGenres() {
        return genres;
    }

    public void setGenres(List<Genres> genres) {
        this.genres = genres;
    }

    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }

    public List<Formats> getFormats() {
        return formats;
    }

    public void setFormats(List<Formats> formats) {
        this.formats = formats;
    }

    public void setSizeTags() {
        if (this.pages >= 1 && this.pages <= 200) {
            this.tags.add(Tags.SMALL);
        }
        if (this.pages >= 201 && this.pages <= 500) {
            this.tags.add(Tags.MEDIUM);
        }
        if (this.pages >= 501 && this.pages <= 1000) {
            this.tags.add(Tags.LARGE);
        }
        if (this.pages >= 1001) {
            this.tags.add(Tags.EXTRA_LARGE);
        }
    }

    public void addSingleTag(Tags tag) {
        this.tags.add(tag);
    }

    public void removeSingleTag(Tags tag) {
        for (Tags currentTag: this.tags) {
            if (Objects.equals(tag, currentTag)) {
                this.tags.remove(tag);
            }
        }
    }

    public void addSingleFormat(Formats format) {
        this.formats.add(format);
    }

    public void removeSingleFormat(Formats format) {
        for (Formats currentFormat: this.formats) {
            if (Objects.equals(format, currentFormat)) {
                this.formats.remove(format);
            }
        }
    }

    public void addSingleGenre(Genres genre) {
        this.genres.add(genre);
    }

    public void removeSingleGenre(Genres genre) throws NotFoundException {
        LibraryLogger log = new LibraryLogger();
        try {
            for (Genres currentGenre : this.genres) {
                if (Objects.equals(genre, currentGenre)) {
                    this.genres.remove(genre);
                }
            }
            if (!this.genres.contains(genre)) {
                throw new NotFoundException("Genre " + genre + " was not found.");
            }
            log.logInfo("Successfully removed genre " + genre + ".");
        } catch (NotFoundException notFoundException) {
            log.logError(notFoundException.getMessage());
        } finally {
            log.logInfo("Done attempting to remove the genre " + genre + ".");
        }
    }

    public void addAuthor(String author) {
        this.authors.add(author);
    }

    public void addAuthor(List<String> authors) {
        this.authors.addAll(authors);
    }

    public void removeSingleAuthor(String author) {
        for (String currentAuthor: this.authors) {
            if (Objects.equals(author, currentAuthor)) {
                this.authors.remove(author);
            }
        }
    }

    @Override
    public int compareTo(Book otherBook) {
        return this.getTitle().compareTo(otherBook.getTitle());
    }
}
