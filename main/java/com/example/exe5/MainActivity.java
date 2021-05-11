package com.example.exe5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    EditText txtsalario;
    public void calculo(View view){

        txtsalario = findViewById(R.id.txtsalario);
        double s = Double.parseDouble(txtsalario.getText().toString());

        double s1 = s + ((s * 5)/100);
        double s2 = s1 - ((s1 * 7 )/100);

        Toast.makeText(MainActivity.this,"O sálario a receber é : " + s2 + " Kzs",Toast.LENGTH_LONG ).show();
    }
}