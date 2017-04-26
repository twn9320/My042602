package com.example.yvtc.my042602;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicka(View v){
        FragmentTransaction ft= getFragmentManager().beginTransaction();
        ft.replace(R.id.layout_main,new FragmentA());
        ft.commit();
    }

    public void clickb(View v){
        FragmentTransaction ft= getFragmentManager().beginTransaction();
        ft.replace(R.id.layout_main,new FragmentB());
        ft.commit();
    }
}
