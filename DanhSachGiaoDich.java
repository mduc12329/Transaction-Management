import java.util.ArrayList;
import java.util.Scanner;

/*
 * Muc dich: quan ly cac danh sach giao dich 
 * Nguoi tao: Dustin
 * Ngay tao: 19-10-2021
 * Version: 1.0 */
public class DanhSachGiaoDich {
	final int MOT_TY = 1000;
	// 1.attributes
	private ArrayList<GiaoDich> listGiaoDich;
	private int tongSLVangGiaoDich;
	private int tongSLTienTeGiaoDich;
	private float trungBinhThanhTienTienTe;
	// 2.get set

	public ArrayList<GiaoDich> getListGiaoDich() {
		return listGiaoDich;
	}

	public void setListGiaoDich(ArrayList<GiaoDich> listGiaoDich) {
		this.listGiaoDich = listGiaoDich;
	}

	public int getTongSLVangGiaoDich() {
		return tongSLVangGiaoDich;
	}

	public void setTongSLVangGiaoDich(int tongSLVangGiaoDich) {
		this.tongSLVangGiaoDich = tongSLVangGiaoDich;
	}

	public int getTongSLTienTeGiaoDich() {
		return tongSLTienTeGiaoDich;
	}

	public void setTongSLTienTeGiaoDich(int tongSLTienTeGiaoDich) {
		this.tongSLTienTeGiaoDich = tongSLTienTeGiaoDich;
	}
	
	public float getTrungBinhThanhTienTienTe() {
		return trungBinhThanhTienTienTe;
	}

	// 3.constructor
	public DanhSachGiaoDich() {
		this.listGiaoDich = new ArrayList<GiaoDich>();
	}

	public DanhSachGiaoDich(ArrayList<GiaoDich> listGiaoDich) {
		this.listGiaoDich = listGiaoDich;
	}

	// 4. in out
	public void nhap(Scanner sc) {
		boolean flag = true;
		GiaoDich giaoDich;
		do {
			System.out.println("1. Nhap giao dich vang.");
			System.out.println("2. Nhap giao dich tien te.");
			System.out.println("0. Thoat.");
			int chon = Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1:
				giaoDich = new GiaoDichVang();
				giaoDich.nhap(sc);
				giaoDich.tinhTien();
				this.listGiaoDich.add(giaoDich);
				break;
			case 2:
				giaoDich = new GiaoDichTienTe();
				giaoDich.nhap(sc);
				giaoDich.tinhTien();
				this.listGiaoDich.add(giaoDich);
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("Nhap dung gia tri.");
			}
		} while (flag);
	}

	public void xuat() {
		for (GiaoDich gd : this.listGiaoDich) {
			gd.xuat();
		}
	}
	
	public void xuatGDTheoTieuChi() {
		System.out.println("Cac giao dich lon hon 1 ty la: ");
		for(GiaoDich gd : this.listGiaoDich) {
			if(gd.getDonGia()>MOT_TY) {
				gd.xuat();
			}
		}
	}

	// 5. method
	public void tinhTongSLVangGiaoDich() {
		for (GiaoDich gd : this.listGiaoDich) {
			if (gd instanceof GiaoDichVang) {
				this.tongSLVangGiaoDich += gd.soLuong;
			}
		}
		System.out.println("Tong SL giao dich vang: " + this.tongSLVangGiaoDich);
	}
	public void tinhTongSLTienTeGiaoDich() {
		for (GiaoDich gd : this.listGiaoDich) {
			if (gd instanceof GiaoDichTienTe) {
				this.tongSLTienTeGiaoDich += gd.soLuong;
			}
		}
		System.out.println("Tong SL giao dich tien te: " + this.tongSLTienTeGiaoDich);
	}
	public void tinhTrungBinhThanhTienTienTe() {
		float thanhTien = 0;
		for (GiaoDich gd : this.listGiaoDich) {
			if (gd instanceof GiaoDichTienTe) {
				thanhTien += ((GiaoDichTienTe)gd).thanhTien;
			}
		}
		this.trungBinhThanhTienTienTe = thanhTien/tongSLTienTeGiaoDich;
		System.out.println("Trung binh thanh tien tien te: " + this.tongSLTienTeGiaoDich);
	}
	
	public void tinhTienChoCacGiaoDich() {
		for (GiaoDich gd : this.listGiaoDich) {
			gd.tinhTien();
		}
	}
	
	public void dummyData() {
		GiaoDich giaoDich = new GiaoDichVang(1,1,1,2020,4,5,"SGC");
		this.listGiaoDich.add(giaoDich);
		giaoDich = new GiaoDichVang(2,2,1,2020,5,10,"SGC");
		this.listGiaoDich.add(giaoDich);
		giaoDich = new GiaoDichVang(3,3,4,2020,12,11,"9999");
		this.listGiaoDich.add(giaoDich);
		giaoDich = new GiaoDichTienTe(4,5,5,2020,1200,10,23,2);
		this.listGiaoDich.add(giaoDich);
		giaoDich = new GiaoDichTienTe(5,6,7,2020,1400,11,10,1);
		this.listGiaoDich.add(giaoDich);
	}
}
