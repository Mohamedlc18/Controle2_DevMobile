package com.example.controle2_devmobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

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
        for(Climat c:clmts)
            MyDataClimat.AddClimat(db.getWritableDatabase(),c);
    }
}