import java.util.HashMap;
import java.util.Map;

public class MapHashMap {
    /* MapHashMap
        adalah struktur data dalam bentuk pasangan key-value. MapHashMap sama dengan “associative array “ dalam bahasa PHP.
        Objek disimpan di MapHashMap sebagai value menggunakan key yang harus unik dan harus berupa objek juga.
        Salah satu implementasi dari interface MapHashMap adalah class HashMap.

        Map > HashMap
    */
    public static void main(String[] args) {
        // Menggunakan HashMap
        Map<String, Planet> planets = new HashMap<>();
        planets.put("key-1", new Planet("Jupiter", 0.06)); // method put() untuk menambahkan objek ke Map
        planets.put("key-2", new Planet("Mars", 0.82));
        planets.put("key-3", new Planet("Saturnus", 1.00));
        planets.put("key-4", new Planet("Bumi", 0.11));
        planets.put("key-4", new Planet("Bumi-X", 0.11)); // menambahkan ke Map dengan key yang sama

        // method size() untuk mendapatkan ukuran Set
        System.out.println("Map planets awal: (size = "+ planets.size() +")");
        for (String key : planets.keySet()) { // looping key dari Map
            // method get() untuk melihat isi Map berdasarkan key
            System.out.println("\t " + key + " : " + planets.get(key));
        }

        planets.remove("key-2"); // method remove() untuk mengeluarkan objek dari Map

        System.out.println("Map planets akhir: (size = "+ planets.size() +")");
        for (Planet planet : planets.values()) { // looping value dari Map
            System.out.println("\t " + planet);
        }
    }
}
