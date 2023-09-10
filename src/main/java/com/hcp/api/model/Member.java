package com.hcp.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Member {

    @Id
    private Integer userId;
    private String name;
    private Integer graduationYear;
    private String email;
    private String profilePictureUrl;
    private String linkedinUrl;
    private String githubUrl;
    private String resumeUrl;
    private String bio;
    private String role;
    private Boolean active;
    private Integer dateJoined;
    private Integer dateLeft;

    public Member() {
    }

    public Member(Integer userId, String name, Integer graduationYear, String email, String profilePictureUrl, String linkedinUrl, String githubUrl, String resumeUrl, String bio, String role, Boolean active, Integer dateJoined, Integer dateLeft) {
        this.userId = userId;
        this.name = name;
        this.graduationYear = graduationYear;
        this.email = email;
        this.profilePictureUrl = profilePictureUrl;
        this.linkedinUrl = linkedinUrl;
        this.githubUrl = githubUrl;
        this.resumeUrl = resumeUrl;
        this.bio = bio;
        this.role = role;
        this.active = active;
        this.dateJoined = dateJoined;
        this.dateLeft = dateLeft;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public Integer getGraduationYear() {
        return graduationYear;
    }

    public String getEmail() {
        return email;
    }

    public String getProfilePictureUrl() {
        return profilePictureUrl;
    }

    public String getLinkedinUrl() {
        return linkedinUrl;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public String getResumeUrl() {
        return resumeUrl;
    }

    public String getBio() {
        return bio;
    }

    public String getRole() {
        return role;
    }

    public Boolean getActive() {
        return active;
    }

    public Integer getDateJoined() {
        return dateJoined;
    }

    public Integer getDateLeft() {
        return dateLeft;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setGraduationYear(Integer graduationYear) {
        this.graduationYear = graduationYear;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
    }

    public void setLinkedinUrl(String linkedinUrl) {
        this.linkedinUrl = linkedinUrl;
    }

    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }

    public void setResumeUrl(String resumeUrl) {
        this.resumeUrl = resumeUrl;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setDateJoined(Integer dateJoined) {
        this.dateJoined = dateJoined;
    }

    public void setDateLeft(Integer dateLeft) {
        this.dateLeft = dateLeft;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", graduationYear=" + graduationYear +
                ", email='" + email + '\'' +
                ", profilePictureUrl='" + profilePictureUrl + '\'' +
                ", linkedinUrl='" + linkedinUrl + '\'' +
                ", githubUrl='" + githubUrl + '\'' +
                ", resumeUrl='" + resumeUrl + '\'' +
                ", bio='" + bio + '\'' +
                ", role='" + role + '\'' +
                ", active=" + active +
                ", dateJoined=" + dateJoined +
                ", dateLeft=" + dateLeft +
                '}';
    }

    public static class Builder {
        private Integer userId;
        private String name;
        private Integer graduationYear;
        private String email;
        private String profilePictureUrl;
        private String linkedinUrl;
        private String githubUrl;
        private String resumeUrl;
        private String bio;
        private String role;
        private Boolean active;
        private Integer dateJoined;
        private Integer dateLeft;

        public Builder() {
        }

        public Builder userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder graduationYear(Integer graduationYear) {
            this.graduationYear = graduationYear;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder profilePictureUrl(String profilePictureUrl) {
            this.profilePictureUrl = profilePictureUrl;
            return this;
        }

        public Builder linkedinUrl(String linkedinUrl) {
            this.linkedinUrl = linkedinUrl;
            return this;
        }

        public Builder githubUrl(String githubUrl) {
            this.githubUrl = githubUrl;
            return this;
        }

        public Builder resumeUrl(String resumeUrl) {
            this.resumeUrl = resumeUrl;
            return this;
        }

        public Builder bio(String bio) {
            this.bio = bio;
            return this;
        }

        public Builder role(String role) {
            this.role = role;
            return this;
        }

        public Builder active(Boolean active) {
            this.active = active;
            return this;
        }

        public Builder dateJoined(Integer dateJoined) {
            this.dateJoined = dateJoined;
            return this;
        }

        public Builder dateLeft(Integer dateLeft) {
            this.dateLeft = dateLeft;
            return this;
        }

        public Member build() {
            return new Member(userId, name, graduationYear, email, profilePictureUrl, linkedinUrl, githubUrl, resumeUrl, bio, role, active, dateJoined, dateLeft);
        }
    }
}
