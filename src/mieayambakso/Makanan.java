package mieayambakso;

//Kelas Makanan mewarisi dari kelas Item (Inheritance)
public class Makanan extends Item {
    //Atribut tambahan untuk makanan
    private String tipe;
    
    //Konstruktor (Contructor)
    public Makanan(String nama, int harga, String tipe) {
        super(nama, harga);
        this.tipe = tipe;
    }

    // Accessor (Getter)
    public String getTipe() {
        return tipe;
    }

    // Mutator (Setter)
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    // Implementasi method getDetail (Polymorphism)
    @Override
    public String getDetail() {
        return "Makanan: " + getNama() + ", Harga: " + getHarga() + ", Tipe: " + tipe;
    }
}
