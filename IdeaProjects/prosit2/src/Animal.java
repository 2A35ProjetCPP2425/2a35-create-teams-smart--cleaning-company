public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal ;
    Animal() {}
    public Animal(String family, String name, int age) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal =isMammal;
    }
   @Override
    public String toString() {
        return "Animal [Famille=" + family +
                ", Nom=" + name +
                ", Âge=" + age +
                ", Mammifère=" + isMammal + "]";
    }
}
