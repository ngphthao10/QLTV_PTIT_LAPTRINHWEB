package poly.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TUASACH")
public class TuaSach {
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "MaTuaSach")
	private String maTuaSach;
	
	@Column(name = "TenTuaSach")
	private String tenTuaSach;
	
	@Column(name = "idTheLoai")
	private int idTheLoai;
	
	@Column(name = "DaAn")
	private int daAn;

	public TuaSach() {
		super();
	}

	public TuaSach(int id, String maTuaSach, String tenTuaSach, int idTheLoai, int daAn) {
		super();
		this.id = id;
		this.maTuaSach = maTuaSach;
		this.tenTuaSach = tenTuaSach;
		this.idTheLoai = idTheLoai;
		this.daAn = daAn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMaTuaSach() {
		return maTuaSach;
	}

	public void setMaTuaSach(String maTuaSach) {
		this.maTuaSach = maTuaSach;
	}

	public String getTenTuaSach() {
		return tenTuaSach;
	}

	public void setTenTuaSach(String tenTuaSach) {
		this.tenTuaSach = tenTuaSach;
	}

	public int getIdTheLoai() {
		return idTheLoai;
	}

	public void setIdTheLoai(int idTheLoai) {
		this.idTheLoai = idTheLoai;
	}

	public int getDaAn() {
		return daAn;
	}

	public void setDaAn(int daAn) {
		this.daAn = daAn;
	}
	
}