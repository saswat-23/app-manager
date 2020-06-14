package tech.saswat.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "app_members")

public class AppMember {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int sl;
	private String program;
	private String uname;
	private String password;
	private String status;
	
	@Column(name = "updt_at")
	private Date updtAt;

	public int getSl() {
		return sl;
	}

	public void setSl(int sl) {
		this.sl = sl;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getUpdtAt() {
		return updtAt;
	}

	public void setUpdtAt(Timestamp updtAt) {
		this.updtAt = updtAt;
	}


	@Override
	public String toString() {
		return "AppMember [sl=" + sl + ", program=" + program + ", uname=" + uname + ", password=" + password
				+ ", status=" + status + ", updtAt=" + updtAt + "]";
	}
	
	
	
}
