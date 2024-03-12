package poly.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CT_PHIEUNHAP")
public class CT_PhieuNhap {
	
	@Id
	@Column(name = "SoPhieuNhap")
	private int soPhieuNhap;
	
	@Id
	@Column(name = "idSach")
	private int idSach;
	
	@Column(name = "DonGia")
	private int donGia;
	
	@Column(name = "ThanhTien")
	private int thanhTien;
	
	@Column(name = "SoLuongNhap")
	private int soLuongNhap;

	public CT_PhieuNhap() {
		super();
	}

	public CT_PhieuNhap(int soPhieuNhap, int idSach, int donGia, int thanhTien, int soLuongNhap) {
		super();
		this.soPhieuNhap = soPhieuNhap;
		this.idSach = idSach;
		this.donGia = donGia;
		this.thanhTien = thanhTien;
		this.soLuongNhap = soLuongNhap;
	}

	public int getSoPhieuNhap() {
		return soPhieuNhap;
	}

	public void setSoPhieuNhap(int soPhieuNhap) {
		this.soPhieuNhap = soPhieuNhap;
	}

	public int getIdSach() {
		return idSach;
	}

	public void setIdSach(int idSach) {
		this.idSach = idSach;
	}

	public int getDonGia() {
		return donGia;
	}

	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}

	public int getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(int thanhTien) {
		this.thanhTien = thanhTien;
	}

	public int getSoLuongNhap() {
		return soLuongNhap;
	}

	public void setSoLuongNhap(int soLuongNhap) {
		this.soLuongNhap = soLuongNhap;
	}
	
	
	
}
