package rpsigma.model.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the activity_classification database table.
 * 
 */
@Embeddable
public class ActivityClassificationPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="je_id")
	private int jeId;

	@Column(name="activity_id")
	private int activityId;

	public ActivityClassificationPK() {
	}
	public int getJeId() {
		return this.jeId;
	}
	public void setJeId(int jeId) {
		this.jeId = jeId;
	}
	public int getActivityId() {
		return this.activityId;
	}
	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ActivityClassificationPK)) {
			return false;
		}
		ActivityClassificationPK castOther = (ActivityClassificationPK)other;
		return 
			(this.jeId == castOther.jeId)
			&& (this.activityId == castOther.activityId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.jeId;
		hash = hash * prime + this.activityId;
		
		return hash;
	}
}