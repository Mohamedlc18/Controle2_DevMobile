package com.example.controle2_devmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listeCLMS;
    MyDataClimat db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db =new MyDataClimat(this);

        ArrayList<Climat> clmts =new ArrayList<>();
        clmts.add(new Climat(1,"Tetouan","maroc",35,26));
        clmts.add(new Climat(2,"Rabat","maroc",34,23));
        clmts.add(new Climat(3,"Fes","maroc",39,24));
        clmts.add(new Climat(4,"OUJDA","maroc",41,16));
        clmts.add(new Climat(5,"Casa blanca","maroc",33,30));
        for(Climat c:clmts){
            MyDataClimat.AddClimat(db.getWritableDatabase(),c);}

        listeCLMS=findViewById(R.id.listeCLMS);
        ArrayList<Climat> clmt=MyDataClimat.getAllClimat(db.getReadableDatabase());
        ArrayList<String> listeCLMS =new ArrayList<>();
        for(Climat c: clmt){
            listeCLMS.add("             Température: "+c.getTempérature()+"°C \n"+ c.getNom_Ville()+"\n             pour de nuages: "+c.getPourcentage_Nuages()+" %");
        }
        ArrayAdapter<String> ad=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,listeCLMS);
        listeCLMS.setAdapter(ad);


        }
    public void Activity2(View view) {
        Intent i=null;
        i = new Intent(this, Question8.class);
        startActivity(i);
        }
    }