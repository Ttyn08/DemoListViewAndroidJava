package com.example.demo5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Planet> planets;

    public CustomAdapter(Context context, ArrayList<Planet> planets) {
        this.context = context;
        this.planets = planets;
    }


    @Override
    public int getCount() {
        return planets.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false);
        }

        TextView nameTextView = convertView.findViewById(R.id.titleView);
        ImageView iconImageView = convertView.findViewById(R.id.imageView);

        Planet planet = planets.get(position);
        nameTextView.setText(planet.getName());
        iconImageView.setImageResource(planet.getIcon());

        return convertView;
    }
}
