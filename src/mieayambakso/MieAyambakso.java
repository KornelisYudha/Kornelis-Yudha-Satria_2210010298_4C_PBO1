package mieayambakso;

    import java.util.ArrayList; // Import untuk Arraylist
    import java.util.Scanner;  // Import untuk Scanner

public class MieAyambakso {
    public static void main(String[] args) {
        // Membuat daftar menu (Array)
        ArrayList<Item> menu = new ArrayList<>();

        // Menambahkan item ke menu (Object)
        menu.add(new Makanan("Bakso Biasa", 15000, "Biasa"));
        menu.add(new Makanan("Bakso Spesial", 20000, "Spesial"));
        menu.add(new Makanan("Mie Ayam Biasa", 12000, "Biasa"));
        menu.add(new Makanan("Mie Ayam Spesial", 18000, "Spesial"));
        menu.add(new Minuman("Es Teh", 5000, "Dingin"));
        menu.add(new Minuman("Es Teh", 5000, "Hangat"));
        menu.add(new Minuman("es Jeruk", 7000, "Panas"));

        // Menampilkan menu (Output Sederhana)
        System.out.println("Menu Mie Ayam/Bakso:");
        for (Item item : menu) { // Perulangan untuk menampilkan setiap item di menu
            System.out.println(item.getDetail());
        }

        // Mengubah harga menggunakan seleksi dan perulangan
        Scanner scanner = new Scanner(System.in); // Input Sederhana
        for (Item item : menu) { // Perulangan untuk setiap item Menu
            System.out.println("Apakah Anda ingin mengubah harga untuk " + item.getNama() + "? (iya/tidak)");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("iya")) {// Seleksi Untuk keputusan perubahan harga
                System.out.println("Masukkan harga baru:");
                while (!scanner.hasNextInt()) { //Error Handling untuk memastikan input berupa angka
                    System.out.println("Input tidak valid. Harap masukkan angka.");
                    scanner.next(); // membersihkan input yang salah
                }
                int hargaBaru = scanner.nextInt();
                scanner.nextLine(); // membersihkan newline
                item.setHarga(hargaBaru); //Mutator untuk mengubah harga
            }
        }

        // Menampilkan menu setelah perubahan harga (Output Sederhana)
        System.out.println("Menu Mie Ayam/Bakso setelah perubahan harga:");
        for (Item item : menu) {
            System.out.println(item.getDetail());
        }

        scanner.close();
    }
}