package rhynix.eliud.recyclerview;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BookActivity extends AppCompatActivity {

    private TextView tvtitle,tvdescription,tvcategory;
    private ImageView bookImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

            tvtitle = (TextView)findViewById(R.id.txtTitle);
            tvdescription = (TextView)findViewById(R.id.txtDescription);
            tvcategory = (TextView)findViewById(R.id.txtCategoty);
            bookImg = (ImageView)findViewById(R.id.bookthumbnail);


        //Receive the Data

        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        int Image = intent.getExtras().getInt("Thumbnail");

        //Settting Values to their respective content

        tvtitle.setText(Title);
        tvdescription.setText(Description);
        bookImg.setImageResource(Image);

    }
}
