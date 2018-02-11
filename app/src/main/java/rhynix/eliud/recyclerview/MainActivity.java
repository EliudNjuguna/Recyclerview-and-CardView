package rhynix.eliud.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> lstBook;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstBook = new ArrayList<>();
        lstBook.add(new Book("The Vegitarian","Category Book","Description Book",R.drawable.thevigitarian));
        lstBook.add(new Book("The Wild Robot","Category Book","Description Book",R.drawable.thewildrobot));
        lstBook.add(new Book("Maria Samples","Category Book","Description Book",R.drawable.mariasemples));
        lstBook.add(new Book("The Martian","Category Book","Description Book",R.drawable.themartian));
        lstBook.add(new Book("He Died with ...","Category Book","Description Book",R.drawable.hediedwith));
        lstBook.add(new Book("The Vegitarian","Category Book","Description Book",R.drawable.thevigitarian));
        lstBook.add(new Book("The Wild Robot","Category Book","Description Book",R.drawable.thewildrobot));
        lstBook.add(new Book("Maria Samples","Category Book","Description Book",R.drawable.mariasemples));
        lstBook.add(new Book("The Martian","Category Book","Description Book",R.drawable.themartian));
        lstBook.add(new Book("He Died with ...","Category Book","Description Book",R.drawable.hediedwith));
        lstBook.add(new Book("The Vegitarian","Category Book","Description Book",R.drawable.thevigitarian));
        lstBook.add(new Book("The Wild Robot","Category Book","Description Book",R.drawable.thewildrobot));
        lstBook.add(new Book("Maria Samples","Category Book","Description Book",R.drawable.mariasemples));
        lstBook.add(new Book("The Martian","Category Book","Description Book",R.drawable.themartian));
        lstBook.add(new Book("He Died with ...","Category Book","Description Book",R.drawable.hediedwith));

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstBook);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(myAdapter);

    }
}
