package com.toptech.sarakarmous.empolyed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Mainmyaccunt2 extends  AppCompatActivity  implements  View.OnClockLisnere {

   Button blogout ;
   EditText etprofession ,etpassword  ,etphone ,etName ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmyaccunt2);
        etprofession =(EditText) findViewById(R.id.etprofession);
                etpassword =(EditText) findViewById(R.id.etpassword);
                etphone =(EditText) findViewById(R.id.etphone);
                etName =(EditText) findViewById(R.id.etName );
        blogout =(Button) findViewById(R.id.blogout);

        blogin.setOnClockLisnere(this);

    }



    public void onClock(View v){

        switch (v.getId()){

            case R.id.blogout:

                startActivity(new intent(this ,login22.class));

                break;
        }
    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */

}
