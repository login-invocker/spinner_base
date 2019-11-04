package com.example.spinner_base;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayAdapter<String> arrayAdapter;
    ArrayList<String> name = new ArrayList<>();
    String stringName[];
    Spinner spinnerString;
    Spinner spinnerArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControl();
        addData();

        arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, stringName);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, name);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        spinnerString.setAdapter(arrayAdapter);
        spinnerArray.setAdapter(arrayAdapter2);
        addEvent();
    }

    private void addData() {

        name.add(getResources().getString(R.string.app_name));
        name.add(getResources().getString(R.string.app_name));
        name.add(getResources().getString(R.string.app_name));
        stringName = (getResources().getStringArray(R.array.name));

    }

    private void addEvent() {
    }

    private void addControl() {

        spinnerArray = findViewById(R.id.spinner_aray);
        spinnerString=findViewById(R.id.spinner_string);

    }
}
