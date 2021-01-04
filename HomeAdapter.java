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


public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeViewHolder> {
Context context1;
List<Home>HomeList;

    public HomeAdapter(Context context1, List<Home> HomeList) {
        this.context1 = context1;
        this.HomeList = HomeList;
    }

    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view1 = LayoutInflater.from(context1).inflate(R.layout.item_home,parent,false);
      HomeViewHolder mHolder =new HomeViewHolder(view1);


        return mHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {
Home home = HomeList.get(position);
holder.name.setText(home.getName());
        holder.text.setText(home.gettext());
       holder.img_contact1.setImageResource(home.getPhoto());

        }



    @Override
    public int getItemCount() {
        return HomeList.size();
    }

    public class HomeViewHolder extends RecyclerView.ViewHolder {
        public ImageView img_contact1;
        TextView text,name;




        public HomeViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            text=itemView.findViewById(R.id.text);
            img_contact1=itemView.findViewById(R.id.img_contact1);
        }
    }
}
