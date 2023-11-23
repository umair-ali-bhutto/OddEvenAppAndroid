package com.computerzila.oddevenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num;
    Button bt;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num = (EditText) findViewById(R.id.myNum);
        bt = (Button) findViewById(R.id.myChk);
        output = (TextView) findViewById(R.id.result);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int a = Integer.parseInt(num.getText().toString());
                if(a%2 == 0)
                {
                    output.setText("Even");
                }
                else
                {
                    output.setText("Odd");
                }

            }
        });
    }
}