package tutorial34;

import java.io.Serializable;

//To make class serializable, have it implement Serializable

public class Person implements Serializable {
	private static final long serialVersionUID = -8163181067146972663L;
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [ id = " + id + " name = " + name + " ]";
	}

}
