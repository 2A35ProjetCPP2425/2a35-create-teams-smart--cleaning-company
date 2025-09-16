public class Zoo {
    Animal[] animals  = new Animal [25] ;
    String name;
    String city ;
    int nbrCages;
    Zoo(){}
    Zoo(String name,String city,int nbrCages){
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
    public void displayZoo() {
        System.out.println("Zoo name: " + name +" "+ ",Zoo city: " + city+ " " +" ,nombre de cages : "+nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo [Nom=" + name + ", Ville=" + city + ", Nombre de cages=" + nbrCages + "]";
    }

}
