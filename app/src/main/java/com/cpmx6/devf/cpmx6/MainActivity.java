package com.cpmx6.devf.cpmx6;

import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.cpmx6.devf.cpmx6.adapter.TrendingGiphyAdapter;
import com.cpmx6.devf.cpmx6.app.GiphyApplication;
import com.cpmx6.devf.cpmx6.model.GiphyItem;
import com.facebook.drawee.backends.pipeline.Fresco;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observer;

public class MainActivity extends AppCompatActivity implements Observer<GiphyItem> {

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.drawer_layout)
    DrawerLayout drawerLayout;
    @Bind(R.id.giphy_recycler_view)
    RecyclerView giphyRecyclerView;
    @Bind(R.id.text_to_search)
    TextView textToSearch;
    @Bind(R.id.search_btn)
    Button searchBtn;
    private RecyclerView.LayoutManager mLayoutManager;
    private TrendingGiphyAdapter mTrendingGiphyAdapter;
    private List<GiphyItem.DataEntity> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fresco.initialize(this);
        ButterKnife.bind(this);
        setupToolbar();

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        giphyRecyclerView.setHasFixedSize(true);

        mLayoutManager = new GridLayoutManager(this, 2);
        giphyRecyclerView.setLayoutManager(mLayoutManager);

        mTrendingGiphyAdapter = new TrendingGiphyAdapter(items, this);
        giphyRecyclerView.setAdapter(mTrendingGiphyAdapter);

        getTrending();
    }

    private void setupToolbar() {
        setSupportActionBar(toolbar);
        // Show menu icon
        final ActionBar ab = getSupportActionBar();
        if (ab != null) {
            ab.setHomeAsUpIndicator(R.drawable.ic_menu);
            ab.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public void onCompleted() {
        Log.wtf("completed", "OK");
    }

    @Override
    public void onError(Throwable e) {
        Log.wtf("ERROR::", String.valueOf(e.fillInStackTrace()));
    }

    @Override
    public void onNext(GiphyItem giphyItem) {
        mTrendingGiphyAdapter.setNewItems(giphyItem.getData());
    }

    private void getTrending(){
        GiphyApplication.getGiphyApiManager().getTrendingGiphy().subscribe(this);
    }

    private void searchGiphy(){
        if(textToSearch.getText().length() > 0){
            GiphyApplication.getGiphyApiManager()
                    .searchGiphy(String.valueOf(textToSearch.getText())).subscribe(this);
        }else{
            getTrending();
        }
    }

    @OnClick(R.id.search_btn)
    public void doSearch(){
        searchGiphy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
