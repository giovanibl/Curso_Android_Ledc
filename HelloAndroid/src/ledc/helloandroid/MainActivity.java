package ledc.helloandroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void onButtonClicked(View view){
    	TextView texto = (TextView)findViewById(R.id.textView1);
    	texto.setVisibility(TextView.VISIBLE);
    	Toast.makeText(this, getString(R.string.message), Toast.LENGTH_LONG).show();
    }
    
}
