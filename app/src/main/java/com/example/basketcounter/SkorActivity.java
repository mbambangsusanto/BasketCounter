package com.example.basketcounter;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class SkorActivity extends AppCompatActivity {

    int skorTimA = 0;
    int skorTimB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skor);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Papan Skor");


        String namaA = getIntent().getStringExtra("Tim A");
        String namaB = getIntent().getStringExtra("Tim B");

        TextView namaTimA = (TextView) findViewById(R.id.txt_tim_a);
        TextView namaTimB = (TextView) findViewById(R.id.txt_tim_b);

        namaTimA.setText("Team" + " " + namaA);
        namaTimB.setText("Team" + " " + namaB);

    }

    public void TampilanSkorTimA(int skor)
    {
        TextView txtSkor = (TextView) findViewById(R.id.txt_poin_tim_a);
        txtSkor.setText(String.valueOf(skor));
    }

    public void SatuPoinA(View v)
    {
        skorTimA += 1;
        TampilanSkorTimA(skorTimA);
    }

    public void DuaPoinA(View v)
    {
        skorTimA += 2;
        TampilanSkorTimA(skorTimA);
    }

    public void TigaPoinA(View v)
    {
        skorTimA += 3;
        TampilanSkorTimA(skorTimA);
    }

    public void TampilanSkorTimB(int skor)
    {
        TextView txtSkor = (TextView) findViewById(R.id.txt_poin_tim_b);
        txtSkor.setText(String.valueOf(skor));
    }

    public void SatuPoinB(View v)
    {
        skorTimB += 1;
        TampilanSkorTimB(skorTimB);
    }

    public void DuaPoinB(View v)
    {
        skorTimB += 2;
        TampilanSkorTimB(skorTimB);
    }

    public void TigaPoinB(View v)
    {
        skorTimB += 3;
        TampilanSkorTimB(skorTimB);
    }

    public void ResetA(View v)
    {
        skorTimA = 0;
        TampilanSkorTimA(skorTimA);
    }

    public void ResetB(View v)
    {
        skorTimB = 0;
        TampilanSkorTimB(skorTimB);
    }
}