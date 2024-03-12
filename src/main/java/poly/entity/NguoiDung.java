package poly.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "NGUOIDUNG")
public class NguoiDung {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "MaNguoiDung")
	private String maNguoiDung;
	
	@Column(name = "TenNguoiDung")
	private String tenNguoiDung;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date ngaySinh;
	
	@Column(name = "ChucVu")
	private String chucVu;
	
	@Column(name = "TenDangNhap")
	private String tenDangNhap;
	
	@Column(name = "MatKhau")
	private String matKhau;
	
	@Column(name = "idNhomNguoiDung")
	private int idNhomNguoiDung;

	public NguoiDung() {
		super();
	}

	public NguoiDung(int id, String maNguoiDung, String tenNguoiDung, Date ngaySinh, String chucVu, String tenDangNhap,
			String matKhau, int idNhomNguoiDung) {
		super();
		this.id = id;
		this.maNguoiDung = maNguoiDung;
		this.tenNguoiDung = tenNguoiDung;
		this.ngaySinh = ngaySinh;
		this.chucVu = chucVu;
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
		this.idNhomNguoiDung = idNhomNguoiDung;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMaNguoiDung() {
		return maNguoiDung;
	}

	public void setMaNguoiDung(String maNguoiDung) {
		this.maNguoiDung = maNguoiDung;
	}

	public String getTenNguoiDung() {
		return tenNguoiDung;
	}

	public void setTenNguoiDung(String tenNguoiDung) {
		this.tenNguoiDung = tenNguoiDung;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public String getTenDangNhap() {
		return tenDangNhap;
	}

	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public int getIdNhomNguoiDung() {
		return idNhomNguoiDung;
	}

	public void setIdNhomNguoiDung(int idNhomNguoiDung) {
		this.idNhomNguoiDung = idNhomNguoiDung;
	}
	
	
	
	
	
}
