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
@Table(name = "PhieuNhapSach")
public class PhieuNhapSach {

	@Id
	@Column(name = "SoPhieuNhap")
	private int soPhieuNhap;
	
	@Column(name = "TongTien")
	private int tongTien;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "NgayNhap")
	private Date ngayNhap;

	public PhieuNhapSach() {
		super();
	}

	public PhieuNhapSach(int soPhieuNhap, int tongTien, Date ngayNhap) {
		super();
		this.soPhieuNhap = soPhieuNhap;
		this.tongTien = tongTien;
		this.ngayNhap = ngayNhap;
	}

	public int getSoPhieuNhap() {
		return soPhieuNhap;
	}

	public void setSoPhieuNhap(int soPhieuNhap) {
		this.soPhieuNhap = soPhieuNhap;
	}

	public int getTongTien() {
		return tongTien;
	}

	public void setTongTien(int tongTien) {
		this.tongTien = tongTien;
	}

	public Date getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	
	
	
}
