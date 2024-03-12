package poly.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUONSACH")
public class CuonSach {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "MaCuonSach")
	private String maCuonSach;
	
	@Column(name = "idSach")
	private int idSach;
	
	@Column(name = "TinhTrang")
	private int tinhTrang;
	
	@Column(name = "DaAn")
	private int daAn;

	public CuonSach() {
		super();
	}

	public CuonSach(int id, String maCuonSach, int idSach, int tinhTrang, int daAn) {
		super();
		this.id = id;
		this.maCuonSach = maCuonSach;
		this.idSach = idSach;
		this.tinhTrang = tinhTrang;
		this.daAn = daAn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMaCuonSach() {
		return maCuonSach;
	}

	public void setMaCuonSach(String maCuonSach) {
		this.maCuonSach = maCuonSach;
	}

	public int getIdSach() {
		return idSach;
	}

	public void setIdSach(int idSach) {
		this.idSach = idSach;
	}

	public int getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(int tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public int getDaAn() {
		return daAn;
	}

	public void setDaAn(int daAn) {
		this.daAn = daAn;
	}
	
	
	
}
