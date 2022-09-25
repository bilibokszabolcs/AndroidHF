package com.example.hf01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button osszeadas = findViewById(R.id.button1);
        Button kivonas = findViewById(R.id.button2);
        Button szorzas = findViewById(R.id.button3);
        Button osztas = findViewById(R.id.button4);


        EditText szam1 = findViewById(R.id.editTextNumber1);
        EditText szam2 = findViewById(R.id.editTextNumber2);
        TextView megoldas = findViewById(R.id.textView1);

        osszeadas.setTextSize(25);
        kivonas.setTextSize(25);
        szorzas.setTextSize(25);
        osztas.setTextSize(25);
        megoldas.setTextSize(25);
        szam1.setTextSize(25);
        szam2.setTextSize(25);


        osszeadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double eredmeny = Double.parseDouble(szam1.getText().toString()) + Double.parseDouble(szam2.getText().toString());
                    megoldas.setText(Double.toString(eredmeny));

                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Csak számokat adhatsz meg!", Toast.LENGTH_SHORT).show();
                }
            }
        });


        kivonas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double eredmeny = Double.parseDouble(szam1.getText().toString()) - Double.parseDouble(szam2.getText().toString());
                    megoldas.setText(Double.toString(eredmeny));

                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Csak számokat adhatsz meg!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        szorzas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double eredmeny = Double.parseDouble(szam1.getText().toString()) * Double.parseDouble(szam2.getText().toString());
                    megoldas.setText(Double.toString(eredmeny));

                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Csak számokat adhatsz meg!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        osztas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double eredmeny = Double.parseDouble(szam1.getText().toString()) / Double.parseDouble(szam2.getText().toString());
                    megoldas.setText(Double.toString(eredmeny));

                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Csak számokat adhatsz meg!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}