package com.gutotech.frasesdodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.security.SecureRandom;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void generateNewPhrase(View view){
        String [] phrases = {
                "Um pequeno pensamento positivo pela manhã pode mudar todo o seu dia.",
                "Que o dia seja leve, que a tristeza seja breve e que o dia seja feliz. Bom dia!",
                "Que o dia comece bem e termine ainda melhor.",
                "Pra hoje: sorrisos bobos, uma mente tranquila e um coração cheio de paz.",
                "Sempre que o sol nasce, você tem uma nova oportunidade de ser feliz. Bom dia!"};

        TextView textView = findViewById(R.id.textView);

        textView.setText(phrases[new SecureRandom().nextInt(phrases.length)]);
    }
}