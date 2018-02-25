package com.example.adibf.adibfakhrimuhtadi_1202154192_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText userName, passWord; //variable untuk username dan password
    String user, pass; //variable untuk tempat username dan password

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void signIn(View view) {
        userName = (EditText) findViewById(R.id.username);
        passWord = (EditText) findViewById(R.id.password);
        user = userName.getText().toString();
        pass = passWord.getText().toString();

//autentikasi ketika login
        if ((user.contains("EAD"))&&((pass.contains("MOBILE")))){
            Toast.makeText(this, "Login Berhasil!", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Login.this, MainActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Login Gagal!", Toast.LENGTH_SHORT).show();

        }
    }
}
