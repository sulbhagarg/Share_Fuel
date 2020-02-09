package com.example.share_fuel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class AddRide extends AppCompatActivity {

    Button btnAdd;
    EditText etTime, etDate, etSeatsAvailable;
    AutoCompleteTextView etStartPoint, etDestination;
    RadioGroup etVehicleType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_ride);

        btnAdd = findViewById(R.id.btnAdd);
        etDate = findViewById(R.id.etDate);
        etDestination = findViewById(R.id.etDestination);
        etSeatsAvailable = findViewById(R.id.etSeatsAvailable);
        etTime = findViewById(R.id.etTime);
        etStartPoint = findViewById(R.id.etStartPoint);
        etVehicleType = findViewById(R.id.rbVehicleType);


//        etStartPoint.setAdapter(new PlaceAutoSuggestAdapter(AddRides.this, android.R.layout.simple_list_item_1));
//        etDestination.setAdapter(new PlaceAutoSuggestAdapter(AddRides.this, android.R.layout.simple_list_item_1));

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String start = etStartPoint.getText().toString().trim();
                String end = etDestination.getText().toString().trim();
//                Intent i = new Intent(AddRide.this, com.example..MapsActivity.class);
//                i.putExtra("start", start);
//                i.putExtra("end", end);
//                startActivity(i);
            }
        });
    }
}
