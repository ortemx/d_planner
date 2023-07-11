package com.example.d_planner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView tasksList;
    private TasksAdapter tasksAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tasksList = findViewById(R.id.rv_tasks);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        tasksList.setLayoutManager(layoutManager);
        tasksList.setHasFixedSize(true);

        tasksAdapter = new TasksAdapter(24);
        tasksList.setAdapter(tasksAdapter);


    }
}