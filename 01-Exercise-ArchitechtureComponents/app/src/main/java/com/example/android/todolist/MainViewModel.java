package com.example.android.todolist;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.android.todolist.database.TaskDatabase;
import com.example.android.todolist.database.TaskEntry;

import java.util.List;

public class MainViewModel extends AndroidViewModel {
    private static final String TAG =  MainViewModel.class.getSimpleName();
    private LiveData<List<TaskEntry>> liveDataTasks;
    public MainViewModel(@NonNull Application application) {
        super(application);
        Log.e(TAG, "Actively retrieving the tasks from the Database");
        liveDataTasks = TaskDatabase.getInstance(application.getApplicationContext()).taskDAO().getAllTasks();
    }

    public LiveData<List<TaskEntry>> getLiveDataTasks() {
        return liveDataTasks;
    }
}
