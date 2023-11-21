import java.util.Objects;

public class Departement implements Comparable<Departement> {

    private int id;
    private String nom;
    private int nombreEmployes;

    public Departement() {

    }

    public Departement(int id, String nom, int nombreEmployes) {
        this.id = id;
        this.nom = nom;
        this.nombreEmployes = nombreEmployes;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return id == that.id && nom.equals(that.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom);
    }

    @Override
    public int compareTo(Departement o) {
        return Integer.compare(this.id, o.id);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nombreEmployes=" + nombreEmployes +
                '}';
    }
}
