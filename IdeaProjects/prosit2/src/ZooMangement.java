import java.util.Scanner;

public class ZooMangement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String zooName = "";
        int nbrCages = 0;

        while (zooName.trim().isEmpty()) {
            System.out.print("Entrez le nom du zoo : ");
            zooName = scanner.nextLine();
            if (zooName.trim().isEmpty()) {
                System.out.println("Le nom du zoo ne doit pas être vide !");
            }
        }

        while (nbrCages <= 0) {
            System.out.print("Entrez le nombre de cages : ");
            if (scanner.hasNextInt()) {
                nbrCages = scanner.nextInt();
                if (nbrCages <= 0) {
                    System.out.println("Le nombre de cages doit être un entier positif !");
                }
            } else {
                System.out.println("Veuillez entrer un nombre valide !");
                scanner.next();
            }
        }

        System.out.println(zooName + " comporte " + nbrCages + " cages");

        scanner.close();

        Animal Unlion = new Animal();
        Unlion.family="belhssin";
        Unlion.name="zac";
        Unlion.age=18;
        Unlion.isMammal=true;

        Zoo MyZoo = new Zoo();
        MyZoo.name = "bellvidaire";
        MyZoo.city = "tunis";
        MyZoo.nbrCages = 20;

        //System.out.println(MyZoo) ;
        System.out.println(MyZoo.toString()) ;
        System.out.println(Unlion.toString()) ;

        //System.out.println("Zoo : " + MyZoo.name + " à " + MyZoo.city);
        //System.out.println("Animal : " + Unlion.name  + " "+ Unlion.family + " "+ Unlion.age+" "+ true);

        MyZoo.displayZoo();
    }
}


