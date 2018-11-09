package lohith.com.farmer_connect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    FarmerAdapter adapter;
    List<ItemDetails> item_list;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        item_list = new ArrayList<>();


        //adding some items to our list
        item_list.add(
                new ItemDetails(
                           "lohith",
                            "Msrit college",
                             50000,
                              1,
                               R.mipmap.ic_launcher
                ));

       item_list.add(
                new ItemDetails(
                        "Anil",
                        "SJCIT college",
                        40000,
                         2,
                         R.mipmap.ic_launcher_round));


        adapter = new FarmerAdapter(this,item_list);
        recyclerView.setAdapter(adapter);

    }
}
