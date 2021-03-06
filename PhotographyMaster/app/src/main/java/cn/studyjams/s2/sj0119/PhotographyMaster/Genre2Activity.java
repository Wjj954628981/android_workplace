package cn.studyjams.s2.sj0119.PhotographyMaster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Genre2Activity extends AppCompatActivity {

    private ImageView whatimg;
    private TextView photographyintro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre2);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        whatimg = (ImageView) findViewById(R.id.genre_img2);
        whatimg.setImageResource(R.drawable.genre2);
        photographyintro = (TextView) findViewById(R.id.genre_intro2);

        photographyintro.setText(this.getResources().getString(R.string.genre2));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
