package com.example.udemy;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.udemy.R;

public class MainActivity extends Activity { // tu był appcompatactivity i nie działało

    Button button; // tu stworzyłem obiekt do przycisku + ant+enter na Button
    // do tego Button to również nazwa widgetu z layoutu

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // to się odwołuje do wyświetlenia layoutu act_main

        button = findViewById(R.id.button); // i tu przypisaliśmy czym jest button z góry, powiązaliśmy ten obiekt z góry
        button.setOnClickListener(new View.OnClickListener() { // po tym wyskoczyła metoda na dole
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                // tu Intent nazwaliśmy intent, odwołujemy się do MA.this, bo samo this nie wystarczy ze
                // względu na to, że jesteśmy zagnieżdżeni w override i wpisujemy aktywność do której chcemy iść
                startActivity(intent);
                //teraz wywołujemy metodę sA i argument to intent

            }
        });

    }
}