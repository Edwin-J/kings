package minjae.history_israel_juda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Gallery gallery;

    final int img[] = {
            R.drawable.canada,
            R.drawable.korea,
            R.drawable.mexico,
            R.drawable.france,
            R.drawable.poland,
            R.drawable.saudi_arabia
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GalleryAdapter adapter = new GalleryAdapter(
                getApplicationContext(),
                R.layout.row,
                img
        );

        Gallery gallery = (Gallery) findViewById(R.id.gallery);
        gallery.setAdapter(adapter);

        final ImageView imageView = (ImageView) findViewById(R.id.image);
        imageView.setOnClickListener(this);

        gallery.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {
                imageView.setImageResource(img[pos]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) { }
        });

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);
    }
}
