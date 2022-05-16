package BaiTap;

import java.util.Scanner;

public abstract class ThanhVien implements NhapXuat {
	// 1. Attributes
	protected String hoTen;
	protected int namSinh;
	protected String noiSinh;
	protected String diaChi;

	// 2. Getter, Setter
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getNoiSinh() {
		return noiSinh;
	}

	public void setNoiSinh(String noiSinh) {
		this.noiSinh = noiSinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	// 3. Constructors
	public ThanhVien() {
		// TODO Auto-generated constructor stub
	}

	public ThanhVien(String hoTen, int namSinh, String noiSinh, String diaChi) {
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.noiSinh = noiSinh;
		this.diaChi = diaChi;
	}

	// 4. Input, Output
	public void nhap(Scanner scan) {
		System.out.print("Họ và Tên: ");
		this.hoTen = scan.nextLine();
		System.out.print("Năm Sinh: ");
		this.namSinh = Integer.parseInt(scan.nextLine());
		System.out.print("Nơi Sinh: ");
		this.noiSinh = scan.nextLine();
		System.out.print("Địa chỉ: ");
		this.diaChi = scan.nextLine();

	}

	public void xuat() {
		System.out.print("Họ tên: " + this.hoTen + " Năm sinh: " + this.namSinh + " Nơi sinh: " + this.noiSinh
				+ " Địa chỉ: " + this.diaChi);
	}
	// 5. Business methods

}
