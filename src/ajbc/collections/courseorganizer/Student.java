package ajbc.collections.courseorganizer;

import java.util.HashMap;
import java.util.Map;

public class Student {
	protected int id;
	protected Map<Integer, Course> courses = new HashMap<Integer, Course>();

	public Student(int id, Map<Integer, Course> courses) {
		super();
		this.id = id;
		this.courses = courses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Map<Integer, Course> getCourses() {
		return courses;
	}

	public void setCourses(Map<Integer, Course> courses) {
		this.courses = courses;
	}

	public double calcAverage() {
		return sumGrades() / courses.size();
	}

	private double sumGrades() {
		double sum = 0;
		for (Map.Entry<Integer, Course> entry : courses.entrySet()) {
			sum += entry.getValue().getGrade();
		}
		return sum;
	}

	public double calculateSD() {
		double sum = 0.0, standardDeviation = 0.0;
		int length = courses.size();

		for (Map.Entry<Integer, Course> entry : courses.entrySet()) {
			sum += entry.getValue().getGrade();
		}

		double mean = sum / length;

		for (Map.Entry<Integer, Course> entry : courses.entrySet()) {
			standardDeviation += Math.pow(entry.getValue().getGrade() - mean, 2);
		}

		return Math.sqrt(standardDeviation / length);
	}
	
	@Override
	public String toString() {
		return "Studet [id=" + id + ", courses=" + courses + "]";
	}
}
