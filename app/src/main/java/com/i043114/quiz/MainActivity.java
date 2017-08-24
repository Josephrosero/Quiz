package com.i043114.quiz;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.flt_1);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goActivitydos(view);
            }
        });
    }


    public void goActivitydos(View v){
        Intent intent = new Intent(this, Main2Activity.class); // Intent = intenciones sirve para obtener todas las actividades que uno tiene y recibe dos parametros
        startActivity(intent);}




}
