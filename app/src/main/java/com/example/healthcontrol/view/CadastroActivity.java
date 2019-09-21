package com.example.healthcontrol.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.healthcontrol.R;

public class CadastroActivity extends AppCompatActivity {

    private Button btnComecar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        initViews();

        btnComecar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CadastroActivity.this,InformacoesActivity.class));
            }
        });
    }

    public void initViews(){
        btnComecar = findViewById(R.id.btnComecar);
    }
}
