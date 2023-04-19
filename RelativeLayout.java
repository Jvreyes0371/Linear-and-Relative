package com.example.linearlayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
public class RelativeLayout extends AppCompatActivity {
        private Button buttons;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_relative_layout);
            buttons = (Button) findViewById(R.id.button15);
            buttons.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openMainActivity();
                }});}
        public void openMainActivity(){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }