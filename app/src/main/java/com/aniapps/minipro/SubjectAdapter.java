package com.aniapps.minipro;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by USER on 02-04-2017.
 */
public class SubjectAdapter extends RecyclerView.Adapter<SubjectAdapter.MyViewHolder>
{ private List<Subject> sublist ;
    public class MyViewHolder extends RecyclerView.ViewHolder
    { public TextView title;

      public MyViewHolder( final View v)
      { super(v);
        title = (TextView)v.findViewById(R.id.subjecttitle);
          v.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Toast.makeText( v.getContext()," Clicked "+ title.getText(),Toast.LENGTH_SHORT).show();
              }
          });

          title.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
               //   Toast.makeText( v.getContext()," Clicked "+ title.getText(),Toast.LENGTH_SHORT).show();
                  Intent i = new Intent( v.getContext(), SubjectListView.class);
                  v.getContext().startActivity(i);
              }
          });

      }
    }

     public SubjectAdapter( List<Subject> sublist){
         this.sublist = sublist;
     }

    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType ){
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.subject_row, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder ( MyViewHolder holder, int position){
        Subject s = sublist.get(position);
        holder.title.setText(s.getTitle());
    }

    @Override
    public int getItemCount(){
        return sublist.size();
    }


}
