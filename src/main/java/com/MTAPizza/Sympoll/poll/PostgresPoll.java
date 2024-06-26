package com.MTAPizza.Sympoll.poll;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;


@Entity
@Table(name = "polls")
public class PostgresPoll implements Serializable {
    @Id
    @Column(name = "poll_id", nullable = false)
    private int pollID;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "creator", nullable = false)
    private String creator;
    @Column(name = "group_id", nullable = false)
    private int groupID;
//    @Column(name = "title", nullable = false)
//    private int votingID;
    @Column(name = "num_answers_allowed", nullable = false)
    private int numAnswersAllowed;
    @Column(name = "time_created")
    private long timeCreated;
    @Column(name = "time_updated")
    private long timeUpdated;
    @Column(name = "time_ends")
    private long timeEnds;

    public PostgresPoll() {
    }

    public PostgresPoll(int pollID, String title, String description, String creator, int groupID, int numAnswersAllowed, long timeCreated, long timeUpdated, long timeEnds) {
        this.pollID = pollID;
        this.title = title;
        this.description = description;
        this.creator = creator;
        this.groupID = groupID;
        this.numAnswersAllowed = numAnswersAllowed;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeEnds = timeEnds;
    }

    public int getPollID() {
        return pollID;
    }

    public void setPollID(int pollID) {
        this.pollID = pollID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public int getNumAnswersAllowed() {
        return numAnswersAllowed;
    }

    public void setNumAnswersAllowed(int numAnswersAllowed) {
        this.numAnswersAllowed = numAnswersAllowed;
    }

    public long getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(long timeCreated) {
        this.timeCreated = timeCreated;
    }

    public long getTimeUpdated() {
        return timeUpdated;
    }

    public void setTimeUpdated(long timeUpdated) {
        this.timeUpdated = timeUpdated;
    }

    public long getTimeEnds() {
        return timeEnds;
    }

    public void setTimeEnds(long timeEnds) {
        this.timeEnds = timeEnds;
    }
}
