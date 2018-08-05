package com.ohservices.ohservices;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ContentAdapter extends RecyclerView.Adapter<ContentAdapter.AllContentViewHolder> {

    Context context;
    ArrayList<ServiceProvider> details;

    public ContentAdapter(Context context, ArrayList<ServiceProvider> details) {
        this.context = context;
        this.details = details;
    }

    @NonNull
    @Override
    public AllContentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater mnLayoutInflator = LayoutInflater.from(parent.getContext());
        View itemView = mnLayoutInflator.inflate(R.layout.custom_card,parent,false);
        AllContentViewHolder allSongs = new AllContentViewHolder(itemView);
        return allSongs;
    }

    @Override
    public void onBindViewHolder(@NonNull AllContentViewHolder holder, final int position) {
        final ServiceProvider serviceProvider = details.get(position);
        holder.name.setText(serviceProvider.getName());
        holder.activeHours.setText(serviceProvider.getHours());
        holder.Address.setText(serviceProvider.getAddress());
        holder.content_Holder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, serviceProvider.getName(), Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public int getItemCount() {
        if(details== null)
            return 0;
        else
            return details.size();
    }

    public static class AllContentViewHolder extends RecyclerView.ViewHolder{


        public AllContentViewHolder(View itemView) {
            super(itemView);
        }

        TextView name=itemView.findViewById(R.id.name);
        TextView activeHours=itemView.findViewById(R.id.hours);
        TextView Address=itemView.findViewById(R.id.address);
        RelativeLayout content_Holder=itemView.findViewById(R.id.card);

    }
}
