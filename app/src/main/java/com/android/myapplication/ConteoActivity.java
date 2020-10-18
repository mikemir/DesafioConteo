package com.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConteoActivity extends AppCompatActivity {

    Button btVolver;
    TextView tvConteo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conteo);

        Intent intent = getIntent();

        tvConteo = (TextView) findViewById(R.id.tvConteo);
        btVolver = (Button) findViewById(R.id.btVolver);

        String textoConteo = intent.getStringExtra("tipoConteo") + " " + intent.getIntExtra("conteo", 0);
        tvConteo.setText(textoConteo);

        btVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        Log.println(Log.INFO, "ALM", "onCreate(ConteoActivity)");
    }

    @Override
    protected void onStart() {
        Log.println(Log.INFO, "ALM", "onStart(ConteoActivity)");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.println(Log.INFO, "ALM", "onResume(ConteoActivity)");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.println(Log.INFO, "ALM", "onPause(ConteoActivity)");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.println(Log.INFO, "ALM", "onStop(ConteoActivity)");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.println(Log.INFO, "ALM", "onRestart(ConteoActivity)");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.println(Log.INFO, "ALM", "onDestroy(ConteoActivity)");
        super.onDestroy();
    }
}