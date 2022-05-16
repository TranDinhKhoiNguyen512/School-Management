package BaiTap;

import java.util.Calendar;
import java.util.Scanner;

public class GiaoVien extends ThanhVien implements NhapXuat {
	// 1. Attributes
	private int namBatDauDay;
	private String chuyenMon;
	private int soNamGiangDay;
	private int year = Calendar.getInstance().get(Calendar.YEAR);
	// 2. Getter, Setter

	public int getNamBatDauDay() {
		return namBatDauDay;
	}

	public void setNamBatDauDay(int namBatDauDay) {
		this.namBatDauDay = namBatDauDay;
	}

	public String getChuyenMon() {
		return chuyenMon;
	}

	public void setChuyenMon(String chuyenMon) {
		this.chuyenMon = chuyenMon;
	}
	
	public int getSoNamGiangDay() {
		return soNamGiangDay;
	}

	//3. Constructors
	public GiaoVien() {
		// TODO Auto-generated constructor stub
	}

	public GiaoVien(String hoTen, int namSinh, String noiSinh, String diaChi, int namBatDauDay, String chuyenMon) {
		super(hoTen, namSinh, noiSinh, diaChi);
		this.namBatDauDay = namBatDauDay;
		this.chuyenMon = chuyenMon;
	}
	//4. Input, Output
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Năm bắt đầu dạy: ");
		this.namBatDauDay = Integer.parseInt(scan.nextLine());
		boolean flag = true;
		do {
			System.out.println("Chuyên Môn (tự Nhiên , Xã Hội) :");
			this.chuyenMon = scan.nextLine();
			if (this.chuyenMon.equalsIgnoreCase("Tự Nhiên") || this.chuyenMon.equalsIgnoreCase("Xã Hội")) {

				flag = false;
			}
		} while (flag);

	}
	public void xuat() {
		super.xuat();
		System.out.println(" Năm bắt đầu dạy là: "+this.namBatDauDay+" Chuyên môn: "+this.chuyenMon+" Số năm giảng dạy là: "+this.soNamGiangDay);
	}
	//5. Business methods
	public void tinhSoNamGiangDay() {
		this.soNamGiangDay = year - this.namBatDauDay;
	}
}
