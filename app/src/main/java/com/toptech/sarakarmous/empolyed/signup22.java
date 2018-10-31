package com.toptech.sarakarmous.empolyed;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class signup22 extends AppCompatActivity {



    Button etsignup ;
    EditText etprofession, etpassword ,etphone ,etName ,etrepeatpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup22);


        etprofession =(EditText) findViewById(R.id.etprofession);
        etrepeatpassword =(EditText) findViewById(R.id.etrepeatpassword);
        etpassword =(EditText) findViewById(R.id.etpassword);
        etphone = (EditText) findViewById(R.id.etphone);
        etName =(EditText) findViewById(R.id.etName);

    }


    private boolean validateEmail() {
        String emailInput = textInputEmail.getEditText().getText().toString().trim();

        if (emailInput1.isEmpty()) {
            textInputEmail.setError("Field can't be empty");
            return false;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(emailInput1).matches()) {
            textInputEmail.setError("Please enter a valid email address");
            return false;
        } else {
            textInputEmail.setError(null);
            return true;
        }
    }


    private boolean validatePassword() {
        String etpassword = textInputPassword.getEditText().getText().toString().trim();

        if (etpassword.isEmpty()) {
            textInputPassword.setError("Field can't be empty");
            return false;
        } else if (!PASSWORD_PATTERN.matcher(etpassword).matches()) {
            textInputPassword.setError("Password too weak");
            return false;
        } else {
            textInputPassword.setError(null);
            return true;
        }
    }


}




