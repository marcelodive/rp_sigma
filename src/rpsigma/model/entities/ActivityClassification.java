package rpsigma.model.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the activity_classification database table.
 * 
 */
@Entity
@Table(name="activity_classification")
@NamedQuery(name="ActivityClassification.findAll", query="SELECT a FROM ActivityClassification a")
public class ActivityClassification implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ActivityClassificationPK id;

	private byte classification;

	public ActivityClassification() {
	}

	public ActivityClassificationPK getId() {
		return this.id;
	}

	public void setId(ActivityClassificationPK id) {
		this.id = id;
	}

	public byte getClassification() {
		return this.classification;
	}

	public void setClassification(byte classification) {
		this.classification = classification;
	}

}