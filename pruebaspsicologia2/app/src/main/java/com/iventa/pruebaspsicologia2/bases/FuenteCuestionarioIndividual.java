package com.iventa.pruebaspsicologia2.bases;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.iventa.pruebaspsicologia2.bases.SQLiteOpenHelperCuestionario.TablaCuestionarioIndividual;
import com.iventa.pruebaspsicologia2.clases.ClasesIndividual;

public class FuenteCuestionarioIndividual {
    private SQLiteDatabase db;
    private SQLiteOpenHelperCuestionario dbHelper;
    private String[] columnas = {
            TablaCuestionarioIndividual.COLUMNA_NOMBRE,
            TablaCuestionarioIndividual.COLUMNA_PATERNO,
            TablaCuestionarioIndividual.COLUMNA_MATERNO,
            TablaCuestionarioIndividual.COLUMNA_P72
    };

    public FuenteCuestionarioIndividual(Context context) {
        dbHelper = new SQLiteOpenHelperCuestionario(context);
    }

    public void open() {
        db = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    // TabletaAdministrador = 2014-07-31
    public Integer cuentaRegistrosEnIndividual() {
        Cursor cursor = db.rawQuery("SELECT count(*) FROM cuestionarioindividual", null);
        cursor.moveToFirst();
        Integer cantidad_de_registros = (int) cursor.getLong(cursor.getColumnIndex("count(*)"));
        cursor.close();
        return cantidad_de_registros;
    }

    public void crearCuestionarioIndividual(String el_campoRegistro, String el_campoCadena, Integer el_campoMunicipio,
                                            Integer el_campoAgeb, Integer  el_campoArea, Integer el_campoManzana,Integer el_campoVivienda,
                                            String el_campoNombre,String el_campoPaterno, String el_campoMaterno,
                                            Integer el_campoSexo, Integer el_campoEdad,
                                            String el_campoP72, Integer el_campoVive) {
        db.execSQL("INSERT INTO cuestionarioindividual " +
                "(registro,cadena,municipio,ageb,area,manzana,vivienda,nombre,paterno,materno,sexo,edad,p72,vive) " +
                "VALUES ('" +
                el_campoRegistro + "','" + el_campoCadena + "'," + el_campoMunicipio + "," +
                el_campoAgeb + "," + el_campoArea + "," + el_campoManzana + "," + el_campoVivienda + "," +
                el_campoNombre + "','" + el_campoPaterno + "','" + el_campoMaterno + "','" +
                el_campoSexo + ",'" + el_campoEdad + ",'" +
                el_campoP72 + "'," + el_campoVive +")"
        );
    }

    // Procedimiento por eliminar.
    public List<ClasesIndividual> getAllRegistros() {
        List<ClasesIndividual> listaDeIndividual = new ArrayList<ClasesIndividual>();
        Cursor cursor = db.query(TablaCuestionarioIndividual.TABLA_CUESTIONARIO_INDIVIDUAL, columnas, null, null,
                null, null, null);
        cursor.moveToFirst();

        while (!cursor.isAfterLast()) {
            ClasesIndividual nuevoRegistro = cursorToIndividual(cursor);
            listaDeIndividual.add(nuevoRegistro);
            cursor.moveToNext();
        }

        cursor.close();
        return listaDeIndividual;
    }

    // TabletaBuscarSujeto = 2014-08-07
    // TabletaBuscarSujeto = 2017-03-04
    public String[] buscaMatriz(String comando_SQL) {
        Cursor cursor = db.rawQuery(comando_SQL, null);
        cursor.moveToFirst();

        String[] lamatriz = {
                cursor.getString(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),
                cursor.getString(4),cursor.getString(5),cursor.getString(6),cursor.getString(7),
                cursor.getString(8),cursor.getString(9),cursor.getString(10),cursor.getString(11)
        };

        cursor.close();
        return lamatriz;
    }

    // TabletaBuscarProspecto = 2017-03-04
    public String[] buscaUnaMatriz(String buscar) {
        Cursor cursor = db.rawQuery(buscar, null);
        cursor.moveToFirst();

        String[] lamatriz = {
                cursor.getString(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),
                cursor.getString(4),cursor.getString(5),cursor.getString(6),cursor.getString(7),
                cursor.getString(8),cursor.getString(9),cursor.getString(10),cursor.getString(11),
                cursor.getString(12),cursor.getString(13)
        };

        cursor.close();
        return lamatriz;
    }

    // TabletaBuscarSujeto = 2014-08-07
    public List<ClasesIndividual> buscaVariosRegistros(String comando_SQL) {
        List<ClasesIndividual> listaDeIndividual = new ArrayList<ClasesIndividual>();
        Cursor cursor = db.rawQuery(comando_SQL, null);
        cursor.moveToFirst();

        while (!cursor.isAfterLast()) {
            ClasesIndividual nuevoRegistro = cursorToIndividual(cursor);
            listaDeIndividual.add(nuevoRegistro);
            cursor.moveToNext();
        }

        cursor.close();
        return listaDeIndividual;
    }

    // TabletaBuscarSujeto = 2014-08-07
    // TabletaBuscarProspecto = 2017-03-04
    private ClasesIndividual cursorToIndividual(Cursor cursor) {
        ClasesIndividual registro = new ClasesIndividual();
        registro.setId(cursor.getLong(0));

        Calendar calendar = new GregorianCalendar();

        String el_sexo = "Nada";
        Integer la_EdadAyer = Integer.valueOf(cursor.getString(10));
        String la_EdadActual = null;
        String la_FechaToma = cursor.getString(11);
        Integer ano_FechaToma;

        if (la_FechaToma.length() == 10) {
            ano_FechaToma = Integer.valueOf(la_FechaToma.substring(6,10));
            la_EdadActual = String.valueOf((calendar.get(Calendar.YEAR) - ano_FechaToma) + la_EdadAyer);
        }

        if (la_FechaToma.length() == 4) la_FechaToma = "05/06/1998";
        if (Integer.valueOf(cursor.getString(9)) == 1) el_sexo = "Masculino";
        if (Integer.valueOf(cursor.getString(9)) == 2) el_sexo = "Femenino";

        String texto = cursor.getString(0) + ", " + cursor.getString(1) + "-" + cursor.getString(2) + "-" +
                cursor.getString(3) + "-" + cursor.getString(4) + "-" + cursor.getString(5) + ", " +
                cursor.getString(6) + " " + cursor.getString(7) + " " + cursor.getString(8) + ", " +
                el_sexo + ", Edad ayer " + cursor.getString(10) + ", Edad actual " + la_EdadActual +
                ", Fecha muestra " + la_FechaToma + ", " +
                cursor.getString(12);

        registro.setTexto(texto);

        return registro;
    }

    // TabletaBuscarProspecto = 2017-03-04
    // TabletaBuscarProspecto = 2017-12-04
    public List<ClasesIndividual> buscaRegistrosParaArea(String comando_SQL) {
        List<ClasesIndividual> listaDeIndividual = new ArrayList<ClasesIndividual>();
        Cursor cursor = db.rawQuery(comando_SQL, null);
        cursor.moveToFirst();

        while (!cursor.isAfterLast()) {
            ClasesIndividual nuevoRegistro = cursorParaAreaIndividual(cursor);
            listaDeIndividual.add(nuevoRegistro);
            cursor.moveToNext();
        }

        cursor.close();
        return listaDeIndividual;
    }

    // TabletaBuscarSujeto = 2014-08-07
    // TabletaBuscarProspecto = 2017-03-04
    // TabletaBuscarProspecto = 2017-12-04
    private ClasesIndividual cursorParaAreaIndividual(Cursor cursor) {
        ClasesIndividual registro = new ClasesIndividual();
        registro.setId(cursor.getLong(0));

        Calendar calendar = new GregorianCalendar();

        Integer la_EdadAyer = Integer.valueOf(cursor.getString(10));
        String la_EdadActual = null;
        String la_FechaToma = cursor.getString(11);
        Integer ano_FechaToma;

        if (la_FechaToma.length() == 10) {
            ano_FechaToma = Integer.valueOf(la_FechaToma.substring(6,10));
            la_EdadActual = String.valueOf((calendar.get(Calendar.YEAR) - ano_FechaToma) + la_EdadAyer);
        }

        if (la_FechaToma.length() == 4) la_FechaToma = "05/06/1998";

        String texto = cursor.getString(0) + "," + cursor.getString(1) + "," + cursor.getString(2) + "," +
                cursor.getString(3) + "," + cursor.getString(4) + "," + cursor.getString(5) + ", " +
                cursor.getString(6) + "," + cursor.getString(7) + "," + cursor.getString(8) + "," +
                cursor.getString(9) + cursor.getString(10) + la_EdadActual + la_FechaToma + ", " +
                cursor.getString(12);

        registro.setTexto(texto);

        return registro;
    }

    // TabletaAdministrador = 2015-11-03
    public void vaciarCuestionarioIndividual() {
        db.execSQL("DELETE FROM cuestionarioindividual");
        db.close();
    }

    public void borrarNota(ClasesIndividual registro) {
        long id = registro.getId();
        db.delete(TablaCuestionarioIndividual.TABLA_CUESTIONARIO_INDIVIDUAL, TablaCuestionarioIndividual.COLUMNA_REGISTRO + " = " + id,
                null);
    }
}
