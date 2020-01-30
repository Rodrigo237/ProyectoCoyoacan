package com.iventa.pruebaspsicologia2;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import com.iventa.pruebaspsicologia2.bases.FuenteCuestionarioBasico;

import java.text.SimpleDateFormat;
import java.util.Date;


public class MiniMentalP extends AppCompatActivity {


    CheckBox Pregunta1,Pregunta2,Pregunta3,Pregunta4,Pregunta5;
    CheckBox Pregunta6,Pregunta7,Pregunta8,Pregunta9,Pregunta10;
    CheckBox Pregunta11,Pregunta12R1,Pregunta12R2,Pregunta12R3;

    FuenteCuestionarioBasico fuenteCuestionarioBasico;

    private String el_registro;
    private static String la_tableta;
    private static String el_encuesto;
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
    private int seleccion_08;
    private String tiempo_08;
    private  int seleccion_09;
    private String tiempo_09;
    private  int seleccion_10;
    private  String tiempo_10;
    private int seleccion_11;
    private String tiempo_11;
    private int seleccion_12R1;
    private String tiempo_12R1;
    private int seleccion_12R2;
    private String tiempo_12R2;
    private  int seleccion_12R3;
    private String tiempo_12R3;
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

        final String matriz[] = fuenteCuestionarioBasico.abrirSeleccion_0201(comando_1);
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



        if (Pregunta1.isChecked())
        {
            matriz[12] = "1";
            matriz[13] = me_das_tu_ora();
            seleccion_01 = 1;
            tiempo_01 = me_das_tu_ora();
        }else if (!Pregunta1.isChecked()) {
            matriz[12] = "0";
            matriz[13] = me_das_tu_ora();
            seleccion_01 = 0;
            tiempo_01 = me_das_tu_ora();
        }

        if (Pregunta2.isChecked())
        {
            matriz[14] = "1";
            matriz[15] = me_das_tu_ora();
            seleccion_02 = 1;
            tiempo_02 = me_das_tu_ora();
        }else if (!Pregunta2.isChecked())
        {
            matriz[14] = "0";
            matriz[15] = me_das_tu_ora();
            seleccion_02 = 0;
            tiempo_02 = me_das_tu_ora();
        }

        if (Pregunta3.isChecked())
        {
            matriz[16] = "1";
            matriz[17] = me_das_tu_ora();
            seleccion_03 = 1;
            tiempo_03 = me_das_tu_ora();
        }else if (!Pregunta3.isChecked())
        {
            matriz[16] = "0";
            matriz[17] = me_das_tu_ora();
            seleccion_03 = 0;
            tiempo_03 = me_das_tu_ora();
        }

        if (Pregunta4.isChecked())
        {
            matriz[18] = "1";
            matriz[19] = me_das_tu_ora();
            seleccion_04 = 1;
            tiempo_04 = me_das_tu_ora();
        }else if (!Pregunta4.isChecked())
        {
            matriz[18] = "0";
            matriz[19] = me_das_tu_ora();
            seleccion_04 = 0;
            tiempo_04 = me_das_tu_ora();
        }

        if (Pregunta5.isChecked())
        {
            matriz[20] = "1";
            matriz[21] = me_das_tu_ora();
            seleccion_05 = 1;
            tiempo_05 = me_das_tu_ora();
        }else if (!Pregunta5.isChecked())
        {
            matriz[20] = "0";
            matriz[21] = me_das_tu_ora();
            seleccion_05 = 0;
            tiempo_05 = me_das_tu_ora();
        }

        if (Pregunta6.isChecked())
        {
            matriz[22] = "1";
            matriz[23] = me_das_tu_ora();
            seleccion_06 = 1;
            tiempo_06 = me_das_tu_ora();
        }else if (!Pregunta6.isChecked())
        {
            matriz[22] = "0";
            matriz[23] = me_das_tu_ora();
            seleccion_06 = 0;
            tiempo_06 = me_das_tu_ora();
        }

        if (Pregunta7.isChecked())
        {
            matriz[24] = "1";
            matriz[25] = me_das_tu_ora();
            seleccion_07 = 1;
            tiempo_07 = me_das_tu_ora();
        }else if (!Pregunta7.isChecked())
        {
            matriz[24] = "0";
            matriz[25] = me_das_tu_ora();
            seleccion_07 = 0;
            tiempo_07 = me_das_tu_ora();
        }

        if (Pregunta8.isChecked())
        {
            matriz[26] = "1";
            matriz[27] = me_das_tu_ora();
            seleccion_08 = 1;
            tiempo_08 = me_das_tu_ora();
        }else if (!Pregunta2.isChecked())
        {
            matriz[26] = "0";
            matriz[27] = me_das_tu_ora();
            seleccion_08 = 0;
            tiempo_08 = me_das_tu_ora();
        }

        if (Pregunta9.isChecked())
        {
            matriz[28] = "1";
            matriz[29] = me_das_tu_ora();
            seleccion_09 = 1;
            tiempo_09 = me_das_tu_ora();
        }else if (!Pregunta9.isChecked())
        {
            matriz[28] = "0";
            matriz[29] = me_das_tu_ora();
            seleccion_09 = 0;
            tiempo_09 = me_das_tu_ora();
        }

        if (Pregunta10.isChecked())
        {
            matriz[30] = "1";
            matriz[31] = me_das_tu_ora();
            seleccion_10 = 1;
            tiempo_10 = me_das_tu_ora();
        }else if (!Pregunta10.isChecked())
        {
            matriz[30] = "0";
            matriz[31] = me_das_tu_ora();
            seleccion_10 = 0;
            tiempo_10 = me_das_tu_ora();
        }

        if (Pregunta11.isChecked())
        {
            matriz[32] = "1";
            matriz[33] = me_das_tu_ora();
            seleccion_11 = 1;
            tiempo_11 = me_das_tu_ora();
        }else if (!Pregunta11.isChecked())
        {
            matriz[32] = "0";
            matriz[33] = me_das_tu_ora();
            seleccion_11 = 0;
            tiempo_11 = me_das_tu_ora();
        }

        if (Pregunta12R1.isChecked())
        {
            matriz[33] = "1";
            matriz[34] = me_das_tu_ora();
            seleccion_12R1 = 1;
            tiempo_12R1 = me_das_tu_ora();
        }else if (!Pregunta12R1.isChecked())
        {
            matriz[33] = "0";
            matriz[34] = me_das_tu_ora();
            seleccion_12R1 = 0;
            tiempo_12R1 = me_das_tu_ora();
        }

        if (Pregunta12R2.isChecked())
        {
            matriz[35] = "1";
            matriz[36] = me_das_tu_ora();
            seleccion_12R2 = 1;
            tiempo_12R2 = me_das_tu_ora();
        }else if (!Pregunta12R2.isChecked())
        {
            matriz[35] = "0";
            matriz[36] = me_das_tu_ora();
            seleccion_12R2 = 0;
            tiempo_12R2 = me_das_tu_ora();
        }

        if (Pregunta12R3.isChecked())
        {
            matriz[37] = "1";
            matriz[38] = me_das_tu_ora();
            seleccion_12R3 = 1;
            tiempo_12R3 = me_das_tu_ora();
        }else if (!Pregunta12R3.isChecked())
        {
            matriz[37] = "0";
            matriz[38] = me_das_tu_ora();
            seleccion_12R3 = 0;
            tiempo_12R3 = me_das_tu_ora();
        }

    }

    public void miniSiguienteP(View view)
    {
        Intent minisiguiente = new Intent(this,MiniMentalS.class);
        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
        fuenteCuestionarioBasico.open();
        String comando_00 = "UPDATE cuestionariobasico SET";
        String comando_01  = ", mi_01";
        String comando_02 = ", tmi_01";
        String comando_03  = ", mi_02";
        String comando_04 = ", tmi_02";
        String comando_05  = ", mi_03";
        String comando_06 = ", tmi_03";
        String comando_07  = ", mi_04";
        String comando_08 = ", tmi_04";
        String comando_09  = ", mi_05";
        String comando_10 = ", tmi_05";
        String comando_11  = ", mi_06";
        String comando_12 = ", tmi_06";
        String comando_13  = ", mi_07";
        String comando_14 = ", tmi_07";
        String comando_15 = ", mi_08";
        String comando_16 = ", tmi_08";
        String comando_17 = ", mi_09";
        String comando_18 = ", tmi_09";
        String comando_19 = ", mi_10";
        String comando_20 = ", tmi_10";
        String comando_21 = ", mi_11";
        String comando_22 = ", tmi_11";
        String comando_23 = ", mi_12r1";
        String comando_24 = ", tmi_12r1";
        String comando_25 = "mi_12r2";
        String comando_26 = "tmi_12r2";
        String comando_27 = "mi_12r3";
        String comando_28 = "tmi_12r3";
        String comando_50 = " WHERE registro = " + "'" + el_registro + "'";

        fuenteCuestionarioBasico.guardarCaptura_0201(comando_00,
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
                comando_15, seleccion_08,
                comando_16, tiempo_08,
                comando_17, seleccion_09,
                comando_18, tiempo_09,
                comando_19, seleccion_10,
                comando_20, tiempo_10,
                comando_21, seleccion_11,
                comando_22, tiempo_11,
                comando_23, seleccion_12R1,
                comando_24,tiempo_12R1,
                comando_25, seleccion_12R2,
                comando_26, tiempo_12R2,
                comando_27,seleccion_12R3,
                comando_28,tiempo_12R3,
                comando_50);
        startActivity(minisiguiente);
    }

    public void miniMentalPAbortar(View view)
    {
        Intent miniMAbortar = new Intent(getApplicationContext(),MainActivity.class);
        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
        fuenteCuestionarioBasico.open();
        String comando_00 = "UPDATE cuestionariobasico SET";
        String comando_01  = ", mi_01";
        String comando_02 = ", tmi_01";
        String comando_03  = ", mi_02";
        String comando_04 = ", tmi_02";
        String comando_05  = ", mi_03";
        String comando_06 = ", tmi_03";
        String comando_07  = ", mi_04";
        String comando_08 = ", tmi_04";
        String comando_09  = ", mi_05";
        String comando_10 = ", tmi_05";
        String comando_11  = ", mi_06";
        String comando_12 = ", tmi_06";
        String comando_13  = ", mi_07";
        String comando_14 = ", tmi_07";
        String comando_15 = ", mi_08";
        String comando_16 = ", tmi_08";
        String comando_17 = ", mi_09";
        String comando_18 = ", tmi_09";
        String comando_19 = ", mi_10";
        String comando_20 = ", tmi_10";
        String comando_21 = ", mi_11";
        String comando_22 = ", tmi_11";
        String comando_23 = ", mi_12r1";
        String comando_24 = ", tmi_12r1";
        String comando_25 = "mi_12r2";
        String comando_26 = "tmi_12r2";
        String comando_27 = "mi_12r3";
        String comando_28 = "tmi_12r3";
        String comando_50 = " WHERE registro = " + "'" + el_registro + "'";

        fuenteCuestionarioBasico.guardarCaptura_0201(comando_00,
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
                comando_15, seleccion_08,
                comando_16, tiempo_08,
                comando_17, seleccion_09,
                comando_18, tiempo_09,
                comando_19, seleccion_10,
                comando_20, tiempo_10,
                comando_21, seleccion_11,
                comando_22, tiempo_11,
                comando_23, seleccion_12R1,
                comando_24,tiempo_12R1,
                comando_25, seleccion_12R2,
                comando_26, tiempo_12R2,
                comando_27,seleccion_12R3,
                comando_28,tiempo_12R3,
                comando_50);
        miniMAbortar.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        miniMAbortar.putExtra("EXIT",true);
        startActivity(miniMAbortar);
    }

    public String me_das_tu_ora() {
        Date date = new Date();
        String cadena_la_hora = "'" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date.getTime()) + "'";
        return cadena_la_hora;
    }
}
