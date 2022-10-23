package com.example.hf04;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomAdapter extends ArrayAdapter {
    private final Activity context;
    private final Integer[] imageIDarray;

    private final String[] currencyNameArray;

    private final String[] infoArray;

    private final String[] buyPrices;

    private final String[] sellPrices;

    private final String currencyPrice = "RON";

    public CustomAdapter(Activity context, String[] currencyNameArrayParam, String[] infoArrayParam, Integer[] imageIDArrayParam, String[] buyPricesParam, String[] sellPricesParam) {

        super(context, R.layout.list_item, currencyNameArrayParam);
        this.context = context;
        this.imageIDarray = imageIDArrayParam;
        this.currencyNameArray = currencyNameArrayParam;
        this.infoArray = infoArrayParam;
        this.buyPrices = buyPricesParam;
        this.sellPrices = sellPricesParam;


    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_item, null, true);

        TextView nameText = rowView.findViewById(R.id.textView);
        TextView infoText = rowView.findViewById(R.id.textView2);
        ImageView picture = rowView.findViewById(R.id.imageView4);
        TextView buyText = rowView.findViewById(R.id.textView5);
        TextView sellText = rowView.findViewById(R.id.textView6);

        nameText.setText(currencyNameArray[position]);
        infoText.setText(infoArray[position]);
        picture.setImageResource(imageIDarray[position]);
        buyText.setText(buyPrices[position] + " " + currencyPrice);
        sellText.setText(sellPrices[position] + " " + currencyPrice);

        return rowView;


    }


}
