package alya.ikb.myutsrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHm;
    private ArrayList<Hm> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvHm = findViewById(R.id.rv_hm);
        rvHm.setHasFixedSize(true);

        if(getSupportActionBar()!=null){
            getSupportActionBar().setTitle("Gadis Mineral Town");
        }
        list.addAll(HmData.getListData());
        showRecycleList();
    }

    private void showRecycleList(){
        rvHm.setLayoutManager(new LinearLayoutManager(this));
        ListHmAdapter listHmAdapter = new ListHmAdapter(this, list);
        rvHm.setAdapter(listHmAdapter);
    }

    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.tombol_about, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.profilku:
                Intent intent = new Intent(this, Profil.class);
                startActivity(intent);
                return true;
        }
        return true;
    }

    /*public ArrayList<Hm> getListHm(){
        String[] dataName=getResources().getStringArray(R.array.data_name);
        String[] dataDescription=getResources().getStringArray(R.array.data_description);
        String[] dataPhoto=getResources().getStringArray(R.array.photo);

        ArrayList<Hm> listHm=new ArrayList<>();
        for (int i=0; i<dataName.length; i++){
            Hm hm = new Hm();
            hm.setName(dataName[i]);
            hm.setDescription(dataDescription[i]);
            hm.setPhoto(dataPhoto[i]);

            listHm.add(hm);
        }return listHm;
    }*/
}
