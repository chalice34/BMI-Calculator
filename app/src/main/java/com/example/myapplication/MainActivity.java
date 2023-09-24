package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText t1, t2;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.b1);
        t1 = findViewById(R.id.hight); // Corrected the ID
        t2 = findViewById(R.id.weight); // Corrected the ID
        t = findViewById(R.id.endshit);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int height = Integer.valueOf(t1.getText().toString());
                int weight = Integer.valueOf(t2.getText().toString());
                double bmi = Fun(height, weight);
                t.setText(String.valueOf(bmi));
            }
        });
    }

    public double Fun(int height, int weight) {
        // Convert height from cm to meters
        double heightInMeters = height / 100.0;

        // Calculate BMI
        return (int)weight / (heightInMeters * heightInMeters);
    }
}
