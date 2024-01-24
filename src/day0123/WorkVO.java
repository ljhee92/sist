package day0123;

public class WorkVO {
	
	private String name;
	private int javaScore;
	private int oracleScore;
	
	public WorkVO() {
		
	}	// WorkVO
	
	public WorkVO(String name, int javaScore, int oracleScore) {
		this.name = name;
		this.javaScore = javaScore;
		this.oracleScore = oracleScore;
	}	// WorkVO

	public String getName() {
		return name;
	}	// getName

	public void setName(String name) {
		this.name = name;
	}	// setName

	public int getJavaScore() {
		return javaScore;
	}	// getJavaScore

	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}	// setJavaScore
	
	public int getOracleScore() {
		return oracleScore;
	}	// getOracleScore

	public void setOracleScore(int oracleScore) {
		this.oracleScore = oracleScore;
	}	// setOracleScore
	
}	// class