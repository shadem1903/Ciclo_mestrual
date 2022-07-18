package com.example.ciclo_mestrual.ui.anticonceptivos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AnticonceptivosViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AnticonceptivosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}