package ajbc.collections.top10;

public class Gamer {
	protected String name;
	protected int score;
	protected String country;
	protected int rank;

	public Gamer(String name, int score, String country, int rank) {
		super();
		this.name = name;
		this.score = score;
		this.country = country;
		this.rank = rank; //the number of hours played
	}

	@Override
	public String toString() {
		return "Gamer [name=" + name + ", score=" + score + ", country=" + country + ", rank=" + rank + "]";
	}

}
