package com.example.cecyt9.examen1_lopez_aguilar_nadia_beatriz_6im7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Examen_pant1 extends AppCompatActivity {

    EditText Money;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examen_pant1);
        Money = (EditText) findViewById(R.id.Enviar);
    }

    public void Precionarbtn(View vw) {
        try{
            int Total = Integer.parseInt(Money.getText().toString());
            Toast.makeText(getApplicationContext(),""+Total/18, Toast.LENGTH_LONG).show();
            Intent Try = new Intent(this,enviar_email.class);
            Bundle Pack = new Bundle();
            Pack.putString("Resultado",""+Total/18);
            Try.putExtras(Pack);
            finish();
            startActivity(Try);

        }catch(Exception e)
        {
            Toast.makeText(getApplicationContext(),"Ocurrio un error"+e.getMessage(), Toast.LENGTH_LONG).show();
        }

    }


}
