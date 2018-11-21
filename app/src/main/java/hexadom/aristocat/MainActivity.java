package hexadom.aristocat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

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

    public void goto_scenarios(View v){
        Intent myIntent = new Intent(getBaseContext(), ScenariosActivity.class);
        startActivity(myIntent);
    }

    public void goto_states(View v){
        Intent myIntent = new Intent(getBaseContext(), StatesActivity.class);
        startActivity(myIntent);
    }

    public void goto_round(View v){
        Intent myIntent = new Intent(getBaseContext(), RoundActivity.class);
        startActivity(myIntent);
    }

}
