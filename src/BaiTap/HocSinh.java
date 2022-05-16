package BaiTap;

import java.util.Scanner;

public class HocSinh extends ThanhVien implements NhapXuat {
	// 1. Attributes
	private float diemToan;
	private float diemVan;
	private float diemNgoaiNgu;
	private float diemTB;
	private String xepLoai;
	// 2. Getter, Setter

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemVan() {
		return diemVan;
	}

	public void setDiemVan(float diemVan) {
		this.diemVan = diemVan;
	}

	public float getDiemNgoaiNgu() {
		return diemNgoaiNgu;
	}

	public void setDiemNgoaiNgu(float diemNgoaiNgu) {
		this.diemNgoaiNgu = diemNgoaiNgu;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public String getXepLoai() {
		return xepLoai;
	}

	// 3. Constructors
	public HocSinh() {
		// TODO Auto-generated constructor stub
	}

	public HocSinh(String hoTen, int namSinh, String noiSinh, String diaChi, float diemToan, float diemVan,
			float diemNgoaiNgu) {
		super(hoTen, namSinh, noiSinh, diaChi);
		this.diemToan = diemToan;
		this.diemVan = diemVan;
		this.diemNgoaiNgu = diemNgoaiNgu;
	}
	

	// 4. Input,Output
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.print("Nhập điểm Toán: ");
		this.diemToan = Float.parseFloat(scan.nextLine());
		System.out.print("Nhập điểm ngoại ngữ: ");
		this.diemNgoaiNgu = Float.parseFloat(scan.nextLine());
		System.out.print("Nhập điểm văn: ");
		this.diemVan = Float.parseFloat(scan.nextLine());

	}
	public void xuat() {
		super.xuat();
		System.out.println(" Điểm toán: " + this.diemToan + " Điểm văn: " + this.diemVan + " Điểm ngoại ngữ: "
				+ this.diemNgoaiNgu+" Điểm trung bình là: "+this.diemTB + " Xếp loại : "+this.xepLoai);
	}

	// 5 Business methods
	public void tinhDiemTB() {
		this.diemTB = (this.diemToan + this.diemVan + this.diemNgoaiNgu) / 3;
	}
	public void xepLoaiHocSinh() {
			if (this.diemTB < 5) {
				this.xepLoai = "Yếu";
			} else if (5 <= this.diemTB && this.diemTB < 7) {
				this.xepLoai = " Trung bình";
			} else if (7 <= this.diemTB && this.diemTB < 8) {
				this.xepLoai = " Khá";
			} else if (8 <= this.diemTB && this.diemTB < 9) {
				this.xepLoai = "Giỏi";
			} else if (9 <= this.diemTB && this.diemTB <= 10) {
				this.xepLoai = "Xuất Sắc";
			}
	}
}
