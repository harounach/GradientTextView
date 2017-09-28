package com.havas.gradienttextview;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Typeface algerianFont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text_view);

        //setting custom font "Algerian"
        algerianFont = Typeface.createFromAsset(getAssets(), "ALGER.TTF");
        textView.setTypeface(algerianFont);

        //applying gradient colors
        int[] colors = {ContextCompat.getColor(this, R.color.font_color_a),
                ContextCompat.getColor(this, R.color.font_color_b),
                ContextCompat.getColor(this, R.color.font_color_c),
                ContextCompat.getColor(this, R.color.font_color_d)};
        float[] position = {0, 1, 2, 3};
        Shader.TileMode tileMode = Shader.TileMode.MIRROR; // or TileMode.REPEAT;
        LinearGradient linearGradient = new LinearGradient(0, 0, 0, 50,colors,position, tileMode);
        Shader shaderGradient = linearGradient;
        textView.getPaint().setShader(shaderGradient);

    }
}
