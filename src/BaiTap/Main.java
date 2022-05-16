package BaiTap;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		TruongHoc th = new TruongHoc();
		doMenu(th, scan);
	}
	public static void menu() {
		System.out.println("1. Nhập thêm thông tin ");
		System.out.println("2. xuất thông tin học sinh ");
		System.out.println("3. xuất thông tin giáo viên");
		System.out.println("4. tìm giáo viên của thâm niên cao nhất");
		System.out.println("5. tìm giáo viên có thâm niên > 5 năm  và khối tự nhiên");
		System.out.println("6. Học sinh có điểm trung bình cao nhất của học sinh");
		System.out.println("7. sắp xếp học sinh theo điểm trung bình giảm dần QuickSort");
		System.out.println("8. sắp xếp tên học sinh theo thứ tự ABC bubbleSort");
		System.out.println("0. Thoát");
	}
	public static void doMenu(TruongHoc th, Scanner scan) {
		boolean flag = true;
		th.taoDuLieu();
		do {
			menu();
			System.out.print(">>Mời chọn: ");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 0:
				flag = false;
				break;
			case 1:
				th.nhap(scan);
				break;
			case 2:
				th.tinhDiemTBHS();
				th.xepLoaiHocSinh();
				th.xuatHS();
				break;
			case 3:
				th.tinhSoNamGiangDay();
				th.xuatGV();
				break;
			case 4:				
				th.giaoVienCoThamNienCaoNhat();
				break;
			case 5:
				th.giaoVienTheoTieuChi();
				break;
			case 6:
				th.lietKeHSdiemTBCaoNhat();
				break;
			case 7:
				th.tinhDiemTBHS();
				th.xepLoaiHocSinh();
				th.sapXepTheoDTB();
				th.xuatHS();
				break;
			case 8:
				th.tinhDiemTBHS();
				th.xepLoaiHocSinh();
				th.sapXepTheoDTB();
				th.sapXepTenHS();
				th.xuatHS();
				break;
			}

		} while (flag);

	}
}