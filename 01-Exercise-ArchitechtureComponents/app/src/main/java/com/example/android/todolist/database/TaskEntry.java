package com.example.android.todolist.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.Date;

// Completed (2) Annotate the class with Entity. Use "task" for the table name
@Entity(tableName = "task_entry")
public class TaskEntry {

    // Completed (3) Annotate the id as PrimaryKey. Set autoGenerate to true.
    @PrimaryKey (autoGenerate = true)
    private int id;
    @ColumnInfo
    private String description;
    @ColumnInfo
    private int priority;
    @ColumnInfo(name = "updated_at")
    private Date updatedAt;

    // Completed (4) Use the Ignore annotation so Room knows that it has to use the other constructor instead
    @Ignore
    public TaskEntry(String description, int priority, Date updatedAt) {
        this.description = description;
        this.priority = priority;
        this.updatedAt = updatedAt;
    }

    public TaskEntry(int id, String description, int priority, Date updatedAt) {
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
