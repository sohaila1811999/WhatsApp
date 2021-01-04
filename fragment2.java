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

public class fragment2 extends Fragment{
 private RecyclerView recyclerView;
View view;
   private List<Contact> contactList;
ContactAdapter adapter;

    public fragment2() {
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         view = inflater.inflate(R.layout.fragment2_layout, container, false);

         recyclerView = (RecyclerView) view.findViewById(R.id.contacts_recycler2);
        ContactAdapter contactAdapter = new ContactAdapter(getContext(),contactList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        recyclerView.setAdapter(contactAdapter);
        return view;



    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        contactList=new ArrayList<>();
        contactList.add(new Contact("Amira",R.drawable.ic_baseline_face_24,"01267521490"));
        contactList.add(new Contact("Rawan",R.drawable.ic_baseline_face_24,"01205079031"));
        contactList.add(new Contact("Sohaila",R.drawable.ic_baseline_face_24,"01157525490"));
        contactList.add(new Contact("Ahmed",R.drawable.ic_baseline_face_24,"01267521490"));
        contactList.add(new Contact("Mahmoud",R.drawable.ic_baseline_face_24,"01063321490"));
        contactList.add(new Contact("Fatma",R.drawable.ic_baseline_face_24,"01167521490"));
        contactList.add(new Contact("Nada",R.drawable.ic_baseline_face_24,"01238759869"));
        contactList.add(new Contact("Mama",R.drawable.ic_baseline_face_24,"01038759869"));
        contactList.add(new Contact("baba",R.drawable.ic_baseline_face_24,"01138759869"));
        contactList.add(new Contact("asmaa",R.drawable.ic_baseline_face_24,"01538759869"));
        contactList.add(new Contact("roro",R.drawable.ic_baseline_face_24,"01018759869"));
        contactList.add(new Contact("soso",R.drawable.ic_baseline_face_24,"01238759869"));
        contactList.add(new Contact("Mai",R.drawable.ic_baseline_face_24,"011228759869"));
        contactList.add(new Contact("soha",R.drawable.ic_baseline_face_24,"01238759869"));

        contactList.add(new Contact("Zainab",R.drawable.ic_baseline_face_24,"0011344586576"));

    }
}

