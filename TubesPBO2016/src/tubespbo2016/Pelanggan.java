/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo2016;

/**
 *
 * @author Budi Pradnyana
 */
public class Pelanggan extends Orang {
    private int idPelanggan;

    public int getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(int idPelanggan) {
        this.idPelanggan = idPelanggan;
    }
    
    @Override
    public String getNama() {
        return super.getNama();
    }

    public void setName(String nama) {
       super.setNama(nama);
    }
    
    public String getAlamat() {
        return super.getAlamat();
    }

    public void setAlamat(String alamat) {
        super.setAlamat(alamat);
    }
}
