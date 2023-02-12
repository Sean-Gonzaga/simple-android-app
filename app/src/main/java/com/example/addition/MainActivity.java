package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.addButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get the edit text
                EditText t1=(EditText)findViewById(R.id.firstNum);
                EditText t2=(EditText)findViewById(R.id.secondNum);

                //convert value into int
                int x=Integer.parseInt(t1.getText().toString());
                int y=Integer.parseInt(t2.getText().toString());

                //sum these two numbers
                int z=x+y;

                //display this text to TextView
                TextView tv_data=(TextView)findViewById(R.id.sum);
                tv_data.setText("" + z);
            }
        });

    }

}