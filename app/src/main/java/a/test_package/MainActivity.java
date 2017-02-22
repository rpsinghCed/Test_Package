package a.test_package;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RatingBar rr;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         rr=(RatingBar) findViewById(R.id.ratingBar1);
         t1=(TextView) findViewById(R.id.textView1);


        rr.setRating((float) 2);
        rr.setStepSize((float) 0.3);


        rr.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {

            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                // TODO Auto-generated method stub
                //Merge This file With Sud Hello I am Ghost 
                t1.setText(String.valueOf(rating));
                Log.i("hello","test");


            }
        });

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,Second.class);
                startActivity(intent);
            }
        });
    }
}
