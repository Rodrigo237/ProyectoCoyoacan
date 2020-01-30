package com.iventa.pruebaspsicologia2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import com.iventa.pruebaspsicologia2.bases.FuenteCuestionarioBasico;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MiniMentalS extends AppCompatActivity {

    CheckBox Pregunta13R1,Pregunta13R2,Pregunta13R3,Pregunta13R4,Pregunta13R5;
    CheckBox Pregunta14,Pregunta15R1,Pregunta15R2,Pregunta15R3,Pregunta16R1,Pregunta16R2;
    CheckBox Pregunta17,Pregunta18R1,Pregunta18R2,Pregunta18R3,Pregunta19,Pregunta20,Pregunta21;

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
    private int seleccion_01R1;
    private String tiempo_01R1;
    private int seleccion_01R2;
    private String tiempo_01R2;
    private int seleccion_01R3;
    private String tiempo_01R3;
    private int seleccion_01R4;
    private String tiempo_01R4;
    private int seleccion_01R5;
    private String tiempo_01R5;
    private int seleccion_02;
    private String tiempo_02;
    private int seleccion_03R1;
    private String tiempo_03R1;
    private int seleccion_03R2;
    private String tiempo_03R2;
    private int seleccion_03R3;
    private String tiempo_03R3;
    private int seleccion_04R1;
    private String tiempo_04R1;
    private  int seleccion_04R2;
    private String tiempo_04R2;
    private  int seleccion_05;
    private  String tiempo_05;
    private int seleccion_06R1;
    private String tiempo_06R1;
    private int seleccion_06R2;
    private String tiempo_06R2;
    private int seleccion_06R3;
    private String tiempo_06R3;
    private  int seleccion_07;
    private String tiempo_07;
    private  int seleccion_08;
    private String tiempo_08;
    private  int seleccion_09;
    private String tiempo_09;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini_mental_s);

        Pregunta13R1 = (CheckBox)findViewById(R.id.Mini13R1);
        Pregunta13R2 = (CheckBox)findViewById(R.id.Mini13R2);
        Pregunta13R3 = (CheckBox)findViewById(R.id.Mini13R3);
        Pregunta13R4 = (CheckBox)findViewById(R.id.Mini13R4);
        Pregunta13R5 = (CheckBox)findViewById(R.id.Mini13R5);
        Pregunta14 = (CheckBox)findViewById(R.id.Mini14);
        Pregunta15R1 = (CheckBox)findViewById(R.id.Manzana15);
        Pregunta15R2 = (CheckBox)findViewById(R.id.Perro15);
        Pregunta15R3 = (CheckBox)findViewById(R.id.Mesa15);
        Pregunta16R1 = (CheckBox)findViewById(R.id.Lapiz16);
        Pregunta16R2 = (CheckBox)findViewById(R.id.Reloj16);
        Pregunta17 = (CheckBox)findViewById(R.id.Mini17);
        Pregunta18R1 = (CheckBox)findViewById(R.id.Mini18R1);
        Pregunta18R2 = (CheckBox)findViewById(R.id.Mini18R2);
        Pregunta18R3 = (CheckBox)findViewById(R.id.Mini18R3);
        Pregunta19 = (CheckBox)findViewById(R.id.Mini19);
        Pregunta20 = (CheckBox)findViewById(R.id.Mini20);
        Pregunta21 = (CheckBox)findViewById(R.id.Mini21);

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


        if (Pregunta13R1.isChecked())
        {
            matriz[12] = "1";
            matriz[13] = me_das_tu_ora();
            seleccion_01R1 = 1;
            tiempo_01R1 = me_das_tu_ora();
        }else if (!Pregunta13R1.isChecked()) {
            matriz[12] = "0";
            matriz[13] = me_das_tu_ora();
            seleccion_01R1 = 0;
            tiempo_01R1 = me_das_tu_ora();
        }

        if (Pregunta13R2.isChecked())
        {
            matriz[14] = "1";
            matriz[15] = me_das_tu_ora();
            seleccion_01R2 = 1;
            tiempo_01R2 = me_das_tu_ora();
        }else if (!Pregunta13R2.isChecked())
        {
            matriz[14] = "0";
            matriz[15] = me_das_tu_ora();
            seleccion_01R2 = 0;
            tiempo_01R2 = me_das_tu_ora();
        }

        if (Pregunta13R3.isChecked())
        {
            matriz[16] = "1";
            matriz[17] = me_das_tu_ora();
            seleccion_01R3 = 1;
            tiempo_01R3 = me_das_tu_ora();
        }else if (!Pregunta13R4.isChecked())
        {
            matriz[16] = "0";
            matriz[17] = me_das_tu_ora();
            seleccion_01R4 = 0;
            tiempo_01R4 = me_das_tu_ora();
        }

        if (Pregunta13R5.isChecked())
        {
            matriz[18] = "1";
            matriz[19] = me_das_tu_ora();
            seleccion_01R5 = 1;
            tiempo_01R5 = me_das_tu_ora();
        }else if (!Pregunta13R5.isChecked())
        {
            matriz[18] = "0";
            matriz[19] = me_das_tu_ora();
            seleccion_01R5 = 0;
            tiempo_01R5 = me_das_tu_ora();
        }

        if (Pregunta14.isChecked())
        {
            matriz[20] = "1";
            matriz[21] = me_das_tu_ora();
            seleccion_02 = 1;
            tiempo_02 = me_das_tu_ora();
        }else if (!Pregunta14.isChecked())
        {
            matriz[20] = "0";
            matriz[21] = me_das_tu_ora();
            seleccion_02 = 0;
            tiempo_02 = me_das_tu_ora();
        }

        if (Pregunta15R1.isChecked())
        {
            matriz[22] = "1";
            matriz[23] = me_das_tu_ora();
            seleccion_03R1 = 1;
            tiempo_03R1 = me_das_tu_ora();
        }else if (!Pregunta15R1.isChecked())
        {
            matriz[22] = "0";
            matriz[23] = me_das_tu_ora();
            seleccion_03R1 = 0;
            tiempo_03R1 = me_das_tu_ora();
        }

        if (Pregunta15R2.isChecked())
        {
            matriz[24] = "1";
            matriz[25] = me_das_tu_ora();
            seleccion_03R2 = 1;
            tiempo_03R2 = me_das_tu_ora();
        }else if (!Pregunta15R2.isChecked())
        {
            matriz[24] = "0";
            matriz[25] = me_das_tu_ora();
            seleccion_03R2 = 0;
            tiempo_03R2 = me_das_tu_ora();
        }

        if (Pregunta15R3.isChecked())
        {
            matriz[26] = "1";
            matriz[27] = me_das_tu_ora();
            seleccion_03R3 = 1;
            tiempo_03R3 = me_das_tu_ora();
        }else if (!Pregunta15R3.isChecked())
        {
            matriz[26] = "0";
            matriz[27] = me_das_tu_ora();
            seleccion_03R3 = 0;
            tiempo_03R3 = me_das_tu_ora();
        }

        if (Pregunta16R1.isChecked())
        {
            matriz[28] = "1";
            matriz[29] = me_das_tu_ora();
            seleccion_04R1 = 1;
            tiempo_04R1 = me_das_tu_ora();
        }else if (!Pregunta16R1.isChecked())
        {
            matriz[28] = "0";
            matriz[29] = me_das_tu_ora();
            seleccion_04R1 = 0;
            tiempo_04R1 = me_das_tu_ora();
        }

        if (Pregunta16R2.isChecked())
        {
            matriz[30] = "1";
            matriz[31] = me_das_tu_ora();
            seleccion_04R2 = 1;
            tiempo_04R2 = me_das_tu_ora();
        }else if (!Pregunta16R2.isChecked())
        {
            matriz[30] = "0";
            matriz[31] = me_das_tu_ora();
            seleccion_04R2 = 0;
            tiempo_04R2 = me_das_tu_ora();
        }

        if (Pregunta17.isChecked())
        {
            matriz[32] = "1";
            matriz[33] = me_das_tu_ora();
            seleccion_05 = 1;
            tiempo_05 = me_das_tu_ora();
        }else if (!Pregunta17.isChecked())
        {
            matriz[32] = "0";
            matriz[33] = me_das_tu_ora();
            seleccion_05 = 0;
            tiempo_05 = me_das_tu_ora();
        }

        if (Pregunta18R1.isChecked())
        {
            matriz[33] = "1";
            matriz[34] = me_das_tu_ora();
            seleccion_06R1 = 1;
            tiempo_06R1 = me_das_tu_ora();
        }else if (!Pregunta18R1.isChecked())
        {
            matriz[33] = "0";
            matriz[34] = me_das_tu_ora();
            seleccion_06R1 = 0;
            tiempo_06R1 = me_das_tu_ora();
        }

        if (Pregunta18R2.isChecked())
        {
            matriz[35] = "1";
            matriz[36] = me_das_tu_ora();
            seleccion_06R2 = 1;
            tiempo_06R2 = me_das_tu_ora();
        }else if (!Pregunta18R2.isChecked())
        {
            matriz[35] = "0";
            matriz[36] = me_das_tu_ora();
            seleccion_06R2 = 0;
            tiempo_06R2 = me_das_tu_ora();
        }

        if (Pregunta18R3.isChecked())
        {
            matriz[37] = "1";
            matriz[38] = me_das_tu_ora();
            seleccion_06R3 = 1;
            tiempo_06R3 = me_das_tu_ora();
        }else if (!Pregunta18R3.isChecked())
        {
            matriz[37] = "0";
            matriz[38] = me_das_tu_ora();
            seleccion_06R3 = 0;
            tiempo_06R3 = me_das_tu_ora();
        }

        if (Pregunta19.isChecked())
        {
            matriz[39] = "1";
            matriz[40] = me_das_tu_ora();
            seleccion_07 = 1;
            tiempo_07 = me_das_tu_ora();
        }else if (!Pregunta19.isChecked())
        {
            matriz[39] = "0";
            matriz[40] = me_das_tu_ora();
            seleccion_07 = 0;
            tiempo_07 = me_das_tu_ora();
        }
        if (Pregunta20.isChecked())
        {
            matriz[39] = "1";
            matriz[40] = me_das_tu_ora();
            seleccion_08 = 1;
            tiempo_08 = me_das_tu_ora();
        }else if (!Pregunta20.isChecked())
        {
            matriz[39] = "0";
            matriz[40] = me_das_tu_ora();
            seleccion_08 = 0;
            tiempo_08 = me_das_tu_ora();
        }
        if (Pregunta21.isChecked())
        {
            matriz[39] = "1";
            matriz[40] = me_das_tu_ora();
            seleccion_09 = 1;
            tiempo_09 = me_das_tu_ora();
        }else if (!Pregunta21.isChecked())
        {
            matriz[39] = "0";
            matriz[40] = me_das_tu_ora();
            seleccion_09 = 0;
            tiempo_09 = me_das_tu_ora();
        }


    }

    public void miniMentalFinalizar(View view)
    {
        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
        fuenteCuestionarioBasico.open();
        String comando_00 = "UPDATE cuestionariobasico SET";
        String comando_01  = ", mi_13r1";
        String comando_02 = ", tmi_13r1";
        String comando_03  = ", mi_13r2";
        String comando_04 = ", tmi_13r2";
        String comando_05  = ", mi_13r3";
        String comando_06 = ", tmi_13r3";
        String comando_07  = ", mi_13r4";
        String comando_08 = ", tmi_13r4";
        String comando_09  = ", mi_13r5";
        String comando_10 = ", tmi_13r5";
        String comando_11  = ", mi_14";
        String comando_12 = ", tmi_14";
        String comando_13  = ", mi_15r1";
        String comando_14 = ", tmi_15r1";
        String comando_15 = ", mi_15r2";
        String comando_16 = ", tmi_15r2";
        String comando_17 = ", mi_15r3";
        String comando_18 = ", tmi_15r3";
        String comando_19 = ", mi_16r1";
        String comando_20 = ", tmi_16r1";
        String comando_21 = ", mi_16r2";
        String comando_22 = ", tmi_16r2";
        String comando_23 = ", mi_17";
        String comando_24 = ", tmi_17";
        String comando_25 = "mi_18r1";
        String comando_26 = "tmi_18r1";
        String comando_27 = "mi_18r2";
        String comando_28 = "tmi_18r2";
        String comando_29 = "mi_18r3";
        String comando_30 = "tmi_18r3";
        String comando_31 = ", mi_19";
        String comando_32 = ", tmi_19";
        String comando_33 = ", mi_20";
        String comando_34 = ", tmi_20";
        String comando_35 = ", mi_21";
        String comando_36 = ", tmi_21";
        String comando_50 = " WHERE registro = " + "'" + el_registro + "'";

    }

    public void miniMentalSAbortar(View view)
    {
        Intent minimentalAbort = new Intent(getApplicationContext(),MainActivity.class);
        minimentalAbort.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        minimentalAbort.putExtra("EXIT",true);
        startActivity(minimentalAbort);
    }

    public String me_das_tu_ora() {
        Date date = new Date();
        String cadena_la_hora = "'" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date.getTime()) + "'";
        return cadena_la_hora;
    }
}
