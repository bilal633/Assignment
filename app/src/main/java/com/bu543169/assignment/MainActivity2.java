package com.bu543169.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView txtName, txtDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtName = findViewById(R.id.txtName);
        txtDetails = findViewById(R.id.txtDetails);

        txtName.setText(getIntent().getExtras().getString("CATEGORY"));
        txtDetails.setText(getIntent().getExtras().getString("DETAILS"));
    }
}