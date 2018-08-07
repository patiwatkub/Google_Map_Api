package com.example.inkza.google_map_api;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hsalf.smilerating.BaseRating;
import com.hsalf.smilerating.SmileRating;

public class ToiletReview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toilet_review);
        SmileRating smileRating = (SmileRating) findViewById(R.id.smile_rating);
        smileRating.setNameForSmile(BaseRating.TERRIBLE, "แย่มาก");
        smileRating.setNameForSmile(BaseRating.BAD, "แย่");
        smileRating.setNameForSmile(BaseRating.OKAY, "พอใช้");
        smileRating.setNameForSmile(BaseRating.GOOD, "ดี");
        smileRating.setNameForSmile(BaseRating.GREAT, "ดีมาก");
    }
}
