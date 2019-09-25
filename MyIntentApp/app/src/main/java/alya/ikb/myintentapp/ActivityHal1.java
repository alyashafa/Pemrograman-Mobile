package alya.ikb.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityHal1 extends AppCompatActivity {

    Button btnhal2;
    EditText edthal2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal1);
        btnhal2 = findViewById(R.id.btnhal2);
        edthal2 = findViewById(R.id.edithal2);

        btnhal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = edthal2.getText().toString();
                startActivity(new Intent(ActivityHal1.this, ActivityHal2.class).putExtra("nama", nama));
            }
        });
    }
}

