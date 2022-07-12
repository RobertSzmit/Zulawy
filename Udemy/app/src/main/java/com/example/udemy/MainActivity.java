package com.example.udemy;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.SearchManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

// po wywołaniu setonclicklistener
                                        // zaimplentowano to na dole: potem alt+enter
                                        // i implemet methods i onClick
public class MainActivity extends Activity implements View.OnClickListener {

    TextView helloText; // stworzyliśmy obiekt, po Textview alt+enter
    Button clickMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // powiązanie javy z lejałtem

        helloText = findViewById(R.id.helloText); // i obiekt z góry dostał argument
        helloText.setText("Jestem zmieniony!"); // wywołaliśmy metodę na obiekcie settext (zmień tekst),
        // który się zamieni z hello world zaraz po uruchomieniu, bo jesteśmy w metodzie onCreate

        clickMe = findViewById(R.id.btnClick);
        clickMe.setText("Zmieniłem się"); // wywołujemy metodę settext
        clickMe.setOnClickListener(this);

    }

    @Override // dziedziczy z tego wyżej i się zatrzymuje gdy coś tam - cykl życia
    protected void onStop() {
        super.onStop();
    }
                                        // to się zrobiło po tym, jak zaimplementowałem na górze onClick
                                              @Override
                                              public void onClick(View view) {
                                                  Toast.makeText(this , "chuje muje" , Toast.LENGTH_LONG).show();
                                              }
                                          }