package com.myapp11;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class InicioSesion extends AppCompatActivity {

    Button btnInicioSesion;
    Button btnVolverAlHome2;
    EditText inputCorreoSession;
    EditText inputPasswordSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_inicio_sesion);

        btnInicioSesion = findViewById(R.id.btn_Iniciar_sesion);
        btnVolverAlHome2 = findViewById(R.id.btn_Volver_Iniciosesion);
        inputCorreoSession = findViewById(R.id.input_email_iniciosesion);
        inputPasswordSesion = findViewById(R.id.input_password);
    }
    public void irDashboardDesdeInicioSesion(){
        Intent intent = new Intent(this, DasBoardt.class);
        startActivity(intent);
    }
}