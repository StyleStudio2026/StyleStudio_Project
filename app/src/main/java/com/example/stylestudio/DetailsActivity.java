
package com.example.stylestudio;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ImageView detailImage = findViewById(R.id.detailImage);
        TextView detailStyle = findViewById(R.id.detailStyle);
        TextView detailPrice = findViewById(R.id.detailPrice);
        TextView detailDescription = findViewById(R.id.detailDescription);
        Button saveButton = findViewById(R.id.saveButton);

        int index = getIntent().getIntExtra("index", 0);

        if (index < 0 || index >= OutfitData.IMAGES.length) {
            index = 0;
        }

        detailImage.setImageResource(OutfitData.IMAGES[index]);
        detailStyle.setText(OutfitData.STYLES[index]);
        detailPrice.setText("SAR " + OutfitData.PRICES[index]);
        detailDescription.setText(OutfitData.DESCRIPTIONS[index]);

        final int selectedIndex = index;

        saveButton.setOnClickListener(v -> {

            SharedPreferences prefs =
                    getSharedPreferences("style", MODE_PRIVATE);

            prefs.edit()
                    .putString("name", OutfitData.STYLES[selectedIndex])
                    .putInt("index", selectedIndex)
                    .apply();

            Toast.makeText(this,
                    "Saved to Favorites!",
                    Toast.LENGTH_SHORT).show();
        });
    }
}

