package poly.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NHOMNGUOIDUNG")
public class NhomNguoiDung {

	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "MaNhomNguoiDung")
	private String maNhomNguoiDung;
	
	@Column(name = "TenNhomNguoiDung")
	private String tenNhomNguoiDung;

	public NhomNguoiDung() {
		super();
	}

	public NhomNguoiDung(int id, String maNhomNguoiDung, String tenNhomNguoiDung) {
		super();
		this.id = id;
		this.maNhomNguoiDung = maNhomNguoiDung;
		this.tenNhomNguoiDung = tenNhomNguoiDung;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMaNhomNguoiDung() {
		return maNhomNguoiDung;
	}

	public void setMaNhomNguoiDung(String maNhomNguoiDung) {
		this.maNhomNguoiDung = maNhomNguoiDung;
	}

	public String getTenNhomNguoiDung() {
		return tenNhomNguoiDung;
	}

	public void setTenNhomNguoiDung(String tenNhomNguoiDung) {
		this.tenNhomNguoiDung = tenNhomNguoiDung;
	}
	
	
	
}
