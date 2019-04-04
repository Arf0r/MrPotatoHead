package com.example.mrpotatohead;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.LogPrinter;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import com.example.mrpotatohead.R;

public class MainActivity extends AppCompatActivity {

    ImageView imageBody;
    ImageView imageArms;
    ImageView imageEars;
    ImageView imageNose;
    ImageView imageEyes;
    ImageView imageEyebrows;
    ImageView imageGlasses;
    ImageView imageMouth;
    ImageView imageMustache;
    ImageView imageShoes;
    ImageView imageHat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageBody = (ImageView) findViewById(R.id.body);
        imageArms = (ImageView) findViewById(R.id.arms);
        imageEars = (ImageView) findViewById(R.id.ears);
        imageNose = (ImageView) findViewById(R.id.nose);
        imageEyes = (ImageView) findViewById(R.id.eyes);
        imageEyebrows = (ImageView) findViewById(R.id.eyebrows);
        imageGlasses = (ImageView) findViewById(R.id.glasses);
        imageMouth = (ImageView) findViewById(R.id.mouth);
        imageMustache = (ImageView) findViewById(R.id.mustache);
        imageShoes = (ImageView) findViewById(R.id.shoes);
        imageHat = (ImageView) findViewById(R.id.hat);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("Body", imageBody.getVisibility());
        outState.putInt("Arms", imageArms.getVisibility());
        outState.putInt("Ears", imageEars.getVisibility());
        outState.putInt("Nose", imageNose.getVisibility());
        outState.putInt("Eyes", imageEyes.getVisibility());
        outState.putInt("Eyebrows", imageEyes.getVisibility());
        outState.putInt("Glasses", imageGlasses.getVisibility());
        outState.putInt("Mouth", imageMouth.getVisibility());
        outState.putInt("Mustache", imageMustache.getVisibility());
        outState.putInt("Shoes", imageShoes.getVisibility());
        outState.putInt("Hat", imageHat.getVisibility());

    }

    @Override
    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        imageBody.setVisibility(inState.getInt("Body"));
        imageArms.setVisibility(inState.getInt("Arms"));
        imageEars.setVisibility(inState.getInt("Ears"));
        imageNose.setVisibility(inState.getInt("Nose"));
        imageEyes.setVisibility(inState.getInt("Eyes"));
        imageEyebrows.setVisibility(inState.getInt("Eyebrows"));
        imageGlasses.setVisibility(inState.getInt("Glasses"));
        imageMouth.setVisibility(inState.getInt("Mouth"));
        imageMustache.setVisibility(inState.getInt("Mustache"));
        imageShoes.setVisibility(inState.getInt("Shoes"));
        imageHat.setVisibility(inState.getInt("Hat"));
    }
    public void checkClicked(View v) {
        CheckBox checkbox = (CheckBox) v;
        String text = checkbox.getText().toString();
        boolean checked = checkbox.isChecked();

        String body = "Body";
        if (text.equals(body)) {
            if (checked) {
                imageBody.setVisibility(View.VISIBLE);
            } else {
                imageBody.setVisibility(View.INVISIBLE);
            }
        }
        String arms = "Arms";
        if (text.equals(arms)) {
            if (checked) {
                imageArms.setVisibility(View.VISIBLE);
            } else {
                imageArms.setVisibility(View.INVISIBLE);
            }
        }
        String ears = "Ears";
        if (text.equals(ears)) {
            if (checked) {
                imageEars.setVisibility(View.VISIBLE);
            } else {
                imageEars.setVisibility(View.INVISIBLE);
            }
        }
        String eyes = "Eyes";
        if (text.equals(eyes)) {
            if (checked) {
                imageEyes.setVisibility(View.VISIBLE);
            } else {
                imageEyes.setVisibility(View.INVISIBLE);
            }
        }
        String eyebrows = "Eyebrows  ";
        if (text.equals(eyebrows)) {
            if (checked) {
                imageEyebrows.setVisibility(View.VISIBLE);
            } else {
                imageEyebrows.setVisibility(View.INVISIBLE);
            }
        }
        String glasses = "Glasses";
        if (text.equals(glasses)) {
            if (checked) {
                imageGlasses.setVisibility(View.VISIBLE);
            } else {
                imageGlasses.setVisibility(View.INVISIBLE);
            }
        }
        String nose = "Nose";
        if (text.equals(nose)) {
            if (checked) {
                imageNose.setVisibility(View.VISIBLE);
            } else {
                imageNose.setVisibility(View.INVISIBLE);
            }
        }
        String hat = "Hat";
        if (text.equals(hat)) {
            if (checked) {
                imageHat.setVisibility(View.VISIBLE);
            } else {
                imageHat.setVisibility(View.INVISIBLE);
            }
        }
        String mouth = "Mouth";
        if (text.equals(mouth)) {
            if (checked) {
                imageMouth.setVisibility(View.VISIBLE);
            } else {
                imageMouth.setVisibility(View.INVISIBLE);
            }
        }
        String mustache = "Mustache";
        if (text.equals(mustache)) {
            if (checked) {
                imageMustache.setVisibility(View.VISIBLE);
            } else {
                imageMustache.setVisibility(View.INVISIBLE);
            }
        }
        String shoes = "Shoes";
        if (text.equals(shoes)) {
            if (checked) {
                imageShoes.setVisibility(View.VISIBLE);
            } else {
                imageShoes.setVisibility(View.INVISIBLE);
            }
        }
    }
}
