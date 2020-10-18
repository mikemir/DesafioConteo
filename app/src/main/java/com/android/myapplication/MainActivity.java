package com.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//https://developer.android.com/guide/components/activities/activity-lifecycle?hl=es
public class MainActivity extends AppCompatActivity {

    TextView tvConteoLaptop, tvConteoRadio, tvConteoTelevisor;
    Button btLaptop, btRadio, btTelevisor;
    int conteoLaptop, conteoRadio, conteoTelevisor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvConteoLaptop = (TextView) findViewById(R.id.tvConteoLaptop);
        tvConteoRadio = (TextView) findViewById(R.id.tvConteoRadio);
        tvConteoTelevisor = (TextView) findViewById(R.id.tvConteoTelevisor);

        btLaptop = (Button) findViewById(R.id.btLaptop);
        btRadio = (Button) findViewById(R.id.btRadio);
        btTelevisor = (Button) findViewById(R.id.btTelevisor);

        btLaptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                conteoLaptop++;
                Intent intent = new Intent(MainActivity.this, ConteoActivity.class);
                intent.putExtra("tipoConteo", "Laptop");
                intent.putExtra("conteo", conteoLaptop);
                startActivity(intent);
            }
        });

        btRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                conteoRadio++;
                Intent intent = new Intent(MainActivity.this, ConteoActivity.class);
                intent.putExtra("tipoConteo", "Radio");
                intent.putExtra("conteo", conteoRadio);
                startActivity(intent);
            }
        });

        btTelevisor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                conteoTelevisor++;
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
        tvConteoTelevisor.setText(Integer.toString(conteoTelevisor));
        tvConteoLaptop.setText(Integer.toString(conteoLaptop));
        tvConteoRadio.setText(Integer.toString(conteoRadio));
        Log.println(Log.INFO, "ALM", "onRestart(MainActivity)");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.println(Log.INFO, "ALM", "onDestroy(MainActivity)");
        super.onDestroy();
    }
}