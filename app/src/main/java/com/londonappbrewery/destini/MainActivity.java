package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    Button buttonTop;
    Button buttonBottom;
    TextView storyText;
    int mStoryIndex=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        buttonTop=(Button) findViewById(R.id.buttonTop);
        buttonBottom =(Button) findViewById(R.id.buttonBottom);
        storyText=(TextView) findViewById(R.id.storyTextView);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mStoryIndex==1 || mStoryIndex==2) {
                    storyText.setText(R.string.T3_Story);
                    buttonBottom.setText(R.string.T3_Ans1);
                    buttonTop.setText(R.string.T3_Ans2);
                mStoryIndex=3;}
                else if(mStoryIndex==3)
                {
                    storyText.setText(R.string.T6_End);
                    buttonBottom.setVisibility(View.GONE);
                    buttonTop.setVisibility(View.GONE);
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mStoryIndex==1) {
                    storyText.setText(R.string.T2_Story);
                    buttonBottom.setText(R.string.T2_Ans1);
                    buttonTop.setText(R.string.T2_Ans2);
                mStoryIndex=2;
                }
                else if(mStoryIndex==2)
                {
                storyText.setText(R.string.T4_End);
                buttonTop.setVisibility(View.GONE);
                buttonBottom.setVisibility(View.GONE);
                }
                else if (mStoryIndex==3)
                {
                    storyText.setText(R.string.T5_End);
                    buttonTop.setVisibility(View.GONE);
                    buttonBottom.setVisibility(View.GONE);

                }
            }
        });


    }




}
