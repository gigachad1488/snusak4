package com.example.shailushay4v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.vodochku_liem_vodochku_piem_vodochkoi_tolko_jivem67, new Guchakchak201(), "gugachah231").addToBackStack("gugachah231").commit();
    }
}

