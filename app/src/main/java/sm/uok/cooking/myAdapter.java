package sm.uok.cooking;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class myAdapter extends RecyclerView.Adapter<myAdapter.myViewHolder> {

    private final Activity activity;
    private final ArrayList<objectOfList> list;
    private View view;

    public myAdapter(ArrayList<objectOfList>list, Activity activity){
        this.list=list;
        this.activity=activity;

    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        switch (MainActivity.selectUserTheme){

            case 0:
                view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_item,parent,false);
                break;
            case 1:
                view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_itemdark,parent,false);
                break;
        }


        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
      objectOfList item=  list.get(position);
      holder.txt_item.setText(item.text);
      holder.img_item.setImageResource(item.resImg);

      switch (item.text){
          case "غذاهای  ایرانی":
              holder.root.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      Intent intent=new Intent(activity,irani.class);
                      activity.startActivity(intent);
                  }
              });
              break;
          case "غذاهای فست فود":
              holder.root.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      Intent intent=new Intent(activity,khareji.class);
                      activity.startActivity(intent);
                  }
              });
              break;
          case "لیست علاقه مندی ها":
              holder.root.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      Intent intent=new Intent(activity,ForwardList.class);
                      activity.startActivity(intent);
                  }
              });
              break;
          case "غذاهای چینی":
              holder.root.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      Intent intent=new Intent(activity,China.class);
                      activity.startActivity(intent);
                  }
              });
              break;
          case "غذاهای مکزیکی":
              holder.root.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      Intent intent=new Intent(activity,Mexico.class);
                      activity.startActivity(intent);
                  }
              });
              break;
          case "غذاهای مدیترانه ای":
              holder.root.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      Intent intent=new Intent(activity,Mediterranean.class);
                      activity.startActivity(intent);
                  }
              });
              break;
          case "غذاهای عربی":
              holder.root.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      Intent intent=new Intent(activity,Arabic.class);
                      activity.startActivity(intent);
                  }
              });
              break;
      }



        switch (item.text) {

            case "رشته پلو":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "reshte");
                        activity.startActivity(intent);

                    }
                });
                break;


            case "فسنجون":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "fesn");
                        activity.startActivity(intent);

                    }
                });
                break;

            case "پیتزا":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "pit");
                        activity.startActivity(intent);

                    }
                });
                break;
            /////////////////////mediterranean food//////////////////
            case "ژیرو":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "mt_1");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "سوولاکی":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "mt_2");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "اسفوگاتا":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "mt_3");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "موساکا":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "mt_4");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "تیروپیتس":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "mt_5");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "تزاتزیکی":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "mt_6");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "کانولی":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "mt_7");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "پیده":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "mt_8");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "کومپیر":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "mt_9");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "بورک":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "mt_10");
                        activity.startActivity(intent);

                    }
                });
                break;

    ////////////////////////////END/////////////////////////////////////
    ////////////////////////china foods/////////////////////////////////
            case "دامپلینگ چینی":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "ch_1");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "وونتون":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "ch_2");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "ایکسایو لانگ بائو":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "ch_3");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "اردک کبابی":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "ch_4");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "چیکن کونگ پائو":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "ch_5");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "سیب زمینی رنده شده سرخ شده":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "ch_6");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "ماپو توفو":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "ch_7");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "نودل ژاجیانگ می ین":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "ch_8");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "نودل چومین":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "ch_9");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "چائو فان":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "ch_10");
                        activity.startActivity(intent);

                    }
                });
                break;
    ////////////////////////////END/////////////////////////////////////
    ////////////////////////////mexico foods////////////////////////////
            case "چیلاکیله":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "mx_1");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "پوزوله":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "mx_2");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "تاکو الپاستور":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "mx_3");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "توستادا":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "mx_4");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "چیلی نوگادا":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "mx_5");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "ایلوته":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "mx_6");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "انچیلادا":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "mx_7");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "موله":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "mx_8");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "گواکاموله":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "mx_9");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "تاماله":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "mx_10");
                        activity.startActivity(intent);

                    }
                });
                break;

    ////////////////////////////END/////////////////////////////////////
    ///////////////////////arabic foods/////////////////////////////////
            case "شاورما":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "ar_1");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "فلافل عربی":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "ar_2");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "حمص":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "ar_3");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "مجبوس":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "ar_4");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "کوشاری":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "ar_5");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "سالاد تبوله":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "ar_6");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "لحم عجین":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "ar_7");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "کبه":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "ar_8");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "مندی مرغ":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "ar_9");
                        activity.startActivity(intent);

                    }
                });
                break;
            case "شیش کباب":
                holder.root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(activity, StudyActivity.class);
                        intent.putExtra("data", "ar_10");
                        activity.startActivity(intent);

                    }
                });
                break;



            ///////////////////////////END//////////////////////////////////////

        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class myViewHolder extends RecyclerView.ViewHolder{
        ImageView img_item;
        TextView txt_item;
        ViewGroup root;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            img_item= itemView.findViewById(R.id.img_item);
            txt_item =itemView.findViewById(R.id.txt_item);
            root= itemView.findViewById(R.id.root);
        }
    }


    private Filter myFliter=new Filter() {

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            ArrayList<objectOfList> filteredList=new ArrayList<>();
            if(constraint==null||constraint.length()==0){
                //empty
            }else {
                String userinput=constraint.toString().toLowerCase().trim();
                for(objectOfList item:G.fullList){
                    if(item.text.toLowerCase().contains(userinput)){
                        filteredList.add(item);
                    }
                }
            }
            FilterResults results=new FilterResults();
            results.values=filteredList;
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
          list.clear();
          list.addAll((List) results.values);
          notifyDataSetChanged();
        }
    };

    public Filter getMyFliter() {
        return myFliter;
    }
}
