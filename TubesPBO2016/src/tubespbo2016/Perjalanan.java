/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo2016;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Budi Pradnyana
 */
public class Perjalanan {
    PaketWisata paket;
    private Date tanggal;
    Map<Integer,Pelanggan> pelanggan = new HashMap<Integer,Pelanggan>();

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
    
    public PaketWisata getPaket() {
        return paket;
    }

    public void setPaket(PaketWisata paket) {
        this.paket = paket;
    }
    
    public void addPelanggan(Pelanggan p){
        pelanggan.put(p.getIdPelanggan(), p);
    }
    
    public Map<Integer,Pelanggan> getPelanggan(){
        return pelanggan;
    }
    
    public  Pelanggan getPelangganByIndex(int i){
        List<Pelanggan> index = new ArrayList<Pelanggan>(pelanggan.values());
        return index.get(i);
    }
    
    public Pelanggan getPelangganById(int idpel){
        return pelanggan.get(idpel);
    }
    
}
