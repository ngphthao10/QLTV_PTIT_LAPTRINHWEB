package poly.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CHUCNANG")
public class ChucNang {
	@Id 
	@Column(name = "id")
	private int id;
	
	@Column(name = "MaChucNang")
	private String maChucNang;
	
	@Column(name = "TenChucNang")
	private String tenChucNang;
	
	@Column(name = "TenManHinh")
	private String tenManHinh;

	public ChucNang(Integer id, String maChucNang, String tenChucNang, String tenManHinh) {
		super();
		this.id = id;
		this.maChucNang = maChucNang;
		this.tenChucNang = tenChucNang;
		this.tenManHinh = tenManHinh;
	}

	public ChucNang() {
		super();
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getMaChucNang() {
		return maChucNang;
	}

	public void setMaChucNang(String maChucNang) {
		this.maChucNang = maChucNang;
	}

	public String getTenChucNang() {
		return tenChucNang;
	}

	public void setTenChucNang(String tenChucNang) {
		this.tenChucNang = tenChucNang;
	}

	public String getTenManHinh() {
		return tenManHinh;
	}

	public void setTenManHinh(String tenManHinh) {
		this.tenManHinh = tenManHinh;
	}
	
	
	
}
