package com.example.fadacai;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class Spinner extends AppCompatActivity {
    private TextView tvMessage;
    private android.widget.Spinner spFood;
    private android.widget.Spinner spPlace;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner);
        findViews();
    }

    private void findViews() {
        tvMessage = (TextView) findViewById(R.id.tvMessage);
        spFood = (android.widget.Spinner) findViewById(R.id.spFood);
        spFood.setSelection(0, true);
        spFood.setOnItemSelectedListener(listener);

        spPlace = (android.widget.Spinner) findViewById(R.id.spPlace);
        String[] places = {"Australia", "U.K.", "Japan", "Thailand"};
        ArrayAdapter<String> adapterPlace = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, places);
        adapterPlace
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPlace.setAdapter(adapterPlace);
        spPlace.setSelection(0, true);
        spPlace.setOnItemSelectedListener(listener);
    }

    android.widget.Spinner.OnItemSelectedListener listener = new android.widget.Spinner.OnItemSelectedListener() {
        @Override
        public void onItemSelected(
                AdapterView<?> parent, View view, int pos, long id) {
            tvMessage.setText(parent.getItemAtPosition(pos).toString());
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {
            tvMessage.setText(R.string.text_NothingSelected);
        }
    };
}
