package com.example.tabbed;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
public class fragment1 extends Fragment {
    private RecyclerView recyclerView;
    View v;
    private List<Home> HomeList;
    HomeAdapter adapter1;

    public fragment1() {
    }

    @Nullable

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v =inflater.inflate(R.layout.fragment1_layout,container,false);
        recyclerView =(RecyclerView)v.findViewById(R.id.contacts_recycler);

        HomeAdapter homeAdapter = new HomeAdapter(getContext(),HomeList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        recyclerView.setAdapter(homeAdapter);
        return v;}
        @Override
        @Nullable
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            HomeList=new ArrayList<>();
            HomeList.add(new Home("Rawan",R.drawable.ic_baseline_person_pin_24,"Hi"));
            HomeList.add(new Home("Mum",R.drawable.ic_baseline_person_pin_24,"sohaila"));
            HomeList.add(new Home("nada",R.drawable.ic_baseline_person_pin_24,"Thank you"));
            HomeList.add(new Home("fatma",R.drawable.ic_baseline_person_pin_24,"soso"));
            HomeList.add(new Home("soso",R.drawable.ic_baseline_person_pin_24,"bye bye"));
            HomeList.add(new Home("Amira",R.drawable.ic_baseline_person_pin_24,"Hi"));


        }
    }








