package com.example.lesson1;

import static android.graphics.Typeface.DEFAULT;
import static android.graphics.Typeface.MONOSPACE;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;

    private EditText mMessageEditText;
    private CheckBox mColorCheckBox;
    private Switch mBoldSwitch;
    private ToggleButton mtoggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_app);
        setTitle("Счетчик Ворон");

        mMessageEditText = (EditText) findViewById(R.id.editText);
        mColorCheckBox = (CheckBox) findViewById(R.id.checkBoxColor);
        mBoldSwitch = (Switch) findViewById(R.id.switchBold);
        mtoggleButton = (ToggleButton) findViewById(R.id.toggleButton);

        Button mCrowsCounterButton = (Button) findViewById(R.id.buttonCounter);
        mCrowsCounterButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                if (mColorCheckBox.isChecked())
                    mMessageEditText.setTextColor(Color.RED);
                else
                    mMessageEditText.setTextColor(Color.BLACK);

                if (mBoldSwitch.isChecked())
                    mMessageEditText.setTypeface(Typeface.DEFAULT_BOLD);
                else
                    mMessageEditText.setTypeface(DEFAULT);

                if (mtoggleButton.isChecked())
                    mMessageEditText.setTypeface(MONOSPACE);
                else
                    mtoggleButton.setTypeface(DEFAULT);

                mMessageEditText.setText("Я насчитал " + ++mCount + " ворон");
            }
        });
    }
}