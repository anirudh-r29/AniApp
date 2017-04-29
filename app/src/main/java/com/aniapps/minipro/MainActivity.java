package com.aniapps.minipro;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import org.json.JSONObject;

import java.lang.reflect.Method;
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

       /* String url =" ADD URL " ;
        ProgressDialog pDialog;
        pDialog = new ProgressDialog(this);
        pDialog.setMessage("Please wait...");
        pDialog.setCancelable(false);

        JsonObjectRequest jsonObjReq = new JsonObjectRequest(Method.GET,
                url, null, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {
                Log.d(TAG, response.toString());

                try {
                    // Parsing json object response
                    // response will be a json object

                    String subject = response.getString("name");


                    jsonResponse = "";
                    jsonResponse += "Name: " + name + "\n\n";
                    jsonResponse += "Email: " + email + "\n\n";
                    jsonResponse += "Home: " + home + "\n\n";
                    jsonResponse += "Mobile: " + mobile + "\n\n";

                    txtResponse.setText(jsonResponse);

                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(),
                            "Error: " + e.getMessage(),
                            Toast.LENGTH_LONG).show();
                }
                hidepDialog();
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d(TAG, "Error: " + error.getMessage());
                Toast.makeText(getApplicationContext(),
                        error.getMessage(), Toast.LENGTH_SHORT).show();
                // hide the progress dialog
                hidepDialog();
            }
        });

        // Adding request to request queue
        AppController.getInstance().addToRequestQueue(jsonObjReq);
    }
*/




    com.aniapps.minipro.Subject s = new com.aniapps.minipro.Subject("MAKRI");
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

