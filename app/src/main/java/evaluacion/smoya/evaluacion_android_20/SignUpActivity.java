package evaluacion.smoya.evaluacion_android_20;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {
    EditText txtUsuario;
    EditText txtPass;
    Button btnRegistrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void btnRegistrarse(View view) {
        txtUsuario  = findViewById(R.id.txtUsuario);
        txtPass = findViewById(R.id.txtPass);
        btnRegistrarse = findViewById(R.id.btnRegistrarse);
        Intent intent = new Intent (this, MainActivity.class);
        intent.putExtra("usuario", txtUsuario.getText().toString());
        intent.putExtra("contraseña", txtPass.getText().toString());
        startActivity(intent);
    }

    public void onButtonClicked3(View view) {
        Intent intent = new Intent (this, LoginActivity.class);
        startActivity(intent);
    }
}

