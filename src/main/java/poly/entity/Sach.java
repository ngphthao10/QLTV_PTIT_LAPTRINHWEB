package poly.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SACH")
public class Sach {

	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "MaSach")
	private String maSach;
	
	@Column(name = "idTuaSach")
	private int idTuaSach;
	
	@Column(name = "SoLuong")
	private int soLuong;
	
	@Column(name = "SoLuongConLai")
	private int soLuongConLai;
	
	@Column(name = "DonGia")
	private int donGia;
	
	@Column(name = "NamXB")
	private int namXB;
	
	@Column(name = "NhaXB")
	private String nhaXB;
	
	@Column(name = "DaAn")
	private int daAn;

	public Sach() {
		super();
	}

	public Sach(int id, String maSach, int idTuaSach, int soLuong, int soLuongConLai, int donGia, int namXB,
			String nhaXB, int daAn) {
		super();
		this.id = id;
		this.maSach = maSach;
		this.idTuaSach = idTuaSach;
		this.soLuong = soLuong;
		this.soLuongConLai = soLuongConLai;
		this.donGia = donGia;
		this.namXB = namXB;
		this.nhaXB = nhaXB;
		this.daAn = daAn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public int getIdTuaSach() {
		return idTuaSach;
	}

	public void setIdTuaSach(int idTuaSach) {
		this.idTuaSach = idTuaSach;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public int getSoLuongConLai() {
		return soLuongConLai;
	}

	public void setSoLuongConLai(int soLuongConLai) {
		this.soLuongConLai = soLuongConLai;
	}

	public int getDonGia() {
		return donGia;
	}

	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}

	public int getNamXB() {
		return namXB;
	}

	public void setNamXB(int namXB) {
		this.namXB = namXB;
	}

	public String getNhaXB() {
		return nhaXB;
	}

	public void setNhaXB(String nhaXB) {
		this.nhaXB = nhaXB;
	}

	public int getDaAn() {
		return daAn;
	}

	public void setDaAn(int daAn) {
		this.daAn = daAn;
	}
	
	
	
}
