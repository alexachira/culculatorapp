package com.reen.culculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText input1,input2;
    TextView  txtresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1=findViewById(R.id.input1);
        input2=findViewById(R.id.input2);
        txtresult=findViewById(R.id.textviewresult);
    }

    public void  add(View X)
    {
        Toast.makeText(this, "add clicked", Toast.LENGTH_SHORT).show();
        String v = input1.getText().toString().trim();
        String z =input2.getText().toString().trim();
        //check
        if (v.isEmpty()|| z.isEmpty()) return;
        //convert
        int a =Integer.parseInt(v);
        int b = Integer.parseInt(z);
        //calculate display
        int result =a+b;
        txtresult.setText(""+result);
    }
public void subtract (View X) {
    Toast.makeText(this, "add clicked", Toast.LENGTH_SHORT).show();
    String v = input1.getText().toString().trim();
    String z = input2.getText().toString().trim();
    //check
    if (v.isEmpty() || z.isEmpty()) return;
    //convert
    int a = Integer.parseInt(v);
    int b = Integer.parseInt(z);
    //calculate display
    int result = a - b;
    txtresult.setText("" + result);
}
public void multiplication(View X)
    {
        Toast.makeText(this, "add clicked", Toast.LENGTH_SHORT).show();
        String v = input1.getText().toString().trim();
        String z =input2.getText().toString().trim();
        //check
        if (v.isEmpty()|| z.isEmpty()) return;
        //convert
        int a =Integer.parseInt(v);
        int b = Integer.parseInt(z);
        //calculate display
        int result =a*b;
        txtresult.setText(""+result);
    }


    public void division(View X)

    {
        Toast.makeText(this, "add clicked", Toast.LENGTH_SHORT).show();
        String v = input1.getText().toString().trim();
        String z =input2.getText().toString().trim();
        //check
        if (v.isEmpty()|| z.isEmpty()) return;
        //convert
        int a =Integer.parseInt(v);
        double b = Double.parseDouble(z);
        //calculate display
        double result =a/b;
        txtresult.setText(""+result);
    }
}
