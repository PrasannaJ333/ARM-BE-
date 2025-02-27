package org.arm.resource.mngt.service;

import java.util.List;

import org.arm.resource.mngt.entity.Campaign;
import org.arm.resource.mngt.entity.Project;
import org.arm.resource.mngt.exception.IDNotFoundException;
import org.arm.resource.mngt.exception.ProjectNotFoundException;

public interface IProjectService {

	public List<Project> getAllProject() throws ProjectNotFoundException;

	public void save(Project project);
	
	Project getById(int id) throws IDNotFoundException;
	
	List<Project> getProjectsOfOneCampiagn(int campaignId) throws IDNotFoundException;
	
	public Project addProject(Integer campaignId, Project project);
}
