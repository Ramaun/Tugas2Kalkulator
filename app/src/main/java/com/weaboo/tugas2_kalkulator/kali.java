package com.weaboo.tugas2_kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class kali extends AppCompatActivity implements View.OnClickListener {

    private Button btKali;
    private EditText etAngka1, etAngka2;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kali);

        btKali = findViewById(R.id.kali);
        etAngka1 = findViewById(R.id.etAngka1);
        etAngka2 = findViewById(R.id.etAngka2);
        tvHasil = findViewById(R.id.tvHasil);

        btKali.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        try {
            String sAngka1 = etAngka1.getText().toString();
            String sAngka2 = etAngka2.getText().toString();

            double angka1 = Double.parseDouble(sAngka1);
            double angka2 = Double.parseDouble(sAngka2);
            double hasil = 0;

            if (v.getId() == R.id.btKali)
                hasil = angka1 * angka2;

            String shasil = String.valueOf(hasil);
            tvHasil.setText(shasil);
        } catch (NumberFormatException nfe) {
            Toast.makeText(getApplicationContext(), "Harap Isi seluruh Field", Toast.LENGTH_SHORT).show();
        }
    }
}
