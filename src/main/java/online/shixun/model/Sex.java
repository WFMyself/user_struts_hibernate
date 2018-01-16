package online.shixun.model;
public enum Sex {
	MAN("男", 0), WOMAN("女", 1);

	private String name;
	private int index;

	private Sex(String name, int index) {
		this.name = name;
		this.index = index;
	}

	public static String getName(int index) {
		for (Sex sex : Sex.values()) {
			if (sex.getIndex() == index) {
				return sex.name();
			}
		}
		return null;
	}

	public static Sex getSex(String name) {
		for (Sex sex : Sex.values()) {
			if (sex.getName().equals(name)) {
				return sex;
			}
		}
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
