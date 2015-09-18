package com.joeymejias.fivewaystosayhelloedition;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import static com.joeymejias.fivewaystosayhelloedition.R.id.yes_button;

public class MainActivity extends AppCompatActivity {


    /*
    ** Global variables for the views
     */
    RelativeLayout chinese;
    RelativeLayout spanish;
    RelativeLayout urdu;
    RelativeLayout arabic;
    RelativeLayout portuguese;

    /*
    ** Global variables for buttons
     */
    Button chineseButton;
    Button spanishButton;
    Button urduButton;
    Button arabicButton;
    Button portugueseButton;
    Button yesButton;
    Button noButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        ** Setting view global variables to view ids
         */
        chinese = (RelativeLayout) findViewById(R.id.chinese);
        spanish = (RelativeLayout) findViewById(R.id.spanish);
        urdu = (RelativeLayout) findViewById(R.id.urdu);
        arabic = (RelativeLayout) findViewById(R.id.arabic);
        portuguese = (RelativeLayout) findViewById(R.id.portuguese);

        /*
        ** Setting button global variables to button ids
         */
        chineseButton = (Button) findViewById(R.id.chinese_button);
        spanishButton = (Button) findViewById(R.id.spanish_button);
        urduButton = (Button) findViewById(R.id.urdu_button);
        arabicButton = (Button) findViewById(R.id.arabic_button);
        portugueseButton = (Button) findViewById(R.id.portuguese_button);

        yesButton = (Button) findViewById(yes_button);
        noButton = (Button) findViewById(R.id.no_button);


        /*
        ** Setting buttons to start the activities for the chosen language
         */
        chineseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startChinese();
            }
        });

        spanishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSpanish();
            }
        });

        urduButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startUrdu();
            }
        });

        arabicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startArabic();
            }
        });

        portugueseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startPortuguese();
            }
        });


        yesButton.setOnClickListener(feedbackListener(true));

        noButton.setOnClickListener(feedbackListener(false));

    }

    private void startChinese() {
        Intent intent = new Intent(this, ChineseActivity.class);
        startActivity(intent);
    }

    private void startSpanish() {
        Intent intent = new Intent(this, SpanishActivity.class);
        startActivity(intent);
    }

    private void startUrdu() {
        Intent intent = new Intent(this, UrduActivity.class);
        startActivity(intent);
    }

    private void startArabic() {
        Intent intent = new Intent(this, ArabicActivity.class);
        startActivity(intent);
    }

    private void startPortuguese() {
        Intent intent = new Intent(this, PortugueseActivity.class);
        startActivity(intent);

    }

    private View.OnClickListener feedbackListener(final boolean feedback) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startFeedback(feedback);
            }
        };
    }

    /*
    ** If statement for feedback toast
    */

    private void startFeedback(boolean feedback) {
        if (feedback) {
            Toast.makeText(MainActivity.this, "Thank you for your feedback!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "We are working to make this app better!", Toast.LENGTH_SHORT).show();
        }
    }
}
