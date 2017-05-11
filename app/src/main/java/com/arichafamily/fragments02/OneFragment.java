package com.arichafamily.fragments02;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class OneFragment extends Fragment implements View.OnClickListener {

    EditText etName;
    Button btnSubmit;

    public OneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        etName = (EditText) view.findViewById(R.id.etName);
        btnSubmit = (Button) view.findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        etName.setText("Ron");
    }
}
