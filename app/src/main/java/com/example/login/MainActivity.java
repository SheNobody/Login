package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String mail = "mario@gmail.com";
    String password = "123456";
    EditText emailfild, passwordfild;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailfild = findViewById(R.id.email);
        passwordfild = findViewById(R.id.password);
        button = findViewById(R.id.button);
        String inputMail = emailfild.getText().toString();
        String inputPassword = passwordfild.getText().toString();
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
    private void showErrorMessage(String errorMessage) {
        Toast.makeText(
                this,
                errorMessage,
                Toast.LENGTH_SHORT
        ).show();
    }
}
