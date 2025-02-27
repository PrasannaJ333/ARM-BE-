package org.arm.resource.mngt.entity;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
//@AllArgsConstructor
@NoArgsConstructor
public class Campaign {
	@Id
	private int campaignId;
	private String campaignName;
	private String campaignOwner;
	private Timestamp startDate;
	private Timestamp endDate;
	@Enumerated(EnumType.STRING)
	private Priority priority;
	@Enumerated(EnumType.STRING)
	private Status status;
	private Timestamp createDate;
	private Timestamp updateDate;
	private int isDeleted;
	private String createdBy;
	private String updatedBy;
	private String region;
	@OneToMany(mappedBy = "campaign")
	private Set<Project> projects;

	
	@Override
	public String toString() {
		return "Campaign [campaignId=" + campaignId + ", campaignName=" + campaignName + ", campaignOwner="
				+ campaignOwner + ", startDate=" + startDate + ", endDate=" + endDate + ", priority=" + priority
				+ ", status=" + status + ", createDate=" + createDate + ", updateDate=" + updateDate + ", isDeleted="
				+ isDeleted + "]";
	}


	public Campaign(int campaignId, String campaignName, String campaignOwner, Timestamp startDate, Timestamp endDate,
			Priority priority, Status status, Timestamp createDate, Timestamp updateDate, int isDeleted,
			String createdBy, String updatedBy, String region, Set<Project> projects) {
		super();
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.campaignOwner = campaignOwner;
		this.startDate = startDate;
		this.endDate = endDate;
		this.priority = priority;
		this.status = status;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.isDeleted = isDeleted;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.region = region;
		this.projects = projects;
	}
	
}
