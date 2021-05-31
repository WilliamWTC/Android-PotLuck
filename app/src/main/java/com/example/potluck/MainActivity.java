package com.example.potluck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView showText;
    private Button showButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showButton = findViewById(R.id.button);
        showText = findViewById(R.id.textView);

        showButton.setOnClickListener(View -> {
            String[] arr={"Do you believe in aliens?",
                    "You are about to get into a fight, what song comes on as your soundtrack?",
                    "If you could know the absolute & total truth to one question, what would you ask?",
                    "How many friends do you have on facebook & how many actually mean something to you?",
                    "Which of your personality traits has been the most useful?",
                    "If you had a theme song, what would it be?",
                    "If you could write one new law that everyone had to obey, what law would you create?",
                    "What do you like more, being a leader or a follower?",
                    "What do you miss most about being a kid?",
                    "You are given a thousand acres of land, what do you do with it?",
                    "If you could hack into one computer, whose computer would it be?",
                    "What's the most interesting thing you've read/seen this week?",
                    "What fact amazes you every time you think of it?",
                    "What is the silliest thing you've heard people say about you?",
                    "What cartoon do you still like to watch?",
                    "What personality trait do you wish you had?",
                    "What's the meanest thing you've ever done to someone to get back at them?",
                    "If you were arrested with no explanation, what would friends/family assume you've done?",
                    "using one word, how would you describe your family?",
                    "If you could shop for free at one store, which one would you choose?",
                    "When have you felt your biggest adrenaline rush?", "Superman or Batman?",
                    "What event in your life would make a good movie?",
                    "On a day held in your honor, what would people have to do?",
                    "What food combination do you want to ban?",
                    "What's your first executive order as king/queen of [this company/nation/room etc]?",
                    "If you could be great at one sport which would it be?",
                    "If you could dedicate your life to solving one problem, what problem would it be?",
                    "If you had one day to live on earth, what would you do?",
                    "What makes a person beautiful to you?",
                    "What's a big favor you have done for a friend?",
                    "If you could turn into your partner for a day, what would you do?",
                    "What would be the absolute worst name you could give your child?",
                    "If you could swim in any liquid, what would it be & why?",
                    "What Simpsons character are you?",
                    "What separates true friends from acquaintances?",
                    "If you were immortal for a day, what would you do?",
                    "What job do you think you were born to do?",
                    "Do you believe things happen for a reason?",
                    "If you could replace war with something else to settle countries differences, what would it be?",
                    "Have you ever received money from the tooth fairy?",
                    "Do you believe that we all have souls?",
                    "Never have i ever thought that I am the most awesome person on the planet?",
                    "Never have I ever forged my parent's signature?",
                    "Never have I ever borrowed something without the intention of returning it?"};
            Random r=new Random();
            int randomNumber=r.nextInt(arr.length);
            showText.setText(arr[randomNumber]);
        });
    }
}