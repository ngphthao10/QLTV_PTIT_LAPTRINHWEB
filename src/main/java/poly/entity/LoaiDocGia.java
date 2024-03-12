package poly.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "LOAIDOCGIA")
public class LoaiDocGia {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "MaLoaiDocGia")
	private String maLoaiDocGia;
	
	@Column(name = "TenLoaiDocGia")
	private String tenLoaiDocGia;

	public LoaiDocGia() {
		super();
	}

	public LoaiDocGia(int id, String maLoaiDocGia, String tenLoaiDocGia) {
		super();
		this.id = id;
		this.maLoaiDocGia = maLoaiDocGia;
		this.tenLoaiDocGia = tenLoaiDocGia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMaLoaiDocGia() {
		return maLoaiDocGia;
	}

	public void setMaLoaiDocGia(String maLoaiDocGia) {
		this.maLoaiDocGia = maLoaiDocGia;
	}

	public String getTenLoaiDocGia() {
		return tenLoaiDocGia;
	}

	public void setTenLoaiDocGia(String tenLoaiDocGia) {
		this.tenLoaiDocGia = tenLoaiDocGia;
	}
	
	
}
