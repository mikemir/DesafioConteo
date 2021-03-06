package com.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
    }
}