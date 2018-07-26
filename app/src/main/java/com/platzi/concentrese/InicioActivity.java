package com.platzi.concentrese;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.platzi.concentrese.opciones.ModoJuegoActivity;
import com.platzi.concentrese.opciones.PuntageAltoActivity;
import com.platzi.concentrese.opciones.TipoJuegoActivity;

public class InicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }

    public void iniciar(View view)
    {
        Intent intent=new Intent(InicioActivity.this, TipoJuegoActivity.class);
        startActivity(intent);
    }

    public void puntagesAltos(View view)
    {
        Intent intent=new Intent(InicioActivity.this, PuntageAltoActivity.class);
        startActivity(intent);
    }

    public void configuracion(View view)
    {
        Intent intent=new Intent(InicioActivity.this, ModoJuegoActivity.class);
        startActivity(intent);

    }
}
