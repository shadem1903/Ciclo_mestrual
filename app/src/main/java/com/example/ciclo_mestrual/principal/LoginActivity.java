package com.example.ciclo_mestrual.principal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ciclo_mestrual.R;

public class LoginActivity extends AppCompatActivity  {
    EditText Usuario,Password;
    TextView txtOlvido;
    Button btn_ingresar, btn_registrrase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Usuario = findViewById(R.id.Usuario);
        Password = findViewById(R.id.Password);
        txtOlvido = findViewById(R.id.txtOlvido);
        btn_ingresar = findViewById(R.id.btn_ingresar);
        btn_registrrase = findViewById(R.id.btn_registrarse);

        btn_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DrawerNavigationActivity.class);
                startActivityForResult(intent, 0);
            }
        });
        btn_registrrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),RegisterActivity.class);
                startActivityForResult(intent,0);
            }
        });

    }

    /*@Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.txtRegistro:
                Intent intent = new Intent(MainActivity.);
                startActivity(intent);
                break;
            case R.id.txtOlvido:
                Intent intent1 = new Intent(MainActivity.);
                startActivity(intent1);
                break;
        }
*/
}