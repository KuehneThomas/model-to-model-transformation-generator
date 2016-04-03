package transformationGenerator.population;

import java.util.Date;

import transformationGenerator.population.interfaces.IChangeLogEntry;

public class ChangeLogEntry implements IChangeLogEntry {

	private final Date createdAt;
	private String changeDescription;

	public ChangeLogEntry(String changeDescription) {
		this.createdAt = new Date();
		this.changeDescription = changeDescription;
	}

	@Override
	public Date getCreatedAt() {
		return createdAt;
	}

	@Override
	public String toString() {
		return String.format("%s: %s", createdAt, changeDescription);
	}

}
