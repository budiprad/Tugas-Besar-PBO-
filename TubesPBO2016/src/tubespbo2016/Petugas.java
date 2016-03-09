package tubespbo2016;

public class Petugas extends Orang{
	private String jabatan;
	
	public void setJabatan(String jabatan){
		this.jabatan = jabatan;
	}
	
	public String getJabatan(){
		return jabatan;
	}
        
        @Override
        public String getNama() {
            return super.getNama();
        }
        
        @Override
        public void setNama(String nama) {
            super.setNama(nama);
        }
    
        @Override
        public String getAlamat() {
            return super.getAlamat();
        }

        @Override
        public void setAlamat(String alamat) {
            super.setAlamat(alamat);
        }
}