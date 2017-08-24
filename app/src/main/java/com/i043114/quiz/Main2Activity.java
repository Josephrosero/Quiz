package com.i043114.quiz;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn1 = (Button) findViewById(R.id.bnt_2);
        registerForContextMenu(btn1);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.flt_2);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goActivityuno(view);
            }
        });

    }



    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        menu.setHeaderTitle("Mis Opciones");
        inflater.inflate(R.menu.menu, menu);
    }

    public void goActivityuno(View v){
        Intent intent = new Intent(this, MainActivity.class); // Intent = intenciones sirve para obtener todas las actividades que uno tiene y recibe dos parametros
        startActivity(intent);}
}
