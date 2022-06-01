
public class SinhVien {
	// cac thuoc tinh
	private String hoVaTen;
	private int mSSV;
	private float diemLT,diemTH;
	// tao 1 constructor rỗng
	public SinhVien() {
		
	}
	// khi dat ten bien ko ghi hoa chu cai dau
	// tạo 1 constructor có tham số
	public SinhVien(String hovaten ,int mssv , float diemlt , float diemth) {
		this.hoVaTen = hovaten;
		this.mSSV = mssv;
		this.diemLT = diemlt;
		this.diemTH = diemth;
	}
	// ham get 
	public String getHoVaTen() {
		return this.hoVaTen;
	}
	public int getMSSV() {
		return this.mSSV;
	}
	public float getDiemLT() {
		return this.diemLT;
	}
	public float getDiemTH() {
		return this.diemTH;
	}
	// ham set 
	public void setHoVaTen(String hovaten) {
		this.hoVaTen=hovaten;
	}
	public void setMSSV(int mssv) {
		this.mSSV=mssv;
	}
	public void setDiemLT(float diemlt) {
			this.diemLT=diemlt;
	}
	public void setDiemTH(float diemTH) {
		this.diemTH=diemTH;
	}
	// cac phuong thuc 
	public float inDiemTB() {
		return (this.diemLT+this.diemTH)/2;
	}
	public String toString() {
		return "mssv,diemlt,diemth" +"/"+this.mSSV +"/"+ this.diemLT +"/"+ this.diemTH;  
	}
	public String thongTinSV() {
		return "mssv,diemlt,diemth,diemtb"+"/"+this.mSSV+ "/"+ this.diemLT +"/"+ this.diemTH+"/"+this.inDiemTB();
	}
	
	
}
