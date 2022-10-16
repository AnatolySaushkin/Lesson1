package com.example.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_app);

        EditText firstnumber = findViewById(R.id.first_number);
        EditText secondnumber = findViewById(R.id.second_number);

        Button compare = findViewById(R.id.compare);

        TextView result = findViewById(R.id.result);

        compare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txtFirstDigitValue = firstnumber.getText().toString();
                String txtSecondDigitValue = secondnumber.getText().toString();

                try {

                    Integer firstValue = Integer.valueOf(txtFirstDigitValue);
                    Integer secondValue = Integer.valueOf(txtSecondDigitValue);

                    if (firstValue.equals(secondValue)) {
                        result.setText("Equals!");
                    } else {
                        result.setText("Not Equals!");
                    }
                } catch (NumberFormatException e) {
                    result.setText("Error!");
                }
            }
        });
    }
}