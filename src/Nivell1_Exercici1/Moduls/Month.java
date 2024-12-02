package Nivell1_Exercici1.Moduls;

public class Month {

    private String name;

    public Month(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Month month = (Month) obj;
        return name.equals(month.name);
    }

    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Month{" +
                "name='" + name + '\'' +
                '}';
    }
}