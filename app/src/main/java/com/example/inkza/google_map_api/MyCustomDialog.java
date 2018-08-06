package com.example.inkza.google_map_api;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MyCustomDialog extends DialogFragment {
    private static final String TAG = "MyCustomDialog";
    //widgets
        private Button detail,edit,review,delite,cancel;
    //vars
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_custom,container,false);
        detail = view.findViewById(R.id.Bt_detail);
        edit = view.findViewById(R.id.Bt_edit);
        review = view.findViewById(R.id.Bt_review);
        delite = view.findViewById(R.id.Bt_delite);
        cancel=view.findViewById(R.id.Bt_cancel);

        detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TolietDetail.class);
                startActivity(intent);
            }
        });
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"edit!",Toast.LENGTH_SHORT).show();
            }
        });
        review.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"review!",Toast.LENGTH_SHORT).show();
            }
        });
        delite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"delite!",Toast.LENGTH_SHORT).show();
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getDialog().dismiss();
            }
        });
        
        
        return view;

    }
}
