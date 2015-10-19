package com.example.dam.listacontactos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class AddActivity extends AppCompatActivity {

Contacto c;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_activity);
        iniciar();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        return super.onOptionsItemSelected(item);
    }
    public void iniciar(){
        Intent i= getIntent();
        Bundle b= i.getExtras();
        c = (Contacto) b.getSerializable("contacto");
    }

    public void saveNew(View v){
        ArrayList<String> a=new ArrayList<String>();
        a.add("654213578");
        a.add("65478");
        c.setNombre("0creado");c.setNumeros(a);c.setId(3574);
        this.getIntent().putExtra("contacto", c);
        setResult(RESULT_OK, this.getIntent());
        finish();
    }

    public void addEditText(View v){
        LinearLayout vertical = (LinearLayout) findViewById(R.id.add);
        EditText et = new EditText(this);
        et.setInputType(InputType.TYPE_CLASS_PHONE);
        et.setHint(R.string.numero);
        et.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        vertical.addView(et, vertical.getChildCount() - 2);
    }
    public void dontSaveChanges(View v){
        finish();
    }
}








