package com.example.hf07;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.VH> {

    Animal[] animals;
    Context context;

    public CustomAdapter(Animal[] animals, Context context) {
        this.animals = animals;
        this.context = context;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.rv_item, parent, false);
        return new VH(itemView, context);
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        final Animal myAnimalList = animals[position];
        holder.name.setText(myAnimalList.getName());
        holder.description.setText(myAnimalList.getDescription());
        holder.img.setImageResource(myAnimalList.getImage());
    }

    @Override
    public int getItemCount() {
        return animals.length;
    }

    public class VH extends RecyclerView.ViewHolder {
        TextView name;
        TextView description;
        ImageView img;

        public VH(@NonNull View itemView, Context context) {
            super(itemView);
            name = itemView.findViewById(R.id.textView);
            description = itemView.findViewById(R.id.textView2);
            img = itemView.findViewById(R.id.imageView);
        }
    }
}
