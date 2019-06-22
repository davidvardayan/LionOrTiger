package com.davidvardanyan.lionortiger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void imageViewIsTapped(View imageView){

        ImageView tappedImageView = (ImageView) imageView;
        tappedImageView.setTranslationX(-2000);
        tappedImageView.setImageResource(R.drawable.tiger);
        tappedImageView.animate().translationXBy(2000).alpha(1).rotation(3600).setDuration(1000);

    }

}
