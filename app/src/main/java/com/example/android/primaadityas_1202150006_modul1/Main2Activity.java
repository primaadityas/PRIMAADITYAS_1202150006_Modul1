package com.example.android.primaadityas_1202150006_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TextView tempat, porsi, makan, harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        String lokasiMakan = intent.getStringExtra("tempat");
        String nasiUduk = intent.getStringExtra("menu");
        String hargaMakan = intent.getStringExtra("harga");
        String jumlahMakan = intent.getStringExtra("jumlah");

        int totalMakan = Integer.valueOf(hargaMakan)*Integer.valueOf(jumlahMakan);

        harga = (TextView)findViewById(R.id.textViewHarga);
        harga.setText(String.valueOf(totalMakan));

        makan = (TextView)findViewById(R.id.textViewMenu);
        makan.setText(nasiUduk);

        porsi = (TextView)findViewById(R.id.textViewPorsi);
        porsi.setText(jumlahMakan);

        tempat = (TextView)findViewById(R.id.textViewTempat);
        tempat.setText(lokasiMakan);

        if(totalMakan < 65000){
            Toast toast = Toast.makeText(this, "Disini aja makan malamnya!", Toast.LENGTH_LONG);
            toast.show();
        }else{
            Toast toast = Toast.makeText(this, "Jangan makan malam disini, uangnya tidak cukup", Toast.LENGTH_LONG );
            toast.show();
        }
    }
}
