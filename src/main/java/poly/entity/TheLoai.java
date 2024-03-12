package poly.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "THELOAI")
public class TheLoai {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "MaTheLoai")
	private String maTheLoai;
	
	@Column(name = "TenTheLoai")
	private String tenTheLoai;

	public TheLoai() {
		super();
	}

	public TheLoai(int id, String maTheLoai, String tenTheLoai) {
		super();
		this.id = id;
		this.maTheLoai = maTheLoai;
		this.tenTheLoai = tenTheLoai;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMaTheLoai() {
		return maTheLoai;
	}

	public void setMaTheLoai(String maTheLoai) {
		this.maTheLoai = maTheLoai;
	}

	public String getTenTheLoai() {
		return tenTheLoai;
	}

	public void setTenTheLoai(String tenTheLoai) {
		this.tenTheLoai = tenTheLoai;
	}

	
}
