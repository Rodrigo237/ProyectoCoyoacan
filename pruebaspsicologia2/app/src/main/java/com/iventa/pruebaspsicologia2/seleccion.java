package com.iventa.pruebaspsicologia2;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;
import com.iventa.pruebaspsicologia2.bases.FuenteCuestionarioBasico;

import java.text.SimpleDateFormat;
import java.util.Date;

public class seleccion extends AppCompatActivity {

    Button bsig;
    RadioButton nunca1,muy1,algun1,casi1,siempre1;
    RadioButton  nunca2,muy2,algun2,casi2,siempre2;
    RadioButton  nunca3,muy3,algun3,casi3,siempre3;
    RadioButton  nunca4,muy4,algun4,casi4,siempre4;
    RadioButton  nunca5,muy5,algun5,casi5,siempre5;
    RadioButton  nunca6,muy6,algun6,casi6,siempre6;
    RadioButton  nunca7,muy7,algun7,casi7,siempre7;
    RadioButton  nunca8,muy8,algun8,casi8,siempre8;
    RadioButton  nunca9,muy9,algun9,casi9,siempre9;
    RadioButton  nunca10,muy10,algun10,casi10,siempre10;
    RadioButton  nunca11,muy11,algun11,casi11,siempre11;
    RadioButton  nunca12,muy12,algun12,casi12,siempre12;
    private SQLiteDatabase db;
    FuenteCuestionarioBasico fuenteCuestionarioBasico;
    String comandoSql;

    private String seleccion_fecha;
    private String seleccion_hora_ini;
    private String seleccion_fechor_ini;

    private static String la_tableta;
    private static String el_encuesto;
    private String el_registro;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion);

        Date date = new Date();
        seleccion_fecha = "'" + new SimpleDateFormat("yyyy-MM-dd").format(date.getTime()) + "'";
        seleccion_hora_ini = "'" + new SimpleDateFormat("HH:mm:ss").format(date.getTime()) + "'";

        bsig = (Button)findViewById(R.id.sigselec);

        nunca1 = (RadioButton)findViewById(R.id.nunca1);
        muy1  = (RadioButton)findViewById(R.id.muy1);
        algun1 = (RadioButton)findViewById(R.id.algun1);
        casi1 = (RadioButton)findViewById(R.id.casi1);
        siempre1 = (RadioButton)findViewById(R.id.siempre1);

        nunca2 = (RadioButton)findViewById(R.id.nunca2);
        muy2  = (RadioButton)findViewById(R.id.muy2);
        algun2 = (RadioButton)findViewById(R.id.algun2);
        casi2 = (RadioButton)findViewById(R.id.casi2);
        siempre2 = (RadioButton)findViewById(R.id.siempre2);

        nunca3 = (RadioButton)findViewById(R.id.nunca3);
        muy3  = (RadioButton)findViewById(R.id.muy3);
        algun3 = (RadioButton)findViewById(R.id.algun3);
        casi3 = (RadioButton)findViewById(R.id.casi3);
        siempre3 = (RadioButton)findViewById(R.id.siempre3);

        nunca4 = (RadioButton)findViewById(R.id.nunca4);
        muy4  = (RadioButton)findViewById(R.id.muy4);
        algun4 = (RadioButton)findViewById(R.id.algun4);
        casi4 = (RadioButton)findViewById(R.id.casi4);
        siempre4 = (RadioButton)findViewById(R.id.siempre4);

        nunca5 = (RadioButton)findViewById(R.id.nunca5);
        muy5  = (RadioButton)findViewById(R.id.muy5);
        algun5 = (RadioButton)findViewById(R.id.algun5);
        casi5 = (RadioButton)findViewById(R.id.casi5);
        siempre5 = (RadioButton)findViewById(R.id.siempre5);

        nunca6 = (RadioButton)findViewById(R.id.nunca6);
        muy6  = (RadioButton)findViewById(R.id.muy6);
        algun6 = (RadioButton)findViewById(R.id.algun6);
        casi6 = (RadioButton)findViewById(R.id.casi6);
        siempre6 = (RadioButton)findViewById(R.id.siempre6);

        nunca7 = (RadioButton)findViewById(R.id.nunca7);
        muy7  = (RadioButton)findViewById(R.id.muy7);
        algun7 = (RadioButton)findViewById(R.id.algun7);
        casi7 = (RadioButton)findViewById(R.id.casi7);
        siempre7 = (RadioButton)findViewById(R.id.siempre7);

        nunca8 = (RadioButton)findViewById(R.id.nunca8);
        muy8  = (RadioButton)findViewById(R.id.muy8);
        algun8 = (RadioButton)findViewById(R.id.algun8);
        casi8 = (RadioButton)findViewById(R.id.casi8);
        siempre8 = (RadioButton)findViewById(R.id.siempre8);

        nunca9 = (RadioButton)findViewById(R.id.nunca9);
        muy9  = (RadioButton)findViewById(R.id.muy9);
        algun9 = (RadioButton)findViewById(R.id.algun9);
        casi9 = (RadioButton)findViewById(R.id.casi9);
        siempre9 = (RadioButton)findViewById(R.id.siempre9);

        nunca10 = (RadioButton)findViewById(R.id.nunca10);
        muy10  = (RadioButton)findViewById(R.id.muy10);
        algun10 = (RadioButton)findViewById(R.id.algun10);
        casi10 = (RadioButton)findViewById(R.id.casi10);
        siempre10 = (RadioButton)findViewById(R.id.siempre10);

        nunca11 = (RadioButton)findViewById(R.id.nunca11);
        muy11  = (RadioButton)findViewById(R.id.muy11);
        algun11 = (RadioButton)findViewById(R.id.algun11);
        casi11 = (RadioButton)findViewById(R.id.casi11);
        siempre11 = (RadioButton)findViewById(R.id.siempre11);

        nunca12 = (RadioButton)findViewById(R.id.nunca12);
        muy12  = (RadioButton)findViewById(R.id.muy12);
        algun12 = (RadioButton)findViewById(R.id.algun12);
        casi12 = (RadioButton)findViewById(R.id.casi12);
        siempre12 = (RadioButton)findViewById(R.id.siempre12);

        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
        fuenteCuestionarioBasico.open();
        String comando_00 = "SELECT registro, tableta, encuesto FROM posicionador";
        String el_registro_leido[] = fuenteCuestionarioBasico.tomarEncuesto(comando_00);
        if (el_registro_leido[0] != null) {
             el_registro = String.valueOf(el_registro_leido[0].toString());
             la_tableta = String.valueOf(el_registro_leido[1].toString());
             el_encuesto = String.valueOf(el_registro_leido[2].toString());
        }

        String comando_0 = "SELECT nombre, paterno, materno FROM cuestionariobasico WHERE registro = " + "'" + el_registro + "'";
        String identificacion[] = fuenteCuestionarioBasico.tomarNombre(comando_0);

        if ((identificacion[0] != null) && (identificacion[1] != null )) {
            String el_nombre = String.valueOf(identificacion[0].toString());
            String el_paterno = String.valueOf(identificacion[1].toString());
            String el_materno = String.valueOf(identificacion[2].toString());

            if ((el_nombre.length() > 0) && (el_paterno.length() > 0) && (el_materno.length() > 0)) {
              //  exhibe_nombre.setText("Registro de:" + el_nombre.trim() + " " + el_paterno.trim() + " " + el_materno.trim());
            }
        }

        String comando_1 = "SELECT registro, " +
                "municipio, ageb, area, manzana, vivienda, " +
                "nombre, paterno, materno, " +
                "sexo, edad, edad_hoy, " +
                "encuesto " +
                "FROM cuestionariobasico " +
                "WHERE registro = " + "'" + el_registro + "'";

        String matriz[] = fuenteCuestionarioBasico.abrirSeleccion_0101(comando_1);

    }


    public void sigsel(View view){
        Intent selint = new Intent(this,Depresion.class);
        startActivity(selint);
    }

    //Pregunta1
    public void pregunta1(View view){
        boolean checked = ((RadioButton) view).isChecked();//Chequeo

        switch (view.getId()){
            case R.id.nunca1:
                Toast.makeText(this,"1",Toast.LENGTH_LONG).show();
                comandoSql = "INSERT INTO CuestionarioBasico(COLUMNA_P_01) VALUES(1)";
                fuenteCuestionarioBasico.abrirSeleccion_0101(comandoSql);
                break;
            case R.id.muy1:
                Toast.makeText(this,"2",Toast.LENGTH_LONG).show();
                break;
            case R.id.algun1:
                Toast.makeText(this,"3",Toast.LENGTH_LONG).show();
                break;
            case R.id.casi1:
                Toast.makeText(this,"4",Toast.LENGTH_LONG).show();
                break;
            case R.id.siempre1:
                Toast.makeText(this,"5",Toast.LENGTH_LONG).show();
                break;
        }
    }

    //Pregunta2
    public void pregunta2(View view){
        boolean checked = ((RadioButton) view).isChecked();//Chequeo

        switch (view.getId()){
            case R.id.nunca2:
                Toast.makeText(this,"1",Toast.LENGTH_LONG).show();
                break;
            case R.id.muy2:
                Toast.makeText(this,"2",Toast.LENGTH_LONG).show();
                break;
            case R.id.algun2:
                Toast.makeText(this,"3",Toast.LENGTH_LONG).show();
                break;
            case R.id.casi2:
                Toast.makeText(this,"4",Toast.LENGTH_LONG).show();
                break;
            case R.id.siempre2:
                Toast.makeText(this,"5",Toast.LENGTH_LONG).show();
                break;
        }
    }

    //Pregunta3
    public void pregunta3(View view){
        boolean checked = ((RadioButton) view).isChecked();//Chequeo

        switch (view.getId()){
            case R.id.nunca3:
                break;
            case R.id.muy3:
                break;
            case R.id.algun3:
                break;
            case R.id.casi3:
                break;
            case R.id.siempre3:
                break;
        }
    }

    //Pregunta4
    public void pregunta4(View view){
        boolean checked = ((RadioButton) view).isChecked();//Chequeo

        switch (view.getId()){
            case R.id.nunca4:
                break;
            case R.id.muy4:
                break;
            case R.id.algun4:
                break;
            case R.id.casi4:
                break;
            case R.id.siempre4:
                break;
        }
    }

    //Pregunta5
    public void pregunta5(View view){
        boolean checked = ((RadioButton) view).isChecked();//Chequeo

        switch (view.getId()){
            case R.id.nunca5:
                break;
            case R.id.muy5:
                break;
            case R.id.algun5:
                break;
            case R.id.casi5:
                break;
            case R.id.siempre5:
                break;
        }
    }


    //Pregunta6
    public void pregunta6(View view){
        boolean checked = ((RadioButton) view).isChecked();//Chequeo

        switch (view.getId()){
            case R.id.nunca6:
                break;
            case R.id.muy6:
                break;
            case R.id.algun6:
                break;
            case R.id.casi6:
                break;
            case R.id.siempre6:
                break;
        }
    }

    //Pregunta7
    public void pregunta7(View view){
        boolean checked = ((RadioButton) view).isChecked();//Chequeo

        switch (view.getId()){
            case R.id.nunca7:
                break;
            case R.id.muy7:
                break;
            case R.id.algun7:
                break;
            case R.id.casi7:
                break;
            case R.id.siempre7:
                break;
        }
    }

    //Pregunta8
    public void pregunta8(View view){
        boolean checked = ((RadioButton) view).isChecked();//Chequeo

        switch (view.getId()){
            case R.id.nunca8:
                break;
            case R.id.muy8:
                break;
            case R.id.algun8:
                break;
            case R.id.casi8:
                break;
            case R.id.siempre8:
                break;
        }
    }

    //Pregunta9
    public void pregunta9(View view){
        boolean checked = ((RadioButton) view).isChecked();//Chequeo

        switch (view.getId()){
            case R.id.nunca9:
                break;
            case R.id.muy9:
                break;
            case R.id.algun9:
                break;
            case R.id.casi9:
                break;
            case R.id.siempre9:
                break;
        }
    }

    //Pregunta10
    public void pregunta10(View view){
        boolean checked = ((RadioButton) view).isChecked();//Chequeo

        switch (view.getId()){
            case R.id.nunca10:
                break;
            case R.id.muy10:
                break;
            case R.id.algun10:
                break;
            case R.id.casi10:
                break;
            case R.id.siempre10:
                break;
        }
    }

    //Pregunta11
    public void pregunta111(View view){
        boolean checked = ((RadioButton) view).isChecked();//Chequeo

        switch (view.getId()){
            case R.id.nunca11:
                break;
            case R.id.muy11:
                break;
            case R.id.algun11:
                break;
            case R.id.casi11:
                break;
            case R.id.siempre11:
                break;
        }
    }

    //Pregunta12
    public void pregunta12(View view){
        boolean checked = ((RadioButton) view).isChecked();//Chequeo

        switch (view.getId()){
            case R.id.nunca12:
                break;
            case R.id.muy12:
                break;
            case R.id.algun12:
                break;
            case R.id.casi12:
                break;
            case R.id.siempre12:
                break;
        }
    }

}
