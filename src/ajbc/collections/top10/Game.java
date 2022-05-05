package ajbc.collections.top10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Game {
	private final static int TOP10 = 10;

	protected ArrayList<Gamer> gamers = new ArrayList<Gamer>();
	protected ArrayList<Gamer> topTen = null;

	public Game() {

	}

	public ArrayList<Gamer> getGamers() {
		return gamers;
	}

	public void setGamers(ArrayList<Gamer> gamers) {
		this.gamers = gamers;
	}

	@Override
	public String toString() {
		return "Game [gamers=" + gamers + ", topTen=" + topTen + "]";
	}

	public void addGamerToList(Gamer gamer) {
		gamers.add(gamer);
	}

	public void updateScoreBoard() { // That method run every 10 minutes
		ArrayList<Gamer> list = gamers;
		Collections.sort(list, Collections.reverseOrder());
		try {
			topTen = new ArrayList<Gamer>(list.subList(0, TOP10));
		} catch (IndexOutOfBoundsException e) {
			topTen = new ArrayList<Gamer>(list.subList(0, list.size()));
		}
	}

	public void showScoreBoard() {
		for (int i = 0; i < TOP10 && topTen.size() > i; i++) {
			System.out.println(i + 1 + ": " + topTen.get(i));
		}
	}
	
	public void showAllGamers() {
		for (int i = 0; i < gamers.size(); i++) {
			System.out.println(i + 1 + ": " + gamers.get(i));
		}
	}

	public ArrayList<Gamer> sortByGamerName() {
		Comparator<Gamer> gamerNameComparator = new Comparator<Gamer>() {
			@Override
			public int compare(Gamer g1, Gamer g2) {
				return g1.getName().compareTo(g2.getName());
			}
		};

		ArrayList<Gamer> list = gamers;
		Collections.sort(list, gamerNameComparator);
		return new ArrayList<Gamer>(list.subList(0, list.size()));
	}

	public ArrayList<Gamer> sortByCountry() {
		Comparator<Gamer> countryComparator = new Comparator<Gamer>() {
			@Override
			public int compare(Gamer g1, Gamer g2) {
				return g1.getCountry().compareTo(g2.getCountry());
			}
		};

		ArrayList<Gamer> list = gamers;
		Collections.sort(list, countryComparator);
		return new ArrayList<Gamer>(list.subList(0, list.size()));
	}

	public ArrayList<Gamer> sortByGamerRank() {
		Comparator<Gamer> gamerRankComparator = new Comparator<Gamer>() {
			@Override
			public int compare(Gamer g1, Gamer g2) {
				return -(g1.getRank() - g2.getRank());
			}
		};

		ArrayList<Gamer> list = gamers;
		Collections.sort(list, gamerRankComparator);
		return new ArrayList<Gamer>(list.subList(0, list.size()));
	}
}
