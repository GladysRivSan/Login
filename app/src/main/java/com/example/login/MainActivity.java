package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String mail = "gladys@hotmail.com";
    String password = "123456";
    EditText mailField, passwordField;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mailField = findViewById(R.id.email_Field);
        passwordField = findViewById(R.id.password_Field);
        button = findViewById(R.id.boton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputMail = mailField.getText().toString();
                String inputPassword = passwordField.getText().toString();

                if (!Patterns.EMAIL_ADDRESS.matcher(inputMail).matches()) {
                    showErrorMessage(
                            "Ingrese un correo electrónico válido"
                    );
                    return;
                }

                if (!mail.equals(inputMail)) {
                    showErrorMessage(
                            "El correo es inválido"
                    );
                    return;
                }

                if (!password.equals(inputPassword)) {
                    showErrorMessage(
                            "La contraseña en invalida"
                    );
                }

            }

        });


    }

    private void showErrorMessage(String errorMessage) {
        Toast.makeText(
                this,
                errorMessage,
                Toast.LENGTH_SHORT
        ).show();
    }
}