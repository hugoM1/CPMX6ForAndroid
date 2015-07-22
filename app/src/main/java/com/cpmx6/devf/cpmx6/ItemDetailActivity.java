package com.cpmx6.devf.cpmx6;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.cpmx6.devf.cpmx6.app.GiphyApplication;
import com.cpmx6.devf.cpmx6.model.DetailItem;
import com.cpmx6.devf.cpmx6.nav.NavigationHelper;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.Bind;
import butterknife.ButterKnife;
import rx.Observer;

public class ItemDetailActivity extends AppCompatActivity implements Observer<DetailItem>{

    @Bind(R.id.giphy_image_view)
    SimpleDraweeView giphyImageView;
    @Bind(R.id.itemInfo)
    TextView infoText;

    private Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);
        ButterKnife.bind(this);

        if(getIntent().getExtras() != null){
            bundle = getIntent().getBundleExtra(NavigationHelper.BUNDLE_EXTRAS);
            getDetails(bundle.getString("id"));
        }
    }

    private void getDetails(String id){
        GiphyApplication.getGiphyApiManager().getItemDetetailById(id)
                .subscribe(this);
    }

    @Override
    public void onCompleted() {
        Log.wtf("Completed", "OK");
    }

    @Override
    public void onError(Throwable e) {
        Log.wtf("ERROR::", String.valueOf(e));
    }

    @Override
    public void onNext(DetailItem dataEntity) {
        Log.wtf("Next::", String.valueOf(dataEntity.getData().getId()));
        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setUri(Uri.parse(dataEntity.getData().getImages().getDownsized().getUrl()))
                .setAutoPlayAnimations(true)
                .build();
        giphyImageView.setController(controller);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_item_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
