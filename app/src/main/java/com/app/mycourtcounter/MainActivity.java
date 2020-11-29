package com.app.mycourtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int pointsA = 0;
    private int pointsB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(pointsA);
        displayForTeamB(pointsB);
    }
    public void displayForTeamA(int score) {
        TextView scoreViewA = findViewById(R.id.team_a_score);
        scoreViewA.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreViewB = findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(score));
    }
    public void displayForThreePointsA(View view){
        pointsA += 3;
        displayForTeamA(pointsA);
    }
    public void displayForThreePointsB(View view){
        pointsB += 3;
        displayForTeamB(pointsB);
    }
    public void displayForTwoPointsA(View view){
        pointsA += 2;
        displayForTeamA(pointsA);
    }
    public void displayForTwoPointsB(View view){
        pointsB += 2;
        displayForTeamB(pointsB);
    }
    public void displayForFreePointsA(View view){
        pointsA++;
        displayForTeamA(pointsA);
    }
    public void displayForFreePointsB(View view){
        pointsB++;
        displayForTeamB(pointsB);
    }
    public void reset(View view){
        pointsA = 0;
        pointsB = 0;
        displayForTeamA(pointsA);
        displayForTeamB(pointsB);
    }

}
