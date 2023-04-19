package com.example.linearlayout;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    private Button buttons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttons = (Button) findViewById(R.id.button12);
        buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RelativeLayout();
            }});}
    public void RelativeLayout(){
        Intent intent = new Intent(this, RelativeLayout.class);
        startActivity(intent);
    }
}