package com.example.cal;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    double input1 = 0, input2 = 0;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd, buttonSub,
            buttonMul, buttonDiv, buttonEqual, buttonDel, buttonDot, buttonMod;
    TextView result;
    boolean Addition, Subtract, Multiplication, Division, Remainder, decimal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button0 = (Button) findViewById(R.id.Button0);
        button1 = (Button) findViewById(R.id.Button1);
        button2 = (Button) findViewById(R.id.Button2);
        button3 = (Button) findViewById(R.id.Button3);
        button4 = (Button) findViewById(R.id.Button4);
        button5 = (Button) findViewById(R.id.Button5);
        button6 = (Button) findViewById(R.id.Button6);
        button7 = (Button) findViewById(R.id.Button7);
        button8 = (Button) findViewById(R.id.Button8);
        button9 = (Button) findViewById(R.id.Button9);
        buttonDot = (Button) findViewById(R.id.Buttondot);
        buttonAdd = (Button) findViewById(R.id.Buttonadd);
        buttonSub = (Button) findViewById(R.id.Buttonsubt);
        buttonMul = (Button) findViewById(R.id.Buttonmult);
        buttonDiv = (Button) findViewById(R.id.Buttondiv);
        buttonMod = (Button) findViewById(R.id.Buttonmod);
        buttonDel = (Button) findViewById(R.id.del);
        buttonEqual = (Button) findViewById(R.id.equals);

        result = (TextView) findViewById(R.id.display);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(String.format("%s0", result.getText()));
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(String.format("%s1", result.getText()));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(String.format("%s2", result.getText()));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(String.format("%s3", result.getText()));
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(String.format("%s4", result.getText()));
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(String.format("%s5", result.getText()));
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(String.format("%s6", result.getText()));
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(String.format("%s7", result.getText()));
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(String.format("%s8", result.getText()));
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(String.format("%s9", result.getText()));
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (decimal) {
                    Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_LONG).show();
                } else {
                    result.setText(String.format("%s.", result.getText()));
                    decimal = true;
                }

            }
        });
        buttonDel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                result.setText("");
                input1 = 0.0;
                input2 = 0.0;
            }
        });


        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result.getText().length() != 0){
                    input1 = Double.parseDouble(result.getText() + "");
                    Addition = true;
                    decimal = false;
                    result.setText(null);
                }
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result.getText().length() != 0){
                    input1 = Double.parseDouble(result.getText() + "");
                    Subtract = true;
                    decimal = false;
                    result.setText(null);
                }
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result.getText().length() != 0){
                    input1 = Double.parseDouble(result.getText() + "");
                    Multiplication = true;
                    decimal = false;
                    result.setText(null);
                }
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result.getText().length() != 0){
                    input1 = Double.parseDouble(result.getText() + "");
                    Division = true;
                    decimal = false;
                    result.setText(null);
                }
            }
        });
        buttonMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result.getText().length() != 0){
                    input1 = Double.parseDouble(result.getText() + "");
                    Remainder = true;
                    decimal = false;
                    result.setText(null);
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Addition){
                    input2 = Double.parseDouble(result.getText() + "");
                    decimal = false;
                    result.setText(input1+input2+"");
                    Addition = false;
                }
                if(Subtract){
                    input2 = Double.parseDouble(result.getText() + "");
                    decimal = false;
                    result.setText(input1-input2+"");
                    Subtract = false;
                }
                if(Multiplication){
                    input2 = Double.parseDouble(result.getText() + "");
                    decimal = false;
                    result.setText(input1*input2+"");
                    Multiplication = false;
                }
                if(Division){
                    input2 = Double.parseDouble(result.getText() + "");
                    decimal = false;
                    result.setText(input1/input2+"");
                    Division = false;
                }
                if(Remainder){
                    input2 = Double.parseDouble(result.getText() + "");
                    decimal = false;
                    result.setText(input1%input2+"");
                    Remainder = false;
                }
            }
        });

    }
}

