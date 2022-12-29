package model;

public class kinhnghiem {
   private int idkn;
   private String nameda;
   private String kythuat;
   private String mota;
   private int namkn;
   private int idcv;
   
   public kinhnghiem()
   {
   }
   public kinhnghiem(int idkn, String nameda, String kythuat, String mota,int namkn, int idcv)
   {
	   this.idkn = idkn;
	   this.nameda = nameda;
	   this.kythuat = kythuat;
	   this.mota = mota;
	   this.namkn = namkn;
	   this.idcv = idcv;
   }
public int getNamkn() {
	return namkn;
}
public void setNamkn(int namkn) {
	this.namkn = namkn;
}
public int getIdkn() {
	return idkn;
}
public void setIdkn(int idkn) {
	this.idkn = idkn;
}
public String getNameda() {
	return nameda;
}
public void setNameda(String nameda) {
	this.nameda = nameda;
}
public String getKythuat() {
	return kythuat;
}
public void setKythuat(String kythuat) {
	this.kythuat = kythuat;
}
public String getMota() {
	return mota;
}
public void setMota(String mota) {
	this.mota = mota;
}
public int getIdcv() {
	return idcv;
}
public void setIdcv(int idcv) {
	this.idcv = idcv;
}
@Override
public String toString() {
	return "kinhnghiem [idkn=" + idkn + ", nameda=" + nameda + ", kythuat=" + kythuat + ", mota=" + mota + ", namkn="
			+ namkn + ", idcv=" + idcv + "]";
}
   
}
