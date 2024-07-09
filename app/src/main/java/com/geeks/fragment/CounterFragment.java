package com.geeks.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class CounterFragment extends Fragment {

    private TextView textView;
    private Button buttonMinus;
    private Button buttonPlus;
    private int counter = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_zoom, container, false);

        textView = view.findViewById(R.id.text_view);
        buttonMinus = view.findViewById(R.id.button_minus);
        buttonPlus = view.findViewById(R.id.button_plus);

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter--;
                textView.setText(String.valueOf(counter));
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                textView.setText(String.valueOf(counter));
            }
        });

        return view;
    }
}