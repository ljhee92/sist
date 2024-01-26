package day0124;

public class StuInfoVO {
	
	private int number;
	private String name;
	private int javaScore;
	private int oracleScore;
	
	public StuInfoVO(int number, String name, int javaScore, int oracleScore) {
		this.number = number;
		this.name = name;
		this.javaScore = javaScore;
		this.oracleScore = oracleScore;
	}	// StuInfoVO
	
	public int getNumber() {
		return number;
	}	// getNumber

	public void setNumber(int number) {
		this.number = number;
	}	// setNumber

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