package hexadom.aristocat;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import hexadom.aristocat.databinding.TemplateCharactersBinding;

public class CharactersTemplateActivity extends AppCompatActivity {
    // Store the binding
    private TemplateCharactersBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Inflate the content view (replacing `setContentView`)
        binding = DataBindingUtil.setContentView(this, R.layout.template_characters);
        // Store the field now if you'd like without any need for casting
        // String text = binding.maximusMotd().getText().toString();
        String text = binding.test.getText().toString();
        binding.test.setText("Binding Demo");
        // Or use the binding to update views directly on the binding
        // binding.setMoto("@strings/maximus_moto");
    }
}
