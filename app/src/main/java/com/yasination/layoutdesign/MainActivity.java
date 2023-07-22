package com.yasination.layoutdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText myNameTextInputEditText;
    Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myNameTextInputEditText = findViewById(R.id.myNameTextInputEditText);
        submit= findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myText = myNameTextInputEditText.getText().toString();

                    myNameTextInputEditText.setText("Thanks : "+myText);

            }
        });


    }
}