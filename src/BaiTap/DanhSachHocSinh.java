package BaiTap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class DanhSachHocSinh  {
	// 1. Attributes
	ArrayList<HocSinh> listHocSinh;
	// 2.Getter,Setter

	public ArrayList<HocSinh> getListHocSinh() {
		return listHocSinh;
	}

	public void setListHocSinh(ArrayList<HocSinh> listHocSinh) {
		this.listHocSinh = listHocSinh;
	}

	public DanhSachHocSinh() {
		listHocSinh = new ArrayList<HocSinh>();
	}

	public void xuat() {
		for (HocSinh hs : this.listHocSinh) {
			hs.xuat();
		}
	}

	public void taoDuLieuHS() {
		try {
			FileReader reader = new FileReader("src/BaiTap/HocSinh.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] listInfo = line.split(" # ");
				HocSinh hs = new HocSinh();
				hs.setHoTen(listInfo[0]);
				hs.setNamSinh(Integer.parseInt(listInfo[1]));
				hs.setNoiSinh(listInfo[2]);
				hs.setDiaChi(listInfo[3]);
				hs.setDiemToan(Float.parseFloat(listInfo[4]));
				hs.setDiemVan(Float.parseFloat(listInfo[5]));
				hs.setDiemNgoaiNgu(Float.parseFloat(listInfo[6]));
				this.listHocSinh.add(hs);
				reader.close();
			}
		} catch (IOException e) {

		}
	}

	public void tinhDiemTrungBinh() {
		for (HocSinh hs : this.listHocSinh) {
			hs.tinhDiemTB();
		}
	}

	public ArrayList<HocSinh> lietKeHocSinhCoDiemTBCaoNhat() {
		ArrayList<HocSinh> listTB = new ArrayList<HocSinh>();
		float diemTBMax = timDiemTBCaoNhat();
		for (HocSinh hs : this.listHocSinh) {
			if (hs.getDiemTB() == diemTBMax) {
				listTB.add(hs);
			}
		}
		return listTB;
	}

	public float timDiemTBCaoNhat() {
		float diemTBMax = 0;
		for (HocSinh hs : this.listHocSinh) {
			if (hs.getDiemTB() > diemTBMax) {
				diemTBMax = hs.getDiemTB();
			}
		}
		return diemTBMax;
	}
	public void xepLoaiHocSinh() {
		for(HocSinh hs : this.listHocSinh) {
			hs.xepLoaiHocSinh();
		}
	}
	public void bubbleSort(ArrayList<HocSinh> _listHS) {
		int i;
		int j;
		for (i = 0; i < _listHS.size(); i++) {
			for (j = _listHS.size() - 1; j > i; j--) {
				HocSinh personI = _listHS.get(j);
				HocSinh personJ = _listHS.get(j-1);
				if (personI.getHoTen().compareToIgnoreCase(personJ.getHoTen())<0) {
					Collections.swap(_listHS, j,j-1);
				}
			}
		}
	}
	public void sortName() {
		bubbleSort(this.listHocSinh);
	}
	public void TBQuickSort(ArrayList<HocSinh> list, int left, int right) {

		int i = left;

		int j = right;
		HocSinh hs = list.get((left + right) / 2);

		do {

			while (list.get(i).getDiemTB() > hs.getDiemTB()) {
				i++;

			}
			while (list.get(j).getDiemTB() < hs.getDiemTB()) {

				j--;

			}
			if (i <= j) {
				Collections.swap(list, j, i);
				i++;
				j--;

			}
		} while (i < j);
		if (left < j) {

			TBQuickSort(list, left, j);
		}
		if (i < right) {

			TBQuickSort(list, i, right);
		}

	}
	public void sapXepDTB() {
		TBQuickSort(listHocSinh, 0, listHocSinh.size()-1);
	}

	public void them(HocSinh hs) {
		this.listHocSinh.add(hs);
		
	}
}