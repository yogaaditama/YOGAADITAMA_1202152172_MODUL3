package com.example.asusx453sa.YOGAADITAMA_1202152172_MODUL3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText userName, password;
    Button btnlogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userName = (EditText)findViewById(R.id.editTextusername);
        password = (EditText)findViewById(R.id.editTextpassword);
        btnlogin = (Button)findViewById(R.id.buttonlogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String usernamekey = userName.getText().toString();
               String passwordkey = password.getText().toString();

                if (usernamekey.equals("EAD")&& passwordkey.equals("MOBILE")){
                    Intent login = new Intent(Login.this, DaftarMinuman.class);
                    startActivity(login);
                    Toast.makeText(Login.this, "Login Sukses" , Toast.LENGTH_LONG).show();


                }else {
                    Toast.makeText(Login.this,"Login gagal",Toast.LENGTH_LONG).show();

                }


            }
        });


    }
}
