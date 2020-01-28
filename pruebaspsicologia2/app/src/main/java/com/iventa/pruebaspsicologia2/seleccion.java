package com.iventa.pruebaspsicologia2;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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

    RadioGroup radioGroupP1,radioGroupP2,radioGroupP3,radioGroupP4,radioGroupP5;
    RadioGroup radioGroupP6,radioGroupP7,radioGroupP8,radioGroupP9,radioGroupP10;
    RadioGroup radioGroupP11,radioGroupP12;

    private String seleccion_fecha;
    private String seleccion_hora_ini;
    private String seleccion_fechor_ini;

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
    private int seleccion_08;
    private String tiempo_08;
    private int seleccion_09;
    private String tiempo_09;
    private int seleccion_10;
    private String tiempo_10;
    private int seleccion_11;
    private String tiempo_11;
    private int seleccion_12;
    private String tiempo_12;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion);

        Date date = new Date();
        seleccion_fecha = "'" + new SimpleDateFormat("yyyy-MM-dd").format(date.getTime()) + "'";
        seleccion_hora_ini = "'" + new SimpleDateFormat("HH:mm:ss").format(date.getTime()) + "'";

        radioGroupP1 = (RadioGroup)findViewById(R.id.radioGroupP1);
        radioGroupP2 = (RadioGroup)findViewById(R.id.radioGroupP2);
        radioGroupP3 = (RadioGroup)findViewById(R.id.radioGroupP3);
        radioGroupP4 = (RadioGroup)findViewById(R.id.radioGroupP4);
        radioGroupP5 = (RadioGroup)findViewById(R.id.radioGroupP5);
        radioGroupP6 = (RadioGroup)findViewById(R.id.radioGroupP6);
        radioGroupP7 = (RadioGroup)findViewById(R.id.radioGroupP7);
        radioGroupP8 = (RadioGroup)findViewById(R.id.radioGroupP8);
        radioGroupP9 = (RadioGroup)findViewById(R.id.radioGroupP9);
        radioGroupP10 = (RadioGroup)findViewById(R.id.radioGroupP10);
        radioGroupP11 = (RadioGroup)findViewById(R.id.radioGroupP11);
        radioGroupP12 = (RadioGroup)findViewById(R.id.radioGroupP12);
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

        final String matriz[] = fuenteCuestionarioBasico.abrirSeleccion_0101(comando_1);
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

        radioGroupP1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.nunca1:
                        matriz[12] = "1";
                        matriz[13] = me_das_tu_ora();
                        seleccion_01 = 1;
                        break;
                    case R.id.muy1:
                        matriz[12] = "2";
                        matriz[13] = me_das_tu_ora();
                        seleccion_01 = 2;
                        break;
                    case R.id.algun1:
                        matriz[12] = "3";
                        matriz[13] = me_das_tu_ora();
                        seleccion_01 = 3;
                        break;
                    case R.id.casi1:
                        matriz[12] = "4";
                        matriz[13] = me_das_tu_ora();
                        seleccion_01 = 4;
                        break;
                    case R.id.siempre1:
                        matriz[12] = "5";
                        matriz[13] = me_das_tu_ora();
                        seleccion_01 = 5;
                        break;
                }
            }
        });

        radioGroupP2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.nunca2:
                        matriz[14] = "1";
                        matriz[15] = me_das_tu_ora();
                        seleccion_02 = 1;
                        break;
                    case R.id.muy2:
                        matriz[14] = "2";
                        matriz[15] = me_das_tu_ora();
                        seleccion_02 = 2;
                        break;
                    case R.id.algun2:
                        matriz[14] = "3";
                        matriz[15] = me_das_tu_ora();
                        seleccion_02 = 3;
                    case R.id.casi2:
                        matriz[14] = "4";
                        matriz[15] = me_das_tu_ora();
                        seleccion_02 = 4;
                        break;
                    case R.id.siempre2:
                        matriz[14] = "5";
                        matriz[15] = me_das_tu_ora();
                        seleccion_02 = 5;
                        break;
                }
            }
        });

        radioGroupP3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.nunca3:
                        matriz[16] = "1";
                        matriz[17] = me_das_tu_ora();
                        seleccion_03 = 1;
                        break;
                    case R.id.muy3:
                        matriz[16] = "2";
                        matriz[17] = me_das_tu_ora();
                        seleccion_03 = 2;
                        break;
                    case R.id.algun3:
                        matriz[16] = "3";
                        matriz[17] = me_das_tu_ora();
                        seleccion_03 = 3;
                    case R.id.casi3:
                        matriz[16] = "4";
                        matriz[17] = me_das_tu_ora();
                        seleccion_03 = 4;
                        break;
                    case R.id.siempre3:
                        matriz[16] = "5";
                        matriz[17] = me_das_tu_ora();
                        seleccion_03 = 5;
                        break;
                }
            }
        });

        radioGroupP4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.nunca4:
                        matriz[18] = "1";
                        matriz[19] = me_das_tu_ora();
                        seleccion_04 = 1;
                        break;
                    case R.id.muy4:
                        matriz[18] = "2";
                        matriz[19] = me_das_tu_ora();
                        seleccion_04 = 2;
                        break;
                    case R.id.algun4:
                        matriz[18] = "3";
                        matriz[19] = me_das_tu_ora();
                        seleccion_04 = 3;
                    case R.id.casi4:
                        matriz[18] = "4";
                        matriz[19] = me_das_tu_ora();
                        seleccion_04 = 4;
                        break;
                    case R.id.siempre4:
                        matriz[18] = "5";
                        matriz[19] = me_das_tu_ora();
                        seleccion_04 = 5;
                        break;
                }
            }
        });

        radioGroupP5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.nunca5:
                        matriz[20] = "1";
                        matriz[21] = me_das_tu_ora();
                        seleccion_05 = 1;
                        break;
                    case R.id.muy5:
                        matriz[20] = "2";
                        matriz[21] = me_das_tu_ora();
                        seleccion_05 = 2;
                        break;
                    case R.id.algun5:
                        matriz[20] = "3";
                        matriz[21] = me_das_tu_ora();
                        seleccion_05 = 3;
                    case R.id.casi5:
                        matriz[20] = "4";
                        matriz[21] = me_das_tu_ora();
                        seleccion_05 = 4;
                        break;
                    case R.id.siempre5:
                        matriz[20] = "5";
                        matriz[21] = me_das_tu_ora();
                        seleccion_05 = 5;
                        break;
                }
            }
        });

        radioGroupP6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.nunca6:
                        matriz[22] = "1";
                        matriz[23] = me_das_tu_ora();
                        seleccion_06 = 1;
                        break;
                    case R.id.muy6:
                        matriz[22] = "2";
                        matriz[23] = me_das_tu_ora();
                        seleccion_06 = 2;
                        break;
                    case R.id.algun6:
                        matriz[22] = "3";
                        matriz[23] = me_das_tu_ora();
                        seleccion_06 = 3;
                    case R.id.casi6:
                        matriz[22] = "4";
                        matriz[23] = me_das_tu_ora();
                        seleccion_06 = 4;
                        break;
                    case R.id.siempre6:
                        matriz[22] = "5";
                        matriz[23] = me_das_tu_ora();
                        seleccion_06 = 5;
                        break;
                }
            }
        });

        radioGroupP7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.nunca7:
                        matriz[24] = "1";
                        matriz[25] = me_das_tu_ora();
                        seleccion_07 = 1;
                        break;
                    case R.id.muy7:
                        matriz[24] = "2";
                        matriz[25] = me_das_tu_ora();
                        seleccion_07 = 2;
                        break;
                    case R.id.algun7:
                        matriz[24] = "3";
                        matriz[25] = me_das_tu_ora();
                        seleccion_07 = 3;
                    case R.id.casi7:
                        matriz[24] = "4";
                        matriz[25] = me_das_tu_ora();
                        seleccion_07 = 4;
                        break;
                    case R.id.siempre7:
                        matriz[24] = "5";
                        matriz[25] = me_das_tu_ora();
                        seleccion_07 = 5;
                        break;
                }
            }
        });

        radioGroupP8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.nunca8:
                        matriz[26] = "1";
                        matriz[27] = me_das_tu_ora();
                        seleccion_08 = 1;
                        break;
                    case R.id.muy8:
                        matriz[26] = "2";
                        matriz[27] = me_das_tu_ora();
                        seleccion_08 = 2;
                        break;
                    case R.id.algun8:
                        matriz[26] = "3";
                        matriz[27] = me_das_tu_ora();
                        seleccion_08 = 3;
                    case R.id.casi8:
                        matriz[26] = "4";
                        matriz[27] = me_das_tu_ora();
                        seleccion_08 = 4;
                        break;
                    case R.id.siempre8:
                        matriz[26] = "5";
                        matriz[27] = me_das_tu_ora();
                        seleccion_08 = 5;
                        break;
                }
            }

        });

        radioGroupP9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.nunca9:
                        matriz[28] = "1";
                        matriz[29] = me_das_tu_ora();
                        seleccion_09 = 1;
                        break;
                    case R.id.muy9:
                        matriz[28] = "2";
                        matriz[29] = me_das_tu_ora();
                        seleccion_09 = 2;
                        break;
                    case R.id.algun9:
                        matriz[28] = "3";
                        matriz[29] = me_das_tu_ora();
                        seleccion_09 = 3;
                    case R.id.casi9:
                        matriz[28] = "4";
                        matriz[29] = me_das_tu_ora();
                        seleccion_09 = 4;
                        break;
                    case R.id.siempre9:
                        matriz[28] = "5";
                        matriz[29] = me_das_tu_ora();
                        seleccion_09 = 5;
                        break;
                }
            }
        });

        radioGroupP10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.nunca10:
                        matriz[30] = "1";
                        matriz[31] = me_das_tu_ora();
                        seleccion_10 = 1;
                        break;
                    case R.id.muy10:
                        matriz[30] = "2";
                        matriz[31] = me_das_tu_ora();
                        seleccion_10 = 2;
                        break;
                    case R.id.algun10:
                        matriz[30] = "3";
                        matriz[31] = me_das_tu_ora();
                        seleccion_10 = 3;
                    case R.id.casi10:
                        matriz[30] = "4";
                        matriz[31] = me_das_tu_ora();
                        seleccion_10 = 4;
                        break;
                    case R.id.siempre10:
                        matriz[30] = "5";
                        matriz[31] = me_das_tu_ora();
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
                        matriz[32] = "1";
                        matriz[33] = me_das_tu_ora();
                        seleccion_11 = 1;
                        break;
                    case R.id.muy11:
                        matriz[32] = "2";
                        matriz[33] = me_das_tu_ora();
                        seleccion_11 = 2;
                        break;
                    case R.id.algun11:
                        matriz[32] = "3";
                        matriz[33] = me_das_tu_ora();
                        seleccion_11 = 3;
                    case R.id.casi11:
                        matriz[32] = "4";
                        matriz[33] = me_das_tu_ora();
                        seleccion_11 = 4;
                        break;
                    case R.id.siempre11:
                        matriz[32] = "5";
                        matriz[33] = me_das_tu_ora();
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
                        matriz[34] = "1";
                        matriz[35] = me_das_tu_ora();
                        seleccion_12 = 1;
                        break;
                    case R.id.muy12:
                        matriz[34] = "2";
                        matriz[35] = me_das_tu_ora();
                        seleccion_12 = 2;
                        break;
                    case R.id.algun12:
                        matriz[34] = "3";
                        matriz[35] = me_das_tu_ora();
                        seleccion_12 = 3;
                    case R.id.casi8:
                        matriz[34] = "4";
                        matriz[35] = me_das_tu_ora();
                        seleccion_12 = 4;
                        break;
                    case R.id.siempre12:
                        matriz[34] = "5";
                        matriz[35] = me_das_tu_ora();
                        seleccion_12 = 5;
                        break;
                }
            }
        });
    }


    public void sigsel(View view){
        Intent selint = new Intent(this,Depresion.class);
        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
        fuenteCuestionarioBasico.open();

        String comando_00 = "UPDATE cuestionariobasico SET";
        String comando_01 = "  fecha = ";
        String comando_02 = ", hora_ini = ";
        String comando_03 = ", fechor_ini = ";
        String comando_04 = ", p_01 = ";
        String comando_05 = ", t_01 = ";
        String comando_06 = ", p_02 = ";
        String comando_07 = ", t_02 = ";
        String comando_08 = ", p_03 = ";
        String comando_09 = ", t_03 = ";
        String comando_10 = ", psbp_01 = ";
        String comando_11 = ", tpsbp_01 = ";
        String comando_12 = ", psbp_02 = ";
        String comando_13 = ", tpsbp_02 = ";
        String comando_14 = ", psbp_03 = ";
        String comando_15 = ", tpsbp_03 = ";
        String comando_16 = ", pse_01 = ";
        String comando_17 = ", tpse_01 = ";
        String comando_18 = ", pse_02= ";
        String comando_19 = ", tpse_02 = ";
        String comando_20 = ", pse_03 = ";
        String comando_21 = ", tpse_03 = ";
        String comando_22 = ", pc_01 = ";
        String comando_23 = ", tpc_01 = ";
        String comando_24 = ", pc_02 = ";
        String comando_25 = ", tpc_02 = ";
        String comando_26 = ", pc_03 = ";
        String comando_27 = ", tpc_03 = ";
        String comando_28 = ", encuesto = ";
        String comando_50 = " WHERE registro = " + "'" + el_registro + "'";

        fuenteCuestionarioBasico.guardarCaptura_0101(comando_00,
                 comando_01,  seleccion_fecha,
                 comando_02,  seleccion_hora_ini,
                 comando_03,  seleccion_fechor_ini,
                 comando_04,  seleccion_01,
                 comando_05,  tiempo_01,
                 comando_06, seleccion_02,
                 comando_07, tiempo_02,
                 comando_08,  seleccion_03,
                 comando_09, tiempo_03,
                 comando_10, seleccion_04,
                 comando_11, tiempo_04,
                 comando_12,  seleccion_05,
                 comando_13, tiempo_05,
                 comando_14,  seleccion_06,
                 comando_15, tiempo_06,
                 comando_16,  seleccion_07,
                 comando_17, tiempo_07,
                 comando_18,  seleccion_08,
                 comando_19, tiempo_08,
                 comando_20,  seleccion_09,
                 comando_21, tiempo_09,
                 comando_22,  seleccion_10,
                 comando_23, tiempo_10,
                 comando_24,  seleccion_11,
                 comando_25, tiempo_11,
                 comando_26,  seleccion_12,
                 comando_27, tiempo_12,
                 comando_28, "'" + el_encuesto + "'",
                 comando_50);
        startActivity(selint);
    }

    //Pregunta1
    public void pregunta1(View view){
        boolean checked = ((RadioButton) view).isChecked();//Chequeo

        switch (view.getId()){
            case R.id.nunca1:
                Toast.makeText(this,"1",Toast.LENGTH_LONG).show();
                break;
            case R.id.muy1:
                comandoSql = "INSERT INTO CuestionarioBasico(COLUMNA_P_01) VALUES(2)";
                fuenteCuestionarioBasico.abrirSeleccion_0101(comandoSql);
                Toast.makeText(this,"2",Toast.LENGTH_LONG).show();
                break;
            case R.id.algun1:
                comandoSql = "INSERT INTO CuestionarioBasico(COLUMNA_P_01) VALUES(3)";
                fuenteCuestionarioBasico.abrirSeleccion_0101(comandoSql);
                Toast.makeText(this,"3",Toast.LENGTH_LONG).show();
                break;
            case R.id.casi1:
                comandoSql = "INSERT INTO CuestionarioBasico(COLUMNA_P_01) VALUES(4)";
                fuenteCuestionarioBasico.abrirSeleccion_0101(comandoSql);
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
                comandoSql = "INSERT INTO CuestionarioBasico(COLUMNA_P_02) VALUES(1)";
                fuenteCuestionarioBasico.abrirSeleccion_0101(comandoSql);
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

    public String me_das_tu_ora() {
        Date date = new Date();
        String cadena_la_hora = "'" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date.getTime()) + "'";
        return cadena_la_hora;
    }

    public void abortarSeleccion(View view)
    {
        Intent abortarSelec = new Intent(getApplicationContext(),MainActivity.class);
        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
        fuenteCuestionarioBasico.open();

        String comando_00 = "UPDATE cuestionariobasico SET";
        String comando_01 = "  fecha = ";
        String comando_02 = ", hora_ini = ";
        String comando_03 = ", fechor_ini = ";
        String comando_04 = ", p_01 = ";
        String comando_05 = ", t_01 = ";
        String comando_06 = ", p_02 = ";
        String comando_07 = ", t_02 = ";
        String comando_08 = ", p_03 = ";
        String comando_09 = ", t_03 = ";
        String comando_10 = ", psbp_01 = ";
        String comando_11 = ", tpsbp_01 = ";
        String comando_12 = ", psbp_02 = ";
        String comando_13 = ", tpsbp_02 = ";
        String comando_14 = ", psbp_03 = ";
        String comando_15 = ", tpsbp_03 = ";
        String comando_16 = ", pse_01 = ";
        String comando_17 = ", tpse_01 = ";
        String comando_18 = ", pse_02= ";
        String comando_19 = ", tpse_02 = ";
        String comando_20 = ", pse_03 = ";
        String comando_21 = ", tpse_03 = ";
        String comando_22 = ", pc_01 = ";
        String comando_23 = ", tpc_01 = ";
        String comando_24 = ", pc_02 = ";
        String comando_25 = ", tpc_02 = ";
        String comando_26 = ", pc_03 = ";
        String comando_27 = ", tpc_03 = ";
        String comando_28 = ", encuesto = ";
        String comando_50 = " WHERE registro = " + "'" + el_registro + "'";

        fuenteCuestionarioBasico.guardarCaptura_0101(comando_00,
                comando_01,  seleccion_fecha,
                comando_02,  seleccion_hora_ini,
                comando_03,  seleccion_fechor_ini,
                comando_04,  seleccion_01,
                comando_05,  tiempo_01,
                comando_06, seleccion_02,
                comando_07, tiempo_02,
                comando_08,  seleccion_03,
                comando_09, tiempo_03,
                comando_10, seleccion_04,
                comando_11, tiempo_04,
                comando_12,  seleccion_05,
                comando_13, tiempo_05,
                comando_14,  seleccion_06,
                comando_15, tiempo_06,
                comando_16,  seleccion_07,
                comando_17, tiempo_07,
                comando_18,  seleccion_08,
                comando_19, tiempo_08,
                comando_20,  seleccion_09,
                comando_21, tiempo_09,
                comando_22,  seleccion_10,
                comando_23, tiempo_10,
                comando_24,  seleccion_11,
                comando_25, tiempo_11,
                comando_26,  seleccion_12,
                comando_27, tiempo_12,
                comando_28, "'" + el_encuesto + "'",
                comando_50);
        abortarSelec.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        abortarSelec.putExtra("EXIT",true);
        startActivity(abortarSelec);
    }

}
