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
@Table(name = "DOCGIA")
public class DocGia {
	
	@Id
	@Column(name = "ID")
	private int id;
	
	@Column(name = "MaDocGia")
	private String maDocGia;
	
	@Column(name = "TenDocGia")
	private String tenDocGia;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date ngaySinh;
	
	@Column(name = "DiaChi")
	private String diaChi;
	
	@Column(name = "Email")
	private String email;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date ngayLapThe;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date ngayHetHan;
	
	@Column(name = "idLoaiDocGia")
	private int idLoaiDocGia;
	
	@Column(name = "TongNoHienTai")
	private int tongNoHienTai;
	
	@Column(name = "idNguoiDung")
	private int idNguoiDung;

	public DocGia() {
		super();
	}

	public DocGia(int id, String maDocGia, String tenDocGia, Date ngaySinh, String diaChi, String email,
			Date ngayLapThe, Date ngayHetHan, int idLoaiDocGia, int tongNoHienTai, int idNguoiDung) {
		super();
		this.id = id;
		this.maDocGia = maDocGia;
		this.tenDocGia = tenDocGia;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.email = email;
		this.ngayLapThe = ngayLapThe;
		this.ngayHetHan = ngayHetHan;
		this.idLoaiDocGia = idLoaiDocGia;
		this.tongNoHienTai = tongNoHienTai;
		this.idNguoiDung = idNguoiDung;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMaDocGia() {
		return maDocGia;
	}

	public void setMaDocGia(String maDocGia) {
		this.maDocGia = maDocGia;
	}

	public String getTenDocGia() {
		return tenDocGia;
	}

	public void setTenDocGia(String tenDocGia) {
		this.tenDocGia = tenDocGia;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getNgayLapThe() {
		return ngayLapThe;
	}

	public void setNgayLapThe(Date ngayLapThe) {
		this.ngayLapThe = ngayLapThe;
	}

	public Date getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(Date ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}

	public int getIdLoaiDocGia() {
		return idLoaiDocGia;
	}

	public void setIdLoaiDocGia(int idLoaiDocGia) {
		this.idLoaiDocGia = idLoaiDocGia;
	}

	public int getTongNoHienTai() {
		return tongNoHienTai;
	}

	public void setTongNoHienTai(int tongNoHienTai) {
		this.tongNoHienTai = tongNoHienTai;
	}

	public int getIdNguoiDung() {
		return idNguoiDung;
	}

	public void setIdNguoiDung(int idNguoiDung) {
		this.idNguoiDung = idNguoiDung;
	}
	
	
	
	
}
