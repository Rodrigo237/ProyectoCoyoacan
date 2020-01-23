package com.iventa.pruebaspsicologia2.bases;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteOpenHelperBasico extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "CuestionarioBasico";
    private static final int DATABASE_VERSION = 1;

    public static class TablaPosicionador{
        public static String TABLA_POSICIONADOR = "posicionador";
        public static String COLUMNA_REGISTRO = "registro";
        public static String COLUMNA_POSICION = "posicion";
        public static String COLUMNA_TABLETA = "tableta";
        public static String COLUMNA_ENCUESTO = "encuesto";
        public static String COLUMNA_REFIERE = "refiere";
    }

    public static class TablaCuestionarioBasico{
        public static String TABLA_CUESTIONARIO_BASICO = "cuestionariobasico";
        public static String COLUMNA_REGISTRO = "registro";
        public static String COLUMNA_CADENA = "cadena";
        public static String COLUMNA_MUNICIPIO = "municipio";
        public static String COLUMNA_AGEB = "ageb";
        public static String COLUMNA_AREA = "area";
        public static String COLUMNA_MANZANA = "manzana";
        public static String COLUMNA_VIVIENDA = "vivienda";
        public static String COLUMNA_NOMBRE = "nombre";
        public static String COLUMNA_PATERNO = "paterno";
        public static String COLUMNA_MATERNO = "materno";
        public static String COLUMNA_SEXO = "sexo";
        public static String COLUMNA_EDAD = "edad";
        public static String COLUMNA_EDAD_HOY = "edad_hoy";
        public static String COLUMNA_FECHA = "fecha";
        public static String COLUMNA_HORA_INI = "hora_ini";
        public static String COLUMNA_FECHOR_INI = "fechor_ini";
        public static String COLUMNA_P_01 = "p_01";
        public static String COLUMNA_T_01 = "t_01";
        public static String COLUMNA_P_02 = "p_02";
        public static String COLUMNA_T_02 = "t_02";
        public static String COLUMNA_P_03 = "p_03";
        public static String COLUMNA_T_03 = "t_03";
        public static String COLUMNA_PSBP_01 = "psbp_01";
        public static String COLUMNA_TSBP_01 = "tsbp_01";
        public static String COLUMNA_PSBP_02 = "pspb_02";
        public static String COLUMNA_TSBP_02 = "tsbp_02";
        public static String COLUMNA_PSBP_03 = "psbp_03";
        public static String COLUMNA_TSBP_03 = "tsbp_03";
        public static String COLUMNA_PSE_01 = "pse_01";
        public static String COLUMNA_TSE_01 = "tse_01";
        public static String COLUMNA_PSE_02 = "pse_02";
        public static String COLUMNA_TSE_02 = "tse_02";
        public static String COLUMNA_PSE_03 = "pse_03";
        public static String COLUMNA_TSE_03 = "tse_03";
        public static String COLUMNA_PC_01 = "pc_01";
        public static String COLUMNA_TC_01 = "tc_01";
        public static String COLUMNA_PC_02 = "pc_02";
        public static String COLUMNA_TC_02 = "tc_02";
        public static String COLUMNA_PC_03 = "pc_03";
        public static String COLUMNA_TC_03 = "tc_03";
        public static String COLUMNA_PDEP_01 = "pdep_01";
        public static String COLUMNA_TDEP_01 = "tdep_01";
        public static String COLUMNA_PDEP_02 = "pdep_02";
        public static String COLUMNA_TDEP_02 = "tdep_02";
        public static String COLUMNA_PDEP_03 = "pdep_03";
        public static String COLUMNA_TDEP_03 = "tdep_03";
        public static String COLUMNA_PDEP_04 = "pdep_04";
        public static String COLUMNA_TDEP_04 = "tdep_04";
        public static String COLUMNA_PDEP_05 = "pdep_05";
        public static String COLUMNA_TDEP_05 = "tdep_05";
        public static String COLUMNA_PDEP_06 = "pdep_06";
        public static String COLUMNA_TDEP_06 = "tdep_06";
        public static String COLUMNA_PDEP_07 = "pdep_07";
        public static String COLUMNA_TDEP_07 = "tdep_07";
        public static String COLUMNA_PB_01 = "pb_01";	// A�o falleci�.
        public static String COLUMNA_TB_01 = "tb_01"; // A�o falleci�.
        public static String COLUMNA_PB_02 = "pb_02"; // A�os cumplidos.
        public static String COLUMNA_TB_02 = "tb_02"; // A�os cumplidos.
        public static String COLUMNA_PB_03 = "pb_03"; // Nosabe. No responde.
        public static String COLUMNA_TB_03 = "tb_03"; // Nosabe. No responde.
        public static String COLUMNA_PB_04 = "pb_04";		// Lugar de fallecimiento.
        public static String COLUMNA_TB_04 = "tb_04";		// Lugar de fallecimiento.
        public static String COLUMNA_PB_05 = "pb_05";	// Municipio.
        public static String COLUMNA_TB_05 = "tb_05";	// Municipio.
        public static String COLUMNA_PB_06 = "pb_06";	// Estado.
        public static String COLUMNA_TB_06 = "tb_06";	// Estado.
        public static String COLUMNA_PB_07 = "pb_07";	// Pa�s.
        public static String COLUMNA_TB_07 = "tb_07";	// Pa�s.
        public static String COLUMNA_PB_08 = "pb_08";		// Causa de fallecimiento.
        public static String COLUMNA_TB_08 = "tb_08";		// Causa de fallecimiento.
        public static String COLUMNA_PB_09 = "pb_09";	// Causa de fallecimiento.
        public static String COLUMNA_TB_09 = "tb_09";	// Causa de fallecimiento.
        public static String COLUMNA_PB_10 = "pb_10";		// Certificado de defunci�n.
        public static String COLUMNA_TB_10 = "tb_10";		// Certificado de defunci�n.
        public static String COLUMNA_MI_01 = "mi_01";
        public static String COLUMNA_TMI_01 = "tmi_01";
        public static String COLUMNA_MI_02 = "mi_02";
        public static String COLUMNA_TMI_02 = "tmi_02";
        public static String COLUMNA_MI_03 = "mi_03";
        public static String COLUMNA_TMI_03 = "tmi_03";
        public static String COLUMNA_MI_04 = "mi_04";
        public static String COLUMNA_TMI_04 = "tmi_04";
        public static String COLUMNA_MI_05 = "mi_05";
        public static String COLUMNA_TMI_05 = "tmi_05";
        public static String COLUMNA_MI_06 = "mi_06";
        public static String COLUMNA_TMI_06 = "tmi_06";
        public static String COLUMNA_MI_07 = "mi_07";
        public static String COLUMNA_TMI_07 = "tmi_07";
        public static String COLUMNA_MI_08 = "mi_08";
        public static String COLUMNA_TMI_08 = "tmi_08";
        public static String COLUMNA_MI_09 = "mi_09";
        public static String COLUMNA_TMI_09 = "tmi_09";
        public static String COLUMNA_MI_10 = "mi_10";
        public static String COLUMNA_TMI_10 = "tmi_10";
        public static String COLUMNA_MI_11 = "mi_11";
        public static String COLUMNA_TMI_11 = "tmi_11";
        public static String COLUMNA_MI_12 = "mi_12";
        public static String COLUMNA_TMI_12 = "tmi_12";
        public static String COLUMNA_MI_13 = "mi_13";
        public static String COLUMNA_TMI_13 = "tmi_13";
        public static String COLUMNA_MI_14 = "mi_14";
        public static String COLUMNA_TMI_14 = "tmi_14";
        public static String COLUMNA_MI_15 = "mi_15";
        public static String COLUMNA_TMI_15 = "tmi_15";
        public static String COLUMNA_MI_16 = "mi_16";
        public static String COLUMNA_TMI_16 = "tmi_16";
        public static String COLUMNA_MI_17 = "mi_17";
        public static String COLUMNA_TMI_17 = "tmi_17";
        public static String COLUMNA_MI_18 = "mi_18";
        public static String COLUMNA_TMI_18 = "tmi_18";
        public static String COLUMNA_MI_19 = "mi_19";
        public static String COLUMNA_TMI_19 = "tmi_19";
        public static String COLUMNA_MI_20 = "mi_20";
        public static String COLUMNA_TMI_20 = "tmi_20";
        public static String COLUMNA_MI_21 = "mi_21";
        public static String COLUMNA_TMI_21 = "tmi_21";
        public static String COLUMNA_RE_01 = "re_01"; // Resultado de la entrevista.
        public static String COLUMNA_TRE_01 = "tre_01";
        public static String COLUMNA_FECHA_FIN = "fecha_fin";
        public static String COLUMNA_HORA_FIN = "hora_fin";
        public static String COLUMNA_FECHOR_FIN = "fechor_fin";
        public static String COLUMNA_LATITUD_B = "latitud_b";
        public static String COLUMNA_LONGITUD_B = "longitud_b";
        public static String COLUMNA_P72 = "p72";
        public static String COLUMNA_VIVE = "vive";
        public static String COLUMNA_TABLETA = "tableta"; // Nombre de la tableta.
        public static String COLUMNA_ENCUESTO = "encuesto"; // Nombre de la entrevistadora.
    }

    private static final String CREAR_TABLA_POSICIONADOR = "create table "
            + TablaPosicionador.TABLA_POSICIONADOR + "("
            + TablaPosicionador.COLUMNA_REGISTRO + " text, "
            + TablaPosicionador.COLUMNA_POSICION + " text, "
            + TablaPosicionador.COLUMNA_TABLETA + " text, "
            + TablaPosicionador.COLUMNA_ENCUESTO + " text, "
            + TablaPosicionador.COLUMNA_REFIERE + " integer)";

    private static final String CREAR_TABLA_CUESTIONARIO_BASICO = "create table "
            + TablaCuestionarioBasico.TABLA_CUESTIONARIO_BASICO + "("
            + TablaCuestionarioBasico.COLUMNA_REGISTRO + " text, "
            + TablaCuestionarioBasico.COLUMNA_CADENA + " text, "
            + TablaCuestionarioBasico.COLUMNA_MUNICIPIO + " integer, "
            + TablaCuestionarioBasico.COLUMNA_AGEB + " integer, "
            + TablaCuestionarioBasico.COLUMNA_AREA + " integer, "
            + TablaCuestionarioBasico.COLUMNA_MANZANA + " integer, "
            + TablaCuestionarioBasico.COLUMNA_VIVIENDA + " integer, "
            + TablaCuestionarioBasico.COLUMNA_NOMBRE + " text, "
            + TablaCuestionarioBasico.COLUMNA_PATERNO + " text, "
            + TablaCuestionarioBasico.COLUMNA_MATERNO + " text, "
            + TablaCuestionarioBasico.COLUMNA_SEXO + " integer, "
            + TablaCuestionarioBasico.COLUMNA_EDAD + " integer, "
            + TablaCuestionarioBasico.COLUMNA_EDAD_HOY + " integer, "
            + TablaCuestionarioBasico.COLUMNA_FECHA + " date, "
            + TablaCuestionarioBasico.COLUMNA_HORA_INI + " time, "
            + TablaCuestionarioBasico.COLUMNA_FECHOR_INI + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_01 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_01 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_02 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_02 + " text, "
            + TablaCuestionarioBasico.COLUMNA_P_03 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_T_03 + " text, "
            + TablaCuestionarioBasico.COLUMNA_PSBP_01 + " integer, "
            + TablaCuestionarioBasico.COLUMNA_TSBP_01 + " text, "
            + TablaCuestionarioBasico.COLUMNA_PSBP_02 + " integer, "	// D�a naci�.
            + TablaCuestionarioBasico.COLUMNA_TSBP_02 + " text, "		// D�a naci�.
            + TablaCuestionarioBasico.COLUMNA_PSBP_03 + " integer, "	// Mes naci�.
            + TablaCuestionarioBasico.COLUMNA_TSBP_03 + " text, "		// Mes naci�.
            + TablaCuestionarioBasico.COLUMNA_PSE_01 + " integer, "	// A�o naci�.
            + TablaCuestionarioBasico.COLUMNA_TSE_01 + " text, "		// A�o naci�.
            + TablaCuestionarioBasico.COLUMNA_PSE_02 + " integer, "	// No sabe. No responde.
            + TablaCuestionarioBasico.COLUMNA_TSE_02 + " text, "		// No sabe. No responde.
            + TablaCuestionarioBasico.COLUMNA_PSE_03 + " text, "		// Tel�fono.
            + TablaCuestionarioBasico.COLUMNA_TSE_03 + " text, "		// Tel�fono.
            + TablaCuestionarioBasico.COLUMNA_PC_01 + " integer, "	// Tel�fono.
            + TablaCuestionarioBasico.COLUMNA_TC_01 + " text, "		// Tel�fono.
            + TablaCuestionarioBasico.COLUMNA_PC_02 + " text, "		// Correo electr�nico.
            + TablaCuestionarioBasico.COLUMNA_TC_02 + " text, "		// Correo electr�nico.
            + TablaCuestionarioBasico.COLUMNA_PC_03 + " integer, "	// Correo electr�nico.
            + TablaCuestionarioBasico.COLUMNA_TC_03 + " text, "		// Correo electr�nico.
            + TablaCuestionarioBasico.COLUMNA_PDEP_01 + " integer, "		// Relaci�n.
            + TablaCuestionarioBasico.COLUMNA_TDEP_01 + " text, "		// Relaci�n.
            + TablaCuestionarioBasico.COLUMNA_PDEP_02 + " integer, "	// D�a naci�.
            + TablaCuestionarioBasico.COLUMNA_TDEP_02 + " text, "		// D�a naci�.
            + TablaCuestionarioBasico.COLUMNA_PDEP_03 + " integer, "	// Mes naci�.
            + TablaCuestionarioBasico.COLUMNA_TDEP_03 + " text, "		// Mes naci�.
            + TablaCuestionarioBasico.COLUMNA_PDEP_04 + " integer, "	// A�o naci�.
            + TablaCuestionarioBasico.COLUMNA_TDEP_04 + " text, "		// A�o naci�.
            + TablaCuestionarioBasico.COLUMNA_PDEP_05 + " integer, "	// No sabe. No responde.
            + TablaCuestionarioBasico.COLUMNA_TDEP_05 + " text, "		// No sabe. No responde.
            + TablaCuestionarioBasico.COLUMNA_PDEP_06 + " integer, "	// D�a falleci�.
            + TablaCuestionarioBasico.COLUMNA_TDEP_06 + " text, "		// D�a falleci�.
            + TablaCuestionarioBasico.COLUMNA_PDEP_07 + " integer, "	// Mes falleci�.
            + TablaCuestionarioBasico.COLUMNA_TDEP_07 + " text, "		// Mes falleci�.
            + TablaCuestionarioBasico.COLUMNA_PB_01 + " integer, "	// A�o falleci�.
            + TablaCuestionarioBasico.COLUMNA_TB_01 + " text, "		// A�o falleci�.
            + TablaCuestionarioBasico.COLUMNA_PB_02 + " integer, "	// A�os cumplidos.
            + TablaCuestionarioBasico.COLUMNA_TB_02 + " text, "		// A�os cumplidos.
            + TablaCuestionarioBasico.COLUMNA_PB_03 + " integer, "	// No sabe. No responde.
            + TablaCuestionarioBasico.COLUMNA_TB_03 + " text, "		// No sabe. No responde.
            + TablaCuestionarioBasico.COLUMNA_PB_04 + " integer, "		// Lugar de fallecimiento.
            + TablaCuestionarioBasico.COLUMNA_TB_04 + " text, "		// Lugar de fallecimiento.
            + TablaCuestionarioBasico.COLUMNA_PB_05 + " integer, "	// Municipio.
            + TablaCuestionarioBasico.COLUMNA_TB_05 + " text, "		// Municipio.
            + TablaCuestionarioBasico.COLUMNA_PB_06 + " integer, "	// Estado.
            + TablaCuestionarioBasico.COLUMNA_TB_06 + " text, "		// Estado.
            + TablaCuestionarioBasico.COLUMNA_PB_07 + " text, "		// Pa�s.
            + TablaCuestionarioBasico.COLUMNA_TB_07 + " text, "		// Pa�s.
            + TablaCuestionarioBasico.COLUMNA_PB_08 + " integer, "		// Causa de fallecimiento.
            + TablaCuestionarioBasico.COLUMNA_TB_08 + " text, "		// Causa de fallecimiento.
            + TablaCuestionarioBasico.COLUMNA_PB_09 + " text, "		// Causa de fallecimiento.
            + TablaCuestionarioBasico.COLUMNA_TB_09 + " text, "		// Causa de fallecimiento.
            + TablaCuestionarioBasico.COLUMNA_PB_10 + " integer, "		// Certificado de defunci�n.
            + TablaCuestionarioBasico.COLUMNA_TB_10 + " text, "		// Certificado de defunci�n.
            + TablaCuestionarioBasico.COLUMNA_MI_01 + "integer,"
            + TablaCuestionarioBasico.COLUMNA_TMI_01 + "text,"
            + TablaCuestionarioBasico.COLUMNA_MI_02 + "integer,"
            + TablaCuestionarioBasico.COLUMNA_TMI_02 + "text,"
            + TablaCuestionarioBasico.COLUMNA_MI_03 + "integer,"
            + TablaCuestionarioBasico.COLUMNA_TMI_03 + "text,"
            + TablaCuestionarioBasico.COLUMNA_MI_04 + "integer,"
            + TablaCuestionarioBasico.COLUMNA_TMI_04 + "text,"
            + TablaCuestionarioBasico.COLUMNA_MI_05 + "integer,"
            + TablaCuestionarioBasico.COLUMNA_TMI_05 + "text,"
            + TablaCuestionarioBasico.COLUMNA_MI_06 + "integer,"
            + TablaCuestionarioBasico.COLUMNA_TMI_06 + "text,"
            + TablaCuestionarioBasico.COLUMNA_MI_07 + "integer,"
            + TablaCuestionarioBasico.COLUMNA_TMI_07 + "text,"
            + TablaCuestionarioBasico.COLUMNA_MI_08 + "integer,"
            + TablaCuestionarioBasico.COLUMNA_TMI_08 + "text,"
            + TablaCuestionarioBasico.COLUMNA_MI_09 + "integer,"
            + TablaCuestionarioBasico.COLUMNA_TMI_09 + "text,"
            + TablaCuestionarioBasico.COLUMNA_MI_10 + "integer,"
            + TablaCuestionarioBasico.COLUMNA_TMI_10 + "text,"
            + TablaCuestionarioBasico.COLUMNA_MI_11 + "integer,"
            + TablaCuestionarioBasico.COLUMNA_TMI_11 + "text,"
            + TablaCuestionarioBasico.COLUMNA_MI_12 + "integer,"
            + TablaCuestionarioBasico.COLUMNA_TMI_12 + "text,"
            + TablaCuestionarioBasico.COLUMNA_MI_13 + "integer,"
            + TablaCuestionarioBasico.COLUMNA_TMI_13 + "text,"
            + TablaCuestionarioBasico.COLUMNA_MI_14 + "integer,"
            + TablaCuestionarioBasico.COLUMNA_TMI_14 + "text,"
            + TablaCuestionarioBasico.COLUMNA_MI_15 + "integer,"
            + TablaCuestionarioBasico.COLUMNA_TMI_15 + "text,"
            + TablaCuestionarioBasico.COLUMNA_MI_16 + "integer,"
            + TablaCuestionarioBasico.COLUMNA_TMI_16 + "text,"
            + TablaCuestionarioBasico.COLUMNA_MI_17 + "integer,"
            + TablaCuestionarioBasico.COLUMNA_TMI_17 + "text,"
            + TablaCuestionarioBasico.COLUMNA_MI_18 + "integer,"
            + TablaCuestionarioBasico.COLUMNA_TMI_18 + "text,"
            + TablaCuestionarioBasico.COLUMNA_MI_19 + "integer,"
            + TablaCuestionarioBasico.COLUMNA_TMI_19 + "text,"
            + TablaCuestionarioBasico.COLUMNA_MI_20 + "integer,"
            + TablaCuestionarioBasico.COLUMNA_TMI_20 + "text,"
            + TablaCuestionarioBasico.COLUMNA_MI_21 + "integer,"
            + TablaCuestionarioBasico.COLUMNA_TMI_21 + "text,"
            + TablaCuestionarioBasico.COLUMNA_RE_01 + " integer, "	// Resultado de la entrevista.
            + TablaCuestionarioBasico.COLUMNA_TRE_01 + " text, "	// Resultado de la entrevista.
            + TablaCuestionarioBasico.COLUMNA_FECHA_FIN + " date, "
            + TablaCuestionarioBasico.COLUMNA_HORA_FIN + " time, "
            + TablaCuestionarioBasico.COLUMNA_FECHOR_FIN + " text, "
            + TablaCuestionarioBasico.COLUMNA_LATITUD_B + " text, "
            + TablaCuestionarioBasico.COLUMNA_LONGITUD_B + " text, "
            + TablaCuestionarioBasico.COLUMNA_P72 + " text, "
            + TablaCuestionarioBasico.COLUMNA_VIVE + " integer, "
            + TablaCuestionarioBasico.COLUMNA_TABLETA + " text, "	// Nombre de la tableta.
            + TablaCuestionarioBasico.COLUMNA_ENCUESTO + " text)";	// Nombre de la entrevistadora.

    public SQLiteOpenHelperBasico(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        db.execSQL(CREAR_TABLA_POSICIONADOR);
        db.execSQL(CREAR_TABLA_CUESTIONARIO_BASICO);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
       db.execSQL(String.format("delete table if exists %s", TablaCuestionarioBasico.TABLA_CUESTIONARIO_BASICO));
        onCreate(db);
    }
}
