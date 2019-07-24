package com.example.android.todolist;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.android.todolist.database.TaskDatabase;

public class ViewModelFactory extends ViewModelProvider.AndroidViewModelFactory {
    TaskDatabase mDb;
    int taskId;

    public ViewModelFactory(@Nullable Application application, TaskDatabase mDb, int taskId) {
        super(application);
        this.mDb = mDb;
        this.taskId = taskId;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new AddTaskViewModel(taskId, mDb);
    }
}
