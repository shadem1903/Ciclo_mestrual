package com.example.ciclo_mestrual.ui.calendarioMenstrual;

import android.widget.Button;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CalendarioMenstrualViewModel extends ViewModel {
    Button btnGuardarCM, btnvolverCM;
    private final MutableLiveData<String> mText;

    public CalendarioMenstrualViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

}