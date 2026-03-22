package com.example.calculateur;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Déclaration des éléments de l'interface
    private EditText fieldSurface, fieldPieces;
    private CheckBox checkPiscine;
    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Liaison XML <-> Java
        fieldSurface = findViewById(R.id.field_surface);
        fieldPieces = findViewById(R.id.field_pieces);
        checkPiscine = findViewById(R.id.check_piscine);
        textResult = findViewById(R.id.text_result);

        // Écouteur du bouton "Calculer"
        Button btnCalcul = findViewById(R.id.btn_calcul);
        btnCalcul.setOnClickListener(v -> calculer());
    }

    private void calculer() {
        // Lecture des valeurs saisies
        double surface = Double.parseDouble(fieldSurface.getText().toString());
        int pieces = Integer.parseInt(fieldPieces.getText().toString());
        boolean piscine = checkPiscine.isChecked();

        // Calcul des impôts
        double impotBase = surface * 2.0;
        double supplement = (pieces * 50) + (piscine ? 100 : 0);
        double total = impotBase + supplement;

        // Affichage du résultat
        textResult.setText("Impôt total : " + total + " DH");
    }
}