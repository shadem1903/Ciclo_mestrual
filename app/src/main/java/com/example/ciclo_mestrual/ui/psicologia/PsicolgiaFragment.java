package com.example.ciclo_mestrual.ui.psicologia;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ciclo_mestrual.R;

public class PsicolgiaFragment extends Fragment {

    private PsicolgiaViewModel mViewModel;

    public static PsicolgiaFragment newInstance() {
        return new PsicolgiaFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_psicolgia, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(PsicolgiaViewModel.class);
        // TODO: Use the ViewModel
    }

}