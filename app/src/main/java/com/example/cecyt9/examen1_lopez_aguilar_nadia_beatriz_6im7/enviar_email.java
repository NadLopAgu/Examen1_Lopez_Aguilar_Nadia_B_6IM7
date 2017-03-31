package com.example.cecyt9.examen1_lopez_aguilar_nadia_beatriz_6im7;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class enviar_email extends AppCompatActivity {

    TextView t_n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enviar_email);

        t_n = (TextView) findViewById(R.id.Nombre_Total);
        try {
        Intent Try = getIntent();
        Bundle Pack = Try.getExtras();
            t_n.setText("Nadia Beatriz Lopez Aguilar, Resultado: "+Pack.getString("Resultado"));
        }catch(Exception e)
        {
            Toast.makeText(getApplicationContext(),"Ocurrio un error", Toast.LENGTH_LONG).show();
        }
    }

    public void Enviar(View vw){
        Intent Try = new Intent(Intent.ACTION_SEND);
        Try.setType("text/plain");
        Try.putExtra(Intent.EXTRA_SUBJECT, "Asunto: Examen 1");
        Try.putExtra(Intent.EXTRA_TEXT, "Contenido del correo:\n"+t_n.getText().toString());
        /*Try.putExtra(Intent.EXTRA_EMAIL, new String[] { "eoropezag@ipn.mx"} );*/
        Try.putExtra(Intent.EXTRA_EMAIL, new String[] { "nadialopezaguilar4399@gmail.com"} );
        startActivity(Try);
    }

}
