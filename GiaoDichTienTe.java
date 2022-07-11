import java.util.Scanner;

/*
 * Muc dich: Lop xu ly giao dich tien
 * Nguoi tao: Dustin
 * Ngay tao: 19-10-2021
 * Version: 1.0 */
public class GiaoDichTienTe extends GiaoDich {
	// 1. attributes
	private float tiGia;
	private int loaiTienTe;
	// 2. get set

	public float getTiGia() {
		return tiGia;
	}

	public void setTiGia(float tiGia) {
		this.tiGia = tiGia;
	}

	public int getLoaiTienTe() {
		return loaiTienTe;
	}

	public void setLoaiTienTe(int loaiTienTe) {
		this.loaiTienTe = loaiTienTe;
	}

	// 3. constructors
	public GiaoDichTienTe() {
	}

	public GiaoDichTienTe(int maGiaoDich, int ngay, int thang, int nam, float donGia, int soLuong, float tiGia,
			int loaiTienTe) {
		super(maGiaoDich, ngay, thang, nam, donGia, soLuong);
		this.tiGia = tiGia;
		this.loaiTienTe = loaiTienTe;
	}

	// 4. in out
	@Override
	public void nhap(Scanner sc) {
		super.nhap(sc);
		System.out.println("Nhap vao ti gia: ");
		this.tiGia = Float.parseFloat(sc.nextLine());
		System.out.println("Nhap vao loai tien te: 1.VND	2.USD	3.EURO");
		this.loaiTienTe = Integer.parseInt(sc.nextLine());
	}

	@Override
	public void xuat() {
		super.xuat();
		String temp = "";
		if (this.loaiTienTe == 1) {
			temp = " VND";
		} else if (this.loaiTienTe == 2) {
			temp = " USD";
		} else {
			temp = " USD";
		}
		System.out.println("\tLoai tien te: " + temp + "\tTi gia: " + this.tiGia + "\tThanh tien: " + this.thanhTien);
	}

	// 5. methods
	@Override
	public void tinhTien() {
		if (loaiTienTe == 1) {
			this.thanhTien = this.soLuong * this.donGia;
		} else {
			this.thanhTien = this.soLuong * this.donGia + this.tiGia;
		}
	}
}
