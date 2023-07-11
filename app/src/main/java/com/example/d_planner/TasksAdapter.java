package com.example.d_planner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.d_planner.model.Task;

public class TasksAdapter extends RecyclerView.Adapter<TasksAdapter.TaskViewHolder> {

    private int tasksCount;

    public TasksAdapter(int tasksCount) {
        this.tasksCount = tasksCount;
    }
    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.tasks;
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(layoutIdForListItem, parent, false);

        return new TaskViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return tasksCount;
    }

    class TaskViewHolder extends RecyclerView.ViewHolder {

        TextView tvTaskTime;
        TextView tvTaskName;

        public TaskViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTaskTime = itemView.findViewById(R.id.tv_taskTime);
            tvTaskName = itemView.findViewById(R.id.tv_taskName);
        }

        void bind(final Task task){
            String time = task.getDate_start().toString() + " - " + task.getDate_finish().toString();
            tvTaskTime.setText(time);
            tvTaskName.setText(task.getName());
        }
    }
}

