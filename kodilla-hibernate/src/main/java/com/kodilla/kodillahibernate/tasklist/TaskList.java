package com.kodilla.kodillahibernate.tasklist;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name="TASKSLIST")
public final class TaskList {

    private int id;
    private String listName;
    private String desctiption;

    public TaskList() {
    }

    public TaskList(String listName, String desctiption) {
        this.listName = listName;
        this.desctiption = desctiption;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name="ID", unique=true)
    public int getId() {
        return id;
    }

    @Column(name = "LISTNAME")
    public String getListName() {
        return listName;
    }

    @Column(name = "DESCRIPTION")
    public String getDesctiption() {
        return desctiption;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setDesctiption(String desctiption) {
        this.desctiption = desctiption;
    }
}
