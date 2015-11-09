package com.example.javier.toast_coin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button ;
    Toast toast;
String [] coin = {"Cara", "Cruz"};
    String res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomGenerator = new Random(); //Construct new number Generator
                int randomNumber = randomGenerator.nextInt(2);


                res = coin[randomNumber];
                Toast toast = Toast.makeText(getApplicationContext(), res, Toast.LENGTH_SHORT) ;
                toast.show();
                Log.i("InfoMessage.", "This is an information message.");
                Log.w("WarningMessage", "This is a warning message, be careful.");
                Log.e("ErrorMessage","Something is not right.");

            }
        });

    }





}
