package com.example.cal;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Math.ceil;

public class MainActivity extends AppCompatActivity {

    double input1 = 0, input2 = 0;
    double finalans=0;
    String Extra_text;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonAdd;
    Button buttonSub;
    Button buttonMul;
    Button buttonDiv;
    Button buttonEqual;
    Button buttonDel;
    Button buttonDot;
    Button buttonMod;
    TextView result;
    boolean Addition, Subtract, Multiplication, Division, Remainder, decimal,zeroError=false;
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
                Vibrator vi = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vi.vibrate(10);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(String.format("%s1", result.getText()));
                Vibrator vi = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vi.vibrate(10);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(String.format("%s2", result.getText()));
                Vibrator vi = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vi.vibrate(10);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(String.format("%s3", result.getText()));
                Vibrator vi = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vi.vibrate(10);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(String.format("%s4", result.getText()));
                Vibrator vi = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vi.vibrate(10);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(String.format("%s5", result.getText()));
                Vibrator vi = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vi.vibrate(10);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(String.format("%s6", result.getText()));
                Vibrator vi = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vi.vibrate(10);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(String.format("%s7", result.getText()));
                Vibrator vi = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vi.vibrate(10);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(String.format("%s8", result.getText()));
                Vibrator vi = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vi.vibrate(10);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(String.format("%s9", result.getText()));
                Vibrator vi = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vi.vibrate(10);
            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (decimal) {
                    Toast.makeText(getApplicationContext(),"It dosent make sense ",Toast.LENGTH_LONG).show();
                    Vibrator vi = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                    vi.vibrate(200);
                } else {
                    result.setText(String.format("%s.", result.getText()));
                    decimal = true;
                    Vibrator vi = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                    vi.vibrate(10);
                }

            }
        });
        buttonDel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Vibrator vi = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vi.vibrate(10);
                result.setText("");
                input1 = 0.0;
                input2 = 0.0;
            }
        });


        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result.getText().length() != 0){
                    Vibrator vi = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                    vi.vibrate(10);
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
                    Vibrator vi = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                    vi.vibrate(10);
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
                    Vibrator vi = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                    vi.vibrate(10);
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
                    Vibrator vi = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                    vi.vibrate(10);
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
                    Vibrator vi = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                    vi.vibrate(10);
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
                Vibrator vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vib.vibrate(10);
                if (result.getText() == "") {

                    Toast.makeText(getApplicationContext(), "It dosent make sense ", Toast.LENGTH_LONG).show();
                    Vibrator vi = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                    vi.vibrate(200);

                } else {
                    if (Addition) {
                        input2 = Double.parseDouble(result.getText() + "");
                        decimal = false;
                        finalans = input1 + input2;
                        result.setText(null);
                        Addition = false;
                    }
                    if (Subtract) {
                        input2 = Double.parseDouble(result.getText() + "");
                        decimal = false;
                        finalans = input1 - input2;
                        result.setText(null);
                        Subtract = false;
                    }
                    if (Multiplication) {
                        input2 = Double.parseDouble(result.getText() + "");
                        decimal = false;
                        finalans = input1 * input2;
                        result.setText(null);
                        Multiplication = false;
                    }
                    if (Division) {
                        input2 = Double.parseDouble(result.getText() + "");
                        decimal = false;
                        if(input2==0) {
                            zeroError=true;
                            Toast.makeText(getApplicationContext(), "You are trying to reach Infinity! ", Toast.LENGTH_LONG).show();
                            Vibrator vi = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                            vi.vibrate(200);
                        }
                         else {
                            finalans = input1 / input2;
                            result.setText(null);
                            Division = false;
                        }
                    }
                    if (Remainder) {
                        input2 = Double.parseDouble(result.getText() + "");
                        decimal = false;
                        finalans = input1 % input2;
                        result.setText(null);
                        Remainder = false;
                    }
                    finalans = finalans * 100;
                    finalans = (int) finalans;
                    finalans = finalans / 100;

                    if (result.getText() != null) {
                        Intent in = new Intent(MainActivity.this, ResultActivity.class);

                        if(zeroError) {
                            in.putExtra("res", "Infinity");
                            zeroError=false;
                        }
                        else
                            in.putExtra("res", String.valueOf(finalans));

                        startActivity(in);
                    }


                }

            }
        });





    }
}

