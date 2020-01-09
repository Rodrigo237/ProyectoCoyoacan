package com.iventa.pruebaspsicologia2.bases;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteOpenHelperCuestionario extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "CuestionarioIndividual";
    private static final int DATABASE_VERSION = 1;

    public static class TablaCuestionarioIndividual{
        public static String TABLA_CUESTIONARIO_INDIVIDUAL = "cuestionarioindividual";
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
        public static String COLUMNA_FECHATOMA = "fechatoma";
        public static String COLUMNA_HORATOMA = "horatoma";
        public static String COLUMNA_P72 = "p72";
        public static String COLUMNA_VIVE = "vive";
    }

    private static final String DATABASE_CREATE = "create table "
            + TablaCuestionarioIndividual.TABLA_CUESTIONARIO_INDIVIDUAL + "("
            + TablaCuestionarioIndividual.COLUMNA_REGISTRO + " text, "
            + TablaCuestionarioIndividual.COLUMNA_CADENA + " text, "
            + TablaCuestionarioIndividual.COLUMNA_MUNICIPIO + " integer, "
            + TablaCuestionarioIndividual.COLUMNA_AGEB + " integer, "
            + TablaCuestionarioIndividual.COLUMNA_AREA + " integer, "
            + TablaCuestionarioIndividual.COLUMNA_MANZANA + " integer, "
            + TablaCuestionarioIndividual.COLUMNA_VIVIENDA + " integer, "
            + TablaCuestionarioIndividual.COLUMNA_NOMBRE + " text, "
            + TablaCuestionarioIndividual.COLUMNA_PATERNO + " text, "
            + TablaCuestionarioIndividual.COLUMNA_MATERNO + " text, "
            + TablaCuestionarioIndividual.COLUMNA_SEXO + " integer, "
            + TablaCuestionarioIndividual.COLUMNA_EDAD + " integer, "
            + TablaCuestionarioIndividual.COLUMNA_FECHATOMA + " text, "
            + TablaCuestionarioIndividual.COLUMNA_HORATOMA + " text, "
            + TablaCuestionarioIndividual.COLUMNA_P72 + " text, "
            + TablaCuestionarioIndividual.COLUMNA_VIVE + " integer)";

    public SQLiteOpenHelperCuestionario(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
//        db.execSQL(DATABASE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
//        db.execSQL("delete table if exists " + TablaCuestionarioIndividual.TABLA_CUESTIONARIO_INDIVIDUAL);
        onCreate(db);
    }

}
