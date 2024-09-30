package com.example.inscriptionformation;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    private TextView textViewNom, textViewEmail, textViewTelephone, textViewAdresse, textViewVille;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textViewNom = findViewById(R.id.textViewNom);
        textViewEmail = findViewById(R.id.textViewEmail);
        textViewTelephone = findViewById(R.id.textViewTelephone);
        textViewAdresse = findViewById(R.id.textViewAdresse);
        textViewVille = findViewById(R.id.textViewVille);


        Intent intent = getIntent();
        String nom = intent.getStringExtra("nom");
        String email = intent.getStringExtra("email");
        String telephone = intent.getStringExtra("telephone");
        String adresse = intent.getStringExtra("adresse");
        String ville = intent.getStringExtra("ville");


        textViewNom.setText("Nom et prénom : " + nom);
        textViewEmail.setText("Email : " + email);
        textViewTelephone.setText("Téléphone : " + telephone);
        textViewAdresse.setText("Adresse : " + adresse);
        textViewVille.setText("Ville : " + ville);
    }
}
