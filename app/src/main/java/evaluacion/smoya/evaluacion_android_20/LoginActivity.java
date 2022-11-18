package evaluacion.smoya.evaluacion_android_20;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
    private Button btnLogin;
    private String txtPass, txtUsuario;
    private EditText tvUsuario, tvPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.SplashTheme);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btnLogin);

        try {
            Bundle datos = LoginActivity.this.getIntent().getExtras();
            txtUsuario = datos.getString("usuario");
            txtPass = datos.getString("contraseña");
            Toast toast = Toast.makeText(this,"usuario:"+txtUsuario+" pass:"+txtPass,Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.START, 90, 0);
            toast.show();
        }
        catch(Exception e) {

        }
    }


    public void buttonLogin(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        Bundle datos = LoginActivity.this.getIntent().getExtras();
        txtUsuario = datos.getString("usuario");
        txtPass = datos.getString("contraseña");
        tvUsuario = findViewById(R.id.editTextTextPersonName);
        tvPass = findViewById(R.id.editTextTextPassword);
        if(tvUsuario.getText().toString().equals(txtUsuario) && tvPass.getText().toString().equals(txtPass)){
            startActivity(intent);
        }else{
            Toast toast = Toast.makeText(this,"Credenciales Incorrectas"+"usuario:"+txtUsuario+" pass:"+txtPass,Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.START, 90, 0);
            toast.show();
        }

    }

    public void onButtonClicked(View view) {
        try {
        Bundle datos = LoginActivity.this.getIntent().getExtras();
        txtUsuario = datos.getString("usuario");
        txtPass = datos.getString("contraseña");
        Toast toast = Toast.makeText(this,"Credenciales Incorrectas"+"usuario:"+txtUsuario+" pass:"+txtPass,Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.START, 90, 0);
        toast.show();
        }
        catch (Exception e) {
            Intent intent = new Intent (this, MainActivity.class);
            startActivity(intent);
        }

    }

    public void onButtonClicked2(View view) {
        try {
            Bundle datos = LoginActivity.this.getIntent().getExtras();
            txtUsuario = datos.getString("usuario");
            txtPass = datos.getString("contraseña");
            Toast toast = Toast.makeText(this,"usuario:"+txtUsuario+" pass:"+txtPass,Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.START, 90, 0);
            toast.show();
        }
        catch(Exception e) {

        }
        Intent intent = new Intent (this, SignUpActivity.class);
        startActivity(intent);
    }
}
