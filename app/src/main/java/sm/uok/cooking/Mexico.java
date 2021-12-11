package sm.uok.cooking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Mexico extends AppCompatActivity {
    private RecyclerView recyclerListMexico;

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
        setContentView(R.layout.activity_mexico);
        recyclerListMexico=findViewById(R.id.recyclerListMexico);
        recyclerListMexico.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<objectOfList> list=new ArrayList<objectOfList>();
        list.add(new objectOfList("چیلاکیله", R.drawable.d6));
        list.add(new objectOfList("پوزوله",R.drawable.d7));
        list.add(new objectOfList("تاکو الپاستور",R.drawable.empty));
        list.add(new objectOfList("توستادا",R.drawable.empty));
        list.add(new objectOfList("چیلی نوگادا",R.drawable.empty));
        list.add(new objectOfList("ایلوته",R.drawable.empty));
        list.add(new objectOfList("انچیلادا",R.drawable.empty));
        list.add(new objectOfList("موله",R.drawable.empty));
        list.add(new objectOfList("گواکاموله",R.drawable.empty));
        list.add(new objectOfList("تاماله",R.drawable.empty));






        myAdapter adapter=new myAdapter(list,this);
        recyclerListMexico.setAdapter(adapter);

    }
}