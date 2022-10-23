package com.example.hf04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView nameText = findViewById(R.id.textView7);
        TextView buyText = findViewById(R.id.textView8);
        ImageView imageView = findViewById(R.id.imageView);

        Integer picture = getIntent().getIntExtra("PICTURE", 0);
        String name = getIntent().getStringExtra("NAME");
        String buy = getIntent().getStringExtra("BUY");

        nameText.setText(name);
        buyText.setText(buy);
        imageView.setImageResource(picture);

    }
}