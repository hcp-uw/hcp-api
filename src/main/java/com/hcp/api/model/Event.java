package com.hcp.api.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Event {
    @Id
    private Integer eventId;
    private Integer numAttendees;
    private Integer date;
    private String description;
    private String eventPictureUrl;
    private String location;
    private String eventName;
    private String sponsors;

    public Event() {
    }

    public Event(Integer eventId, Integer numAttendees, Integer date, String description, String eventPictureUrl, String location, String eventName, String sponsors) {
        this.eventId = eventId;
        this.numAttendees = numAttendees;
        this.date = date;
        this.description = description;
        this.eventPictureUrl = eventPictureUrl;
        this.location = location;
        this.eventName = eventName;
        this.sponsors = sponsors;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public Integer getNumAttendees() {
        return numAttendees;
    }

    public void setNumAttendees(Integer numAttendees) {
        this.numAttendees = numAttendees;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEventPictureUrl() {
        return eventPictureUrl;
    }

    public void setEventPictureUrl(String eventPictureUrl) {
        this.eventPictureUrl = eventPictureUrl;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getSponsors() {
        return sponsors;
    }

    public void setSponsors(String sponsors) {
        this.sponsors = sponsors;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventId=" + eventId +
                ", numAttendees=" + numAttendees +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", eventPictureUrl='" + eventPictureUrl + '\'' +
                ", location='" + location + '\'' +
                ", eventName='" + eventName + '\'' +
                ", sponsers='" + sponsors + '\'' +
                '}';
    }

    public static class Builder {
        private Integer eventId;
        private Integer numAttendees;
        private Integer date;
        private String description;
        private String eventPictureUrl;
        private String location;
        private String eventName;
        private String sponsors;

        public Builder() {
        }

        public Builder eventId(Integer eventId) {
            this.eventId = eventId;
            return this;
        }

        public Builder numAttendees(Integer numAttendees) {
            this.numAttendees = numAttendees;
            return this;
        }

        public Builder date(Integer date) {
            this.date = date;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder eventPictureUrl(String eventPictureUrl) {
            this.eventPictureUrl = eventPictureUrl;
            return this;
        }

        public Builder location(String location) {
            this.location = location;
            return this;
        }

        public Builder eventName(String eventName) {
            this.eventName = eventName;
            return this;
        }

        public Builder sponsors(String sponsors) {
            this.sponsors = sponsors;
            return this;
        }

        public Event build() {
            return new Event(eventId, numAttendees, date, description, eventPictureUrl, location, eventName, sponsors);
        }
    }
}

/*
        Event:
            type: object
            required:
                - eventId
                - numAttendees
                - date
                - description
                - eventPictureUrl
                - location
                - eventName
                - sponsers
            properties:
                eventId:
                    type: integer
                numAttendees:
                    type: integer
                date:
                    type: integer
                description:
                    type: string
                eventPictureUrl:
                    type: string
                location:
                    type: string
                eventName:
                    type: string
                sponsers:
                    type: string

 */
