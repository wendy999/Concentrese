package com.platzi.concentrese.opciones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.platzi.concentrese.R;

public class TipoJuegoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_juego);
    }
    public void nivelFacil(View view)
    {
        Intent intent=new Intent(TipoJuegoActivity.this, JuegoFacilActivity.class);
        startActivity(intent);
    }

    public void nivelMedio(View view)
    {

        Intent intent=new Intent(TipoJuegoActivity.this, JuegoMedioActivity.class);
        startActivity(intent);
    }

    public void nivelDificil(View view)
    {
        Intent intent=new Intent(TipoJuegoActivity.this, JuegoDificilActivity.class);
        startActivity(intent);
    }
}
