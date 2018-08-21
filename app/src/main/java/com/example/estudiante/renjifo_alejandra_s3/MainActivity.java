package com.example.estudiante.renjifo_alejandra_s3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv_imc;
    EditText et_masa;
    EditText et_altura;
    Button btn_calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_imc=findViewById(R.id.tv_imc);
        et_masa=findViewById(R.id.et_masa);
        et_altura=findViewById(R.id.et_altura);
        btn_calcular=findViewById(R.id.btn_calcular);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String masa = et_masa.getText().toString();
                String altura = et_altura.getText().toString();
                float masF= Float.valueOf(masa);
                float alt= Float.valueOf(altura);
                float altF= alt/100;
                float imc= masF/(altF*altF);
                tv_imc.setText(""+imc);

                Toast.makeText(MainActivity.this,"Calculando",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
