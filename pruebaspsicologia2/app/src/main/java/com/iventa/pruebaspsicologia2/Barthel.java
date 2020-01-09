package com.iventa.pruebaspsicologia2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Barthel extends AppCompatActivity {

    RadioButton indep1,depen1;
    RadioButton indep2,ayu2,depen2;
    RadioButton indep3,depen3;
    RadioButton indep4,ayu4,depen4;
    RadioButton indep5,ayu5,depen5;
    RadioButton indep6,minayu6,granayu6;
    RadioButton indep7,ayu7,indepsilla7,depen7;
    RadioButton conti8,inconoca8,incon8;
    RadioButton conti9,inconoca9,incon9;
    RadioButton incon10,ayu10,depen10;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barthel);

        indep1 = (RadioButton)findViewById(R.id.indep1);
        depen1 = (RadioButton)findViewById(R.id.depen1);

        indep2 = (RadioButton)findViewById(R.id.indep2);
        ayu2 = (RadioButton)findViewById(R.id.ayu2);
        depen2 = (RadioButton)findViewById(R.id.depen2);

        indep3 = (RadioButton)findViewById(R.id.indep3);
        depen3 = (RadioButton)findViewById(R.id.depen3);

        indep4 = (RadioButton)findViewById(R.id.indep4);
        ayu4 = (RadioButton)findViewById(R.id.ayu4);
        depen4 = (RadioButton)findViewById(R.id.depen4);

        indep5 = (RadioButton)findViewById(R.id.indep5);
        ayu5 = (RadioButton)findViewById(R.id.ayu5);
        depen5 = (RadioButton)findViewById(R.id.depen5);

        indep6 = (RadioButton)findViewById(R.id.indep6);
        minayu6 = (RadioButton)findViewById(R.id.minayu6);
        granayu6 = (RadioButton)findViewById(R.id.granayu6);

        indep7 = (RadioButton)findViewById(R.id.indep7);
        ayu7 = (RadioButton)findViewById(R.id.ayu7);
        indepsilla7 = (RadioButton)findViewById(R.id.indepsilla7);
        depen7 = (RadioButton)findViewById(R.id.depen7);

        conti8 = (RadioButton)findViewById(R.id.conti8);
        inconoca8 = (RadioButton)findViewById(R.id.inconoca8);
        incon8 = (RadioButton)findViewById(R.id.incon8);

        conti9 = (RadioButton)findViewById(R.id.conti9);
        inconoca9 = (RadioButton)findViewById(R.id.inconoca9);
        incon9 = (RadioButton)findViewById(R.id.incon9);

        incon10 = (RadioButton)findViewById(R.id.incon10);
        ayu10 = (RadioButton)findViewById(R.id.ayu10);
        depen10 = (RadioButton)findViewById(R.id.depen10);
    }

    public void sigBarthel(View view){
        Intent finbar = new Intent(this,terminacion.class);
        startActivity(finbar);
    }

    //Pregunta 20
    public void pregunta20(View view) {
        boolean checked = ((RadioButton) view).isChecked(); //Chequeo

        switch (view.getId())
        {
            case R.id.indep1:
                break;
            case R.id.depen1:
                break;
        }
    }

    //Pregunta 21
    public void pregunta21(View view) {
        boolean checked = ((RadioButton) view).isChecked(); //Chequeo

        switch (view.getId())
        {
            case R.id.indep2:
                break;
            case R.id.ayu2:
                break;
            case R.id.depen2:
                break;
        }
    }

    //Pregunta 22
    public void pregunta22(View view) {
        boolean checked = ((RadioButton) view).isChecked(); //Chequeo

        switch (view.getId())
        {
            case R.id.indep3:
                break;
            case R.id.depen3:
                break;
        }
    }

    //Pregunta 23
    public void pregunta23(View view) {
        boolean checked = ((RadioButton) view).isChecked(); //Chequeo

        switch (view.getId())
        {
            case R.id.indep4:
                break;
            case R.id.ayu4:
                break;
            case R.id.depen4:
                break;
        }
    }

    //Pregunta 24
    public void pregunta24(View view) {
        boolean checked = ((RadioButton) view).isChecked(); //Chequeo

        switch (view.getId())
        {
            case R.id.indep5:
                break;
            case R.id.ayu5:
                break;
            case R.id.depen5:
                break;
        }
    }

    //Pregunta 25
    public void pregunta25(View view) {
        boolean checked = ((RadioButton) view).isChecked(); //Chequeo

        switch (view.getId())
        {
            case R.id.indep6:
                break;
            case R.id.minayu6:
                break;
            case R.id.granayu6:
                break;
        }
    }

    //Pregunta 26
    public void pregunta26(View view) {
        boolean checked = ((RadioButton) view).isChecked(); //Chequeo

        switch (view.getId())
        {
            case R.id.indep7:
                break;
            case R.id.ayu7:
                break;
            case R.id.indepsilla7:
                break;
            case R.id.depen7:
                break;
        }
    }

    //Pregunta 27
    public void pregunta27(View view) {
        boolean checked = ((RadioButton) view).isChecked(); //Chequeo

        switch (view.getId())
        {
            case R.id.conti8:
                break;
            case R.id.inconoca8:
                break;
            case R.id.incon8:
                break;
        }
    }

    //Pregunta 28
    public void pregunta28(View view) {
        boolean checked = ((RadioButton) view).isChecked(); //Chequeo

        switch (view.getId())
        {
            case R.id.conti9:
                break;
            case R.id.inconoca9:
                break;
            case R.id.incon9:
                break;
        }
    }

    //Pregunta 29
    public void pregunta29(View view) {
        boolean checked = ((RadioButton) view).isChecked(); //Chequeo

        switch (view.getId())
        {
            case R.id.incon10:
                break;
            case R.id.ayu10:
                break;
            case R.id.depen10:
                break;
        }
    }


}
