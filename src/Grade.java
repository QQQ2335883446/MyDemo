/*
 * 成绩类
 */
public class Grade {
	private String cname;
	private int score;
	private int credit;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Grade(String cname, int score, int credit) {
		super();
		this.cname = cname;
		this.score = score;
		this.credit = credit;
	}
	@Override
	public String toString() {
		return "Grade [cname=" + cname + ", score=" + score + ", credit=" + credit + "]";
	}
	
}
