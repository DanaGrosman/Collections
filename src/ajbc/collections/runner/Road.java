package ajbc.collections.runner;

import java.util.ArrayList;
import java.util.LinkedList;

public class Road {
	protected LinkedList<CheckPoint> checkPoints = new LinkedList<CheckPoint>();
	protected ArrayList<Car> cars = new ArrayList<Car>();

	public Road() {
	}

	public LinkedList<CheckPoint> getCheckPoints() {
		return checkPoints;
	}

	public void setCars(ArrayList<Car> cars) {
		this.cars = cars;
	}

	public void addCheckPoint(CheckPoint checkPoint) {
		checkPoints.add(checkPoint);
	}

	public void removeCheckPoint(int index) {
		updateCars(index);
		checkPoints.remove(index);
	}

	private void updateCars(int index) {
		// TODO Auto-generated method stub
		
	}
}
