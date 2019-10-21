
/*
 * 学生信息类
 * 用于存储学生信息
 */
public class StudentInfo {
	private String sno;
	private String sname;
	private String snative;
	private String ssxe;
	private String stel;
	private String saddress;
	private int regsta;
	private boolean grade;
	private String success;
	private String conclusion;
	private String graduid;
	private String degreeid;
	private String id;
	private String dep;
	private StringBuilder fail = new StringBuilder();
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSnative() {
		return snative;
	}
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public StringBuilder getFail() {
		return fail;
	}
	public void setFail(String s) {
		this.fail = fail.append(s);
	}
	public void setSnative(String snative) {
		this.snative = snative;
	}
	public String getSsxe() {
		return ssxe;
	}
	public void setSsxe(String ssxe) {
		this.ssxe = ssxe;
	}
	public String getStel() {
		return stel;
	}
	public void setStel(String stel) {
		this.stel = stel;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public int getRegsta() {
		return regsta;
	}
	public void setRegsta(int regsta) {
		this.regsta = regsta;
	}
	public boolean isGrade() {
		return grade;
	}
	public void setGrade(boolean grade) {
		this.grade = grade;
	}
	public StudentInfo(String sno, String sname, String snative, String ssxe,
			String stel, String saddress, int regsta, boolean grade) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.snative = snative;
		this.ssxe = ssxe;
		this.stel = stel;
		this.saddress = saddress;
		this.regsta = regsta;
		this.grade = grade;
	}
	public StudentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentInfo(String sno) {
		super();
		this.sno = sno;
	}
	
	public String getConclusion() {
		return conclusion;
	}
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	@Override
	public String toString() {
		return "StudentInfo [sno=" + sno + ", sname=" + sname + ", graduid=" + graduid + ", degreeid=" + degreeid + "]";
	}
	public StudentInfo(String sno, String sname, String snative, String ssxe, String stel,
			String conclusion) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.snative = snative;
		this.ssxe = ssxe;
		this.stel = stel;
		this.conclusion = conclusion;
	}
	public String getGraduid() {
		return graduid;
	}
	public void setGraduid(String graduid) {
		this.graduid = graduid;
	}
	public String getDegreeid() {
		return degreeid;
	}
	public void setDegreeid(String degreeid) {
		this.degreeid = degreeid;
	}
	public StudentInfo(String sno,String sname, String graduid, String degreeid) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.graduid = graduid;
		this.degreeid = degreeid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setFail(StringBuilder fail) {
		this.fail = fail;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public StudentInfo(String sname, String graduid, String degreeid, String id, String dep) {
		super();
		this.sname = sname;
		this.graduid = graduid;
		this.degreeid = degreeid;
		this.id = id;
		this.dep = dep;
	}
	
	
}
