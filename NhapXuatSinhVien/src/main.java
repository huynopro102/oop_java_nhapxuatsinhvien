
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien("nguyen van a ", 1234, 5, 4);
		SinhVien sv2 = new SinhVien();
		SinhVien sv3 = new SinhVien();
		Scanner x1 = new Scanner(System.in);
		System.out.println("nhap ten sinh vien 2 ");
		sv2.setHoVaTen(x1.nextLine());
		System.out.println("nhap diemlt sv 2");
		sv2.setDiemLT(x1.nextFloat());
		System.out.println("nhap diemth sv 2");
		sv2.setDiemTH(x1.nextFloat());
		System.out.println("nhap mssv sv2");
		sv2.setMSSV(x1.nextInt());
		//
		System.out.println("nhap ten sinh vien 3 ");
		sv3.setHoVaTen(x1.next());
		System.out.println("nhap diemlt sv 3");
		sv3.setDiemLT(x1.nextFloat());
		System.out.println("nhap diemth sv 3");
		sv3.setDiemTH(x1.nextFloat());
		System.out.println("nhap mssv sv3");
		sv3.setMSSV(x1.nextInt());
		// 
		System.out.println("diemtb sv 1 "+sv1.inDiemTB());
		System.out.println("diemtb sv 2 "+sv2.inDiemTB());
		System.out.println("diemtb sv 3 "+sv3.inDiemTB());
		//
		System.out.println("ham toString sv 1 "+sv1.toString());
		System.out.println("ham toString sv 2 "+sv2.toString());
		System.out.println("ham toString sv 3 "+sv3.toString());
		//
		System.out.println("thong tin sv 1 "+sv1.thongTinSV());
		System.out.println("thong tin sv 2 "+sv2.thongTinSV());
		System.out.println("thong tin sv 3 "+sv3.thongTinSV());
		
	}
}
