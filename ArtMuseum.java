import java.util.ArrayList;

public class ArtMuseum {
    ArrayList<Painting> paintings;

    public void sortByName() {
        paintings.sort(Painting.NameComparator);
    }

    public void sortByDate() {
        paintings.sort(Painting.DateComparator);
    }

    public void add(Painting painting) {
        paintings.add(painting);
    }

    public void removeByName(String name) {
        paintings.removeIf(p -> p.getName().equals(name));
    }

    public Painting getByName(String name) throws Exception{
        for (Painting p : paintings) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        throw new Exception("No item with that name.");
    }

    public ArrayList<Painting> getPaintings() {
        return paintings;
    }

    public void setPaintings(ArrayList<Painting> paintings) {
        this.paintings = paintings;
    }

    public ArtMuseum(ArrayList<Painting> paintings) {
        this.paintings = paintings;
    }

    @Override
    public String toString() {
        return "ArtMuseum{" +
                "paintings=" + paintings +
                '}';
    }

    public ArtMuseum() {
        paintings = new ArrayList<>();
    }
}
