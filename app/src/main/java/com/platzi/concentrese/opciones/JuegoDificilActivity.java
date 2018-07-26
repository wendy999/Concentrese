package com.platzi.concentrese.opciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.platzi.concentrese.R;

import java.util.ArrayList;
import java.util.Collections;

public class JuegoDificilActivity extends AppCompatActivity {

    ArrayList<Integer> arrImg = new ArrayList<Integer>();

    ImageView carta1,carta2,carta3,carta4,carta5,carta6,carta7,carta8,
            carta9,carta10,carta11,carta12,carta13,carta14,carta15,
            carta16,carta17,carta18,carta19,carta20,carta21,carta22,carta23,carta24;

    View imagSeleccionada1;
    View imagSeleccionada2;

    int nueroParejas=12;
    int numeroParejasCorrectas=0;
    int nummeroIntentos=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_dificil);

        cargarImgIniciales();

        carta1 = (ImageView) findViewById(R.id.carta1);
        carta1.setTag(imgAleatoria());
        carta2 = (ImageView) findViewById(R.id.carta2);
        carta2.setTag(imgAleatoria());
        carta3 = (ImageView) findViewById(R.id.carta3);
        carta3.setTag(imgAleatoria());
        carta4 = (ImageView) findViewById(R.id.carta4);
        carta4.setTag(imgAleatoria());
        carta5 = (ImageView) findViewById(R.id.carta5);
        carta5.setTag(imgAleatoria());
        carta6 = (ImageView) findViewById(R.id.carta6);
        carta6.setTag(imgAleatoria());
        carta7 = (ImageView) findViewById(R.id.carta7);
        carta7.setTag(imgAleatoria());
        carta8 = (ImageView) findViewById(R.id.carta8);
        carta8.setTag(imgAleatoria());
        carta9 = (ImageView) findViewById(R.id.carta9);
        carta9.setTag(imgAleatoria());
        carta10 = (ImageView) findViewById(R.id.carta10);
        carta10.setTag(imgAleatoria());
        carta11 = (ImageView) findViewById(R.id.carta11);
        carta11.setTag(imgAleatoria());
        carta12 = (ImageView) findViewById(R.id.carta12);
        carta12.setTag(imgAleatoria());
        carta13 = (ImageView) findViewById(R.id.carta13);
        carta13.setTag(imgAleatoria());
        carta14 = (ImageView) findViewById(R.id.carta14);
        carta14.setTag(imgAleatoria());
        carta15 = (ImageView) findViewById(R.id.carta15);
        carta15.setTag(imgAleatoria());
        carta16 = (ImageView) findViewById(R.id.carta16);
        carta16.setTag(imgAleatoria());
        carta17 = (ImageView) findViewById(R.id.carta17);
        carta17.setTag(imgAleatoria());
        carta18 = (ImageView) findViewById(R.id.carta18);
        carta18.setTag(imgAleatoria());
        carta19 = (ImageView) findViewById(R.id.carta19);
        carta19.setTag(imgAleatoria());
        carta20 = (ImageView) findViewById(R.id.carta20);
        carta20.setTag(imgAleatoria());
        carta21 = (ImageView) findViewById(R.id.carta21);
        carta21.setTag(imgAleatoria());
        carta22 = (ImageView) findViewById(R.id.carta22);
        carta22.setTag(imgAleatoria());
        carta23 = (ImageView) findViewById(R.id.carta23);
        carta23.setTag(imgAleatoria());
        carta24 = (ImageView) findViewById(R.id.carta24);
        carta24.setTag(imgAleatoria());
    }

    private int imgAleatoria()
    {
        Collections.shuffle(arrImg);
        int aleatoria = (int) Math.random() * arrImg.size();
        int imgSeleccionada = arrImg.get(aleatoria);

        arrImg.remove(aleatoria);
        return imgSeleccionada;
    }

    private void cargarImgIniciales()
    {
        arrImg.add(R.drawable.cristiano);
        arrImg.add(R.drawable.harrykane);
        arrImg.add(R.drawable.sergioramoz);
        arrImg.add(R.drawable.gerardpiqu_);
        arrImg.add(R.drawable.messi);
        arrImg.add(R.drawable.modri_);
        arrImg.add(R.drawable.mohamet);
        arrImg.add(R.drawable.neymar);
        arrImg.add(R.drawable.paulo);
        arrImg.add(R.drawable.zu_rez);
        arrImg.add(R.drawable.james);
        arrImg.add(R.drawable.mbapp_);
    }
    public void visualizarCarta(View view)
    {
        if (imagSeleccionada1 != null && imagSeleccionada2 != null)
        {
            return;
        }
        if (imagSeleccionada1 ==null)
        {
            imagSeleccionada1 = view;
        }
        else
        {
        }

    }
}
