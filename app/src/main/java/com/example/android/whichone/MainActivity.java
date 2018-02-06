package com.example.android.whichone;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public int onRadioButtonClickedMovie(View view) {


        String choosed = "";
        int movieScore = 0;
        RadioButton radiobuttonMovieLord = (RadioButton) findViewById(R.id.lordOftheRings);
        RadioButton radiobuttonMovieHarry = (RadioButton) findViewById(R.id.harry_potter);
        RadioButton radiobuttonMovieStar = (RadioButton) findViewById(R.id.star_wars);
        Boolean ischeckedLord = radiobuttonMovieLord.isChecked();
        Boolean ischeckedHarry = radiobuttonMovieHarry.isChecked();
        Boolean ischeckedStar = radiobuttonMovieStar.isChecked();
        if (ischeckedLord) {
            radiobuttonMovieHarry.setChecked(false);
            radiobuttonMovieStar.setChecked(false);
            choosed = radiobuttonMovieLord.getText().toString();
            Log.v("MainActivity", "best movie: " + choosed);
            movieScore = movieScore + 0;


        }
        if (ischeckedHarry) {
            radiobuttonMovieLord.setChecked(false);
            radiobuttonMovieStar.setChecked(false);
            choosed = radiobuttonMovieHarry.getText().toString();
            Log.v("MainActivity", "best movie: " + choosed);
            movieScore = movieScore + 0;


        }
        if (ischeckedStar) {
            radiobuttonMovieLord.setChecked(false);
            radiobuttonMovieHarry.setChecked(false);
            choosed = radiobuttonMovieStar.getText().toString();
            Log.v("MainActivity", "best movie: " + choosed);
            movieScore = movieScore + 25;

        }

        return movieScore;


    }

    public int onRadioButtonClickedActor(View view) {

        String choosed = "";
        int movieScore = 0;
        RadioButton radiobuttonActorButler = (RadioButton) findViewById(R.id.gerard_butler);
        RadioButton radiobuttonActorJackman = (RadioButton) findViewById(R.id.hugh_jackman);
        RadioButton radiobuttonActorKeanu = (RadioButton) findViewById(R.id.keanu);
        Boolean ischeckedFirst = radiobuttonActorButler.isChecked();
        Boolean ischeckedSecond = radiobuttonActorJackman.isChecked();
        Boolean ischeckedThird = radiobuttonActorKeanu.isChecked();
        if (ischeckedFirst) {
            radiobuttonActorJackman.setChecked(false);
            radiobuttonActorKeanu.setChecked(false);
            choosed = radiobuttonActorButler.getText().toString();
            Log.v("MainActivity", "best movie: " + choosed);
            movieScore = movieScore + 0;


        }
        if (ischeckedSecond) {
            radiobuttonActorButler.setChecked(false);
            radiobuttonActorKeanu.setChecked(false);
            choosed = radiobuttonActorJackman.getText().toString();
            Log.v("MainActivity", "best movie: " + choosed);
            movieScore = movieScore + 25;


        }
        if (ischeckedThird) {
            radiobuttonActorButler.setChecked(false);
            radiobuttonActorJackman.setChecked(false);
            choosed = radiobuttonActorKeanu.getText().toString();
            Log.v("MainActivity", "best movie: " + choosed);
            movieScore = movieScore + 0;

        }
        return movieScore;
    }

    public int onRadioButtonClickedActress(View view) {

        String choosed = "";
        int actressScore = 0;
        RadioButton radiobuttonActressLessli = (RadioButton) findViewById(R.id.lessli);
        RadioButton radiobuttonActressJodie = (RadioButton) findViewById(R.id.jodie);
        RadioButton radiobuttonActressNatalia = (RadioButton) findViewById(R.id.natalia);
        Boolean ischeckedFirst = radiobuttonActressLessli.isChecked();
        Boolean ischeckedSecond = radiobuttonActressJodie.isChecked();
        Boolean ischeckedThird = radiobuttonActressNatalia.isChecked();
        if (ischeckedFirst) {
            radiobuttonActressJodie.setChecked(false);
            radiobuttonActressNatalia.setChecked(false);
            choosed = radiobuttonActressLessli.getText().toString();
            Log.v("MainActivity", "best movie: " + choosed);
            actressScore = actressScore + 0;


        }
        if (ischeckedSecond) {
            radiobuttonActressLessli.setChecked(false);
            radiobuttonActressNatalia.setChecked(false);
            choosed = radiobuttonActressJodie.getText().toString();
            Log.v("MainActivity", "best movie: " + choosed);
            actressScore = actressScore + 0;


        }
        if (ischeckedThird) {
            radiobuttonActressLessli.setChecked(false);
            radiobuttonActressJodie.setChecked(false);
            choosed = radiobuttonActressNatalia.getText().toString();
            Log.v("MainActivity", "best movie: " + choosed);
            actressScore = actressScore + 25;

        }
        return actressScore;

    }

    public int onRadioButtonClickedComedy(View view) {

        String choosed = "";
        int comedyScore = 0;
        RadioButton radiobuttonComedyKevin = (RadioButton) findViewById(R.id.kevin);
        RadioButton radiobuttonComedyJason = (RadioButton) findViewById(R.id.jason);
        RadioButton radiobuttonComedyJim = (RadioButton) findViewById(R.id.jim_carrey);
        Boolean ischeckedFirst = radiobuttonComedyKevin.isChecked();
        Boolean ischeckedSecond = radiobuttonComedyJason.isChecked();
        Boolean ischeckedThird = radiobuttonComedyJim.isChecked();
        if (ischeckedFirst) {
            radiobuttonComedyJason.setChecked(false);
            radiobuttonComedyJim.setChecked(false);
            choosed = radiobuttonComedyKevin.getText().toString();
            Log.v("MainActivity", "best movie: " + choosed);
            comedyScore = comedyScore + 0;


        }
        if (ischeckedSecond) {
            radiobuttonComedyKevin.setChecked(false);
            radiobuttonComedyJim.setChecked(false);
            choosed = radiobuttonComedyJason.getText().toString();
            Log.v("MainActivity", "best movie: " + choosed);
            comedyScore = comedyScore + 25;
            Log.v("MainActivity", "best movie: " + comedyScore);


        }
        if (ischeckedThird) {
            radiobuttonComedyKevin.setChecked(false);
            radiobuttonComedyJason.setChecked(false);
            choosed = radiobuttonComedyJim.getText().toString();
            Log.v("MainActivity", "best movie: " + choosed);
            comedyScore = comedyScore + 0;

        }
        return comedyScore;
    }

    public String agreedYes(View view) {
        CheckBox yesCheck = findViewById(R.id.checkboxyes);
        Boolean agreeYes = yesCheck.isChecked();
        String thanks = "";
        if (agreeYes) {
            thanks = "That was a small test, thanks for that!";
        } else {
            thanks = "It was awful!";
        }

        return thanks;


    }

    public int calculateScore(View view) {

        int totalScore = (int) onRadioButtonClickedActor(view) + (int) onRadioButtonClickedMovie(view) + (int) onRadioButtonClickedComedy(view) + (int) onRadioButtonClickedActress(view);


        return totalScore;


    }


    public void submitSend(View view) {
        EditText nameField = (EditText) findViewById(R.id.edit_name);
        String name = nameField.getText().toString();
        String thankYou = agreedYes(view);
        int score = calculateScore(view);
        Toast.makeText(this, "Thank you for your answers", Toast.LENGTH_SHORT).show();

        Log.v("MainActivity", "best movie: " + score + " " + thankYou);

        String finalMessage = "Thank you for your attending our quiz, " + name;
        finalMessage += "\nThank you for your critizing: " + thankYou;
        finalMessage += "\nYour Total Score: " + score;
        composeEmail(finalMessage, score);

        return;


    }


    public void composeEmail(String attachment, int score) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Test Total Score " + score);

        intent.putExtra(Intent.EXTRA_TEXT, attachment);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }


}
