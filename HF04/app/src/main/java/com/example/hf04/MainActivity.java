package com.example.hf04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] currencyNameArray = {"EUR", "USD", "GBP", "AUD", "CAD", "CHF", "DKK", "HUF"};

    String[] infoArray = {"Euro", "Dollar american", "Lira sterlina", "Dolar australian", "Dolar canadian", "Franc elvetian", "Coroana daneza", "Forint maghiar"};


    Integer[] imageArray = {
            R.drawable.europeanunion,
            R.drawable.unitedstates,
            R.drawable.unitedkingdom,
            R.drawable.australia,
            R.drawable.canada,
            R.drawable.switzerland,
            R.drawable.denmark,
            R.drawable.hungary
    };
    String[] buyPrices = {"4,4100", "3,9750", "6,1250", "2,9600", "3,0950", "4,2300", "0,5850", "0,0136"};

    String[] sellPrices = {"4,5500", "4,1450", "6,3550", "3,0600", "3,2650", "4,3300", "0,6150", "0,0146"};

    String currencyPrice = "RON";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView myList = findViewById(R.id.myListView);
        CustomAdapter customAdapter = new CustomAdapter(this, currencyNameArray, infoArray, imageArray, buyPrices, sellPrices);

        myList.setAdapter(customAdapter);

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                intent.putExtra("PICTURE", imageArray[i]);
                intent.putExtra("NAME", currencyNameArray[i]);
                intent.putExtra("BUY", buyPrices[i] + " " + currencyPrice);
                startActivity(intent);

            }
        });

    }
}