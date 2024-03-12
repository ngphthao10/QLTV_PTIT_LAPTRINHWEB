package poly.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "PHIEUMUONTRA")
public class PhieuMuonTra {
	
	@Id
	@Column(name = "SoPhieuMuonTra")
	private int soPhieuMuonTra;
	
	@Column(name = "idDocGia")
	private int idDocGia;
	
	@Column(name = "idCuonSach")
	private int idCuonSach;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "NgayMuon")
	private Date ngayMuon;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "ngayTra")
	private Date ngayTra;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "HanTra")
	private Date hanTra;
	
	@Column(name = "SoTienPhat")
	private int soTienPhat;

	public PhieuMuonTra() {
		super();
	}

	public PhieuMuonTra(int soPhieuMuonTra, int idDocGia, int idCuonSach, Date ngayMuon, Date ngayTra, Date hanTra,
			int soTienPhat) {
		super();
		this.soPhieuMuonTra = soPhieuMuonTra;
		this.idDocGia = idDocGia;
		this.idCuonSach = idCuonSach;
		this.ngayMuon = ngayMuon;
		this.ngayTra = ngayTra;
		this.hanTra = hanTra;
		this.soTienPhat = soTienPhat;
	}

	public int getSoPhieuMuonTra() {
		return soPhieuMuonTra;
	}

	public void setSoPhieuMuonTra(int soPhieuMuonTra) {
		this.soPhieuMuonTra = soPhieuMuonTra;
	}

	public int getIdDocGia() {
		return idDocGia;
	}

	public void setIdDocGia(int idDocGia) {
		this.idDocGia = idDocGia;
	}

	public int getIdCuonSach() {
		return idCuonSach;
	}

	public void setIdCuonSach(int idCuonSach) {
		this.idCuonSach = idCuonSach;
	}

	public Date getNgayMuon() {
		return ngayMuon;
	}

	public void setNgayMuon(Date ngayMuon) {
		this.ngayMuon = ngayMuon;
	}

	public Date getNgayTra() {
		return ngayTra;
	}

	public void setNgayTra(Date ngayTra) {
		this.ngayTra = ngayTra;
	}

	public Date getHanTra() {
		return hanTra;
	}

	public void setHanTra(Date hanTra) {
		this.hanTra = hanTra;
	}

	public int getSoTienPhat() {
		return soTienPhat;
	}

	public void setSoTienPhat(int soTienPhat) {
		this.soTienPhat = soTienPhat;
	}
	
	
	
}
