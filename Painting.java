import java.util.Comparator;

public class Painting {
    String author;
    int creationDate;
    String genre;
    String name;

    public Painting(String author, int creationDate, String genre, String name) {
        this.author = author;
        this.creationDate = creationDate;
        this.genre = genre;
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nPainting{" +
                "author='" + author + '\'' +
                ", creationDate=" + creationDate +
                ", genre='" + genre + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Painting() {
        author = "";
        creationDate = 0;
        genre = "";
        name = "";
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(int creationDate) {
        this.creationDate = creationDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Comparator<Painting> NameComparator = new Comparator<Painting> () {
        @Override
        public int compare(Painting o1, Painting o2) {
            return (o1.getName().compareTo(o2.getName()));
        }
    };

    public static Comparator<Painting> DateComparator = new Comparator<Painting> () {
        @Override
        public int compare(Painting o1, Painting o2) {
            return o1.getCreationDate() - o2.getCreationDate();
        }
    };
}
