package com.example.ndr_dz4.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.ndr_dz4.CatModel;
import com.example.ndr_dz4.R;

public class DetailFragment extends Fragment {

    ImageView imageView;
    TextView textCode, textName;
    CatModel kittyModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        imageView = view.findViewById(R.id.image_detail);
        textCode = view.findViewById(R.id.txt_status_code_detail);
        textName = view.findViewById(R.id.txt_name_detail);

        getData();
    }

    private void getData() {
        Bundle bundle = getArguments();
        if (getArguments() != null){
            kittyModel = (CatModel)bundle.getSerializable("cat");
            Glide.with(imageView.getContext()).load(kittyModel.getStatusCode()).into(imageView);
            textName.setText(kittyModel.getDescription());
            textCode.setText(kittyModel.getStatusCode());
        }
    }
}