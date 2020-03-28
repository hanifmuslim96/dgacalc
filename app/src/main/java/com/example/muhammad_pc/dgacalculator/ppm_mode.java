package com.example.muhammad_pc.dgacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ppm_mode extends AppCompatActivity {
    EditText ch4,c2h2,c2h4;
    TextView result;
    int C2H21 = 14, C2H41 = 49, CH41 = 97;
    int C2H22 = 8, C2H42 = 23;
    String error1 = "Partial Discharge, Discharges of the cold plasma (corona)\n" +
            "type in gas bubbles or voids, with the\n" +
            "possible formation of X-wax in paper.";
    String error2 = "Discharges of Low Energy, Partial discharges of the sparking type,\n" +
            "inducing pinholes, carbonized\n" +
            "punctures in paper. Low energy arcing\n" +
            "inducing carbonized perforation or\n" +
            "surface tracking of paper, or the\n" +
            "formation of carbon particles in oil.";
    String error3 = "Discharges of High Energy, Discharges in paper or oil, with power\n" +
            "follow-through, resulting in extensive\n" +
            "damage to paper or large formation of\n" +
            "carbon particles on oil, metal\n" +
            "fusion,tripping of the equipment and\n" +
            "gas alarms.";
    String error4 = "Thermal Fault 1 and 2, T<700 C" +
            "Evidenced by paper turning brownish\n" +
            "(>200 °C) or carbonized (>300 °C)." +
            "Carbonization of paper, formation of\n" +
            "carbon particles in oil.";
    String error5 = "Thermal Fault 3, T>700 C" +
            "Extensive formation of carbon\n" +
            "particles in oil, metal coloration (800\n" +
            "°C) or metal fusion (>1000 °C).";
    String error6 = "please complete your percentage";
    Button btn;
    int sum,inch4,inc2h2,inc2h4,minisum,hun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ch4 = (EditText) findViewById(R.id.ch4);
        c2h2 = (EditText) findViewById(R.id.c2h2);
        c2h4 = (EditText) findViewById(R.id.c2h4);
        result = (TextView) findViewById(R.id.result);
        btn = (Button) findViewById(R.id.button1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int tch4 = Integer.parseInt(ch4.getText().toString());
                int tc2h2 = Integer.parseInt(c2h2.getText().toString());
                int tc2h4 = Integer.parseInt(c2h4.getText().toString());
                hun=100;
                sum=tc2h2+tc2h4+tch4;
                inc2h2=tc2h2/sum;
                inc2h4=tc2h4/sum;
                minisum=inc2h2+inc2h4;
                inch4=hun-minisum;
                if (inch4+inc2h2+inc2h4==100){
                    if (inc2h2<=C2H21){
                        if (inc2h4<=C2H41){
                            if (inch4<=CH41){
                                if (inc2h2<=C2H22){
                                    result.setText(error4);
                                }
                                else if(inc2h2>C2H22){
                                    if (inc2h4<=C2H42){
                                        result.setText(error2);
                                    }
                                    else {result.setText(error3);}
                                }
                            }
                            else {result.setText(error1);}
                        }
                        else {result.setText(error5);}
                    }
                    else if(inc2h2>C2H21){
                        if (inc2h4<=C2H42){
                            result.setText(error2);
                        }
                        else {result.setText(error3);}
                    }
                }else {result.setText(error6);}
            }
        });
    }

   /* public void on_Clicked(View view){
        int inch4 = Integer.parseInt(ch4.getText().toString());
        int inc2h2 = Integer.parseInt(c2h2.getText().toString());
        int inc2h4 = Integer.parseInt(c2h4.getText().toString());

        if (inc2h2<=C2H21){
            if (inc2h4<=C2H41){
                if (inch4<=CH41){
                    if (inc2h2<=C2H22){
                        result.setText(error4);
                    }
                    else if(inc2h2>C2H22){
                        if (inc2h4<=C2H42){
                            result.setText(error2);
                        }
                        else {result.setText(error3);}
                    }
                }
                else {result.setText(error1);}
            }
            else {result.setText(error5);}
        }
        else if(inc2h2>C2H21){
            if (inc2h4<=C2H42){
                result.setText(error2);
            }
            else {result.setText(error3);}
        }
    }*/

}
