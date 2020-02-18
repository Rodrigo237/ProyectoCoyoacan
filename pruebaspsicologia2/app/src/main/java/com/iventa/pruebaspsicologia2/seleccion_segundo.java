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

public class seleccion_segundo extends AppCompatActivity {

    private String seleccion_fecha;
    private String seleccion_hora_ini;
    private String seleccion_fechor_ini;


    RadioGroup radioGroupP10,radioGroupP11,radioGroupP12;
    RadioButton  nunca10,muy10,algun10,casi10,siempre10;
    RadioButton  nunca11,muy11,algun11,casi11,siempre11;
    RadioButton  nunca12,muy12,algun12,casi12,siempre12;

    FuenteCuestionarioBasico fuenteCuestionarioBasico;

    private static String la_tableta;
    private static String el_encuesto;
    private String el_registro;
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
    private String la_fecha;
    private String hora_inicio;
    private String fecha_inicio;
    private int seleccion_10;
    private String tiempo_10;
    private int seleccion_11;
    private String tiempo_11;
    private int seleccion_12;
    private String tiempo_12;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion_segundo);

        Date date = new Date();
        seleccion_fecha = "'" + new SimpleDateFormat("yyyy-MM-dd").format(date.getTime()) + "'";
        seleccion_hora_ini = "'" + new SimpleDateFormat("HH:mm:ss").format(date.getTime()) + "'";

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

        radioGroupP10 = (RadioGroup)findViewById(R.id.radioGroupP10);
        radioGroupP11 = (RadioGroup)findViewById(R.id.radioGroupP11);
        radioGroupP12 = (RadioGroup)findViewById(R.id.radioGroupP12);


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

        final String matriz[] = fuenteCuestionarioBasico.abrirSeleccion_010101(comando_1);
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

        radioGroupP10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.nunca10:
                        matriz[12] = "1";
                        matriz[13] = me_das_tu_ora();
                        seleccion_10 = 1;
                        break;
                    case R.id.muy10:
                        matriz[12] = "2";
                        matriz[13] = me_das_tu_ora();
                        seleccion_10 = 2;
                        break;
                    case R.id.algun10:
                        matriz[12] = "3";
                        matriz[13] = me_das_tu_ora();
                        seleccion_10 = 3;
                        break;
                    case R.id.casi1:
                        matriz[12] = "4";
                        matriz[13] = me_das_tu_ora();
                        seleccion_10 = 4;
                        break;
                    case R.id.siempre10:
                        matriz[12] = "5";
                        matriz[13] = me_das_tu_ora();
                        seleccion_10 = 5;
                        break;
                }
            }
        });

        radioGroupP11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.nunca11:
                        matriz[14] = "1";
                        matriz[15] = me_das_tu_ora();
                        seleccion_11 = 1;
                        break;
                    case R.id.muy11:
                        matriz[14] = "2";
                        matriz[15] = me_das_tu_ora();
                        seleccion_11 = 2;
                        break;
                    case R.id.algun11:
                        matriz[14] = "3";
                        matriz[15] = me_das_tu_ora();
                        seleccion_11 = 3;
                        break;
                    case R.id.casi11:
                        matriz[14] = "4";
                        matriz[15] = me_das_tu_ora();
                        seleccion_11 = 4;
                        break;
                    case R.id.siempre11:
                        matriz[14] = "5";
                        matriz[15] = me_das_tu_ora();
                        seleccion_11 = 5;
                        break;
                }
            }
        });

        radioGroupP12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.nunca12:
                        matriz[16] = "1";
                        matriz[17] = me_das_tu_ora();
                        seleccion_12 = 1;
                        break;
                    case R.id.muy12:
                        matriz[16] = "2";
                        matriz[17] = me_das_tu_ora();
                        seleccion_12 = 2;
                        break;
                    case R.id.algun12:
                        matriz[16] = "3";
                        matriz[17] = me_das_tu_ora();
                        seleccion_12 = 3;
                        break;
                    case R.id.casi12:
                        matriz[16] = "4";
                        matriz[17] = me_das_tu_ora();
                        seleccion_12 = 4;
                        break;
                    case R.id.siempre12:
                        matriz[16] = "5";
                        matriz[17] = me_das_tu_ora();
                        seleccion_12 = 5;
                        break;
                }
            }
        });

    }

    public void siguienteSelec_010101(View view)
    {
        Intent seleccion = new Intent(this,Depresion.class);
        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
        fuenteCuestionarioBasico.open();

        String comando_00 = "UPDATE cuestionariobasico SET";
        String comando_01 = "  fecha = ";
        String comando_02 = ", hora_ini = ";
        String comando_03 = ", fechor_ini = ";
        String comando_04 = ", pc_01 = ";
        String comando_05 = ", tc_01 = ";
        String comando_06 = ", pc_02 = ";
        String comando_07 = ", tc_02 = ";
        String comando_08 = ", pc_03 = ";
        String comando_09 = ", tc_03 = ";
        String comando_28 = ", encuesto = ";
        String comando_50 = " WHERE registro = " + "'" + el_registro + "'";

        fuenteCuestionarioBasico.guardarCaptura_010101(comando_00,
                comando_01,  seleccion_fecha,
                comando_02,  seleccion_hora_ini,
                comando_03,  seleccion_fechor_ini,
                comando_04,  seleccion_10,
                comando_05,  tiempo_10,
                comando_06, seleccion_11,
                comando_07, tiempo_11,
                comando_08,  seleccion_12,
                comando_09, tiempo_12,
                comando_28, "'" + el_encuesto + "'",
                comando_50);

        startActivity(seleccion);
    }

    public String me_das_tu_ora() {
        Date date = new Date();
        String cadena_la_hora = "'" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date.getTime()) + "'";
        return cadena_la_hora;
    }

    public void abortarSeleccionS(View view)
    {
        Intent abortarseleccion = new Intent(this,MainActivity.class);
        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
        fuenteCuestionarioBasico.open();

        String comando_00 = "UPDATE cuestionariobasico SET";
        String comando_01 = "  fecha = ";
        String comando_02 = ", hora_ini = ";
        String comando_03 = ", fechor_ini = ";
        String comando_04 = ", pc_01 = ";
        String comando_05 = ", tc_01 = ";
        String comando_06 = ", pc_02 = ";
        String comando_07 = ", tc_02 = ";
        String comando_08 = ", pc_03 = ";
        String comando_09 = ", tc_03 = ";
        String comando_28 = ", encuesto = ";
        String comando_50 = " WHERE registro = " + "'" + el_registro + "'";

        fuenteCuestionarioBasico.guardarCaptura_010101(comando_00,
                comando_01,  seleccion_fecha,
                comando_02,  seleccion_hora_ini,
                comando_03,  seleccion_fechor_ini,
                comando_04,  seleccion_10,
                comando_05,  tiempo_10,
                comando_06, seleccion_11,
                comando_07, tiempo_11,
                comando_08,  seleccion_12,
                comando_09, tiempo_12,
                comando_28, "'" + el_encuesto + "'",
                comando_50);

        startActivity(abortarseleccion);
    }
}
