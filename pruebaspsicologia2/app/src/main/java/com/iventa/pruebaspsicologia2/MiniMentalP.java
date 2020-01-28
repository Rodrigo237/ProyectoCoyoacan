package com.iventa.pruebaspsicologia2;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;


public class MiniMentalP extends AppCompatActivity {


    CheckBox Pregunta1,Pregunta2,Pregunta3,Pregunta4,Pregunta5;
    CheckBox Pregunta6,Pregunta7,Pregunta8,Pregunta9,Pregunta10;
    CheckBox Pregunta11,Pregunta12R1,Pregunta12R2,Pregunta12R3;
    private SQLiteDatabase db;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini_mental_p);

        Pregunta1 = (CheckBox)findViewById(R.id.MiniP1);
        Pregunta2 = (CheckBox)findViewById(R.id.MiniP2);
        Pregunta3 = (CheckBox)findViewById(R.id.MiniP3);
        Pregunta4 = (CheckBox)findViewById(R.id.MiniP4);
        Pregunta5 = (CheckBox)findViewById(R.id.MiniP5);
        Pregunta6 = (CheckBox)findViewById(R.id.MiniP6);
        Pregunta7 = (CheckBox)findViewById(R.id.MiniP7);
        Pregunta8 = (CheckBox)findViewById(R.id.MiniP8);
        Pregunta9 = (CheckBox)findViewById(R.id.MiniP9);
        Pregunta10 = (CheckBox)findViewById(R.id.MiniP10);
        Pregunta11 = (CheckBox)findViewById(R.id.MiniP11);
        Pregunta12R1 = (CheckBox)findViewById(R.id.Manzana12);
        Pregunta12R2 = (CheckBox)findViewById(R.id.Perro12);
        Pregunta12R3 = (CheckBox)findViewById(R.id.Mesa12);

    }


    public  void Preguntas()
    {
        if (Pregunta1.isChecked())
            db.execSQL("Insert into CuestionarioBasico(mini1)Values(1)");
    }

    public void miniMentalPAbortar(View view)
    {
        Intent miniMAbortar = new Intent(getApplicationContext(),MainActivity.class);
        miniMAbortar.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        miniMAbortar.putExtra("EXIT",true);
        startActivity(miniMAbortar);
    }
}
