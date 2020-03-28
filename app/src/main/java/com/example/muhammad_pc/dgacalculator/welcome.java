package com.example.muhammad_pc.dgacalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.muhammad_pc.dgacalculator.MainActivity;

/**
 * Created by Muhammad-PC on 14/02/2018.
 */

public class welcome extends AppCompatActivity {

    private Button button,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openppm_mode();
            }
        });
    }
    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openppm_mode(){
        Intent intent = new Intent(this, com.example.muhammad_pc.dgacalculator.ppm_mode.class);
        startActivity(intent);
    }
}
