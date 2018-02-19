package com.br.renderson.tabs.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.br.renderson.tabs.MainActivity;
import com.br.renderson.tabs.R;

/**
 * Created by renderson.silva on 16/02/2018.
 */

public class FragmentA extends Fragment implements View.OnClickListener {

    protected android.support.design.widget.FloatingActionButton fab;

    private static final int CAMERA_PIC_REQUEST = 2500;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.activity_fragment_a, container, false);

        //FloatingButton
        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Teste FloatingButton", Toast.LENGTH_SHORT).show();
            }
        });

        return view;

    }

    @Override
    public void onClick(View v) {

    }
}
