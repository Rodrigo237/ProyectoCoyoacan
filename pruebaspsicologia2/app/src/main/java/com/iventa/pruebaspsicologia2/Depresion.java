package com.iventa.pruebaspsicologia2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Depresion extends AppCompatActivity {

    RadioButton rara1,pocas1,consi1,todo1;
    RadioButton rara2,pocas2,consi2,todo2;
    RadioButton rara3,pocas3,consi3,todo3;
    RadioButton rara4,pocas4,consi4,todo4;
    RadioButton rara5,pocas5,consi5,todo5;
    RadioButton rara6,pocas6,consi6,todo6;
    RadioButton rara7,pocas7,consi7,todo7;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depresion);

        rara1 = (RadioButton)findViewById(R.id.rara1);
        pocas1 = (RadioButton)findViewById(R.id.pocas1);
        consi1 = (RadioButton)findViewById(R.id.consi1);
        todo1 = (RadioButton)findViewById(R.id.todo1);

        rara2 = (RadioButton)findViewById(R.id.rara2);
        pocas2 = (RadioButton)findViewById(R.id.pocas2);
        consi2 = (RadioButton)findViewById(R.id.consi2);
        todo2 = (RadioButton)findViewById(R.id.todo2);

        rara3 = (RadioButton)findViewById(R.id.rara3);
        pocas3 = (RadioButton)findViewById(R.id.pocas3);
        consi3 = (RadioButton)findViewById(R.id.consi3);
        todo3 = (RadioButton)findViewById(R.id.todo3);

        rara4 = (RadioButton)findViewById(R.id.rara4);
        pocas4 = (RadioButton)findViewById(R.id.pocas4);
        consi4 = (RadioButton)findViewById(R.id.consi4);
        todo4 = (RadioButton)findViewById(R.id.todo4);


        rara5 = (RadioButton)findViewById(R.id.rara5);
        pocas5 = (RadioButton)findViewById(R.id.pocas5);
        consi5 = (RadioButton)findViewById(R.id.consi5);
        todo5 = (RadioButton)findViewById(R.id.todo5);

        rara6 = (RadioButton)findViewById(R.id.rara6);
        pocas6 = (RadioButton)findViewById(R.id.pocas6);
        consi6 = (RadioButton)findViewById(R.id.consi6);
        todo6 = (RadioButton)findViewById(R.id.todo6);

        rara7 = (RadioButton)findViewById(R.id.rara7);
        pocas7 = (RadioButton)findViewById(R.id.pocas7);
        consi7 = (RadioButton)findViewById(R.id.consi7);
        todo7 = (RadioButton)findViewById(R.id.todo7);
    }


    public void sigdepre(View view){
        Intent condepre = new Intent(this,Barthel.class);
        startActivity(condepre);
    }


    //Pregunta13
    public void pregunta13(View view){
        boolean checked = ((RadioButton) view).isChecked();//Chequeo

        switch (view.getId()){
            case R.id.rara1:
                break;
            case R.id.pocas1:
                break;
            case R.id.consi1:
                break;
            case R.id.todo1:
                break;
        }
    }

    //Pregunta14
    public void pregunta14(View view){
        boolean checked = ((RadioButton) view).isChecked();//Chequeo

        switch (view.getId()){
            case R.id.rara2:
                break;
            case R.id.pocas2:
                break;
            case R.id.consi2:
                break;
            case R.id.todo2:
                break;
        }
    }

    //Pregunta15
    public void pregunta15(View view){
        boolean checked = ((RadioButton) view).isChecked();//Chequeo

        switch (view.getId()){
            case R.id.rara3:
                break;
            case R.id.pocas3:
                break;
            case R.id.consi3:
                break;
            case R.id.todo3:
                break;
        }
    }
    //Pregunta16
    public void pregunta16(View view){
        boolean checked = ((RadioButton) view).isChecked();//Chequeo

        switch (view.getId()){
            case R.id.rara4:
                break;
            case R.id.pocas4:
                break;
            case R.id.consi4:
                break;
            case R.id.todo4:
                break;
        }
    }

    //Pregunta17
    public void pregunta17(View view){
        boolean checked = ((RadioButton) view).isChecked();//Chequeo

        switch (view.getId()){
            case R.id.rara5:
                break;
            case R.id.pocas5:
                break;
            case R.id.consi5:
                break;
            case R.id.todo5:
                break;
        }
    }

    //Pregunta18
    public void pregunta18(View view){
        boolean checked = ((RadioButton) view).isChecked();//Chequeo

        switch (view.getId()){
            case R.id.rara6:
                break;
            case R.id.pocas6:
                break;
            case R.id.consi6:
                break;
            case R.id.todo6:
                break;
        }
    }

    //Pregunta19
    public void pregunta19(View view){
        boolean checked = ((RadioButton) view).isChecked();//Chequeo

        switch (view.getId()){
            case R.id.rara7:
                break;
            case R.id.pocas7:
                break;
            case R.id.consi7:
                break;
            case R.id.todo7:
                break;
        }
    }

}
