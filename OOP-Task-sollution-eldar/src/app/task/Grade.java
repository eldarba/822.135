package app.task;

public class Grade {

	private Profession profession;
	private int score; // 40 - 100
	public static final int MIN_SCORE = 40;
	public static final int MAX_SCORE = 100;

	public Grade() {
	}

	public Grade(Profession profession, int score) {
		super();
		this.profession = profession;
		this.score = score;
	}

	public Profession getProfession() {
		return profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		if (score >= MIN_SCORE && score <= MAX_SCORE) {
			this.score = score;
		}
	}

}
