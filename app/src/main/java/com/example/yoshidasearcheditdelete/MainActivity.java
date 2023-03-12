package com.example.yoshidasearcheditdelete;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.ContentValues;
import android.content.Intent;
import android.os.AsyncTask;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import org.json.JSONException;
import org.json.JSONObject;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button CreateNewEmp, ManageRecords;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CreateNewEmp = (Button) findViewById(R.id.CreateNewEmp);
        ManageRecords = (Button) findViewById(R.id.ManageRecords);
        CreateNewEmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(  MainActivity.this,CreateNewCustomer.class);startActivity(in);
            }
        });
        ManageRecords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(  MainActivity.this,ManageRecords.class); startActivity(in);
            }
        });
    }
}


