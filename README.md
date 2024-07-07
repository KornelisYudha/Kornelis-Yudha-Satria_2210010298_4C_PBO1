# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data menu Mie Ayam Bakso menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama item dan harganya, serta memberikan output berupa informasi detail dari item tersebut seperti tipe atau suhu, serta memungkinkan untuk mengubah harga item yang ada.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Polymorphism, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Item`, `Makanan`, `Minuman`, dan `MieAyambakso` adalah contoh dari class.

```java
public abstract class Item {
    ...
}

public class Makanan extends Item {
    ...
}

public class Minuman extends Item {
    ...
}

public class MieAyambakso {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `new Makanan("Bakso Biasa", 15000, "Biasa")` adalah contoh pembuatan object.

```java
menu.add(new Makanan("Bakso Biasa", 15000, "Biasa"));
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `harga`, `tipe`, dan `suhu` adalah contoh atribut.

```java
private String nama;
private int harga;
private String tipe;
private String suhu;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Item`, `Makanan`, dan `Minuman`.

```java
public Item(String nama, int harga) {
    this.nama = nama;
    this.harga = harga;
}

public Makanan(String nama, int harga, String tipe) {
    super(nama, harga);
    this.tipe = tipe;
}

public Minuman(String nama, int harga, String suhu) {
    super(nama, harga);
    this.suhu = suhu;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setHarga`, `setTipe`, dan `setSuhu` adalah contoh method mutator.

```java
public void setHarga(int harga) {
    this.harga = harga;
}

public void setTipe(String tipe) {
    this.tipe = tipe;
}

public void setSuhu(String suhu) {
    this.suhu = suhu;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getHarga`, `getTipe`, dan `getSuhu` adalah contoh method accessor.

```java
public String getNama() {
    return nama;
}

public int getHarga() {
    return harga;
}

public String getTipe() {
    return tipe;
}

public String getSuhu() {
    return suhu;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`, `harga`, `tipe`, dan `suhu` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```java
private String nama;
private int harga;
private String tipe;
private String suhu;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Makanan` dan `Minuman` mewarisi `Item` dengan sintaks `extends`.

```java
public class Makanan extends Item {
    ...
}

public class Minuman extends Item {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Pada kode ini, method `getDetail` di `Makanan` dan `Minuman` merupakan override dari method abstrak `getDetail` di `Item`.

```java
@Override
public String getDetail() {
    return "Makanan: " + getNama() + ", Harga: " + getHarga() + ", Tipe: " + tipe;
}

@Override
public String getDetail() {
    return "Minuman: " + getNama() + ", Harga: " + getHarga() + ", Suhu: " + suhu;
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `main` untuk mengubah harga item.

```java
if (response.equalsIgnoreCase("iya")) {
    ...
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk menampilkan menu dan meminta input perubahan harga.

```java
for (Item item : menu) {
    ...
}

for (int i = 0; i < mahasiswas.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```java
Scanner scanner = new Scanner(System.in);
System.out.println("Masukkan harga baru:");
int hargaBaru = scanner.nextInt();

System.out.println("Menu Mie Ayam/Bakso:");
System.out.println(item.getDetail());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `ArrayList<Item> menu = new ArrayList<>();` adalah contoh penggunaan array.

```java
ArrayList<Item> menu = new ArrayList<>();
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `while (!scanner.hasNextInt())` untuk menangani error input yang tidak valid.

```java
while (!scanner.hasNextInt()) {
    System.out.println("Input tidak valid. Harap masukkan angka.");
    scanner.next();
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Kornelis Yudha Satria
NPM: 2210010298
