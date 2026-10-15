package Others;
import java.util.Objects;
//
//class Alien{
//    private final int id;
//    private final String name;
//
//    public Alien(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Alien alien = (Alien) o;
//        return id == alien.id && Objects.equals(name, alien.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
//
//    @Override
//    public String toString() {
//        return "Alien{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }
//}


//canonical constructor
record Alien(int id, String name){}

public class Recordclass {
    public static void main(String[] args) {
        Alien a1 = new Alien(1, "Siru");
        Alien a2 = new Alien(1, "Siru");
        System.out.println(a1.equals(a2));
    }
}
