package sm.uok.cooking;
import android.app.Application;

import java.util.ArrayList;

public class G extends Application {

    public static ArrayList<objectOfList> fullList;

    @Override
    public void onCreate() {
        super.onCreate();
      fullList = new ArrayList<>();


        //khareji
        fullList.add(new objectOfList("پیتزا",R.drawable.pitza));
        fullList.add(new objectOfList("استیک",R.drawable.ghazayekhareji));
        fullList.add(new objectOfList("empty",R.drawable.empty));
        fullList.add(new objectOfList("empty",R.drawable.empty));
        fullList.add(new objectOfList("empty",R.drawable.empty));
        fullList.add(new objectOfList("empty",R.drawable.empty));
        fullList.add(new objectOfList("empty",R.drawable.empty));
        fullList.add(new objectOfList("empty",R.drawable.empty));
        fullList.add(new objectOfList("empty",R.drawable.empty));
        fullList.add(new objectOfList("empty",R.drawable.empty));


        //irani
       fullList.add(new objectOfList("رشته پلو",R.drawable.ghazayeirani));
       fullList.add(new objectOfList("فسنجون",R.drawable.ghazayekhareji));
       fullList.add(new objectOfList("empty",R.drawable.empty));
       fullList.add(new objectOfList("empty",R.drawable.empty));
       fullList.add(new objectOfList("empty",R.drawable.empty));
       fullList.add(new objectOfList("empty",R.drawable.empty));
       fullList.add(new objectOfList("empty",R.drawable.empty));
       fullList.add(new objectOfList("empty",R.drawable.empty));
       fullList.add(new objectOfList("empty",R.drawable.empty));
       fullList.add(new objectOfList("empty",R.drawable.empty));

    }
}
