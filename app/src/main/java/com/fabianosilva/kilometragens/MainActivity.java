package com.fabianosilva.kilometragens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText editCentimetros;
    private TextView resultadoMetros;
    private TextView resultadoQuilometros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editCentimetros = findViewById(R.id.editTextViewNumberDecimalCentimetros);
        resultadoMetros = findViewById(R.id.textViewMetros);
        resultadoQuilometros = findViewById(R.id.textViewQuilometros);

    }

    public void calcularMetragens (View view){
        double centimetros = Double.parseDouble(editCentimetros.getText().toString());


        double totalMetros = centimetros / 100;
        double totalQuilometros = centimetros / 100000;

        resultadoQuilometros.setText("A QUANTIDADE É DE "+ totalQuilometros + " Km.");
        resultadoMetros.setText("A QUANTIDADE É DE "+ totalMetros + " M");

    }
}