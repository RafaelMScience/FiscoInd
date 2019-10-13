package com.example.fiscon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        final Intent i = new Intent(this,MainActivity.class);

        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

                finally {
                    startActivity(i);
                    finish();
                }
            }
        };

        timer.start();
    }
}
