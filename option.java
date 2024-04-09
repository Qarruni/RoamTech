package com.anshika.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class option extends AppCompatActivity {

    Button butt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
        butt= findViewById(R.id.button);
     //onclick listener for opening another activity ie. from option to scanner.
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(option.this, scanner.class);
                startActivities(new Intent[]{intent});

            }
        });

    }
}