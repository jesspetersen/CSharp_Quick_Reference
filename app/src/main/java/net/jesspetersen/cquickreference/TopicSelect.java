package net.jesspetersen.cquickreference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TopicSelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_select);
    }

    public void ChangeViewCDSelect(View v){
        startActivity(new Intent(TopicSelect.this, CDSelect.class));
    }

    public void ChangeViewExampleSelect(View v){
        startActivity(new Intent(TopicSelect.this, ExampleSelect.class));
    }

    public void ChangeViewGuideSelect(View v){
        startActivity(new Intent(TopicSelect.this, GuideSelect.class));
    }

    public void ChangeViewAbout(View v){
        startActivity(new Intent(TopicSelect.this, About.class));
    }
}
