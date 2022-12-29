package model;

public class cv {
    private int idcv;
    private String namecv;
    private String name;
    private String email;
    private String phone;
    private String hobby;
    private String dob;
    private int old;
    private String adress;
    private String job;
    private String career;
    private String technical;
    private String gender;
    private int idu;
    private int idnn;
    
    public cv()
    {
    }
    public cv(int idcv,String namecv, String name, String email, String phone, String hobby,String dob, int old, String adress, String job, String career,String technical,String gender, int idu, int idnn) {
    	this.idcv = idcv;
    	this.namecv = namecv;
    	this.name = name;
    	this.email = email;
    	this.phone = phone;
    	this.hobby = hobby;
    	this.dob = dob;
    	this.old = old;
    	this.adress = adress;
    	this.job = job;
    	this.career = career;
    	this.technical = technical;
    	this.gender = gender;
    	this.idu = idu;
    	this.idnn = idnn;
    }
	public String getNamecv() {
		return namecv;
	}
	public void setNamecv(String namecv) {
		this.namecv = namecv;
	}
	public int getIdnn() {
		return idnn;
	}
	public void setIdnn(int idnn) {
		this.idnn = idnn;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getOld() {
		return old;
	}
	public void setOld(int old) {
		this.old = old;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getCareer() {
		return career;
	}
	public void setCareer(String career) {
		this.career = career;
	}
	public String getTechnical() {
		return technical;
	}
	public void setTechnical(String technical) {
		this.technical = technical;
	}
	public int getIdcv() {
		return idcv;
	}
	public void setIdcv(int idcv) {
		this.idcv = idcv;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public int getIdu() {
		return idu;
	}
	public void setIdu(int idu) {
		this.idu = idu;
	}
	@Override
	public String toString() {
		return "cv [idcv=" + idcv + ", namecv=" + namecv + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", hobby=" + hobby + ", dob=" + dob + ", old=" + old + ", adress=" + adress + ", job=" + job
				+ ", career=" + career + ", technical=" + technical + ", gender=" + gender + ", idu=" + idu + ", idnn="
				+ idnn + "]";
	}
    
}
