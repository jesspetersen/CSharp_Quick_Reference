package net.jesspetersen.cquickreference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CDSelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cdselect);
    }

    public void ChangeViewCDConsole(View v){
        startActivity(new Intent(CDSelect.this, CDConsole.class));
    }
}
