package ajbc.collections.top10;

public class Gamer implements Comparable<Gamer> {
	protected String name;
	protected int score;
	protected String country;
	protected int rank; 

	public Gamer(String name, int score, String country, int rank) {
		this.name = name;
		this.score = score;
		this.country = country;
		this.rank = rank;
	}

	public int getScore() {
		return score;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCountry() {
		return country;
	}
	
	public int getRank() {
		return rank;
	}

	@Override
	public String toString() {
		return "Gamer [name=" + name + ", score=" + score + ", country=" + country + ", rank=" + rank + "]";
	}

	@Override
	public int compareTo(Gamer o) {
		return this.getScore() - o.getScore();
	}

}
