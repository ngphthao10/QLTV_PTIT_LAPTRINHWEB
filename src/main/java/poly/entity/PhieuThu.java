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
@Table(name = "PHIEUTHU")
public class PhieuThu {
	
	@Id
	@Column(name = "SoPhieuThu")
	private int soPhieuThu;
	
	@Column(name = "idDocGia")
	private int idDocGia;
	
	@Column(name = "SoTienThu")
	private int soTienThu;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "NgayLap")
	private Date ngayLap;

	public PhieuThu() {
		super();
	}

	public PhieuThu(int soPhieuThu, int idDocGia, int soTienThu, Date ngayLap) {
		super();
		this.soPhieuThu = soPhieuThu;
		this.idDocGia = idDocGia;
		this.soTienThu = soTienThu;
		this.ngayLap = ngayLap;
	}

	public int getSoPhieuThu() {
		return soPhieuThu;
	}

	public void setSoPhieuThu(int soPhieuThu) {
		this.soPhieuThu = soPhieuThu;
	}

	public int getIdDocGia() {
		return idDocGia;
	}

	public void setIdDocGia(int idDocGia) {
		this.idDocGia = idDocGia;
	}

	public int getSoTienThu() {
		return soTienThu;
	}

	public void setSoTienThu(int soTienThu) {
		this.soTienThu = soTienThu;
	}

	public Date getNgayLap() {
		return ngayLap;
	}

	public void setNgayLap(Date ngayLap) {
		this.ngayLap = ngayLap;
	}
	
	
	
}
