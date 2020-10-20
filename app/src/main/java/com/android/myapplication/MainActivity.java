package com.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//https://developer.android.com/guide/components/activities/activity-lifecycle?hl=es
//https://developer.android.com/guide/components/intents-filters?hl=es
public class MainActivity extends AppCompatActivity {

    TextView tvConteoLaptop, tvConteoRadio, tvConteoTelevisor;
    Button btLaptop, btRadio, btTelevisor;
    int conteoLaptop, conteoRadio, conteoTelevisor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvConteoLaptop = findViewById(R.id.tvConteoLaptop);
        tvConteoRadio = findViewById(R.id.tvConteoRadio);
        tvConteoTelevisor = findViewById(R.id.tvConteoTelevisor);

        btLaptop = findViewById(R.id.btLaptop);
        btRadio = findViewById(R.id.btRadio);
        btTelevisor = findViewById(R.id.btTelevisor);

        btLaptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                conteoLaptop = conteoLaptop + 1;
                Intent intent = new Intent(MainActivity.this, ConteoActivity.class);
                intent.putExtra("tipoConteo", "Laptop");
                intent.putExtra("conteo", conteoLaptop);
                startActivity(intent);
            }
        });

        btRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                conteoRadio = conteoRadio + 1;
                Intent intent = new Intent(MainActivity.this, ConteoActivity.class);
                intent.putExtra("tipoConteo", "Radio");
                intent.putExtra("conteo", conteoRadio);
                startActivity(intent);
            }
        });

        btTelevisor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                conteoTelevisor = conteoTelevisor + 1;
                Intent intent = new Intent(MainActivity.this, ConteoActivity.class);
                intent.putExtra("tipoConteo", "Televisor");
                intent.putExtra("conteo", conteoTelevisor);
                startActivity(intent);
            }
        });

        Log.println(Log.INFO, "ALM", "onCreate(MainActivity)");
    }

    @Override
    protected void onStart() {
        Log.println(Log.INFO, "ALM", "onStart(MainActivity)");
        super.onStart();
    }

    @Override
    protected void onResume() {
        //Actualizamos el conteo de los aparatos en los textViews.
        tvConteoTelevisor.setText(Integer.toString(conteoTelevisor));
        tvConteoLaptop.setText(Integer.toString(conteoLaptop));
        tvConteoRadio.setText(Integer.toString(conteoRadio));

        Log.println(Log.INFO, "ALM", "onResume(MainActivity)");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.println(Log.INFO, "ALM", "onPause(MainActivity)");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.println(Log.INFO, "ALM", "onStop(MainActivity)");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.println(Log.INFO, "ALM", "onRestart(MainActivity)");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.println(Log.INFO, "ALM", "onDestroy(MainActivity)");
        super.onDestroy();
    }
}