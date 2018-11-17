package hexadom.aristocat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CharactersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_characters);
    }

    public void goto_characters_maximus(View v) {
        Intent myIntent = new Intent(getBaseContext(), CharactersMaximusActivity.class);
        startActivity(myIntent);
    }
    public void goto_characters_parvati(View v) {
        Intent myIntent = new Intent(getBaseContext(), CharactersParvatiActivity.class);
        startActivity(myIntent);
    }
    public void goto_characters_lunah(View v) {
        Intent myIntent = new Intent(getBaseContext(), CharactersLunahActivity.class);
        startActivity(myIntent);
    }
    public void goto_characters_hexx3r(View v) {
        Intent myIntent = new Intent(getBaseContext(), Charactershexx3rActivity.class);
        startActivity(myIntent);
    }

    public void goto_characters_8ball(View v) {
        Intent myIntent = new Intent(getBaseContext(), Characters8ballActivity.class);
        startActivity(myIntent);
    }
    public void goto_characters_mushashi(View v) {
        Intent myIntent = new Intent(getBaseContext(), CharactersMushashiActivity.class);
        startActivity(myIntent);
    }
    public void goto_characters_wildbill(View v) {
        Intent myIntent = new Intent(getBaseContext(), CharactersWildbillActivity.class);
        startActivity(myIntent);
    }
    public void goto_characters_gata(View v) {
        Intent myIntent = new Intent(getBaseContext(), CharactersGataActivity.class);
        startActivity(myIntent);
    }

    public void goto_characters_hannibal(View v) {
        Intent myIntent = new Intent(getBaseContext(), CharactersHannibalActivity.class);
        startActivity(myIntent);
    }
    public void goto_characters_valkyrie(View v) {
        Intent myIntent = new Intent(getBaseContext(), CharactersValkyrieActivity.class);
        startActivity(myIntent);
    }
    public void goto_characters_laxmee(View v) {
        Intent myIntent = new Intent(getBaseContext(), CharactersLaxmeeActivity.class);
        startActivity(myIntent);
    }
    public void goto_characters_massacre(View v) {
        Intent myIntent = new Intent(getBaseContext(), CharactersMassacreActivity.class);
        startActivity(myIntent);
    }

    public void goto_characters_mendoza(View v) {
        Intent myIntent = new Intent(getBaseContext(), CharactersMendozaActivity.class);
        startActivity(myIntent);
    }
    public void goto_characters_murtair(View v) {
        Intent myIntent = new Intent(getBaseContext(), CharactersMurtairActivity.class);
        startActivity(myIntent);
    }
    public void goto_characters_kozmo(View v) {
        Intent myIntent = new Intent(getBaseContext(), CharactersKozmoActivity.class);
        startActivity(myIntent);
    }
    public void goto_characters_taowu(View v) {
        Intent myIntent = new Intent(getBaseContext(), CharactersTaowuActivity.class);
        startActivity(myIntent);
    }

    public void goto_characters_dart(View v) {
        Intent myIntent = new Intent(getBaseContext(), CharactersDartActivity.class);
        startActivity(myIntent);
    }
    public void goto_characters_bixie(View v) {
        Intent myIntent = new Intent(getBaseContext(), CharactersBixieActivity.class);
        startActivity(myIntent);
    }
    public void goto_characters_prysm(View v) {
        Intent myIntent = new Intent(getBaseContext(), CharactersPrysmActivity.class);
        startActivity(myIntent);
    }
    public void goto_characters_eclypse(View v) {
        Intent myIntent = new Intent(getBaseContext(), CharactersEclypseActivity.class);
        startActivity(myIntent);
    }

    public void goto_characters_boss(View v) {
        Intent myIntent = new Intent(getBaseContext(), CharactersBossActivity.class);
        startActivity(myIntent);
    }
    public void goto_characters_shona(View v) {
        Intent myIntent = new Intent(getBaseContext(), CharactersShonaActivity.class);
        startActivity(myIntent);
    }
    public void goto_characters_koorie(View v) {
        Intent myIntent = new Intent(getBaseContext(), CharactersKoorieActivity.class);
        startActivity(myIntent);
    }
    public void goto_characters_oberon(View v) {
        Intent myIntent = new Intent(getBaseContext(), CharactersOberonActivity.class);
        startActivity(myIntent);
    }
}
