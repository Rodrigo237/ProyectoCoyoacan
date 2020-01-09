package com.iventa.pruebaspsicologia2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.iventa.pruebaspsicologia2.bases.FuenteCuestionarioIndividual;
import com.iventa.pruebaspsicologia2.bases.FuenteCuestionarioBasico;
import com.iventa.pruebaspsicologia2.clases.ClasesIndividual;

public class BuscarCuestionarios extends Activity implements OnItemClickListener {
    private int requestCode = 1;
    private ListView listaIndividual;
    private TextView monitor_01;
    private TextView monitor_02;
    private FuenteCuestionarioIndividual fuenteDeCuestionarioIndividual;
    private FuenteCuestionarioBasico fuenteDeCuestionarioBasico;
    private static String la_tableta;
    private static String el_encuesto;
    private TextView textoMunicipio;
    private TextView textoAgeb;
    private TextView textoArea;
    private TextView textoManzana;
    private TextView textoVivienda;
    private TextView textoNombre;
    private TextView textoPaterno;
    private TextView textoMaterno;
    private TextView textoProcesando;
    private EditText campoMunicipio;
    private EditText campoAgeb;
    private EditText campoArea;
    private EditText campoManzana;
    private EditText campoVivienda;
    private EditText campoNombre;
    private EditText campoPaterno;
    private EditText campoMaterno;
    private String campo_municipio;
    private String campo_ageb;
    private String campo_area;
    private String campo_manzana;
    private String campo_vivienda;
    private String campo_nombre;
    private String campo_paterno;
    private String campo_materno;
    private Integer longitud;
    private String el_registro;
    private String comando_SQL;
    private String xcomando_SQL;
    public String comando_SQL_registro;
    public Integer contador;
    private Integer cantidad_de_registros_en_area_en_basico;
    private Integer cantidad_de_registros_en_manzana_en_basico;
    public boolean familia_seleccionada;
    private Button botonLimpiarCampos;
    private Button botonSeleccionarArea;
    private Button botonSeleccionarManzana;
    private Button botonSeleccionarFamilia;
    private Button botonBuscarCuestionario;
    private Integer ancho_de_pantalla;
    private Integer ancho_de_textos;
    private Integer ancho_de_campos;
    private Integer ancho_de_botones;
    private String elrenglon;
    public String el_campoP72;
    public String matrizBasico[];

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_cuestionarios);

        ancho_de_pantalla = getResources().getDisplayMetrics().widthPixels;

        textoMunicipio			= (TextView) findViewById(R.id.textoMunicipio);
        textoAgeb				= (TextView) findViewById(R.id.textoAgeb);
        textoArea				= (TextView) findViewById(R.id.textoArea);
        textoManzana			= (TextView) findViewById(R.id.textoManzana);
        textoVivienda			= (TextView) findViewById(R.id.textoVivienda);
        textoNombre				= (TextView) findViewById(R.id.textoNombre);
        textoPaterno			= (TextView) findViewById(R.id.textoPaterno);
        textoMaterno			= (TextView) findViewById(R.id.textoMaterno);
        textoProcesando			= (TextView) findViewById(R.id.textoProcesando);
        campoMunicipio			= (EditText) findViewById(R.id.campoMunicipio);
        campoAgeb				= (EditText) findViewById(R.id.campoAgeb);
        campoArea				= (EditText) findViewById(R.id.campoArea);
        campoManzana			= (EditText) findViewById(R.id.campoManzana);
        campoVivienda			= (EditText) findViewById(R.id.campoVivienda);
        campoNombre				= (EditText) findViewById(R.id.campoNombre);
        campoPaterno			= (EditText) findViewById(R.id.campoPaterno);
        campoMaterno			= (EditText) findViewById(R.id.campoMaterno);
        listaIndividual 		= (ListView) findViewById(R.id.listaIndividual);
        monitor_01				= (TextView) findViewById(R.id.monitor_01);
        monitor_02				= (TextView) findViewById(R.id.monitor_02);
        botonLimpiarCampos		= (Button) findViewById(R.id.botonLimpiarCampos);
        botonSeleccionarArea	= (Button) findViewById(R.id.botonSeleccionarArea);
        botonSeleccionarManzana	= (Button) findViewById(R.id.botonSeleccionarManzana);
        botonSeleccionarFamilia	= (Button) findViewById(R.id.botonSeleccionarFamilia);
        botonBuscarCuestionario	= (Button) findViewById(R.id.botonCrearCuestionario);

        ancho_de_textos = (ancho_de_pantalla - 60) / 5;
        textoMunicipio.setWidth(ancho_de_textos);
        textoAgeb.setWidth(ancho_de_textos);
        textoArea.setWidth(ancho_de_textos);
        textoManzana.setWidth(ancho_de_textos);
        textoVivienda.setWidth(ancho_de_textos);

        ancho_de_textos = (ancho_de_pantalla - 20) / 3;
        textoNombre.setWidth(ancho_de_textos);
        textoPaterno.setWidth(ancho_de_textos);
        textoMaterno.setWidth(ancho_de_textos);

        ancho_de_campos = (ancho_de_pantalla - 60) / 5;
        campoMunicipio.setWidth(ancho_de_campos);
        campoAgeb.setWidth(ancho_de_campos);
        campoArea.setWidth(ancho_de_campos);
        campoManzana.setWidth(ancho_de_campos);
        campoVivienda.setWidth(ancho_de_campos);

        ancho_de_campos = (ancho_de_pantalla - 20) / 3;
        campoNombre.setWidth(ancho_de_campos);
        campoPaterno.setWidth(ancho_de_campos);
        campoMaterno.setWidth(ancho_de_campos);

//		ancho_de_botones = (ancho_de_pantalla - 100) / 3;
        ancho_de_botones = 50;
//		botonLimpiarCampos.setWidth(ancho_de_botones);
//		botonSeleccionarArea.setWidth(ancho_de_botones);
//		botonSeleccionarFamilia.setWidth(ancho_de_botones);
//		botonSeleccionarManzana.setWidth(ancho_de_botones);
//		botonCrearCuestionario.setWidth(ancho_de_botones);

        botonLimpiarCampos.setWidth(50);
        botonSeleccionarArea.setWidth(50);
        botonSeleccionarFamilia.setWidth(50);
        botonSeleccionarManzana.setWidth(50);
        botonBuscarCuestionario.setWidth(50);

        campoMunicipio.setNextFocusDownId(R.id.campoAgeb);
        campoAgeb.setNextFocusDownId(R.id.campoArea);
        campoArea.setNextFocusDownId(R.id.campoManzana);
        campoManzana.setNextFocusDownId(R.id.campoVivienda);
        campoVivienda.setNextFocusDownId(R.id.campoNombre);
        campoNombre.setNextFocusDownId(R.id.campoPaterno);
        campoPaterno.setNextFocusDownId(R.id.campoMaterno);
        campoMaterno.setNextFocusDownId(R.id.campoMunicipio);

        campoMunicipio.setBackgroundColor(Color.WHITE);
        campoMunicipio.setTextColor(Color.RED);
        campoAgeb.setBackgroundColor(Color.WHITE);
        campoAgeb.setTextColor(Color.RED);
        campoArea.setBackgroundColor(Color.WHITE);
        campoArea.setTextColor(Color.RED);
        campoManzana.setBackgroundColor(Color.WHITE);
        campoManzana.setTextColor(Color.RED);
        campoVivienda.setBackgroundColor(Color.WHITE);
        campoVivienda.setTextColor(Color.RED);
        campoNombre.setBackgroundColor(Color.WHITE);
        campoNombre.setTextColor(Color.RED);
        campoPaterno.setBackgroundColor(Color.WHITE);
        campoPaterno.setTextColor(Color.RED);
        campoMaterno.setBackgroundColor(Color.WHITE);
        campoMaterno.setTextColor(Color.RED);

        fuenteDeCuestionarioIndividual = new FuenteCuestionarioIndividual(this);
        fuenteDeCuestionarioIndividual.open();

        botonLimpiarCampos.setVisibility(View.VISIBLE);
        botonSeleccionarArea.setVisibility(View.VISIBLE);
        botonSeleccionarFamilia.setVisibility(View.VISIBLE);
        botonSeleccionarManzana.setVisibility(View.VISIBLE);
        botonBuscarCuestionario.setVisibility(View.VISIBLE);
        textoProcesando.setVisibility(View.VISIBLE);

        campoMunicipio.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                // TODO Auto-generated method stub
                botonLimpiarCampos.setVisibility(View.VISIBLE);
                activarBotonArea();

                if (campoMunicipio.length() == 0) {
                    campoMunicipio.setBackgroundColor(Color.WHITE);
                    campoMunicipio.setTextColor(Color.RED);
                }

                if (campoMunicipio.length() > 0) {
                    campoMunicipio.setBackgroundColor(Color.YELLOW);
                    campoMunicipio.setTextColor(Color.BLACK);
                }

                buscarCuestionarios();
            }
        });

        campoAgeb.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                // TODO Auto-generated method stub
                botonLimpiarCampos.setVisibility(View.VISIBLE);
                activarBotonArea();

                if (campoAgeb.length() == 0) {
                    campoAgeb.setBackgroundColor(Color.WHITE);
                    campoAgeb.setTextColor(Color.RED);
                }

                if (campoAgeb.length() > 0) {
                    campoAgeb.setBackgroundColor(Color.YELLOW);
                    campoAgeb.setTextColor(Color.BLACK);
                }

                buscarCuestionarios();
            }
        });

        campoArea.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                // TODO Auto-generated method stub
                botonLimpiarCampos.setVisibility(View.VISIBLE);
                activarBotonArea();

                if (campoArea.length() == 0) {
                    campoArea.setBackgroundColor(Color.WHITE);
                    campoArea.setTextColor(Color.RED);
                }

                if (campoArea.length() > 0) {
                    campoArea.setBackgroundColor(Color.YELLOW);
                    campoArea.setTextColor(Color.BLACK);
                }

                buscarCuestionarios();
            }
        });

        campoManzana.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                // TODO Auto-generated method stub
                botonLimpiarCampos.setVisibility(View.VISIBLE);
                activarBotonManzana();

                if (campoManzana.length() == 0) {
                    campoManzana.setBackgroundColor(Color.WHITE);
                    campoManzana.setTextColor(Color.RED);
                }

                if (campoManzana.length() > 0) {
                    campoManzana.setBackgroundColor(Color.YELLOW);
                    campoManzana.setTextColor(Color.BLACK);
                }

                buscarCuestionarios();
            }
        });

        campoVivienda.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                // TODO Auto-generated method stub
                botonLimpiarCampos.setVisibility(View.VISIBLE);
                activarBotonArea();

                if (campoVivienda.length() == 0) {
                    campoVivienda.setBackgroundColor(Color.WHITE);
                    campoVivienda.setTextColor(Color.RED);
                }

                if (campoVivienda.length() > 0) {
                    campoVivienda.setBackgroundColor(Color.YELLOW);
                    campoVivienda.setTextColor(Color.BLACK);
                }

                buscarCuestionarios();
            }
        });

        campoNombre.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                // TODO Auto-generated method stub
                botonLimpiarCampos.setVisibility(View.VISIBLE);
                activarBotonArea();

                if (campoNombre.length() == 0) {
                    campoNombre.setBackgroundColor(Color.WHITE);
                    campoNombre.setTextColor(Color.RED);
                }

                if (campoNombre.length() > 0) {
                    campoNombre.setBackgroundColor(Color.YELLOW);
                    campoNombre.setTextColor(Color.BLACK);
                }

                buscarCuestionarios();
            }
        });

        campoPaterno.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                // TODO Auto-generated method stub
                botonLimpiarCampos.setVisibility(View.VISIBLE);
                activarBotonArea();

                if (campoPaterno.length() == 0) {
                    campoPaterno.setBackgroundColor(Color.WHITE);
                    campoPaterno.setTextColor(Color.RED);
                }

                if (campoPaterno.length() > 0) {
                    campoPaterno.setBackgroundColor(Color.YELLOW);
                    campoPaterno.setTextColor(Color.BLACK);
                }

                buscarCuestionarios();
            }
        });

        campoMaterno.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                // TODO Auto-generated method stub
                botonLimpiarCampos.setVisibility(View.VISIBLE);
                activarBotonArea();

                if (campoMaterno.length() == 0) {
                    campoMaterno.setBackgroundColor(Color.WHITE);
                    campoMaterno.setTextColor(Color.RED);
                }

                if (campoMaterno.length() > 0) {
                    campoMaterno.setBackgroundColor(Color.YELLOW);
                    campoMaterno.setTextColor(Color.BLACK);
                }

                buscarCuestionarios();
            }
        });
    } // Fin de onCreate

    protected void buscarCuestionarios () {
        campo_municipio	= campoMunicipio.getText().toString();
        campo_ageb		= campoAgeb.getText().toString();
        campo_area		= campoArea.getText().toString();
        campo_manzana	= campoManzana.getText().toString();
        campo_vivienda	= campoVivienda.getText().toString();
        campo_nombre	= campoNombre.getText().toString();
        campo_paterno	= campoPaterno.getText().toString();
        campo_materno	= campoMaterno.getText().toString();

        comando_SQL = "SELECT registro, municipio, ageb, area, manzana, vivienda, " +
                "nombre, paterno, materno, sexo, edad, fechatoma, p72 " +
                "FROM cuestionarioindividual WHERE ";

        if (campo_municipio.length() > 0) {
            comando_SQL = comando_SQL + "municipio = " + campo_municipio + " AND ";
        }

        if (campo_ageb.length() > 0) {
            comando_SQL = comando_SQL + "ageb = " + campo_ageb + " AND ";
        }

        if (campo_area.length() > 0) {
            comando_SQL = comando_SQL + "area = " + campo_area + " AND ";
        }

        if (campo_manzana.length() > 0) {
            comando_SQL = comando_SQL + "manzana = " + campo_manzana + " AND ";
        }

        if (campo_vivienda.length() > 0) {
            comando_SQL = comando_SQL + "vivienda = " + campo_vivienda + " AND ";
        }

        if (campo_nombre.length() > 0) {
            comando_SQL = comando_SQL + "nombre LIKE '%" + campo_nombre + "%' AND ";
        }

        if (campo_paterno.length() > 0) {
            comando_SQL = comando_SQL + "paterno LIKE '%" + campo_paterno + "%' AND ";
        }

        if (campo_materno.length() > 0) {
            comando_SQL = comando_SQL + "materno LIKE '%" + campo_materno + "%' AND ";
        }

        longitud = comando_SQL.length();
        comando_SQL = comando_SQL.substring(0, longitud - 5);
        comando_SQL = comando_SQL + " ORDER BY cadena LIMIT 500";

        fuenteDeCuestionarioIndividual = new FuenteCuestionarioIndividual(this);
        fuenteDeCuestionarioIndividual.open();

        List<ClasesIndividual> listaxDeIndividual = fuenteDeCuestionarioIndividual.buscaVariosRegistros(comando_SQL);
        ArrayAdapter<ClasesIndividual> adapter = new ArrayAdapter<ClasesIndividual>(this,android.R.layout.simple_list_item_1, listaxDeIndividual);

        listaIndividual.setAdapter(adapter);
        listaIndividual.setOnItemClickListener(this);
        // La siguiente línea es con la intención de seleccionar a varios.
//        listaIndividual.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

//        monitor_01.setText("Localizados = " + String.valueOf(listaIndividual.getCount()));

    }

    public void limpiarCampos(View v) {
        botonLimpiarCampos.setVisibility(View.VISIBLE);
        familia_seleccionada = false;
        campoMunicipio.setText("");
        campoMunicipio.requestFocus();
        campoAgeb.setText("");
        campoArea.setText("");
        campoManzana.setText("");
        campoVivienda.setText("");
        campoNombre.setText("");
        campoPaterno.setText("");
        campoMaterno.setText("");
        listaIndividual.setAdapter(null);

//    	comando_SQL = "SELECT registro, municipio, ageb, area, manzana, vivienda, " +
//								"nombre, paterno, materno, sexo, edad, fechatoma, p72, vive " +
//								"FROM cuestionarioindividual WHERE municipio = 0 ";
//
//        fuenteDeCuestionarioIndividual = new FuenteCuestionarioIndividual(this);
//		fuenteDeCuestionarioIndividual.open();
//
//		List<ClasesIndividual> listaDeIndividual = fuenteDeCuestionarioIndividual.buscaVariosRegistros(comando_SQL);
//        ArrayAdapter<ClasesIndividual> adapter = new ArrayAdapter<ClasesIndividual>(this,android.R.layout.simple_list_item_1, listaDeIndividual);
//
//        listaIndividual.setAdapter(adapter);
//        monitor_01.setText("Localizados = " + String.valueOf(listaIndividual.getCount()));
//		fuenteDeCuestionarioIndividual.close();
        botonSeleccionarFamilia.setVisibility(View.VISIBLE);
        botonBuscarCuestionario.setVisibility(View.VISIBLE);
    }

    private void activarBotonArea() {
        if ((campoMunicipio.length() > 0) & (campoAgeb.length() > 0) & (campoArea.length() > 0) &
                (campoManzana.length() < 1) & (campoVivienda.length() < 1) &
                (campoNombre.length() < 1) & (campoPaterno.length() < 1) & (campoMaterno.length() < 1)) {
            botonSeleccionarArea.setVisibility(View.VISIBLE);
        } else {
            botonSeleccionarArea.setVisibility(View.VISIBLE);
        }
    }

    private void activarBotonManzana() {
        if ((campoMunicipio.length() > 0) & (campoAgeb.length() > 0) & (campoArea.length() > 0) &
                (campoManzana.length() > 0) & (campoVivienda.length() < 1) &
                (campoNombre.length() < 1) & (campoPaterno.length() < 1) & (campoMaterno.length() < 1)) {
            botonSeleccionarManzana.setVisibility(View.VISIBLE);
        } else {
            botonSeleccionarManzana.setVisibility(View.VISIBLE);
        }
    }

    public void seleccionarArea(View v) {
        textoProcesando.setVisibility(View.VISIBLE);
        el_registro = listaIndividual.getItemAtPosition(0).toString().substring(0, 9);

        monitor_01.setText("Localizados = " + String.valueOf(listaIndividual.getCount()));
        monitor_02.setText("El registro = " + el_registro);

        campo_municipio	= campoMunicipio.getText().toString();
        campo_ageb		= campoAgeb.getText().toString();
        campo_area		= campoArea.getText().toString();

        fuenteDeCuestionarioBasico = new FuenteCuestionarioBasico(this);
        fuenteDeCuestionarioBasico.open();

        comando_SQL = "SELECT count(*) FROM cuestionariobasico WHERE " +
                "municipio	= " + campo_municipio	+ " AND " +
                "ageb		= " + campo_ageb		+ " AND " +
                "area		= " + campo_area;

        cantidad_de_registros_en_area_en_basico = fuenteDeCuestionarioBasico.cuentaRegistrosEnAreaEnBasico(comando_SQL);

        if (cantidad_de_registros_en_area_en_basico > 0) {
            dialogoYaExisten();
        } else {
            comando_SQL = "SELECT registro, municipio, ageb, area, manzana, vivienda, " +
                    "nombre, paterno, materno, sexo, edad, fechatoma, p72 " +
                    "FROM cuestionarioindividual WHERE " +
                    "municipio	= " + campo_municipio	+ " AND " +
                    "ageb		= " + campo_ageb		+ " AND " +
                    "area		= " + campo_area +
                    " ORDER BY cadena";

            fuenteDeCuestionarioIndividual = new FuenteCuestionarioIndividual(this);
            fuenteDeCuestionarioIndividual.open();

            List<ClasesIndividual> listaDeIndividual = fuenteDeCuestionarioIndividual.buscaRegistrosParaArea(comando_SQL);
            ArrayAdapter<ClasesIndividual> adapter = new ArrayAdapter<ClasesIndividual>(this,android.R.layout.simple_list_item_1, listaDeIndividual);

            contador = listaIndividual.getCount();

            for (int i=0;i<contador;i++) {
                el_registro = listaIndividual.getItemAtPosition(i).toString().substring(0, 9);
                buscarCuestionarios();
            }

            dialogoConfirmacion();
        }
    } // Fin de seleccionarArea.

    public void seleccionarManzana(View v) {
        textoProcesando.setVisibility(View.VISIBLE);
        el_registro = listaIndividual.getItemAtPosition(0).toString().substring(0, 9);

        monitor_01.setText("Localizados = " + String.valueOf(listaIndividual.getCount()));
        monitor_02.setText("El registro = " + el_registro);

        campo_municipio	= campoMunicipio.getText().toString();
        campo_ageb		= campoAgeb.getText().toString();
        campo_area		= campoArea.getText().toString();
        campo_manzana	= campoManzana.getText().toString();

        fuenteDeCuestionarioBasico = new FuenteCuestionarioBasico(this);
        fuenteDeCuestionarioBasico.open();

        comando_SQL = "SELECT count(*) FROM cuestionariobasico WHERE " +
                "municipio	= " + campo_municipio	+ " AND " +
                "ageb		= " + campo_ageb		+ " AND " +
                "area		= " + campo_area		+ " AND " +
                "manzana	= " + campo_manzana;

        cantidad_de_registros_en_manzana_en_basico = fuenteDeCuestionarioBasico.cuentaRegistrosEnManzanaEnBasico(comando_SQL);

        if (cantidad_de_registros_en_manzana_en_basico > 0) {
            dialogoYaExisten();
        } else {
            comando_SQL = "SELECT registro, municipio, ageb, area, manzana, vivienda, " +
                    "nombre, paterno, materno, sexo, edad, fechatoma, p72, vive " +
                    "FROM cuestionarioindividual WHERE " +
                    "municipio	= " + campo_municipio	+ " AND " +
                    "ageb		= " + campo_ageb		+ " AND " +
                    "area		= " + campo_area		+ " AND " +
                    "manzana	= " + campo_manzana +
                    " ORDER BY cadena";

            fuenteDeCuestionarioIndividual = new FuenteCuestionarioIndividual(this);
            fuenteDeCuestionarioIndividual.open();

            List<ClasesIndividual> listaDeIndividual = fuenteDeCuestionarioIndividual.buscaRegistrosParaArea(comando_SQL);
            ArrayAdapter<ClasesIndividual> adapter = new ArrayAdapter<ClasesIndividual>(this,android.R.layout.simple_list_item_1, listaDeIndividual);

            contador = listaIndividual.getCount();

            for (int i=0;i<contador;i++) {
                el_registro = listaIndividual.getItemAtPosition(i).toString().substring(0, 9);
                buscarCuestionarios();
            }

            dialogoConfirmacion();
        }
    } // Fin de seleccionarArea.

    public void seleccionarFamilia(View v) {
        familia_seleccionada = true;
//    	campoMunicipio.setText("");
//    	campoAgeb.setText("");
//    	campoArea.setText("");
//    	campoManzana.setText("");
//    	campoVivienda.setText("");
        campoNombre.setText("");
        campoPaterno.setText("");
        campoMaterno.setText("");

        comando_SQL = "SELECT registro, municipio, ageb, area, manzana, vivienda, " +
                "nombre, paterno, materno, sexo, edad, fechatoma, p72, vive " +
                "FROM cuestionarioindividual WHERE " +
                "municipio = " + campo_municipio + " AND " +
                "ageb = " + campo_ageb + " AND " +
                "area = " + campo_area + " AND " +
                "manzana = " + campo_manzana + " AND " +
                "vivienda = " + campo_vivienda ;

        fuenteDeCuestionarioIndividual = new FuenteCuestionarioIndividual(this);
        fuenteDeCuestionarioIndividual.open();

        List<ClasesIndividual> listaDeIndividual = fuenteDeCuestionarioIndividual.buscaVariosRegistros(comando_SQL);
        ArrayAdapter<ClasesIndividual> adapter = new ArrayAdapter<ClasesIndividual>(this,android.R.layout.simple_list_item_1, listaDeIndividual);

        listaIndividual.setAdapter(adapter);
        monitor_01.setText("Localizados = " + String.valueOf(listaIndividual.getCount()));
        fuenteDeCuestionarioIndividual.close();
        botonBuscarCuestionario.setVisibility(View.VISIBLE);

    }
    public void buscarCuestionario(View v) {
        fuenteDeCuestionarioBasico = new FuenteCuestionarioBasico(this);
        fuenteDeCuestionarioBasico.open();

        String comando_00 = "SELECT tableta, encuesto FROM posicionador";
        String el_registro_leido[] = fuenteDeCuestionarioBasico.tomarTableta(comando_00);

        if (el_registro_leido[0] != null) {
            la_tableta = String.valueOf(el_registro_leido[0].toString());
            el_encuesto = String.valueOf(el_registro_leido[1].toString());
        }

        fuenteDeCuestionarioIndividual = new FuenteCuestionarioIndividual(this);
        fuenteDeCuestionarioIndividual.open();

        comando_SQL_registro = "SELECT registro,cadena, municipio, ageb, area, manzana, vivienda, " +
                "nombre, paterno, materno, sexo, edad, fechatoma, p72 " +
                "FROM cuestionarioindividual " +
                "WHERE registro LIKE '%" + el_registro + "%'";

        String matriz[] = fuenteDeCuestionarioIndividual.buscaUnaMatriz(comando_SQL_registro);

        String el_campoRegistro		= matriz[0].toString();
        String el_campoCadena		= matriz[1].toString();
        Integer el_campoMunicipio	= Integer.valueOf(matriz[2].toString());
        Integer el_campoAgeb		= Integer.valueOf(matriz[3].toString());
        Integer el_campoArea		= Integer.valueOf(matriz[4].toString());
        Integer el_campoManzana		= Integer.valueOf(matriz[5].toString());
        Integer el_campoVivienda	= Integer.valueOf(matriz[6].toString());
        String el_campoNombre		= matriz[7].toString();
        String el_campoPaterno		= matriz[8].toString();
        String el_campoMaterno		= matriz[9].toString();
        Integer el_campoSexo		= Integer.valueOf(matriz[10].toString());
        Integer el_campoEdad		= Integer.valueOf(matriz[11].toString());
        String el_campoFechatoma	= matriz[12].toString();

        Calendar calendar = new GregorianCalendar();

        Integer el_campoEdadActual = 0;
        Integer año_Fechatoma;

        if (el_campoFechatoma.length() == 10) {
            año_Fechatoma = Integer.valueOf(el_campoFechatoma.substring(6,10));
            el_campoEdadActual = (calendar.get(Calendar.YEAR) - año_Fechatoma) + el_campoEdad;
        }

        if (el_campoFechatoma.length() == 4) el_campoFechatoma = "05/06/1998";

        if (matriz[13] != null) {
            el_campoP72 = matriz[13].toString();
        }
        else {
            el_campoP72 = "Sin muestra";
        }

        Integer el_resultado = 20; // Entrevista no iniciada.

        fuenteDeCuestionarioBasico = new FuenteCuestionarioBasico(this);
        fuenteDeCuestionarioBasico.open();

        fuenteDeCuestionarioBasico.buscaMatriz(comando_SQL,elrenglon);

        fuenteDeCuestionarioBasico.fijarRegistroPosicionador(el_campoRegistro);

        if (familia_seleccionada = false) {
            campoMunicipio.setText("");
            campoAgeb.setText("");
            campoArea.setText("");
            campoManzana.setText("");
            campoVivienda.setText("");
        }

        campoNombre.setText("");
        campoPaterno.setText("");
        campoMaterno.setText("");

        botonBuscarCuestionario.setVisibility(View.VISIBLE);
        campoNombre.setBackgroundColor(Color.WHITE);
        campoNombre.setTextColor(Color.RED);
        campoPaterno.setBackgroundColor(Color.WHITE);
        campoPaterno.setTextColor(Color.RED);
        campoMaterno.setBackgroundColor(Color.WHITE);
        campoMaterno.setTextColor(Color.RED);
    }

    public void buscarCuestionario() {
        fuenteDeCuestionarioBasico = new FuenteCuestionarioBasico(this);
        fuenteDeCuestionarioBasico.open();

        String comando_00 = "SELECT tableta, encuesto FROM posicionador";
        String el_registro_leido[] = fuenteDeCuestionarioBasico.tomarTableta(comando_00);

        if(el_registro_leido[0] != null) {
            la_tableta = String.valueOf(el_registro_leido[0].toString());
            el_encuesto = String.valueOf(el_registro_leido[1].toString());
        }

        fuenteDeCuestionarioIndividual = new FuenteCuestionarioIndividual(this);
        fuenteDeCuestionarioIndividual.open();

        comando_SQL_registro = "SELECT registro, cadena, municipio, ageb, area, manzana, vivienda, " +
                "nombre, paterno, materno, sexo, edad, fechatoma, p72 " +
                "FROM cuestionarioindividual " +
                "WHERE registro LIKE '%" + el_registro + "%'";

        String matriz[] = fuenteDeCuestionarioIndividual.buscaUnaMatriz(comando_SQL_registro);

        String el_campoRegistro		= matriz[0].toString();
        String el_campoCadena		= matriz[1].toString();
        Integer el_campoMunicipio	= Integer.valueOf(matriz[2].toString());
        Integer el_campoAgeb		= Integer.valueOf(matriz[3].toString());
        Integer el_campoArea		= Integer.valueOf(matriz[4].toString());
        Integer el_campoManzana		= Integer.valueOf(matriz[5].toString());
        Integer el_campoVivienda	= Integer.valueOf(matriz[6].toString());
        String el_campoNombre		= matriz[7].toString();
        String el_campoPaterno		= matriz[8].toString();
        String el_campoMaterno		= matriz[9].toString();
        Integer el_campoSexo		= Integer.valueOf(matriz[10].toString());
        Integer el_campoEdad		= Integer.valueOf(matriz[11].toString());
        String el_campoFechatoma	= matriz[12].toString();

        Calendar calendar = new GregorianCalendar();

        Integer el_campoEdadActual = 0;
        Integer año_Fechatoma;

        if (el_campoFechatoma.length() == 10) {
            año_Fechatoma = Integer.valueOf(el_campoFechatoma.substring(6,10));
            el_campoEdadActual = (calendar.get(Calendar.YEAR) - año_Fechatoma) + el_campoEdad;
        }

        if (el_campoFechatoma.length() == 4) el_campoFechatoma = "05/06/1998";

        if (matriz[13] != null) {
            el_campoP72 = matriz[13].toString();
        }
        else {
            el_campoP72 = "Sin muestra";
        }

        Integer el_resultado = 20; // Entrevista no iniciada.

        fuenteDeCuestionarioBasico = new FuenteCuestionarioBasico(this);
        fuenteDeCuestionarioBasico.open();

        fuenteDeCuestionarioBasico.buscaMatriz(comando_SQL_registro,elrenglon);
    }

    @Override
    public void onItemClick(final AdapterView<?> adapterView, View view, int renglon, long id) {
        String elrenglon = String.valueOf(adapterView.getItemAtPosition(renglon));
        String elregistro = elrenglon.substring(0, 9);

        fuenteDeCuestionarioIndividual = new FuenteCuestionarioIndividual(this);
        fuenteDeCuestionarioIndividual.open();

        comando_SQL = "SELECT registro, municipio, ageb, area, manzana, vivienda, " +
                "nombre, paterno, materno, sexo, edad, p72 " +
                "FROM cuestionarioindividual " +
                "WHERE registro = " + "'" + elregistro + "'";

        String matriz[] = fuenteDeCuestionarioIndividual.buscaMatriz(comando_SQL);
        fuenteDeCuestionarioIndividual.close();

        el_registro =			matriz[0].toString();
        campoMunicipio.setText(	matriz[1].toString());
        campoAgeb.setText(		matriz[2].toString());
        campoArea.setText(		matriz[3].toString());
        campoManzana.setText(	matriz[4].toString());
        campoVivienda.setText(	matriz[5].toString());
        campoNombre.setText(	matriz[6].toString());
        campoPaterno.setText(	matriz[7].toString());
        campoMaterno.setText(	matriz[8].toString());

        fuenteDeCuestionarioBasico = new FuenteCuestionarioBasico(this);
        fuenteDeCuestionarioBasico.open();

        xcomando_SQL = "SELECT registro " +
                "FROM cuestionariobasico " +
                "WHERE registro = " +
                "'" + elregistro + "'";

        String el_prospecto = fuenteDeCuestionarioBasico.buscarExistente(xcomando_SQL);

        botonSeleccionarFamilia.setVisibility(View.VISIBLE);

        if (el_prospecto == "No está") {
            botonBuscarCuestionario.setVisibility(View.VISIBLE);
        }

        if (el_prospecto == "Sí está") {
            campoMaterno.setText("Ya existe");
            campoMaterno.setBackgroundColor(Color.WHITE);
            campoMaterno.setTextColor(Color.RED);
            botonBuscarCuestionario.setVisibility(View.VISIBLE);
        }
//		} // Fin de if (matrizBasico[0] != null )
    } // Fin de onItemClick

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == this.requestCode && resultCode == RESULT_OK) {
            // Actualizar el Adapter
            fuenteDeCuestionarioIndividual.open();
            refrescarLista();
        }
    }

    private void refrescarLista() {
        List<ClasesIndividual> listaDeIndividual = fuenteDeCuestionarioIndividual.buscaVariosRegistros(comando_SQL);
        ArrayAdapter<ClasesIndividual> adapter = new ArrayAdapter<ClasesIndividual>(this,
                android.R.layout.simple_list_item_1, listaDeIndividual);
        listaIndividual.setAdapter(adapter);
    }

    private Dialog dialogoConfirmacion() {
        final String DEFAULT_YES = "Confirmado";

        AlertDialog.Builder ventanaDeAlerta = new AlertDialog.Builder(this);
        ventanaDeAlerta.setTitle("Aviso");
        ventanaDeAlerta.setMessage("Han sido creados " + contador + " registros.");

        ventanaDeAlerta.setPositiveButton(DEFAULT_YES, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int which) {
                botonSeleccionarArea.setVisibility(View.VISIBLE);
                textoProcesando.setVisibility(View.VISIBLE);
                dialogInterface.cancel();
            }
        });

        return ventanaDeAlerta.show();
    }

    private Dialog dialogoYaExisten() {
        final String DEFAULT_YES = "Aceptar";

        AlertDialog.Builder ventanaDeAlerta = new AlertDialog.Builder(this);
        ventanaDeAlerta.setTitle("Aviso");
        ventanaDeAlerta.setMessage("Ya existe el Área.");

        ventanaDeAlerta.setPositiveButton(DEFAULT_YES, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int which) {
                botonSeleccionarArea.setVisibility(View.VISIBLE);
                textoProcesando.setVisibility(View.VISIBLE);
                dialogInterface.cancel();
            }
        });

        return ventanaDeAlerta.show();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        fuenteDeCuestionarioIndividual.close();
        super.onPause();
    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        fuenteDeCuestionarioIndividual.open();
        super.onResume();
    }

    public void ventanaAnterior(View v) {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
