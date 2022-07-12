package com.example.intenty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonNext = (Button) findViewById(R.id.buttonNext);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               Intent intent = new Intent(MainActivity.this, SecondActivity.class); // tak się przekierowuje stąd
                // do drugiej aktywności - SecondAct... Intent jawny
              //  intent.putExtra("test" , "pochodzę z innego Acti"); // wysyłamy coś z intentem
                Bundle bundle = new Bundle();
                bundle.putString("someString" , "chuje muje dzikie węże");
                intent.putExtra("bundle", bundle);

                startActivity(intent); // metoda startActivity plus wywołanie intentu

             //   Intent intent =  new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.pl")); // a to intent niejawny
             //   startActivity(intent); // odpala np. stronę internetową na domyślnej przeglądarce

            }
        });
    }
}