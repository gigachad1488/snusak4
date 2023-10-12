package com.example.shailushay4v2;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class lwFragment extends Fragment {

    ArrayList<RyanGosling> lakes = new ArrayList<RyanGosling>();
    ListView listView;
    FragmentManager fr;


    public static lwFragment poridge;


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setInitialData();

        listView = view.findViewById(R.id.lw);

        RyaGoslingVFilmeDrive adapter = new RyaGoslingVFilmeDrive(view.getContext(), R.layout.item, lakes);

        listView.setAdapter(adapter);
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                pos = i;
                vv = view;
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setTitle("Удаление");
                builder.setMessage("Удалить?");
                builder.setCancelable(true);
                builder.setPositiveButton("Да", (dialogInterface, i1) -> DeleteAdapter());
                builder.setNegativeButton("Нет", (dialogInterface, i2) -> dialogInterface.dismiss());
                builder.show();
                return true;
            }
        });

        if (poridge == null)
        {
            poridge = this;
        }

    }


    private View vv;
    private int pos;

    public void DeleteAdapter()
    {
        if (vv != null) {
            lakes.remove(pos);
            RyaGoslingVFilmeDrive adapter = new RyaGoslingVFilmeDrive(vv.getContext(), R.layout.item, lakes);
            listView.setAdapter(adapter);
        }
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
