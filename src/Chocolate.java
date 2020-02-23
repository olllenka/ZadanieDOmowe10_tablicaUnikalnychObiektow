import java.util.Objects;

public class Chocolate {
    private String name;
    private double weight;

    public Chocolate() {
    }

    public Chocolate(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chocolate chocolate = (Chocolate) o;
        return Double.compare(chocolate.weight, weight) == 0 &&
                Objects.equals(name, chocolate.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
