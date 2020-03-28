package com.example.muhammad_pc.dgacalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Muhammad-PC on 15/02/2018.
 */

public class splash extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutsplash);
        Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(4000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(splash.this,welcome.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}
