package com.example.inscriptionformation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText np, e, t, a;
    private Button envoyer;
    private Spinner villes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        np = findViewById(R.id.editTextNomPrenom);
        e = findViewById(R.id.editTextEmail);
        t = findViewById(R.id.editTextTelephone);
        a = findViewById(R.id.editTextAdresse);
        villes = findViewById(R.id.villes);
        envoyer = findViewById(R.id.envoyer);

        envoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (validateFields()) {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                    intent.putExtra("nom", np.getText().toString());
                    intent.putExtra("email", e.getText().toString());
                    intent.putExtra("telephone", t.getText().toString());
                    intent.putExtra("adresse", a.getText().toString());
                    intent.putExtra("ville", villes.getSelectedItem().toString());

                    startActivity(intent);
                    finish();
                }
            }
        });
    }


    private boolean validateFields() {
        if (np.getText().toString().trim().isEmpty()) {
            Toast.makeText(this, "Veuillez entrer votre nom et prénom", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (e.getText().toString().trim().isEmpty()) {
            Toast.makeText(this, "Veuillez entrer votre email", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (t.getText().toString().trim().isEmpty()) {
            Toast.makeText(this, "Veuillez entrer votre numéro de téléphone", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (a.getText().toString().trim().isEmpty()) {
            Toast.makeText(this, "Veuillez entrer votre adresse", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (villes.getSelectedItem() == null || villes.getSelectedItem().toString().isEmpty()) {
            Toast.makeText(this, "Veuillez sélectionner une ville", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}
