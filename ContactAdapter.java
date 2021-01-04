package com.example.tabbed;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;


public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
Context context;
List<Contact>contactList;

    public ContactAdapter(Context context, List<Contact> contactList) {
        this.context = context;
        this.contactList = contactList;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view = LayoutInflater.from(context).inflate(R.layout.item_contact,parent,false);
      ContactViewHolder vHolder =new ContactViewHolder(view);


        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
Contact contact = contactList.get(position);
holder.name_contact.setText(contact.getName());
        holder.phone_contact.setText(contact.getPhone());
       holder.img_contact.setImageResource(contact.getPhoto());

        }



    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder {
        public ImageView img_contact;
        TextView name_contact,phone_contact;

        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            name_contact=itemView.findViewById(R.id.name);
            phone_contact=itemView.findViewById(R.id.text);
img_contact=itemView.findViewById(R.id.img_contact);

        }
    }
}
