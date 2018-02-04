package com.example.android.primaadityas_1202150006_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText makan, porsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void apnormal(View view) {
        Intent intent = new Intent(this, Main2Activity.class);

        makan = (EditText)findViewById(R.id.editTextNasi);
        String uduk = makan.getText().toString();

        porsi = (EditText)findViewById(R.id.editTextPorsi);
        String jumlah = porsi.getText().toString();

        intent.putExtra("menu", uduk);
        intent.putExtra("jumlah", jumlah);
        intent.putExtra("tempat", "Apnormal");
        intent.putExtra("harga", "30000");
        startActivity(intent);
    }

    public void eatbus(View view) {
        Intent intent = new Intent(this, Main2Activity.class);

        porsi = (EditText)findViewById(R.id.editTextPorsi);
        String jumlah = porsi.getText().toString();

        makan = (EditText)findViewById(R.id.editTextNasi);
        String uduk = makan.getText().toString();

        intent.putExtra("tempat", "Eatbus");
        intent.putExtra("harga", "50000");
        intent.putExtra("menu", uduk);
        intent.putExtra("jumlah", jumlah);
        startActivity(intent);
    }
}
