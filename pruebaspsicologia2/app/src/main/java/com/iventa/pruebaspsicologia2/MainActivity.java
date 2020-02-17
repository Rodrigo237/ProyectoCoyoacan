package com.iventa.pruebaspsicologia2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Selection;
import android.view.View;
import android.widget.Button;

import com.iventa.pruebaspsicologia2.R;
import com.iventa.pruebaspsicologia2.R.layout;
//import com.example.cuestionariopsicologia.R.layout.activity_main;

public class MainActivity extends Activity {

    private Button button;
    Button Iniciar;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.escuestador);
        Iniciar = (Button)findViewById(R.id.iniciarc);

        Iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent init = new Intent(getApplicationContext(), seleccion.class);
                startActivity(init);
            }
        });
    }

   /* public void Cuestionario(View view){
        Intent init_cuestionario = new Intent(this, seleccion.class);
        startActivity(init_cuestionario);
    }*/

    public void encuestadores(View view){
        Intent encues = new Intent(this, encuestadores.class);
        startActivity(encues);
    }

    public void buscaPros(View view){
        Intent buscap = new Intent(this, BuscarProspectos.class);
        startActivity(buscap);
    }

    public void administradorDeBasesDeDatos(View v) {
        Intent i = new Intent(this, TabletaAdministrador.class);
        startActivity(i);
    }

    public void BuscarCuestionarios(View view){
        Intent buscaCuestionario = new Intent(this,BuscarCuestionarios.class);
        startActivity(buscaCuestionario);
    }
}
