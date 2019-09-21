package com.example.healthcontrol.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.healthcontrol.R;

public class InformacoesActivity extends AppCompatActivity {
private Button btnVamos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacoes);

   btnVamos.findViewById(R.id.BotaoVamos) ;
   btnVamos.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {

           Intent intent = new Intent(InformacoesActivity.this, ResultadoActivity.class);
           startActivity(intent);
       }
   });





    }







}
