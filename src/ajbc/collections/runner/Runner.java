package ajbc.collections.runner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Runner {

	public static void main(String[] args) {
		// learningCollections();
		Road road = new Road();
		road.addCheckPoint(new CheckPoint("Hedera", "hedera", 0));
		road.addCheckPoint(new CheckPoint("Netanya", "Shalom Alehem", 1));
		road.addCheckPoint(new CheckPoint("Tel Aviv", "Hashalom", 2));
		road.addCheckPoint(new CheckPoint("Lod", "Achisamach", 3));
		road.addCheckPoint(new CheckPoint("Ramla", "Ramlod", 4));

		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(new Car(1234, 1));
		cars.add(new Car(5678, 3));
		cars.add(new Car(4567, 0));
		cars.add(new Car(1563, 2));
		cars.add(new Car(5846, 2));
		road.setCars(cars);

		for (int i = 0; i < 5; i++) {
			System.out.println("------------------------------------");
			for (int car = 0; car < 5; car++) {
				Random random = new Random();
				int prevOrNext = random.nextInt(2);
				int currentCheckpoint = cars.get(car).getCheckPointIndex();
				
				System.out.println(cars.get(car).toString());
				System.out.println(road.getCheckPoints().get(currentCheckpoint).toString()+"\n");

				if (prevOrNext == 0) { // previous
					if (currentCheckpoint > 0)
						cars.get(car).setCheckPointIndex(currentCheckpoint--);
				} else { // next
					if (currentCheckpoint < road.getCheckPoints().size())
						cars.get(car).setCheckPointIndex(currentCheckpoint++);
				}
			}
			System.out.println("------------------------------------");
		}
	}

	private static void learningCollections() {
		List<Integer> list = new ArrayList<Integer>(); // List is an interface - can't do new to interface.
		list.add(3);
		list.add(20);
		list.add(55);

		for (Integer integer : list) {
			System.out.println(integer);
		}

		System.out.println("------------------");

		Iterator<Integer> iterator = list.iterator();

		while (iterator.hasNext()) {
			int i = iterator.next();
			System.out.println(i);
		}

		System.out.println("------------------");

		iterator.forEachRemaining(System.out::println);

		System.out.println("------------------");

		List<String> listStr = new ArrayList<String>();
		listStr.add("Dana");
		listStr.add("Adir");
		listStr.add("Talya");
		System.out.println(listStr);
		removeAllItemsFromList(listStr);
		System.out.println("------------------");
		System.out.println(listStr);

		System.out.println("------------------");
		ArrayList<Integer> input = range(1, 10);
		System.out.println(input);
		System.out.println("------------------");
		ArrayList<Integer> doubled = double_each(input);
		System.out.println(doubled);
		System.out.println("------------------");
		ArrayList<Integer> complexified = complexify_each(input);
		System.out.println(complexified);
	}

	public static ArrayList<Integer> range(int start, int end) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int item = start; item < end; item++)
			list.add(item);

		return list;
	}

	public static ArrayList<Integer> double_each(ArrayList<Integer> list) {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		ListIterator<Integer> iterator = list.listIterator();

		while (iterator.hasNext()) {
			int index = iterator.nextIndex();
			newList.add(list.get(index) * 2);
			iterator.next();
		}

		return newList;
	}

	public static ArrayList<Integer> complexify_each(ArrayList<Integer> list) {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		ListIterator<Integer> iterator = list.listIterator();

		while (iterator.hasNext()) {
			int index = iterator.nextIndex();
			newList.add((list.get(index) * 4) + 3);
			iterator.next();
		}

		return newList;
	}

	public static void removeAllItemsFromList(List<String> list) {
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}
	}

}
