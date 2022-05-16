package BaiTap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class DanhSachGiaoVien   {
	ArrayList<GiaoVien> listGiaoVien;

	public ArrayList<GiaoVien> getListGiaoVien() {
		return listGiaoVien;
	}

	public void setListGiaoVien(ArrayList<GiaoVien> listGiaoVien) {
		this.listGiaoVien = listGiaoVien;
	}

	public DanhSachGiaoVien() {
		listGiaoVien = new ArrayList<GiaoVien>();
	}

	public void xuat() {
		for (GiaoVien gv : this.listGiaoVien) {
			gv.xuat();
		}
	}

	public void taoDuLieuGV() {
		try {
			FileReader reader = new FileReader("src/BaiTap/GiaoVien.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] listInfo = line.split(" # ");
				GiaoVien gv = new GiaoVien();
				gv.setHoTen(listInfo[0]);
				gv.setNamSinh(Integer.parseInt(listInfo[1]));
				gv.setNoiSinh(listInfo[2]);
				gv.setDiaChi(listInfo[3]);
				gv.setNamBatDauDay(Integer.parseInt(listInfo[4]));
				gv.setChuyenMon(listInfo[5]);
				this.listGiaoVien.add(gv);
				reader.close();
			}
		} catch (IOException e) {
		}
	}

	public void tinhSoNamGiangDay() {
		for (GiaoVien gv : this.getListGiaoVien()) {
			gv.tinhSoNamGiangDay();
		}
	}

	public ArrayList<GiaoVien> lietKeGiaoVienThamNienCaoNhat() {
		ArrayList<GiaoVien> list = new ArrayList<GiaoVien>();
		int thamNienMax = timThamNienCaoNhat();	
		for(GiaoVien gv : this.listGiaoVien) {
			if(gv.getSoNamGiangDay() == thamNienMax) {
				list.add(gv);
			}
		}
	return list;
	}

	public int timThamNienCaoNhat() {
		int thamNienMax = 0;
		for (GiaoVien gv : this.getListGiaoVien()) {
			if (gv.getSoNamGiangDay() > thamNienMax) {
				thamNienMax = gv.getSoNamGiangDay();
			}
		}
	return thamNienMax;
	}
	public ArrayList<GiaoVien> lietKeGiaoVienTheoTieuChi(){
		ArrayList<GiaoVien> listTC = new ArrayList<GiaoVien>();
		for(GiaoVien gv : this.listGiaoVien) {
			if(gv.getSoNamGiangDay() > 5 && gv.getChuyenMon().equalsIgnoreCase("Tự nhiên")) {
				listTC.add(gv);
			}
		}
	return listTC;
	}

	public void them(GiaoVien gv) {
		this.listGiaoVien.add(gv);
		
	}
}
