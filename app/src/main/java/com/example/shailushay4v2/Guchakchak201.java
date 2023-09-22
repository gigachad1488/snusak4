package com.example.shailushay4v2;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Console;
import java.io.Writer;
import java.util.ArrayList;

public class Guchakchak201 extends Fragment {

    ArrayList<RyanGosling> lakes = new ArrayList<RyanGosling>();
    ListView joper;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setInitialData();

        joper = view.findViewById(R.id.perdachniyOPERATor);

        RyaGoslingVFilmeDrive adapter = new RyaGoslingVFilmeDrive(view.getContext(), R.layout.podkraduli15000, lakes);

        joper.setAdapter(adapter);
        joper.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                System.out.println("ПЕРДАК ОЛСЛА" + position);

            }
        });

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_guchakchak201, container, false);
    }

    private void setInitialData() {

        lakes.add(new RyanGosling("im drive", "amerika", R.drawable.noname));
        lakes.add(new RyanGosling("Амур", "восточный сибир", R.drawable.cean));
        lakes.add(new RyanGosling("Вента", "лавия", R.drawable.pomidor));
        lakes.add(new RyanGosling("Ганг", "hindi", R.drawable.ruan_hosling));


    }
}
