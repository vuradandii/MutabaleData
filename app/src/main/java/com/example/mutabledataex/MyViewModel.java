package com.example.mutabledataex;

import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    private MutableLiveData<Integer> counter = new MutableLiveData<>();

    public void increaseCounter(View view){
        // Retrieve the current value from live data
        int currentValue = counter.getValue() != null ? counter.getValue():0;

        // Increase value by 1
        counter.setValue(currentValue);

    }
    public LiveData<Integer> getCounter(){
        return counter;
    }
}
