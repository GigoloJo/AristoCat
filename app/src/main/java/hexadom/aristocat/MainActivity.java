package hexadom.aristocat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.Spanned;
import android.view.View;

import uk.co.deanwild.flowtextview.FlowTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goto_characters(View v){
        Intent myIntent = new Intent(getBaseContext(), CharactersActivity.class);
        startActivity(myIntent);
    }

}
