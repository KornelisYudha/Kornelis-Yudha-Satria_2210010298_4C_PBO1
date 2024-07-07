package mieayambakso;

//Kelas abstrak Item(Class)
public abstract class Item {
    //Atribut (Attribute)
    private String nama;
    private int harga;
    
    //Konstruktor (Constructor)
    public Item(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Accessor (Getter)
    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    // Mutator (Setter)
    public void setHarga(int harga) {
        this.harga = harga;
    }

    // Method abstrak untuk mendapatkan detail (Polymorphism)
    public abstract String getDetail();
}
