package android.example.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG=MainActivity.class.getSimpleName();

    public static final String EXTRA_MESSAGE=
         "android.example.com.extra.MESSAGE";

    public static final int TEXT_REQUEST = 1;

    private EditText mMessageEditText;
    private TextView mReplyHeadTextView;
    private TextView mReplyTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mMessageEditText = (EditText) findViewById(R.id.editText_main);
        mReplyHeadTextView = (TextView) findViewById(R.id.text_header_reply);
        mReplyHeadTextView = (TextView) findViewById(R.id.text_header_reply);
    }

    public void launchSecondactivity(View view) {
        Log.d(LOG_TAG, 'Buttuon clicked!");

       Intent intent =new Intent( packageContext: this, SecondActivity.class);
       String Message = mMessageEditText.getText().toString();

      Intent.putExtra(EXTRA_MESSAGE,message);
      startActivityForResult(intent,TEXT_REQUEST);

}

