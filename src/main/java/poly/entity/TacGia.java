package poly.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TACGIA")
public class TacGia {
	
	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name = "MaTacGia")
	private String maTacGia;
	
	@Column(name = "TenTacGia")
	private String tenTacGia;

	public TacGia() {
		super();
	}

	public TacGia(String id, String maTacGia, String tenTacGia) {
		super();
		this.id = id;
		this.maTacGia = maTacGia;
		this.tenTacGia = tenTacGia;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMaTacGia() {
		return maTacGia;
	}

	public void setMaTacGia(String maTacGia) {
		this.maTacGia = maTacGia;
	}

	public String getTenTacGia() {
		return tenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}
	
	
}
