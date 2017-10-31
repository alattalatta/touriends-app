package com.example.whddu.project01.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.example.whddu.project01.R;

public class SplashActivity extends Activity {
 public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_splash);

    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    Handler hd = new Handler();
    hd.postDelayed(new splashhandler() , 1800);
}

private class splashhandler implements Runnable{
    public void run() {
        startActivity(new Intent(getApplication(), com.example.whddu.project01.ui.MainActivity.class));
        SplashActivity.this.finish();
    }
}
}
