import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetHashSet {
    /* Set
      adalah mirip dengan List hanya saja objek di dalam Set tidak bisa diduplikasi.
      Yang artinya jika objek yang sama dimasukkan beberapa kali ke dalam Set maka Set hanya akan menyimpan objek tersebut satu kali saja.
      Coba ingat kembali materi Inheritance bagian Overriding dan Overloading.
      Perbedaan lain antara Set dengan List adalah penyimpanan pada Set tidak teratur.
      
      Collection > Set > HashSet
    */
    public static void main(String[] args) {
        // Menggunakan HashSet
        Set<String> planets = new HashSet<>();
        planets.add("Jupiter"); // method add() untuk menambahkan objek ke List
        planets.add("Mars");
        planets.add("Mars");
        planets.add("Mars"); // menambahkan object "Mars" beberapa kali
        planets.add("Saturnus");
        planets.add("Bumi"); // objek lainnya masih bisa terus ditambahkan ke List

        System.out.println("Set planets awal : (Size : "+planets.size()+" )");
        for(Iterator iterator = planets.iterator(); iterator.hasNext();){
            System.out.println("Planets : "+iterator.next());
        }

        planets.remove("Bumi"); // method remove() untuk mengeluarkan objek dari Set

        System.out.println("Set planets akhir: (size = " + planets.size() + ")");
        for (Iterator iterator = planets.iterator(); iterator.hasNext(); ) {
            // looping menggunakan Iterator
            System.out.println("Planets : " + iterator.next());
        }
    }
}
