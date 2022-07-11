import java.util.Scanner;

/*
 * Muc dich: Lop cha xu ly cac giao dich
 * Nguoi tao: Dustin
 * Ngay tao: 19-10-2021
 * Version: 1.0 */
public class GiaoDich {
	//1.Atrributes
	protected int maGiaoDich;
	protected int ngay;
	protected int thang;
	protected int nam;
	protected float donGia;
	protected int soLuong;
	protected float thanhTien;
	//2. get set
	public int getMaGiaoDich() {
		return maGiaoDich;
	}
	public void setMaGiaoDich(int maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}
	public int getNgay() {
		return ngay;
	}
	public void setNgay(int ngay) {
		this.ngay = ngay;
	}
	public int getThang() {
		return thang;
	}
	public void setThang(int thang) {
		this.thang = thang;
	}
	public int getNam() {
		return nam;
	}
	public void setNam(int nam) {
		this.nam = nam;
	}
	public float getDonGia() {
		return donGia;
	}
	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public float getThanhTien() {
		return thanhTien;
	}
	//3. constructors
	public GiaoDich() {
		
	}
	
	public GiaoDich(int maGiaoDich, int ngay, int thang, int nam, float donGia, int soLuong) {
		this.maGiaoDich = maGiaoDich;
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}
	//4. in out
	public void nhap(Scanner sc) {
		System.out.println("Nhap ma: ");
		this.maGiaoDich = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap ngay: ");
		this.ngay = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap thang: ");
		this.thang = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap nam: ");
		this.nam = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap so luong: ");
		this.soLuong = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap don gia: ");
		this.donGia = Float.parseFloat(sc.nextLine());
	}
	
	public void xuat() {
		System.out.print("Ma giao dich: "+this.maGiaoDich+
						"\tNgay giao dich: "+this.ngay+'-'+this.thang+'-'+this.nam+
						"\tDon gia: "+this.donGia+
						"\tSo luong: "+this.soLuong);
	}
	//5. methods
	protected void tinhTien() {
		
	}
}
