package mieayambakso;

//Kelas Minuman mewarisi dari kelas Item
public class Minuman extends Item{
    //Atribute tambahan untuk minuman
    private String suhu;
    
    //konstruktor (Consttruktor)
    public Minuman(String nama, int harga, String suhu) {
        super(nama, harga);
        this.suhu = suhu;
    }

    // Accessor (Getter)
    public String getSuhu() {
        return suhu;
    }

    // Mutator (Setter)
    public void setSuhu(String suhu) {
        this.suhu = suhu;
    }

    // Implementasi method getDetail (Polymorphism)
    @Override
    public String getDetail() {
        return "Minuman: " + getNama() + ", Harga: " + getHarga() + ", Suhu: " + suhu;
    }
}
