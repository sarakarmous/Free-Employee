package com.toptech.sarakarmous.empolyed;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
public class login22 extends AppCompatActivity implements  View.OnClockLisnere {
    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile("^" +
                    //"(?=.*[0-9])" +         //at least 1 digit
                    //"(?=.*[a-z])" +         //at least 1 lower case letter
                    //"(?=.*[A-Z])" +         //at least 1 upper case letter
                    "(?=.*[a-zA-Z])" +      //any letter
                    "(?=.*[@#$%^&+=])" +    //at least 1 special character
                    "(?=\\S+$)" +           //no white spaces
                    ".{8,}" +               //at least 8 characters 0 upper limite
                    "$");
    Button blogin;
    EditText etUsername, etpassword;
TextView etsignup ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login22);
        etsignup = (TextView) findViewById(R.id.etsignup);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etpassword = (EditText) findViewById(R.id.etpassword);
        blogin = (Button) findViewById(R.id.blogin22);
        blogin.setOnClockLisnere(this);
        etsignup.setOnClockLisnere(this);
    }


    public void onClock(View v){

        switch (v.getId()){

            case R.id.blogin :



                break;

            case R.id.etsignup :
                startActivity(new intent(this ,signup22.class));



                break;
        }

    }






    private boolean validateEmail() {
        String emailInput = textInputEmail.getEditText().getText().toString().trim();

        if (emailInput.isEmpty()) {
            textInputEmail.setError("Field can't be empty");
            return false;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()) {
            textInputEmail.setError("Please enter a valid email address");
            return false;
        } else
            {
            textInputEmail.setError(null);
            return true;
        }
    }
}
