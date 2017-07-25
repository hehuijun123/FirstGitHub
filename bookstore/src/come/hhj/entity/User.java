package come.hhj.entity;

public class User {
	private int userid;
	
	private String username;
	
	private String accoundid;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAccoundid() {
		return accoundid;
	}

	public void setAccoundid(String accoundid) {
		this.accoundid = accoundid;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", accoundid=" + accoundid + "]";
	}
	

}
