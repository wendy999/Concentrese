package com.platzi.concentrese.opciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.platzi.concentrese.R;



import android.content.ContentValues;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.platzi.concentrese.R;

import java.util.ArrayList;
import java.util.Collections;

public class JuegoFacilActivity extends AppCompatActivity {

        ArrayList<Integer> arrImagenes =  new ArrayList<Integer>();
        ImageView carta1,carta7,carta4,carta8,carta2,carta3,carta5,carta6;

        TextView txtNumeroIntentos;
        Chronometer chronometer;


        String tipo = "Facil";
        String modoNivel;

        View imagenSeleccionada1;
        View imagenSeleccionada2;

        int numeroParejas = 4;
        int numeroParejasCorrectas=0;
        int numeroInentos=0;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_facil);

            cargarListaImagenes();


            carta1=(ImageView) findViewById(R.id.carta1);
            carta1.setTag(obtenerImagenAleatoria());
            carta2=(ImageView) findViewById(R.id.carta2);
            carta2.setTag(obtenerImagenAleatoria());
            carta3=(ImageView) findViewById(R.id.carta3);
            carta3.setTag(obtenerImagenAleatoria());
            carta4=(ImageView) findViewById(R.id.carta4);
            carta4.setTag(obtenerImagenAleatoria());
            carta5=(ImageView) findViewById(R.id.carta5);
            carta5.setTag(obtenerImagenAleatoria());
            carta6=(ImageView) findViewById(R.id.carta6);
            carta6.setTag(obtenerImagenAleatoria());
            carta7=(ImageView) findViewById(R.id.carta7);
            carta7.setTag(obtenerImagenAleatoria());
            carta8=(ImageView) findViewById(R.id.carta8);
            carta8.setTag(obtenerImagenAleatoria());


            txtNumeroIntentos = (TextView) findViewById(R.id.chronometer);
            chronometer = (Chronometer) findViewById(R.id.crmTiempo);

        }

    private void cargarListaImagenes()
    {
        arrImagenes.add(R.drawable.cristiano);
        arrImagenes.add(R.drawable.gerardpiqu_);
        arrImagenes.add(R.drawable.sergioramoz);
        arrImagenes.add(R.drawable.harrykane);
        arrImagenes.add(R.drawable.cristiano);
        arrImagenes.add(R.drawable.gerardpiqu_);
        arrImagenes.add(R.drawable.sergioramoz);
        arrImagenes.add(R.drawable.harrykane);
    }

    private int obtenerImagenAleatoria()
    {
        Collections.shuffle(arrImagenes);
        int randomIndex = (int) Math.random() *arrImagenes.size();
        int imgSeleccionada = arrImagenes.get(randomIndex);

        arrImagenes.remove(randomIndex);
        return imgSeleccionada;
    }

    public void visualizarCarta(View view)
    {
        if (imagenSeleccionada1 != null && imagenSeleccionada2 != null)
        {
            return;
        }
        ImageView imgTmp =(ImageView) findViewById(view.getId());
        int rscImgTmp = (int) view.getTag();
        imgTmp.setImageResource(rscImgTmp);

        if(imagenSeleccionada1 == null)
        {
            imagenSeleccionada1 = view;
        }
        else
        {
            if(imagenSeleccionada1.getTag() == view.getTag())
            {
                Toast.makeText(JuegoFacilActivity.this,"por favor seleccione otra carta",Toast.LENGTH_SHORT).show();
                return;
            }
            imagenSeleccionada2 =view;

            final CountDownTimer contador =new CountDownTimer(500,500) {
                @Override
                public void onTick(long millisUntilFinished)
                {
                }
                @Override
                public void onFinish()
                {
                    ImageView imgTemp1 = (ImageView)findViewById(imagenSeleccionada1.getId());
                    ImageView imgTemp2 = (ImageView)findViewById(imagenSeleccionada2.getId());

                    int rscImg1 = (int)imagenSeleccionada1.getTag();
                    int rscImg2 = (int)imagenSeleccionada2.getTag();

                    if(rscImg1 == rscImg2){

                        imgTemp1.setEnabled(false);
                        imgTemp1.setEnabled(false);

                        numeroParejasCorrectas++;

                        if(numeroParejasCorrectas  == numeroParejas)
                        {
                           Toast.makeText(JuegoFacilActivity.this,"Felicidades has ganado",Toast.LENGTH_SHORT).show();
                            chronometer.stop();
                            finish();
                        }
                    }
                    else
                    {
                        imgTemp1.setImageResource(R.drawable.carta);
                        imgTemp2.setImageResource(R.drawable.carta);
                    }
                    imagenSeleccionada1 = null;
                    imagenSeleccionada2 = null;
                }

            };
            contador.start();
        }
    }


}

