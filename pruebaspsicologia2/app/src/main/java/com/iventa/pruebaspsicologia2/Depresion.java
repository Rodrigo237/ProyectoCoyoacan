package com.iventa.pruebaspsicologia2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.iventa.pruebaspsicologia2.bases.FuenteCuestionarioBasico;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Depresion extends AppCompatActivity {

    RadioButton rara1,pocas1,consi1,todo1;
    RadioButton rara2,pocas2,consi2,todo2;
    RadioButton rara3,pocas3,consi3,todo3;
    RadioButton rara4,pocas4,consi4,todo4;
    RadioButton rara5,pocas5,consi5,todo5;
    RadioButton rara6,pocas6,consi6,todo6;
    RadioButton rara7,pocas7,consi7,todo7;

    FuenteCuestionarioBasico fuenteCuestionarioBasico;
    RadioGroup radioGroupP13,radioGroupP14,radioGroupP15,radioGroupP16,radioGroupP17;
    RadioGroup radioGroupP18,radioGroupP19;

    private static String la_tableta;
    private static String el_encuesto;
    private String el_registro;
    private String seleccion_fecha;
    private String seleccion_hora_ini;
    private String seleccion_fechor_ini;
    private  String la_cadena;
    private String el_municipio;
    private String el_ageb;
    private String la_area;
    private String la_manzana;
    private String la_vivienda;
    private String el_nombre;
    private String el_paterno;
    private String el_materno;
    private String el_sexo;
    private String la_edad;
    private String la_edad_hoy;
    private int seleccion_01;
    private String tiempo_01;
    private int seleccion_02;
    private String tiempo_02;
    private int seleccion_03;
    private String tiempo_03;
    private int seleccion_04;
    private String tiempo_04;
    private int seleccion_05;
    private String tiempo_05;
    private int seleccion_06;
    private String tiempo_06;
    private int seleccion_07;
    private String tiempo_07;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depresion);

        Date date = new Date();
        seleccion_fecha = "'" + new SimpleDateFormat("yyyy-MM-dd").format(date.getTime()) + "'";
        seleccion_hora_ini = "'" + new SimpleDateFormat("HH:mm:ss").format(date.getTime()) + "'";

        radioGroupP13 = (RadioGroup)findViewById(R.id.radioGroupP13);
        radioGroupP14 = (RadioGroup)findViewById(R.id.radioGroupP14);
        radioGroupP15 = (RadioGroup)findViewById(R.id.radioGroupP15);
        radioGroupP16 = (RadioGroup)findViewById(R.id.radioGroupP16);
        radioGroupP17 = (RadioGroup)findViewById(R.id.radioGroupP17);
        radioGroupP18 = (RadioGroup)findViewById(R.id.radioGroupP18);
        radioGroupP19 = (RadioGroup)findViewById(R.id.radioGroupP19);


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

        final String matriz[] = fuenteCuestionarioBasico.abrirSeleccion_0102(comando_1);
        el_registro =				matriz[0].toString();
        el_municipio =              matriz[1].toString();
        el_ageb	=           		matriz[2].toString();
        la_area =       			matriz[3].toString();
        la_manzana =		        matriz[4].toString();
        la_vivienda =       		matriz[5].toString();
        el_nombre =         		matriz[6].toString();
        el_paterno =        		matriz[7].toString();
        el_materno =        		matriz[8].toString();
        el_sexo =       			matriz[9].toString();
        la_edad   =             	matriz[10].toString();
        la_edad_hoy =           	matriz[11].toString();

        radioGroupP13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.rara1:
                        matriz[12] = "1";
                        matriz[13] = me_das_tu_ora();
                        seleccion_01 = 1;
                        tiempo_01 = me_das_tu_ora();
                        break;
                    case R.id.pocas1:
                        matriz[12] = "2";
                        matriz[13] = me_das_tu_ora();
                        seleccion_01 = 2;
                        tiempo_01 = me_das_tu_ora();
                        break;
                    case R.id.consi1:
                        matriz[12] = "3";
                        matriz[13] = me_das_tu_ora();
                        seleccion_01 = 3;
                        tiempo_01 = me_das_tu_ora();
                        break;
                    case R.id.todo1:
                        matriz[12] = "4";
                        matriz[13] = me_das_tu_ora();
                        seleccion_01 = 4;
                        tiempo_01 = me_das_tu_ora();
                        break;

                }
            }
        });

        radioGroupP14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.rara2:
                        matriz[14] = "1";
                        matriz[15] = me_das_tu_ora();
                        seleccion_02 = 1;
                        tiempo_02 = me_das_tu_ora();
                        break;
                    case R.id.pocas2:
                        matriz[14] = "2";
                        matriz[15] = me_das_tu_ora();
                        seleccion_02 = 2;
                        tiempo_02 = me_das_tu_ora();
                        break;
                    case R.id.consi2:
                        matriz[14] = "3";
                        matriz[15] = me_das_tu_ora();
                        seleccion_02 = 3;
                        tiempo_02 = me_das_tu_ora();
                        break;
                    case R.id.todo2:
                        matriz[14] = "4";
                        matriz[15] = me_das_tu_ora();
                        seleccion_02 = 4;
                        tiempo_02 = me_das_tu_ora();
                        break;
                }
            }
        });

        radioGroupP15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.rara3:
                        matriz[16] = "1";
                        matriz[17] = me_das_tu_ora();
                        seleccion_03 = 1;
                        tiempo_03 = me_das_tu_ora();
                        break;
                    case R.id.pocas3:
                        matriz[16] = "2";
                        matriz[17] = me_das_tu_ora();
                        seleccion_03 = 2;
                        tiempo_03 = me_das_tu_ora();
                        break;
                    case R.id.consi3:
                        matriz[16] = "3";
                        matriz[17] = me_das_tu_ora();
                        seleccion_03 = 3;
                        tiempo_03 = me_das_tu_ora();
                        break;
                    case R.id.todo3:
                        matriz[16] = "4";
                        matriz[17] = me_das_tu_ora();
                        seleccion_03 = 4;
                        tiempo_03 = me_das_tu_ora();
                        break;
                }
            }
        });

        radioGroupP16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.rara4:
                        matriz[18] = "1";
                        matriz[19] = me_das_tu_ora();
                        seleccion_04 = 1;
                        tiempo_04 = me_das_tu_ora();
                        break;
                    case R.id.pocas4:
                        matriz[18] = "2";
                        matriz[19] = me_das_tu_ora();
                        seleccion_04 = 2;
                        tiempo_04 = me_das_tu_ora();
                        break;
                    case R.id.consi4:
                        matriz[18] = "3";
                        matriz[19] = me_das_tu_ora();
                        seleccion_04 = 3;
                        tiempo_04 = me_das_tu_ora();
                        break;
                    case R.id.todo4:
                        matriz[18] = "4";
                        matriz[19] = me_das_tu_ora();
                        seleccion_04 = 4;
                        tiempo_04 = me_das_tu_ora();
                        break;
                }
            }
        });

        radioGroupP17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.rara5:
                        matriz[20] = "1";
                        matriz[21] = me_das_tu_ora();
                        seleccion_05 = 1;
                        tiempo_05 = me_das_tu_ora();
                        break;
                    case R.id.pocas5:
                        matriz[20] = "2";
                        matriz[21] = me_das_tu_ora();
                        seleccion_05 = 2;
                        tiempo_05 = me_das_tu_ora();
                        break;
                    case R.id.consi5:
                        matriz[20] = "3";
                        matriz[21] = me_das_tu_ora();
                        seleccion_05 = 3;
                        tiempo_05 = me_das_tu_ora();
                        break;
                    case R.id.todo5:
                        matriz[20] = "4";
                        matriz[21] = me_das_tu_ora();
                        seleccion_05 = 4;
                        tiempo_05 = me_das_tu_ora();
                        break;
                }
            }
        });

        radioGroupP18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.rara6:
                        matriz[20] = "1";
                        matriz[21] = me_das_tu_ora();
                        seleccion_06 = 1;
                        tiempo_06 = me_das_tu_ora();
                        break;
                    case R.id.pocas6:
                        matriz[20] = "2";
                        matriz[21] = me_das_tu_ora();
                        seleccion_06 = 2;
                        tiempo_06 = me_das_tu_ora();
                        break;
                    case R.id.consi6:
                        matriz[20] = "3";
                        matriz[21] = me_das_tu_ora();
                        seleccion_06 = 3;
                        tiempo_06 = me_das_tu_ora();
                        break;
                    case R.id.todo6:
                        matriz[20] = "4";
                        matriz[21] = me_das_tu_ora();
                        seleccion_06 = 4;
                        tiempo_06 = me_das_tu_ora();
                        break;
                }
            }
        });

        radioGroupP19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.rara7:
                        matriz[22] = "1";
                        matriz[23] = me_das_tu_ora();
                        seleccion_07 = 1;
                        tiempo_07 = me_das_tu_ora();
                        break;
                    case R.id.pocas7:
                        matriz[22] = "2";
                        matriz[23] = me_das_tu_ora();
                        seleccion_07 = 2;
                        tiempo_07 = me_das_tu_ora();
                        break;
                    case R.id.consi7:
                        matriz[22] = "3";
                        matriz[23] = me_das_tu_ora();
                        seleccion_07 = 3;
                        tiempo_07 = me_das_tu_ora();
                        break;
                    case R.id.todo7:
                        matriz[22] = "4";
                        matriz[23] = me_das_tu_ora();
                        seleccion_07 = 4;
                        tiempo_07 = me_das_tu_ora();
                        break;
                }
            }
        });
    }


    public void sigdepre(View view){
        Intent condepre = new Intent(this,Barthel.class);
        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
        fuenteCuestionarioBasico.open();
        String comando_00 = "UPDATE cuestionariobasico SET";
        String comando_01  = ", pdep_01";
        String comando_02 = ", tpdep_01";
        String comando_03  = ", pdep_02";
        String comando_04 = ", tpdep_02";
        String comando_05  = ", pdep_03";
        String comando_06 = ", tpdep_03";
        String comando_07  = ", pdep_04";
        String comando_08 = ", tpdep_04";
        String comando_09  = ", pdep_05";
        String comando_10 = ", tpdep_05";
        String comando_11  = ", pdep_06";
        String comando_12 = ", tpdep_06";
        String comando_13  = ", pdep_07";
        String comando_14 = ", tpdep_07";
        String comando_50 = " WHERE registro = " + "'" + el_registro + "'";

        fuenteCuestionarioBasico.guardarCaptura_0102(comando_00,
                comando_01, seleccion_01,
                comando_02, tiempo_01,
                comando_03, seleccion_02,
                comando_04, tiempo_02,
                comando_05, seleccion_03,
                comando_06, tiempo_03,
                comando_07, seleccion_04,
                comando_08, tiempo_04,
                comando_09, seleccion_05,
                comando_10, tiempo_05,
                comando_11, seleccion_06,
                comando_12, tiempo_06,
                comando_13, seleccion_07,
                comando_14, tiempo_07,
                comando_50);
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

    public void depresionAbortar(View view)
    {
        Intent depreabortar = new Intent(getApplicationContext(),MainActivity.class);
        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
        fuenteCuestionarioBasico.open();
        String comando_00 = "UPDATE cuestionariobasico SET";
        String comando_01  = ", pdep_01";
        String comando_02 = ", tpdep_01";
        String comando_03  = ", pdep_02";
        String comando_04 = ", tpdep_02";
        String comando_05  = ", pdep_03";
        String comando_06 = ", tpdep_03";
        String comando_07  = ", pdep_04";
        String comando_08 = ", tpdep_04";
        String comando_09  = ", pdep_05";
        String comando_10 = ", tpdep_05";
        String comando_11  = ", pdep_06";
        String comando_12 = ", tpdep_06";
        String comando_13  = ", pdep_07";
        String comando_14 = ", tpdep_07";
        String comando_50 = " WHERE registro = " + "'" + el_registro + "'";

        fuenteCuestionarioBasico.guardarCaptura_0102(comando_00,
                comando_01, seleccion_01,
                comando_02, tiempo_01,
                comando_03, seleccion_02,
                comando_04, tiempo_02,
                comando_05, seleccion_03,
                comando_06, tiempo_03,
                comando_07, seleccion_04,
                comando_08, tiempo_04,
                comando_09, seleccion_05,
                comando_10, tiempo_05,
                comando_11, seleccion_06,
                comando_12, tiempo_06,
                comando_13, seleccion_07,
                comando_14, tiempo_07,
                comando_50);
        depreabortar.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        depreabortar.putExtra("EXIT",true);
        startActivity(depreabortar);
    }

    public String me_das_tu_ora() {
        Date date = new Date();
        String cadena_la_hora = "'" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date.getTime()) + "'";
        return cadena_la_hora;
    }
}
