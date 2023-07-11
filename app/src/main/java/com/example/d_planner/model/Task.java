package com.example.d_planner.model;
import java.sql.Timestamp;


public class Task {
    private static int lastId;
    private final int id;
    private final Timestamp date_start;
    private final Timestamp date_finish;
    private final String name;
    private final String description;

    public Task(String name, String description) {
        this.id = lastId++;
        this.date_start = new Timestamp(System.currentTimeMillis());
        this.date_finish = new Timestamp(System.currentTimeMillis());
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public Timestamp getDate_start() {
        return date_start;
    }

    public Timestamp getDate_finish() {
        return date_finish;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
