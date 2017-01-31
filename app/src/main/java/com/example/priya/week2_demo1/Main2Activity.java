package com.example.priya.week2_demo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn = (Button)findViewById(R.id.Activity2);
        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main2Activity.this, MainActivity.class));
            }
        });
        }

    public void rOnclick(View view) {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }
}





