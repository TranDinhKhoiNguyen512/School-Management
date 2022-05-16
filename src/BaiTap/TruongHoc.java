package BaiTap;

import java.util.ArrayList;
import java.util.Scanner;

public class TruongHoc {
	//1. Attributes 

	private DanhSachGiaoVien listGV;
	private DanhSachHocSinh listHS;
	
	public DanhSachGiaoVien getListGV() {
		return listGV;
	}
	public void setListGV(DanhSachGiaoVien listGV) {
		this.listGV = listGV;
	}
	public DanhSachHocSinh getListHS() {
		return listHS;
	}
	public void setListHS(DanhSachHocSinh listHS) {
		this.listHS = listHS;
	}
	public TruongHoc() {
		
	}
	public void taoDuLieu() {
		this.listGV = new DanhSachGiaoVien();
		this.listHS = new DanhSachHocSinh();
		this.listGV.taoDuLieuGV();
		this.listHS.taoDuLieuHS();
	}
	public void xuatGV() {
		
		this.listGV.xuat();
	}
	public void xuatHS() {
		this.listHS.xuat();
	}
	public void tinhSoNamGiangDay() {
		this.listGV.tinhSoNamGiangDay();
	}
	public void giaoVienCoThamNienCaoNhat() {
		ArrayList<GiaoVien> listTNCN = this.listGV.lietKeGiaoVienThamNienCaoNhat();
		for(GiaoVien gv : listTNCN) {
			gv.xuat();
		}
	}
	public void giaoVienTheoTieuChi() {
		ArrayList<GiaoVien> listGVTChi = this.listGV.lietKeGiaoVienTheoTieuChi();
		for(GiaoVien gv : listGVTChi) {
			gv.xuat();
		}
	}
	public void tinhDiemTBHS() {
		this.listHS.tinhDiemTrungBinh();
	}
	public void lietKeHSdiemTBCaoNhat() {
		ArrayList<HocSinh> listHSTBCN = this.listHS.lietKeHocSinhCoDiemTBCaoNhat();
		for(HocSinh hs : listHSTBCN) {
			hs.xuat();
		}
	}
	public void xepLoaiHocSinh() {
		this.listHS.xepLoaiHocSinh();
	}
	public void sapXepTenHS() {
		this.listHS.sortName();
	}
	public void sapXepTheoDTB() {
		this.listHS.sapXepDTB();
	}
	public void menu() {

		System.out.println("1. nhập giáo viên");
		System.out.println("2. nhập học sinh");
		System.out.println("0. Thoát");

	}
	// nhap giao vien , hoc sinh

	public void nhap(Scanner scan) {
		GiaoVien gv;
		HocSinh hs;
		boolean flag = true;
		do {
			menu();
			System.out.println("Mời chọn: ");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {

			case 1:
				gv = new GiaoVien();
				gv.nhap(scan);
				this.listGV.them(gv);
				
				break;
			case 2:
				hs = new HocSinh();
				hs.nhap(scan);
				this.listHS.them(hs);
				break;
			case 0:
				flag = false;
				break;

			}
		} while (flag);

	}
}
