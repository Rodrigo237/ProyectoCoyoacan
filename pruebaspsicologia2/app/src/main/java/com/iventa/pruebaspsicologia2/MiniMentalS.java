package com.iventa.pruebaspsicologia2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MiniMentalS extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini_mental_s);
    }

    public void miniMentalSAbortar(View view)
    {
        Intent minimentalAbort = new Intent(getApplicationContext(),MainActivity.class);
        minimentalAbort.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        minimentalAbort.putExtra("EXIT",true);
        startActivity(minimentalAbort);
    }
}
