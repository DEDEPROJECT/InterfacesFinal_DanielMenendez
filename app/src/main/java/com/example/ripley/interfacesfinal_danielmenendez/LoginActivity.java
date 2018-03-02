package com.example.ripley.interfacesfinal_danielmenendez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {


    private Button BotonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        BotonLogin = (Button)findViewById(R.id.loginButton);
        getSupportActionBar().hide();

        BotonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(LoginActivity.this, appActivity.class);
                startActivity(intent);
            }
        });



    }
}
