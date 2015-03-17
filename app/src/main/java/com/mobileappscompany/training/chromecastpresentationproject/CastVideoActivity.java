package com.mobileappscompany.training.chromecastpresentationproject;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class CastVideoActivity extends ActionBarActivity {

    private Context context;
    private Button  buttonCastVideoAction;
    private Button  buttonReturnToMainFromCastVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cast_video);

        context = this;

        buttonCastVideoAction           = (Button)findViewById(R.id.buttonCastVideoAction);
        buttonReturnToMainFromCastVideo = (Button)findViewById(R.id.buttonReturnToMainFromCastVideo);

        buttonCastVideoAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Constants.showNotYetImplementedToast(context);
            }
        });

        buttonReturnToMainFromCastVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                setResult(Constants.CAST_VIDEO_RESULT_CODE,intent);
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cast_video, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
