package com.example.zulawy;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity1 extends AppCompatActivity {
    RecyclerView recview;
    myadapter adapter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
     setConteView(R.layout.activity_main1);

      recview = (RecyclerView)findViewById(R.id.recview);
     recview.setLayoutManager(new LinearLayoutManager(this));

     FirebaseRecyclerOptions<model> options =
             new FirebaseRecyclerOptions.Builder<model>() // w nawiasach<> nazwa klasy model
                      .setQuery(FirebaseDatabase.getInstance().getReference().child("message"), model.class)
                      .build();

     adapter = new myadapter(options);
     recview.setAdapter(adapter);
  }

    private void setConteView(int activity_main1) {
    }


}
