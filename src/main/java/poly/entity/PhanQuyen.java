package poly.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PHANQUYEN")
public class PhanQuyen {
	
	@Id
	@Column(name = "idNhomNguoiDung")
	private int idNhomNguoiDung;
	
	@Id
	@Column(name = "idChucNang")
	private int idChucNang;

	public PhanQuyen() {
		super();
	}

	public PhanQuyen(int idNhomNguoiDung, int idChucNang) {
		super();
		this.idNhomNguoiDung = idNhomNguoiDung;
		this.idChucNang = idChucNang;
	}

	public int getIdNhomNguoiDung() {
		return idNhomNguoiDung;
	}

	public void setIdNhomNguoiDung(int idNhomNguoiDung) {
		this.idNhomNguoiDung = idNhomNguoiDung;
	}

	public int getIdChucNang() {
		return idChucNang;
	}

	public void setIdChucNang(int idChucNang) {
		this.idChucNang = idChucNang;
	}
	
	
	
}
