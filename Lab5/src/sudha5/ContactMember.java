package sudha5;

public class ContactMember {
	private String cname,cmob,cmail;
	
	public ContactMember() {
		super();
	}

	public ContactMember(String cname, String cmob, String cmail) {
		super();
		this.cname = cname;
		this.cmob = cmob;
		this.cmail = cmail;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCmob() {
		return cmob;
	}

	public void setCmob(String cmob) {
		this.cmob = cmob;
	}

	public String getCmail() {
		return cmail;
	}

	public void setCmail(String cmail) {
		this.cmail = cmail;
	}
}
