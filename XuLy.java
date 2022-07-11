import java.util.Scanner;

public class XuLy {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		doMenu();
	}

	private static void inMenu() {
		System.out.println("1. Nhap giao dich.");
		System.out.println("2. Tinh tong so luong tung loai.");
		System.out.println("3. Tinh trung binh thanh tien giao dich ngoai te.");
		System.out.println("4. Xuat giao dich co don gia hon 1 ty VND.");
		System.out.println("0. Thoat.");
	}

	private static void doMenu() {
		DanhSachGiaoDich list = new DanhSachGiaoDich();
		list.dummyData();
		list.tinhTienChoCacGiaoDich();
		boolean flag = true;
		do {
			inMenu();
			System.out.println("Moi chon: ");
			int chon = Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1:
				list.nhap(sc);
				break;
			case 2:
				list.tinhTongSLVangGiaoDich();
				list.tinhTongSLTienTeGiaoDich();
				break;
			case 3:
				list.tinhTrungBinhThanhTienTienTe();
				System.out.println("Trung binh thanh tien giao dich tien te: "+list.getTrungBinhThanhTienTienTe());
				break;
			case 4:
				list.xuatGDTheoTieuChi();
				break;
			case 0:
				flag = false;
				break;
			}
		} while (flag);
	}
}
