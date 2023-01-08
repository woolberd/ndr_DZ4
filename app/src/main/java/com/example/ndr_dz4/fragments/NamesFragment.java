package com.example.ndr_dz4.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ndr_dz4.CatModel;
import com.example.ndr_dz4.CatsRepositiry;
import com.example.ndr_dz4.NamesAdapter;
import com.example.ndr_dz4.OnClickItemCat;
import com.example.ndr_dz4.R;

public class NamesFragment extends Fragment implements OnClickItemCat {

    private final CatsRepositiry catsRepositiry = new CatsRepositiry();
    private final NamesAdapter namesAdapter = new NamesAdapter();
    private RecyclerView recyclerView;

    public NamesFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_names, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rv_names);

        recyclerView.setLayoutManager(new LinearLayoutManager
                (getContext(),RecyclerView.VERTICAL,false));

        recyclerView.setAdapter(namesAdapter);
        namesAdapter.setListCat(catsRepositiry.getListOfCatHIP());

        namesAdapter.setOnClickItemCat(this);
    }

    @Override
    public void listenerClickItemCat(CatModel catModel) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("cat", catModel);
        getParentFragmentManager().beginTransaction()
                .add(R.id.fragment_container_view,DetailFragment.class,bundle)
                .addToBackStack("NamesFragment")
                .commit();
    }
}