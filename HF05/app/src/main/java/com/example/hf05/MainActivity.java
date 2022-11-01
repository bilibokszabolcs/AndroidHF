package com.example.hf05;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    ListView myListView;
    ArrayList<String> stringlist = new ArrayList<>();
    ArrayAdapter<String> itemadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stringlist.add("Hétfő");
        stringlist.add("Kedd");
        stringlist.add("Szerda");
        stringlist.add("Csütörtök");
        stringlist.add("Péntek");
        stringlist.add("Szombat");
        stringlist.add("Vasárnap");

        myListView = findViewById(R.id.myListView);
        itemadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, stringlist);
        myListView.setAdapter(itemadapter);

        registerForContextMenu(myListView);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.sort:
                Toast.makeText(MainActivity.this, "Lista rendezve", Toast.LENGTH_SHORT).show();
                Collections.sort(stringlist);
                itemadapter.notifyDataSetChanged();
                return true;
            case R.id.delete:
                Toast.makeText(MainActivity.this, "Lista törölve", Toast.LENGTH_SHORT).show();
                stringlist.clear();
                itemadapter.notifyDataSetChanged();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo itemMenuInfo = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();

        // Nem sikerült rájönnöm arra, hogy hogyan kéne a karakterszint változtatni, csak a hátteret változtattam.
        switch (item.getItemId()) {
            case R.id.piros:
                Toast.makeText(MainActivity.this, "Elem átszinezve pirosra", Toast.LENGTH_SHORT).show();
                itemMenuInfo.targetView.setBackgroundColor(Color.RED);
                return true;
            case R.id.zold:
                Toast.makeText(MainActivity.this, "Elem átszinezve zöldre", Toast.LENGTH_SHORT).show();
                itemMenuInfo.targetView.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.sarga:
                Toast.makeText(MainActivity.this, "Elem átszinezve sárgára", Toast.LENGTH_SHORT).show();
                itemMenuInfo.targetView.setBackgroundColor(Color.YELLOW);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}