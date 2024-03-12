package poly.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "CT_TACGIA")
public class CT_TACGIA {
	
	@Id
	@Column(name = "idTacGia")
	private int idTacGia;
	
	@Id
	@Column(name = "idTuaSach")
	private int idTuaSach;

	public CT_TACGIA() {
		super();
	}

	public CT_TACGIA(int idTacGia, int idTuaSach) {
		super();
		this.idTacGia = idTacGia;
		this.idTuaSach = idTuaSach;
	}

	public int getIdTacGia() {
		return idTacGia;
	}

	public void setIdTacGia(int idTacGia) {
		this.idTacGia = idTacGia;
	}

	public int getIdTuaSach() {
		return idTuaSach;
	}

	public void setIdTuaSach(int idTuaSach) {
		this.idTuaSach = idTuaSach;
	}
	
	
}
