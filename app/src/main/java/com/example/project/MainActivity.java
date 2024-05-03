package com.example.project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences myPreferenceRef;
    private TextView prefTextRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        myPreferenceRef = getSharedPreferences("MyCookiePreferences", MODE_PRIVATE);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        prefTextRef = new TextView(this);

    }

    protected void onResume() {


        prefTextRef = (TextView)findViewById(R.id.prefTextMain);
        prefTextRef.setText(myPreferenceRef.getString("MyAppPreferenceString", "No preference found"));

        super.onResume();
    }

    public void openActivity(View view) {

        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }
}
