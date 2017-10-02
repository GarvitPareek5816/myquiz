package com.example.lenovopc.myquiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.text.TextUtils;

//import com.google.android.gms.appindexing.Action;
//import com.google.android.gms.appindexing.AppIndex;
//import com.google.android.gms.appindexing.Thing;
//import com.google.android.gms.common.api.GoogleApiClient;

public class login extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
 //   private GoogleApiClient client;
    String GetEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        LoginButton();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
    //    client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void LoginButton() {
        final EditText username = (EditText) findViewById(R.id.editText);
      //  final EditText password = (EditText) findViewById(R.id.editText2);

        Button login_button = (Button) findViewById(R.id.button2);
        Button clear_button = (Button) findViewById(R.id.button3);


        login_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    //   if (username.getText().toString().equals("garvit") && password.getText().toString().equals("5816")) {
                        GetEditText =  username.getText().toString();

                        if(TextUtils.isEmpty(GetEditText)){

                            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(login.this);
                            alertDialogBuilder.setMessage("Please enter your name ")
                                    .setCancelable(false)
                                    .setPositiveButton("OK",
                                            new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialogInterface, int i) {
                                                    startActivity(new Intent(getApplicationContext(), login.class));
                                                }
                                            });


                            AlertDialog alertDialog = alertDialogBuilder.create();
                            alertDialog.show();

                        }
                        else {

                            Toast.makeText(login.this, "Welcome " +GetEditText+ " !",
                                    Toast.LENGTH_SHORT).show();

                            startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        }
                            //   Intent intent = new Intent(login.this, Calculator.class);
                            //  startActivity(intent);


                  /*      } else {
                            Toast.makeText(login.this, "Username and password is NOT correct",
                                    Toast.LENGTH_SHORT).show();

                        } */
                    }
                }
        );

        clear_button.setOnClickListener(new  View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                username.setText("");
                                             //   password.setText("");

                                            }
                                        }
        );
    }
}


