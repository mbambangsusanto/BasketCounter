package com.example.basketcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void PindahKeSkorActivity(View v)
    {
        EditText edtTimA = (EditText) findViewById(R.id.edt_tim_a);
        EditText edtTimB = (EditText) findViewById(R.id.edt_tim_b);

        String namaTimA = edtTimA.getText().toString();
        String namaTimB = edtTimB.getText().toString();

        Intent intent = new Intent(MainActivity.this, SkorActivity.class);
        intent.putExtra("Tim A", namaTimA);
        intent.putExtra("Tim B", namaTimB);
        startActivity(intent);
    }

}