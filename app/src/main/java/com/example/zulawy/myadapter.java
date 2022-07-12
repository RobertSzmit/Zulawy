package com.example.zulawy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class myadapter extends RecyclerView.Adapter<myadapter.MyViewAdapter> {
    private List<model> list;
    private Context context;

    public myadapter(List<model> list, Context context) {
        this.list = list;
        this.context = context;
    }

    public myadapter(FirebaseRecyclerOptions<model> options) {
    }

    @NonNull
    @Override
    public MyViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.singlerow, parent, false);

        return new MyViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewAdapter holder, int position) {

        model item = list.get(position);
        holder.tresc.setText(item.getTresc());
        holder.name.setText(item.getTresc());
        try {
            Picasso.get().load(item.getImage()).into(holder.image);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewAdapter extends RecyclerView.ViewHolder {

        private TextView name, tresc;
        private ImageView image;

        public MyViewAdapter(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.nametext);
            tresc = itemView.findViewById(R.id.tresctext);
            image = itemView.findViewById(R.id.img1);
        }
    }
}

//public class myadapter extends FirebaseRecyclerAdapter<model, myadapter.myviewholder> {

//    public myadapter(@NonNull FirebaseRecyclerOptions<model> options) {
//        super(options);
 //   }

 //   @Override
//    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull model model) {

 //       holder.name.setText(model.getName());
 //       holder.tresc.setText(model.getTresc());
 //       Glide.with(holder.img.getContext()).load(model.getImage()).into(holder.img); // to jest wywołanie obrazka z bazy
        // getImage gdzie Image to nazwa obrazka, choć w bazie jest z małej

 //   }

 //   @NonNull
 //   @Override
 //   public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

 //       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow, parent, false);
 //       return new myviewholder(view);
 //   }

//    class myviewholder extends RecyclerView.ViewHolder {

 //       CircleImageView img;
 //       TextView name, tresc;
//        public myviewholder(@NonNull View itemView) {

 //           super(itemView);
 //           img = (CircleImageView) itemView.findViewById(R.id.img1);
 //           name = (TextView) itemView.findViewById(R.id.nametext);
 //           tresc = (TextView) itemView.findViewById(R.id.tresctext);
 //       }
//    }

//}

