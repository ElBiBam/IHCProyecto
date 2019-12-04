package com.example.fullihc;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DemoFra extends Fragment {

    private TextView text;


    public DemoFra() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_demo, container, false);

       text = view.findViewById(R.id.txt_display);
       text.setText(getArguments().getString("message"));
       return view;

    }

}
