package model;

public class nganhnghe {
    private int idnn;
    private String namenn;
    public nganhnghe()
    {
    	
    }
    public nganhnghe(int idnn, String namenn)
    {
    	this.idnn = idnn;
    	this.namenn = namenn;
    }
	public int getIdnn() {
		return idnn;
	}
	public void setIdnn(int idnn) {
		this.idnn = idnn;
	}
	public String getNamenn() {
		return namenn;
	}
	public void setNamenn(String namenn) {
		this.namenn = namenn;
	}
	@Override
	public String toString() {
		return "nganhnghe [idnn=" + idnn + ", namenn=" + namenn + "]";
	}
}
