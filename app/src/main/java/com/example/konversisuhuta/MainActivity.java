package com.example.konversisuhuta;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    EditText etText;
    TextView tvText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        load();
    }

    public void load() {
        spinner = findViewById(R.id.spinner);
        etText = findViewById(R.id.eText);
        tvText = findViewById(R.id.tvHasil);
    }

    public void btnKonversi(View view) {
        String Pilihan = spinner.getSelectedItem().toString();

        if (etText.getText().toString().equals("")) {
            tvText.setText("Nilai Tidak Boleh Kosong");
        }
        //Fuction Celcius
        else {
            if (Pilihan.equals("Celcius To Reamur")) {
                cToR();
            }
            if (Pilihan.equals("Celcius To Kelvin")) {
                cToK();
            }
            if (Pilihan.equals("Celcius To Fahrenheit")) {
                cToF();
            }

            //Fungsi Rumus Reamur
            if (Pilihan.equals("Reamur To Celcius<")) {
                rToC();
            }
            if (Pilihan.equals("Reamur To Kelvin")) {
                rToK();
            }
            if (Pilihan.equals("Reamur To Fahrenhait")) {
                rToF();
            }

            //Fungsi rumus Fahrenheit
            if (Pilihan.equals("Fahrenhait To Celcius")) {
                fToC();
            }
            if (Pilihan.equals("Fahrenhait To Kelvin")) {
                fToK();
            }
            if (Pilihan.equals("Fahrenhait To Reamur")) {
                fToR();
            }

            //Fungsi Rumus Kelvin
            if (Pilihan.equals("Kelvin To Celcius")) {
                kToC();
            }
            if (Pilihan.equals("Kelvin To Reamur")) {
                kToR();
            }
            if (Pilihan.equals("Kelvin To Fahrenhait")) {
                kToF();
            }

        }

    }
//Rumus Celcius To
    public void cToR() {
        double suhu = Double.parseDouble(etText.getText().toString());
        double Hasil = (4.0 / 5.0) * suhu;
        tvText.setText("Hasil Konversi " + Hasil + " Re");
    }
    public void cToK() {
        double suhu = Double.parseDouble(etText.getText().toString());
        double Hasil = suhu + 273.15;
        tvText.setText("Hasil Konversi " + Hasil + " K");
    }
    public void cToF() {
        double suhu = Double.parseDouble(etText.getText().toString());
        double Hasil = (9.0 / 5.0) * suhu + 32;
        tvText.setText("Hasil Konversi " + Hasil + " F");
    }

//Rumus Reamur To
    public void rToK() {
        double suhu = Double.parseDouble(etText.getText().toString());
        double Hasil = suhu / 0.8 + 273.15;
        tvText.setText("Hasil Konversi " + Hasil + " K");
    }
    public void rToF() {
        double suhu = Double.parseDouble(etText.getText().toString());
        double Hasil = suhu * 2.25 +32;
        tvText.setText("Hasil Konversi " + Hasil + " F");
    }
    public void rToC() {
        double suhu = Double.parseDouble(etText.getText().toString());
        double Hasil = suhu / 0.8;
        tvText.setText("Hasil Konversi " + Hasil + " C");
    }

//Rumus Fahrenheit To
    public void fToK() {
        double suhu = Double.parseDouble(etText.getText().toString());
        double Hasil = (suhu + 459.67)/1.8;
        tvText.setText("Hasil Konversi " + Hasil + " K");
    }
    public void fToR() {
        double suhu = Double.parseDouble(etText.getText().toString());
        double Hasil = (suhu-32) / 0.44;
        tvText.setText("Hasil Konversi " + Hasil + " Re");
    }
    public void fToC() {
        double suhu = Double.parseDouble(etText.getText().toString());
        double Hasil = (suhu -32) /1.8;
        tvText.setText("Hasil Konversi " + Hasil + " C");
    }

 //Rumus Kelvin To
    public void kToF() {
        double suhu = Double.parseDouble(etText.getText().toString());
        double Hasil = (suhu - 459.67)*1.8;
        tvText.setText("Hasil Konversi " + Hasil + " F");
    }
    public void kToR() {
        double suhu = Double.parseDouble(etText.getText().toString());
        double Hasil = 0.8 * suhu - 273.15;
        tvText.setText("Hasil Konversi " + Hasil + " Re");
    }
    public void kToC() {
        double suhu = Double.parseDouble(etText.getText().toString());
        double Hasil = suhu - 273.15;
        tvText.setText("Hasil Konversi " + Hasil + " C");
    }

}