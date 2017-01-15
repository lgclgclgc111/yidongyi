package entity;
import javax.persistence.*;  
import javax.validation.constraints.NotNull;  
import java.math.BigDecimal;  
import java.util.Date;  

@Entity  
@Table(name = "sys_users")  
public class Sys_users {
	@Id  
    @GeneratedValue(strategy = GenerationType.AUTO)  
    private int id;  
	
	@Column(name = "jobIDorstudentID", nullable = false, length = 30)  
	    private String jobIDorstudentID; 
	 
	@Column(name = "passward", nullable = false, length = 10)  
	    private int passward;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobIDorstudentID() {
		return jobIDorstudentID;
	}

	public void setJobIDorstudentID(String jobIDorstudentID) {
		this.jobIDorstudentID = jobIDorstudentID;
	}

	public int getPassward() {
		return passward;
	}

	public void setPassward(int passward) {
		this.passward = passward;
	}  
	
	
	
}
