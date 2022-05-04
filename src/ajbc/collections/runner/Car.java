package ajbc.collections.runner;

public class Car {
	protected int plateNum;
	protected int checkPointIndex;

	public Car(int plateNum, int checkPointIndex) {
		this.plateNum = plateNum;
		this.checkPointIndex = checkPointIndex;
	}	
	
	public int getCheckPointIndex() {
		return checkPointIndex;
	}

	public void setCheckPointIndex(int checkPointIndex) {
		this.checkPointIndex = checkPointIndex;
	}

	@Override
	public String toString() {
		return "Car [plateNum=" + plateNum + "]";
	}
}
