package com.example.cal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result2);
        TextView textView;
        textView= (TextView) findViewById(R.id.textView);
         getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent in = getIntent();
        String result = in.getStringExtra("res");


        textView.setText(String.valueOf(result));

        textView.setText(result);
        Button closepage;
        closepage = (Button) findViewById(R.id.closebutton);
        closepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                finish();



            }
        });

    }


}
