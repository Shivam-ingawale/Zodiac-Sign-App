package com.shivamingawale.myzodiacsign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class EndActivity extends AppCompatActivity {
    TextView zodiac_text;
    TextView zodiac_text2;
    Animation topanim, bottomanim;
    Button back;
    String zodiac;
    ImageView zodiac_sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        topanim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomanim= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        Intent intent = getIntent();
        zodiac = intent.getStringExtra("Zodiac");
        zodiac_text=findViewById(R.id.textView);
        zodiac_text2=findViewById(R.id.textView1);
        zodiac_sign=findViewById(R.id.imageView2);
        back=findViewById(R.id.button);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EndActivity.this,MainApp.class);
                startActivity(intent);
            }
        });


        zodiac_text.setText(R.string.Aquarius);

        if (zodiac.equals("Capricorn")){
            zodiac_sign.setImageResource(R.drawable.capricorn);
            zodiac_text.setText(zodiac);
            zodiac_text2.setText((R.string.Capricorn));
        }else if (zodiac.equals("Aquarius")){
            zodiac_sign.setImageResource(R.drawable.aquarius);
            zodiac_text.setText(zodiac);
            zodiac_text2.setText((R.string.Aquarius));
        }else if (zodiac.equals("Pisces")){
            zodiac_sign.setImageResource(R.drawable.pisces);
            zodiac_text2.setText(R.string.Pisces);
            zodiac_text.setText(zodiac);
        }else if (zodiac.equals("Aries")){
            zodiac_sign.setImageResource(R.drawable.aries);
            zodiac_text2.setText(R.string.Aries);
            zodiac_text.setText(zodiac);
        }else if (zodiac.equals("Taurus")){
            zodiac_sign.setImageResource(R.drawable.taurus);
            zodiac_text2.setText(R.string.Taurus);
            zodiac_text.setText(zodiac);
        }else if (zodiac.equals("Gemini")){
            zodiac_sign.setImageResource(R.drawable.gemini);
            zodiac_text2.setText(R.string.Gemini);
            zodiac_text.setText(zodiac);
        }else if (zodiac.equals("Cancer")){
            zodiac_sign.setImageResource(R.drawable.cancer);
            zodiac_text2.setText(R.string.Cancer);
            zodiac_text.setText(zodiac);
        }else if (zodiac.equals("Leo")){
            zodiac_sign.setImageResource(R.drawable.leo);
            zodiac_text2.setText(R.string.Leo);
            zodiac_text.setText(zodiac);
        }else if (zodiac.equals("Virgo")){
            zodiac_sign.setImageResource(R.drawable.virgo);
            zodiac_text2.setText((R.string.Virgo));
            zodiac_text.setText(zodiac);
        }else if (zodiac.equals("Scorpio")){
            zodiac_sign.setImageResource(R.drawable.scorpio);
            zodiac_text2.setText(R.string.Scorpio);
            zodiac_text.setText(zodiac);
        }else if (zodiac.equals("Libra")){
            zodiac_sign.setImageResource(R.drawable.libra);
            zodiac_text2.setText(R.string.Libra);
            zodiac_text.setText(zodiac);
        }else if (zodiac.equals("Sagittarius")){
            zodiac_sign.setImageResource(R.drawable.sagittarius);
            zodiac_text2.setText(R.string.Sagittarius);
            zodiac_text.setText(zodiac);
        }

    }
}