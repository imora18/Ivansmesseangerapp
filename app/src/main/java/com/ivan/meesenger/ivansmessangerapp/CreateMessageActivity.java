package com.hfad.messenger;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.ivan.meesenger.ivansmessangerapp.R;

public class CreateMessageActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }
    //Call onSendMessage() when the button is clicked
    public void onSendMessage(View view) {
    }
}
