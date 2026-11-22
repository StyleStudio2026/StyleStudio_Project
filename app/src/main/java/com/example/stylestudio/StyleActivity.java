package com.example.stylestudio;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;

/**
 * الخطوة 3: شاشة اختيار النمط.
 */
public class StyleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_style);

        EditText budgetInput = findViewById(R.id.budgetInput);
        GridView styleGrid = findViewById(R.id.styleGrid);

        // ربط الـ GridView بالـ ImageAdapter (الخطوة 4)
        styleGrid.setAdapter(new ImageAdapter(this, OutfitData.IMAGES, OutfitData.STYLES));

        // الخطوة 5 (حدث النقر) والخطوة 7 (فحص الميزانية) تُضاف هنا:
        // styleGrid.setOnItemClickListener((parent, view, position, id) -> { ... });
    }
}
