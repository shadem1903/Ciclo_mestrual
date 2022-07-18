package com.example.ciclo_mestrual.ui.calendarioPrenatal;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ciclo_mestrual.R;

public class CalendarioPrenatalFragment extends Fragment {

    private CalendarioPrenatalViewModel mViewModel;

    public static CalendarioPrenatalFragment newInstance() {
        return new CalendarioPrenatalFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_calendario_prenatal, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(CalendarioPrenatalViewModel.class);
        // TODO: Use the ViewModel
    }

}