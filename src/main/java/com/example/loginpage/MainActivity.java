package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username =(TextView) findViewById(R.id.username);
        TextView emailid =(TextView) findViewById(R.id.emailid);
        TextView password =(TextView) findViewById(R.id.password);
        TextView confirmpassword =(TextView) findViewById(R.id.confirmpassword);

        MaterialButton submitbtn = (MaterialButton) findViewById(R.id.submitbtn);

        //admin and admin

        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("SWAGATKAR") && emailid.getText().toString().equals("swagatkar16@gmail.com")&& password.getText().toString().equals("roxy3333") && confirmpassword.getText().toString().equals("roxy3333")){
                    //Correct password
                    Toast.makeText(MainActivity.this, "SIGN IN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                }else
                    //incorrect password
                    Toast.makeText(MainActivity.this, "SIGN IN FAILED",Toast.LENGTH_SHORT).show();
            }
        });
    }
}