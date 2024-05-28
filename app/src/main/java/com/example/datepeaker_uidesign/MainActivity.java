package com.example.datepeaker_uidesign;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    DatePicker datePicker;
    TextView usernameEditText4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        datePicker=findViewById(R.id.datePicker);
        usernameEditText4=findViewById(R.id.usernameEditText4);



        datePicker.setOnDateChangedListener((view, year, monthOfYear, dayOfMonth) -> {
            String selectedDate = String.format("%02d/%02d/%04d", monthOfYear + 1, dayOfMonth, year);
            usernameEditText4.setText(selectedDate);
        });

    }
}