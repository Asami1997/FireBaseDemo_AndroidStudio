package com.example.asami.firebasedemo;

import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdView mAdView;

        //You should have your own app id and unit id
        /*
        MobileAds.initialize(getApplicationContext(),
                "**YOUR APP ID**");

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        //load the request in the mAdview
        mAdView.loadAd(adRequest);
        */
        /*
        //connecting to the database and saving an object in firebase

        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();


        Map<String,String> mapValues = new HashMap<>();

        mapValues.put("my name","ahmad");

        //to save it in database

        databaseReference.push().setValue(mapValues, new DatabaseReference.CompletionListener() {
            @Override
            public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {

                if(databaseError == null)
                   {
                       Log.i("Saved","Yes");

                   }else
                          {
                              Log.i("Saved","No");
                          }
            }
        });


*/
    }
}
