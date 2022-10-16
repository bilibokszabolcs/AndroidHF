package com.example.hf03_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Product> productList = new ArrayList<>();

        EditText productCodeInput = findViewById(R.id.editText1);
        EditText productNameInput = findViewById(R.id.editText2);
        EditText productPriceInput = findViewById(R.id.editText3);
        Button addProductButton = findViewById(R.id.button1);
        Button cancelButton = findViewById(R.id.button2);
        Button showButton = findViewById(R.id.button3);
        TextView productTextView = findViewById(R.id.textView4);

        addProductButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Integer code = Integer.parseInt(productCodeInput.getText().toString());
                String name = productNameInput.getText().toString();
                Double price = Double.parseDouble(productPriceInput.getText().toString());

                productList.add(new Product(code, name, price));
                Toast.makeText(MainActivity.this, "Product added", Toast.LENGTH_SHORT).show();
            }

        });


        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                productCodeInput.getText().clear();
                productNameInput.getText().clear();
                productPriceInput.getText().clear();

            }
        });

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String text="Products: \n";
                for (Product product: productList
                     ) {
                    text = text + product.toString();
                }
                productTextView.setText(text);
            }
        });
    }
}