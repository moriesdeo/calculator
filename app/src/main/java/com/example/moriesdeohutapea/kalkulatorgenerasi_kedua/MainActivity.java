package com.example.moriesdeohutapea.kalkulatorgenerasi_kedua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText EDT_atas, EDT_bawah;
    TextView TXT_hasil;
    Double DOU_tambah1, DOU_tambah2, DOU_hasil_tambah;
    Double DOU_kali1, DOU_kali2, DOU_hasil_kali;
    Double DOU_kurang1, DOU_kurang2, DOU_hasil_kurang;
    Double DOU_bagi1, DOU_bagi2, DOU_hasil_bagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EDT_atas = (EditText) findViewById(R.id.editsatu);
        EDT_bawah = (EditText) findViewById(R.id.editdua);
        TXT_hasil = (TextView) findViewById(R.id.texthasil);
    }

    public void buttonexit(View view) {
        System.exit(1);
    }

    public void buttonclear(View view) {
        EDT_atas.setText("");
        EDT_bawah.setText("");
        TXT_hasil.setText("Result");
    }

    public void buttonKurang(View view) {
        try {
            DOU_kurang1 = Double.valueOf(EDT_atas.getText().toString());
            DOU_kurang2 = Double.valueOf(EDT_bawah.getText().toString());
            DOU_hasil_kurang = DOU_kurang1 - DOU_kurang2;
            TXT_hasil.setText(DOU_hasil_kurang.toString());
        } catch (NumberFormatException errorangka) {
            Toast.makeText(getApplicationContext(), "Can't Empty", Toast.LENGTH_SHORT).show();
        }
    }

    public void buttonTambah(View view) {
        try {
            DOU_tambah1 = Double.valueOf(EDT_atas.getText().toString());
            DOU_tambah2 = Double.valueOf(EDT_bawah.getText().toString());
            DOU_hasil_tambah = DOU_tambah1 + DOU_tambah2;
            TXT_hasil.setText(DOU_hasil_tambah.toString());
        } catch (NumberFormatException errorangka) {
            Toast.makeText(getApplicationContext(), "Can't Empty", Toast.LENGTH_SHORT).show();
        }
    }

    public void buttonBagi(View view) {
        try {
            DOU_bagi1 = Double.valueOf(EDT_atas.getText().toString());
            DOU_bagi2 = Double.valueOf(EDT_bawah.getText().toString());
            DOU_hasil_bagi = DOU_bagi1 / DOU_bagi2;
            TXT_hasil.setText(DOU_hasil_bagi.toString());
        } catch (NumberFormatException errorangka) {
            Toast.makeText(getApplicationContext(), "Can't Empty", Toast.LENGTH_SHORT).show();
        }
    }

    public void buttonKali(View view) {
        try {
            DOU_kali1 = Double.valueOf(EDT_atas.getText().toString());
            DOU_kali2 = Double.valueOf(EDT_bawah.getText().toString());
            DOU_hasil_kali = DOU_kali1 * DOU_kali2;
            TXT_hasil.setText(DOU_hasil_kali.toString());
        } catch (NumberFormatException errorangka) {
            Toast.makeText(getApplicationContext(), "Can't Empty", Toast.LENGTH_SHORT).show();
        }
    }
}
