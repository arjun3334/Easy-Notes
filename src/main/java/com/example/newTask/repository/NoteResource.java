package com.example.newTask.repository;

import com.example.newTask.model.Status;
/*import lombok.Builder;
import lombok.Getter;
import lombok.Setter;*/

import java.util.Date;

//@Builder
public class NoteResource {

    private Long noteId;
    private String title;
    private String content;
    private Date createdDate;
    private Status status;

    public Long getNoteId() {
        return noteId;
    }

    public void setNoteId(Long noteId) {
        this.noteId = noteId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
