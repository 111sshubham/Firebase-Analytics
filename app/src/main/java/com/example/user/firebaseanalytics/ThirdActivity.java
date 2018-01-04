package com.example.user.firebaseanalytics;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.firebase.analytics.FirebaseAnalytics;

public class ThirdActivity extends AppCompatActivity {
  private FirebaseAnalytics mFirebaseAnalytics;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_third);
  }

  @Override
  protected void onResume() {
    super.onResume();
    initializeFirebase();
  }

  private void initializeFirebase() {
    // Obtain the FirebaseAnalytics instance.
    mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
  }

  public void click1(View view) {
    Bundle bundle = new Bundle();
    bundle.putString(Constants.BUTTON_NAME, "ThirdActivity Button-1");
    mFirebaseAnalytics.logEvent(Constants.EVENT_CLICK, bundle);
  }

  public void click2(View view) {
    Bundle bundle = new Bundle();
    bundle.putString(Constants.BUTTON_NAME, "ThirdActivity Button-2");
    mFirebaseAnalytics.logEvent(Constants.EVENT_CLICK, bundle);
  }

  public void click3(View view) {
    Bundle bundle = new Bundle();
    bundle.putString(Constants.BUTTON_NAME, "ThirdActivity Button-3");
    mFirebaseAnalytics.logEvent(Constants.EVENT_CLICK, bundle);
  }

  public void clickPrevious(View view) {
    finish();
  }
}
