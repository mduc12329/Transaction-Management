import java.util.Scanner;

/*
 * Muc dich: Lop xu ly giao dich vang
 * Nguoi tao: Dustin
 * Ngay tao: 19-10-2021
 * Version: 1.0 */
public class GiaoDichVang extends GiaoDich {
	// 1.attributes
	private String loaiVang;

	// 2.get set
	public String getLoaiVang() {
		return loaiVang;
	}

	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}

	// 3. constructors
	public GiaoDichVang() {
	}

	public GiaoDichVang(int maGiaoDich, int ngay, int thang, int nam, float donGia, int soLuong, String loaiVang) {
		super(maGiaoDich, ngay, thang, nam, donGia, soLuong);
		this.loaiVang = loaiVang;
	}

	// 4.in out
	@Override
	public void nhap(Scanner sc) {
		super.nhap(sc);
		System.out.println("Nhap loai vang: ");
		this.loaiVang = sc.nextLine();
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\tLoai vang: " + this.loaiVang +"\tThanh tien: "+this.thanhTien);
	}
	// 5. methods
	@Override
	protected void tinhTien() {
		this.thanhTien = this.soLuong * this.donGia;
	}

	
}
