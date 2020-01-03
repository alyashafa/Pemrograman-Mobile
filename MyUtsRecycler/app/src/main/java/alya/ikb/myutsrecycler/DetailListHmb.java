package alya.ikb.myutsrecycler;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailListHmb extends AppCompatActivity {
    private int hm_id;
    ImageView imgDetail;
    TextView tvName, tvDesc;
    private ArrayList<Hm> listhm=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_hmb);

        hm_id =getIntent().getIntExtra("hm_id", 0);
        tvName = findViewById(R.id.nama_hm);
        tvDesc = findViewById(R.id.desc_detail);
        imgDetail = findViewById(R.id.img_detail);

        listhm.addAll(HmData.getListData());

        setLayout();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    void setLayout(){
        tvName.setText(listhm.get(hm_id).getName());
        tvDesc.setText(listhm.get(hm_id).getDescription());
        Glide .with(this)
                .load(listhm.get(hm_id).getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(imgDetail);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==R.id.home){
            Intent main = new Intent(this, MainActivity.class);
            startActivity(main);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
