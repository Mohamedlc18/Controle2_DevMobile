package com.example.controle2_devmobile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Question8 extends AppCompatActivity {

    TextView t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    t1.findViewById(R.id.t1);
    t2.findViewById(R.id.t2);
    t3.findViewById(R.id.t3);

        ArrayList<String> payes =new ArrayList<>();
        payes.add("Zambie");
        payes.add("Lybie");
        payes.add("Italie");
        payes.add("Espagne");
        payes.add("France");
        payes.add("Canada");

    }
    public void effacer(View view) {
        t1.setText("");
        t3.setText("");
        t2.setText("");
        t1.getNextFocusUpId();
    }
}