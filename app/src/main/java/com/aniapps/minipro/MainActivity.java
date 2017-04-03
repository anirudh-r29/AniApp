package com.aniapps.minipro;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.Subject;

public class MainActivity extends AppCompatActivity {
    private List<com.aniapps.minipro.Subject> slist = new ArrayList<>();
    private RecyclerView rview;
    private SubjectAdapter subjectAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        com.aniapps.minipro.Subject s = new com.aniapps.minipro.Subject("ES");
        slist.add(s);
       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/


        rview = (RecyclerView) findViewById(R.id.recycler_view);
        subjectAdapter = new SubjectAdapter(slist);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rview.setLayoutManager(layoutManager);
        rview.setItemAnimator(new DefaultItemAnimator());
        rview.setAdapter(subjectAdapter);

        addData();

    }

  private void addData()
    {
        com.aniapps.minipro.Subject s = new com.aniapps.minipro.Subject("ES");
        slist.add(s);

        s = new com.aniapps.minipro.Subject("CGM");
        slist.add(s);

        s = new com.aniapps.minipro.Subject("CN");
        slist.add(s);

        s = new com.aniapps.minipro.Subject("MIS");
        slist.add(s);

        s = new com.aniapps.minipro.Subject("GTC");
        slist.add(s);
        subjectAdapter.notifyDataSetChanged();


         }




}

