public class PaketWisata
{
    private TempatWisata[] daftarTujuanWisata;
    private double harga;
    private String namaPaket;
    private int jumwis;
    
    public PaketWisata(double harga,String namaPaket,int max)
    {
        this.harga = harga;
        this.namaPaket = namaPaket;
        daftarTujuanWisata = new TempatWisata[max];
    }
    
    public void setHarga(double harga)
    {
        this.harga = harga;
    }
    
    public double getHarga()
    {
        return this.harga;
    }
    
    public void setNamaPaket(String namaPaket)
    {
        this.namaPaket = namaPaket;
    }
    
    public void addTempatWisata(TempatWisata wis)
    {
        if(jumwis<=daftarTujuanWisata.length){
            daftarTujuanWisata[jumwis] = wis;
            jumwis++;
        }
    }
    
}
