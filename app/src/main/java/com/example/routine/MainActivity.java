package com.example.routine;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int counter = 0;
    private TextView titre;
    private ImageView image;
    private Button routineButton;
    List<Step> steps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        routineButton = findViewById(R.id.routineButton);
        routineButton.setText("J'ai terminé !");
        image = findViewById(R.id.routineImage);
        titre = findViewById(R.id.routineTitre);
        steps = new ArrayList<Step>();

        int[] images = new int[7];
        images[0] = R.drawable.ic_routine_debout;
        images[1] = R.drawable.ic_routine_pot;
        images[2] = R.drawable.ic_routine_dejeuner;
        images[3] = R.drawable.ic_routine_dent;
        images[4] = R.drawable.ic_routine_habiller;
        images[5] = R.drawable.ic_routine_jouer;

        steps.add(new Step("Debout", images[0]));
        steps.add(new Step("Pot", images[1]));
        steps.add(new Step("Déjeuner", images[2]));
        steps.add(new Step("Brosse les dents", images[3]));
        steps.add(new Step("S'habiller", images[4]));
        steps.add(new Step("Jouer", images[5]));
        steps.add(new Step("S'habiller", images[4]));

        titre.setText(steps.get(counter).getName());
        image.setImageResource(steps.get(counter).getImage());

        routineButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.routineButton : {
                Log.d("seb", "" + counter);
                Log.d("seb", "" + steps.size());
                if(counter >= steps.size()-1) break;

                counter++;
                titre.setText(steps.get(counter).getName());
                image.setImageResource(steps.get(counter).getImage());
                break;
            }
        }
    }
}
