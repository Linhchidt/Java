package sinhvien;
import java.util.Scanner;
public class sinhvien {
	private int tuoi;
	private float diemtoan, diemvan, diemanh;
	private String hoten, gioitinh;
	
	public sinhvien() {
		
	}
	
	public sinhvien(int tuoi, float diemtoan,float diemvan, float diemanh, String hoten, String gioitinh) {
		this.hoten = hoten;
		this.diemtoan = diemtoan;
		this.diemvan = diemvan;
		this.diemanh = diemanh;
		this.gioitinh = gioitinh;
		this.tuoi = tuoi;
	}
	
	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public float getDiemtoan() {
		return diemtoan;
	}

	public void setDiemtoan(float diemtoan) {
		this.diemtoan = diemtoan;
	}

	public float getDiemvan() {
		return diemvan;
	}

	public void setDiemvan(float diemvan) {
		this.diemvan = diemvan;
	}

	public float getDiemanh() {
		return diemanh;
	}

	public void setDiemanh(float diemanh) {
		this.diemanh = diemanh;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public float diemTB() {
		return (diemtoan + diemvan + diemanh)/3;
	}
	/*public String toString() {
		return hoten + " - " + tuoi + " - " + gioitinh + ": Điểm Toán = " + diemtoan + "; Điểm Văn = " + diemvan + "; Điểm Tiếng Anh = "
	+ diemanh + "có Điểm trung bình = " + diemTB();
	}*/
	public void inSV() {
		System.out.printf("%6s %-5d %5s %10.2f %10.2f %6.2f %6.2f \n ",hoten , tuoi , gioitinh , diemtoan, diemvan, diemanh, diemTB());
	}
	
	public static void main( String[] args) {
		//thông tin sinh viên thứ nhất : 
		sinhvien sv1 = new sinhvien();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập họ tên sinh viên 1 : ");
		sv1.setHoten(sc.nextLine());
		System.out.println("Nhập tuổi sinh viên 1 : ");
		sv1.setTuoi(sc.nextInt());sc.nextLine();
		System.out.println("Nhập giới tính sinh viên 1: ");
		sv1.setGioitinh(sc.nextLine());
		System.out.println("Nhập điểm toán sinh viên 1 : ");
		sv1.setDiemtoan(sc.nextFloat());
		System.out.println("Nhập điểm văn sinh viên 1 : ");
		sv1.setDiemvan(sc.nextFloat());
		System.out.println("Nhập điểm tiếng anh sinh viên 1 : ");
		sv1.setDiemanh(sc.nextFloat());
		
		//thông tin sinh viên thứ 2 :
		
		sinhvien sv2 = new sinhvien();
		System.out.println("Nhập họ tên sinh viên 2 : ");
		sv2.setHoten(sc.nextLine());sc.nextLine();
		System.out.println("Nhập tuổi sinh viên 2 : ");
		sv2.setTuoi(sc.nextInt());sc.nextLine();
		System.out.println("Nhập giới tính sinh viên 2: ");
		sv2.setGioitinh(sc.nextLine());
		System.out.println("Nhập điểm toán sinh viên 2 : ");
		sv2.setDiemtoan(sc.nextFloat());
		System.out.println("Nhập điểm văn sinh viên 2 : ");
		sv2.setDiemvan(sc.nextFloat());
		System.out.println("Nhập điểm tiếng anh sinh viên 2 : ");
		sv2.setDiemanh(sc.nextFloat());
		
		//thông tin sinh viên thứ 3 :
		
		sinhvien sv3 = new sinhvien();
		System.out.println("Nhập họ tên sinh viên 3 : ");
		sv3.setHoten(sc.nextLine());sc.nextLine();
		System.out.println("Nhập tuổi sinh viên 3 : ");
		sv3.setTuoi(sc.nextInt());sc.nextLine();
		System.out.println("Nhập giới tính sinh viên 3 : ");
		sv3.setGioitinh(sc.nextLine());
		System.out.println("Nhập điểm toán sinh viên 3 : ");
		sv3.setDiemtoan(sc.nextFloat());
		System.out.println("Nhập điểm văn sinh viên 3 : ");
		sv3.setDiemvan(sc.nextFloat());
		System.out.println("Nhập điểm tiếng anh sinh viên 3 : ");
		sv3.setDiemanh(sc.nextFloat());
		 
		//in thông tin sinh viên
		
		System.out.printf("%10s %6s %10s %10s %10s %10s %10s \n", "Họ Tên SV","Tuổi","Giới tính",
				"Điểm Toán", "Điểm Văn", "Điểm Tiếng Anh", "Điểm Trung Bình");
		sv1.inSV();
		sv2.inSV();
		sv3.inSV();
			
	}
	
	
}
