package alya.ikb.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnMoveActivity;
    Button btnMoveActivityWithData;
    Button btnDial;
    Button btnWeb;
    Button btnExp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity=findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        btnMoveActivityWithData = findViewById(R.id.btn_move_data);
        btnMoveActivityWithData.setOnClickListener(this);

        btnDial =findViewById(R.id.btn_dial);
        btnDial.setOnClickListener(this);

        btnWeb = findViewById(R.id.btn_web);
        btnWeb.setOnClickListener(this);

        btnExp=findViewById(R.id.btn_explicit);
        btnExp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, NewActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_move_data:
                Intent moveData = new Intent (MainActivity.this, MoveActivityWithData.class);
                moveData.putExtra(MoveActivityWithData.EXTRA_NAME, "Alya Shafa");
                moveData.putExtra(MoveActivityWithData.EXTRA_AGE, 19);
                startActivity(moveData);
                break;

            case R.id.btn_dial:
                String phoneNumber = "0895386357310";
                Intent dialPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhone);
                break;

            case R.id.btn_web:
                Intent website = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.polines.ac.id"));
                startActivity(website);
                break;

            case R.id.btn_explicit:
                Intent Keplicit = new Intent(MainActivity.this, ActivityHal1.class);
                startActivity(Keplicit);
                break;
        }
    }
}
