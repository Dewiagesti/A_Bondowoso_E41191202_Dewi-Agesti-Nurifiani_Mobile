package com.example.belajarlayaut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button btn_linear_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_linear_layout = findViewById(R.id.btn_linear_layout);
        btn_linear_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IntentToLinearLayout = new Intent(MainActivity.this, LinearLayout.class);
                startActivity(IntentToLinearLayout);
            }
        });
    }
}