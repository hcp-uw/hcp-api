package com.hcp.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Project {
    @Id
    private Integer projectId;
    private String members;
    private String githubUrl;
    private String description;
    private String projectPictureUrl;
    private String projectCategory;
    private Boolean active;
    private String name;
    private Integer dateStarted;
    private Integer dateEnded;
    private Integer projectManager;

    public Project() {
    }

    public Project(Integer projectId, String members, String githubUrl, String description, String projectPictureUrl, String projectCategory, Boolean active, String name, Integer dateStarted, Integer dateEnded, Integer projectManager) {
        this.projectId = projectId;
        this.members = members;
        this.githubUrl = githubUrl;
        this.description = description;
        this.projectPictureUrl = projectPictureUrl;
        this.projectCategory = projectCategory;
        this.active = active;
        this.name = name;
        this.dateStarted = dateStarted;
        this.dateEnded = dateEnded;
        this.projectManager = projectManager;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public String getMembers() {
        return members;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public String getDescription() {
        return description;
    }

    public String getProjectPictureUrl() {
        return projectPictureUrl;
    }

    public String getProjectCategory() {
        return projectCategory;
    }

    public Boolean getActive() {
        return active;
    }

    public String getName() {
        return name;
    }

    public Integer getDateStarted() {
        return dateStarted;
    }

    public Integer getDateEnded() {
        return dateEnded;
    }

    public Integer getProjectManager() {
        return projectManager;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public void setMembers(String members) {
        this.members = members;
    }

    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProjectPictureUrl(String projectPictureUrl) {
        this.projectPictureUrl = projectPictureUrl;
    }

    public void setProjectCategory(String projectCategory) {
        this.projectCategory = projectCategory;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateStarted(Integer dateStarted) {
        this.dateStarted = dateStarted;
    }

    public void setDateEnded(Integer dateEnded) {
        this.dateEnded = dateEnded;
    }

    public void setProjectManager(Integer projectManager) {
        this.projectManager = projectManager;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", members='" + members + '\'' +
                ", githubUrl='" + githubUrl + '\'' +
                ", description='" + description + '\'' +
                ", projectPictureUrl='" + projectPictureUrl + '\'' +
                ", projectCategory='" + projectCategory + '\'' +
                ", active=" + active +
                ", name='" + name + '\'' +
                ", dateStarted=" + dateStarted +
                ", dateEnded=" + dateEnded +
                ", projectManager=" + projectManager +
                '}';
    }

    public static class Builder {
        private Integer projectId;
        private String members;
        private String githubUrl;
        private String description;
        private String projectPictureUrl;
        private String projectCategory;
        private Boolean active;
        private String name;
        private Integer dateStarted;
        private Integer dateEnded;
        private Integer projectManager;

        public Builder projectId(Integer projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder members(String members) {
            this.members = members;
            return this;
        }

        public Builder githubUrl(String githubUrl) {
            this.githubUrl = githubUrl;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder projectPictureUrl(String projectPictureUrl) {
            this.projectPictureUrl = projectPictureUrl;
            return this;
        }

        public Builder projectCategory(String projectCategory) {
            this.projectCategory = projectCategory;
            return this;
        }

        public Builder active(Boolean active) {
            this.active = active;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder dateStarted(Integer dateStarted) {
            this.dateStarted = dateStarted;
            return this;
        }

        public Builder dateEnded(Integer dateEnded) {
            this.dateEnded = dateEnded;
            return this;
        }

        public Builder projectManager(Integer projectManager) {
            this.projectManager = projectManager;
            return this;
        }

        public Project build() {
            return new Project(projectId, members, githubUrl, description, projectPictureUrl, projectCategory, active, name, dateStarted, dateEnded, projectManager);
        }
    }
}

