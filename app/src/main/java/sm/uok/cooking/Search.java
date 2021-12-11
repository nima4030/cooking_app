package sm.uok.cooking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.SearchView;

import java.util.ArrayList;

public class Search extends AppCompatActivity {

    private RecyclerView recyclerListSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        switch (MainActivity.selectUserTheme){

            case 0:
                setTheme(R.style.AppThemeMain);
                break;
            case 1:
                setTheme(R.style.AppThemeDark);
                break;
        }
        setContentView(R.layout.activity_search);
        recyclerListSearch =findViewById(R.id.recyclerListSearch);

        recyclerListSearch = (RecyclerView) findViewById(R.id.recyclerListSearch);
        recyclerListSearch.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<objectOfList> list = new ArrayList<objectOfList>();
        list.add(new objectOfList("لیست علاقه مندی ها", R.drawable.book));
        list.add(new objectOfList("غذای ایرانی", R.drawable.ghazayeirani));
        list.add(new objectOfList("غذای خارجی", R.drawable.ghazayekhareji));
        list.add(new objectOfList("empty", R.drawable.ic__info));
        list.add(new objectOfList("empty", R.drawable.ic__info));
        list.add(new objectOfList("empty", R.drawable.ic__info));
        list.add(new objectOfList("empty", R.drawable.ic__info));

        myAdapter adapter = new myAdapter(list, this);
        recyclerListSearch.setAdapter(adapter);


        SearchView searchView =findViewById(R.id.searchView);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
         @Override
         public boolean onQueryTextSubmit(String query) {
            return false;
          }

         @Override
         public boolean onQueryTextChange(String newText) {

             adapter.getMyFliter().filter(newText);
             return false;
          }
        });


    }
}