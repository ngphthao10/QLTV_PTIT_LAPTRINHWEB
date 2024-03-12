package poly.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "THAMSO")
public class ThamSo {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "TuoiToiThieu")
	private int tuoiToiThieu;
	
	@Column(name = "TuoiToiDa")
	private int tuoiToiDa;
	
	@Column(name = "ThoiHanThe")
	private int thoiHanThe;
	
	@Column(name = "KhoangCachXuatBan")
	private int khoangCachXuatBan;
	
	@Column(name = "SoSachMuonToiDa")
	private int soSachMuonToiDa;
	
	@Column(name = "SoNgayMuonToiDa")
	private int soNgayMuonToiDa;
	
	@Column(name = "DonGiaPhat")
	private int donGiaPhat;
	
	@Column(name = "AD_QDKTTienThu")
	private int AD_QDKTTienThu;

	public ThamSo() {
		super();
	}

	public ThamSo(int id, int tuoiToiThieu, int tuoiToiDa, int thoiHanThe, int khoangCachXuatBan, int soSachMuonToiDa,
			int soNgayMuonToiDa, int donGiaPhat, int aD_QDKTTienThu) {
		super();
		this.id = id;
		this.tuoiToiThieu = tuoiToiThieu;
		this.tuoiToiDa = tuoiToiDa;
		this.thoiHanThe = thoiHanThe;
		this.khoangCachXuatBan = khoangCachXuatBan;
		this.soSachMuonToiDa = soSachMuonToiDa;
		this.soNgayMuonToiDa = soNgayMuonToiDa;
		this.donGiaPhat = donGiaPhat;
		AD_QDKTTienThu = aD_QDKTTienThu;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTuoiToiThieu() {
		return tuoiToiThieu;
	}

	public void setTuoiToiThieu(int tuoiToiThieu) {
		this.tuoiToiThieu = tuoiToiThieu;
	}

	public int getTuoiToiDa() {
		return tuoiToiDa;
	}

	public void setTuoiToiDa(int tuoiToiDa) {
		this.tuoiToiDa = tuoiToiDa;
	}

	public int getThoiHanThe() {
		return thoiHanThe;
	}

	public void setThoiHanThe(int thoiHanThe) {
		this.thoiHanThe = thoiHanThe;
	}

	public int getKhoangCachXuatBan() {
		return khoangCachXuatBan;
	}

	public void setKhoangCachXuatBan(int khoangCachXuatBan) {
		this.khoangCachXuatBan = khoangCachXuatBan;
	}

	public int getSoSachMuonToiDa() {
		return soSachMuonToiDa;
	}

	public void setSoSachMuonToiDa(int soSachMuonToiDa) {
		this.soSachMuonToiDa = soSachMuonToiDa;
	}

	public int getSoNgayMuonToiDa() {
		return soNgayMuonToiDa;
	}

	public void setSoNgayMuonToiDa(int soNgayMuonToiDa) {
		this.soNgayMuonToiDa = soNgayMuonToiDa;
	}

	public int getDonGiaPhat() {
		return donGiaPhat;
	}

	public void setDonGiaPhat(int donGiaPhat) {
		this.donGiaPhat = donGiaPhat;
	}

	public int getAD_QDKTTienThu() {
		return AD_QDKTTienThu;
	}

	public void setAD_QDKTTienThu(int aD_QDKTTienThu) {
		AD_QDKTTienThu = aD_QDKTTienThu;
	}
	
	
	
}
