package swing_study.panel;

public class Title {
	private int tno;
	private String tname;
	
	public Title() {
		// TODO Auto-generated constructor stub
	}
	public Title(int no) {
		this.tno = no;
	}
	
	public Title(String tname) {
		this.tname = tname;
	}
	public Title(int no, String name) {
		this.tno = no;
		this.tname = name;
	}
	
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	@Override
	public String toString() {
		return String.format("Title [no=%s, name=%s]", tno, tname);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + tno;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Title other = (Title) obj;
		if (tno != other.tno)
			return false;
		return true;
	}
	
	

}
