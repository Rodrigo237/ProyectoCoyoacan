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

    RadioGroup radioGroupP20,radioGroupP21,radioGroupP22,radioGroupP23,radioGroupP24,radioGroupP25;
    RadioGroup radioGroupP26,radioGroupP27,radioGroupP28,radioGroupP29;
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
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barthel);

        Date date = new Date();
        seleccion_fecha = "'" + new SimpleDateFormat("yyyy-MM-dd").format(date.getTime()) + "'";
        seleccion_hora_ini = "'" + new SimpleDateFormat("HH:mm:ss").format(date.getTime()) + "'";


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

        radioGroupP20 = (RadioGroup)findViewById(R.id.radioGroupP20);
        radioGroupP21 = (RadioGroup)findViewById(R.id.radioGroupP21);
        radioGroupP22 = (RadioGroup)findViewById(R.id.radioGroupP22);
        radioGroupP23 = (RadioGroup)findViewById(R.id.radioGroupP23);
        radioGroupP24 = (RadioGroup)findViewById(R.id.radioGroupP24);
        radioGroupP25 = (RadioGroup)findViewById(R.id.radioGroupP25);
        radioGroupP26 = (RadioGroup)findViewById(R.id.radioGroupP26);
        radioGroupP27 = (RadioGroup)findViewById(R.id.radioGroupP27);
        radioGroupP28 = (RadioGroup)findViewById(R.id.radioGroupP28);
        radioGroupP29 = (RadioGroup)findViewById(R.id.radioGroupP29);

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

        final String matriz[] = fuenteCuestionarioBasico.abrirSeleccion_0104(comando_1);
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

        radioGroupP20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.indep1:
                        matriz[12] = "1";
                        matriz[13] = me_das_tu_ora();
                        seleccion_01 = 1;
                        tiempo_01 = me_das_tu_ora();
                        break;
                    case R.id.depen1:
                        matriz[12] = "2";
                        matriz[13] = me_das_tu_ora();
                        seleccion_01 = 2;
                        tiempo_01 = me_das_tu_ora();
                        break;

                }
            }
        });
        radioGroupP21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.indep2:
                        matriz[14] = "1";
                        matriz[15] = me_das_tu_ora();
                        seleccion_02 = 1;
                        tiempo_02 = me_das_tu_ora();
                        break;
                    case R.id.ayu2:
                        matriz[14] = "2";
                        matriz[15] = me_das_tu_ora();
                        seleccion_02 = 2;
                        tiempo_02 = me_das_tu_ora();
                        break;
                    case R.id.depen2:
                        matriz[14] = "3";
                        matriz[15] = me_das_tu_ora();
                        seleccion_02 = 2;
                        tiempo_02 = me_das_tu_ora();
                        break;

                }
            }
        });

        radioGroupP22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.indep3:
                        matriz[16] = "1";
                        matriz[17] = me_das_tu_ora();
                        seleccion_03 = 1;
                        tiempo_03 = me_das_tu_ora();
                        break;
                    case R.id.depen3:
                        matriz[16] = "2";
                        matriz[17] = me_das_tu_ora();
                        seleccion_03 = 2;
                        tiempo_03 = me_das_tu_ora();
                        break;

                }
            }
        });

        radioGroupP23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.indep4:
                        matriz[18] = "1";
                        matriz[19] = me_das_tu_ora();
                        seleccion_04 = 1;
                        tiempo_04 = me_das_tu_ora();
                        break;
                    case R.id.ayu4:
                        matriz[18] = "2";
                        matriz[19] = me_das_tu_ora();
                        seleccion_04 = 2;
                        tiempo_04 = me_das_tu_ora();
                    case R.id.depen4:
                        matriz[16] = "3";
                        matriz[17] = me_das_tu_ora();
                        seleccion_04 = 3;
                        tiempo_04 = me_das_tu_ora();
                        break;

                }
            }
        });

        radioGroupP24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.indep5:
                        matriz[20] = "1";
                        matriz[21] = me_das_tu_ora();
                        seleccion_05 = 1;
                        tiempo_05 = me_das_tu_ora();
                        break;
                    case R.id.ayu5:
                        matriz[20] = "2";
                        matriz[21] = me_das_tu_ora();
                        seleccion_05 = 2;
                        tiempo_05 = me_das_tu_ora();
                    case R.id.depen5:
                        matriz[20] = "3";
                        matriz[21] = me_das_tu_ora();
                        seleccion_05 = 3;
                        tiempo_05 = me_das_tu_ora();
                        break;

                }
            }
        });

        radioGroupP25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.indep6:
                        matriz[22] = "1";
                        matriz[23] = me_das_tu_ora();
                        seleccion_06 = 1;
                        tiempo_06 = me_das_tu_ora();
                        break;
                    case R.id.minayu6:
                        matriz[22] = "2";
                        matriz[23] = me_das_tu_ora();
                        seleccion_06 = 2;
                        tiempo_06 = me_das_tu_ora();
                    case R.id.granayu6:
                        matriz[22] = "3";
                        matriz[23] = me_das_tu_ora();
                        seleccion_06 = 3;
                        tiempo_06 = me_das_tu_ora();
                        break;

                }
            }
        });

        radioGroupP26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.indep7:
                        matriz[24] = "1";
                        matriz[25] = me_das_tu_ora();
                        seleccion_07 = 1;
                        tiempo_07 = me_das_tu_ora();
                        break;
                    case R.id.ayu7:
                        matriz[24] = "2";
                        matriz[25] = me_das_tu_ora();
                        seleccion_07 = 2;
                        tiempo_07 = me_das_tu_ora();
                    case R.id.indepsilla7:
                        matriz[24] = "3";
                        matriz[25] = me_das_tu_ora();
                        seleccion_07 = 3;
                        tiempo_07 = me_das_tu_ora();
                        break;
                    case R.id.depen7:
                        matriz[24] = "4";
                        matriz[25] = me_das_tu_ora();
                        seleccion_07 = 4;
                        tiempo_07 = me_das_tu_ora();
                        break;

                }
            }
        });

        radioGroupP27.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.conti8:
                        matriz[26] = "1";
                        matriz[27] = me_das_tu_ora();
                        seleccion_08 = 1;
                        tiempo_08 = me_das_tu_ora();
                        break;
                    case R.id.inconoca8:
                        matriz[26] = "2";
                        matriz[27] = me_das_tu_ora();
                        seleccion_08 = 2;
                        tiempo_08 = me_das_tu_ora();
                    case R.id.incon8:
                        matriz[26] = "3";
                        matriz[27] = me_das_tu_ora();
                        seleccion_08 = 3;
                        tiempo_08 = me_das_tu_ora();
                        break;

                }
            }
        });

        radioGroupP28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.conti9:
                        matriz[28] = "1";
                        matriz[29] = me_das_tu_ora();
                        seleccion_09 = 1;
                        tiempo_09 = me_das_tu_ora();
                        break;
                    case R.id.inconoca9:
                        matriz[28] = "2";
                        matriz[29] = me_das_tu_ora();
                        seleccion_09 = 2;
                        tiempo_09 = me_das_tu_ora();
                    case R.id.incon9:
                        matriz[28] = "3";
                        matriz[29] = me_das_tu_ora();
                        seleccion_09 = 3;
                        tiempo_09 = me_das_tu_ora();
                        break;

                }
            }
        });

        radioGroupP29.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.incon10:
                        matriz[30] = "1";
                        matriz[31] = me_das_tu_ora();
                        seleccion_10 = 1;
                        tiempo_10 = me_das_tu_ora();
                        break;
                    case R.id.ayu10:
                        matriz[30] = "2";
                        matriz[31] = me_das_tu_ora();
                        seleccion_10 = 2;
                        tiempo_10 = me_das_tu_ora();
                    case R.id.incon9:
                        matriz[30] = "3";
                        matriz[31] = me_das_tu_ora();
                        seleccion_10 = 3;
                        tiempo_10 = me_das_tu_ora();
                        break;

                }
            }
        });
    }

    public void sigBarthel(View view){
        Intent finbar = new Intent(this,terminacion.class);
        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
        fuenteCuestionarioBasico.open();
        String comando_00 = "UPDATE cuestionariobasico SET";
        String comando_01  = ", pb_01";
        String comando_02 = ", tb_01";
        String comando_03  = ", pb_02";
        String comando_04 = ", tb_02";
        String comando_05  = ", pb_03";
        String comando_06 = ", tb_03";
        String comando_07  = ", pb_04";
        String comando_08 = ", tb_04";
        String comando_09  = ", pb_05";
        String comando_10 = ", tb_05";
        String comando_11  = ", pb_06";
        String comando_12 = ", tb_06";
        String comando_13  = ", pb_07";
        String comando_14 = ", tb_07";
        String comando_15 = ", pb_08";
        String comando_16 = ", tb_08";
        String comando_17 = ", pb_09";
        String comando_18 = ", tb_09";
        String comando_19 = ", pb_10";
        String comando_20 = ", tb_10";
        String comando_50 = " WHERE registro = " + "'" + el_registro + "'";

        fuenteCuestionarioBasico.guardarCaptura_0104(comando_00,
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
                comando_50);
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

    public void barthelAbortar(View view){
        Intent barthelabortar = new Intent(getApplicationContext(),MainActivity.class);
        fuenteCuestionarioBasico = new FuenteCuestionarioBasico(this);
        fuenteCuestionarioBasico.open();
        String comando_00 = "UPDATE cuestionariobasico SET";
        String comando_01  = ", pb_01";
        String comando_02 = ", tb_01";
        String comando_03  = ", pb_02";
        String comando_04 = ", tb_02";
        String comando_05  = ", pb_03";
        String comando_06 = ", tb_03";
        String comando_07  = ", pb_04";
        String comando_08 = ", tb_04";
        String comando_09  = ", pb_05";
        String comando_10 = ", tb_05";
        String comando_11  = ", pb_06";
        String comando_12 = ", tb_06";
        String comando_13  = ", pb_07";
        String comando_14 = ", tb_07";
        String comando_15 = ", pb_08";
        String comando_16 = ", tb_08";
        String comando_17 = ", pb_09";
        String comando_18 = ", tb_09";
        String comando_19 = ", pb_10";
        String comando_20 = ", tb_10";
        String comando_50 = " WHERE registro = " + "'" + el_registro + "'";

        fuenteCuestionarioBasico.guardarCaptura_0104(comando_00,
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
                comando_50);
        barthelabortar.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        barthelabortar.putExtra("EXIT", true);
        startActivity(barthelabortar);

    }

    public String me_das_tu_ora() {
        Date date = new Date();
        String cadena_la_hora = "'" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date.getTime()) + "'";
        return cadena_la_hora;
    }
}
