package com.weaboo.tugas2_kalkulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button btTambah, btKurang, btKali, btBagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btTambah = findViewById(R.id.tambah);
        btKurang = findViewById(R.id.btKurang);
        btKali = findViewById(R.id.btKali);
        btBagi = findViewById(R.id.btBagi);

        btTambah.setOnClickListener(this);
        btKali.setOnClickListener(this);
        btKurang.setOnClickListener(this);
        btBagi.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        try {
            if (v.getId() == R.id.btTambah) {
                Intent tambah = new Intent(MainActivity.this, com.weaboo.tugas2_kalkulator.tambah.class);
                startActivity(tambah);
            }
            if (v.getId() == R.id.btKurang) {
                Intent kurang = new Intent(MainActivity.this, com.weaboo.tugas2_kalkulator.kurang.class);
                startActivity(kurang);
            }
            if (v.getId() == R.id.btKali) {
                Intent kali = new Intent(MainActivity.this, com.weaboo.tugas2_kalkulator.kali.class);
                startActivity(kali);
            }
            if (v.getId() == R.id.btBagi) {
                Intent bagi = new Intent(MainActivity.this, com.weaboo.tugas2_kalkulator.bagi.class);
                startActivity(bagi);
            }

        } catch (NullPointerException e) {
            Toast.makeText(getApplicationContext(), "Coba Lagi", Toast.LENGTH_SHORT).show();
        }
    }


}
