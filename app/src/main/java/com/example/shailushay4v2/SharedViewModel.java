package com.example.shailushay4v2;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class SharedViewModel {
    public MutableLiveData<String> dataToPass = new MutableLiveData<>();



    public void setDataToPass(String data) {
        dataToPass.setValue(data);
    }

    public LiveData<String> getDataToPass() {
        return dataToPass;
    }
}
