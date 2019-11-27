import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListArrayList {
    /* List 
        adalah suatu Collection di mana data yang masuk akan disimpan secara teratur.
        List mempunyai index berdasarkan urutan objek yang dimasukkan ke dalam List.
        Objek di dalam List bisa duplikat artinya objek yang sama bisa dimasukkan beberapa kali ke dalam List dan akan mempunyai index yang berbeda.
        Objek dikatakan sama jika dibandingkan menggunakan method equals() menghasilkan nilai true
    */
    public static void main(String[] args) {
        // untuk melihat hirarki dari sub-class interface Collection
        Collection collection;

        // declarasi menggunakan String Array
        String[] heroes = new String[2];
        heroes[0] = "Rifqi";
        heroes[1] = "Iqbal";
        // heroes[2] = "Error"; // // error ArrayIndexOutOfBoundsException karena ukuran Array tetap (melebihi inisial value nya)

        System.out.println("======================================================");

        // Menggunakan Collection > List > ArrayList  
        List<String> planets = new ArrayList<>();
        planets.add("Jupiter"); // method add() untuk menambahkan objek ke List
        planets.add("Mars");
        planets.add("Mars");
        planets.add("Saturnus");// objek lainnya masih bisa terus ditambahkan ke List

        System.out.println("List Planet awal nya : ");
        for(int i = 0; i < planets.size();i++){
            System.out.println("Index ke - "+i+" - "+planets.get(i));
        }

        System.out.println("======================================================");

        // remove
        planets.remove("Saturnus");
        // update list after remove an item

        System.out.println("======================================================");

        for(int i = 0; i < planets.size(); i++){
            System.out.println("Index ke - "+i+" - "+planets.get(i));
        }
    }
}
