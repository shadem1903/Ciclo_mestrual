package com.example.ciclo_mestrual.ui.carteleraInformativa;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ciclo_mestrual.R;

public class CarteleraInformativoFragment extends Fragment {

    private CarteleraInformativoViewModel mViewModel;

    public static CarteleraInformativoFragment newInstance() {
        return new CarteleraInformativoFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cartelera_informativo, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(CarteleraInformativoViewModel.class);
        // TODO: Use the ViewModel
    }

}