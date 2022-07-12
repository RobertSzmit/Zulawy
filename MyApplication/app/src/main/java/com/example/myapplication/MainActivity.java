package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onBtnClick (View view) { // ta metoda zmienia tekst po kliknięciu

        TextView txtFirstName = findViewById(R.id.txtFirstName); // tekst wyświetlalny
        TextView txtLastName = findViewById(R.id.txtLastName);
        TextView txtEmail = findViewById(R.id.txtEmail);
        
        EditText edtTxtFirstName = findViewById(R.id.edtFirstName); // tekst edytowalny
        EditText edtTxtLastName = findViewById(R.id.edtLastName);
        EditText edtTxtEmail = findViewById(R.id.edtEmail);

        txtFirstName.setText("" + edtTxtFirstName.getText().toString());  // a dzięki temu to co się
        // wpisze wyświetli się w okienku
        txtLastName.setText("" + edtTxtLastName.getText().toString());
        txtEmail.setText("" +edtTxtEmail.getText().toString());
    }
}