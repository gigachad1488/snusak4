package com.example.shailushay4v2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RyaGoslingVFilmeDrive extends ArrayAdapter<RyanGosling>
{
    private LayoutInflater inflater;
    private int layout;
    private List<RyanGosling> gosligi;

    public RyaGoslingVFilmeDrive(Context context, int resource, List<RyanGosling> rg) {
        super(context, resource, rg);
        gosligi = rg;
        layout = resource;
        inflater = LayoutInflater.from(context);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view=inflater.inflate(this.layout, parent, false);

        ImageView iv = view.findViewById(R.id.indus20);
        TextView nam = view.findViewById(R.id.servak);
        TextView tehutex1 = view.findViewById(R.id.author);

        RyanGosling laks = gosligi.get(position);

        iv.setImageResource(laks.ImageID);
        nam.setText(laks.Name);
        tehutex1.setText(laks.Location);

        return view;
    }
}
