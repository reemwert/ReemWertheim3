package com.example.reemwertheim3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn3;
    private int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn3 = findViewById(R.id.btn3);
    }

    public void go(View view) {
        if (count<7){
            btn3.setText("This is a click number:\n" + count);
            count++;
        }
        else{
            btn3.setText("Enough to click. Go to new start!\n");
            count = 0;
        }
    }
}