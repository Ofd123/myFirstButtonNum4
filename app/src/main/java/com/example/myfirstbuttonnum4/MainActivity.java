package com.example.myfirstbuttonnum4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btn;
int num = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
    }

    public void go(View view) {

        if (num%7 == 0){
            btn.setText("BOOM!");
        }
        else{
            String str = "This is click number: "+num;
            btn.setText(str);
        }
    num +=1;
    }
}