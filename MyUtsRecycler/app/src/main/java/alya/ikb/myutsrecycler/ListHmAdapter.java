package alya.ikb.myutsrecycler;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListHmAdapter extends RecyclerView.Adapter<ListHmAdapter.ListViewHolder>
{
    private ArrayList<Hm>listHm;
    private Context context;

    public ListHmAdapter(Context context, ArrayList<Hm>listHm){
        this.listHm=listHm;
        this.context=context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_hm, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListHmAdapter.ListViewHolder holder, int position) {
        final Hm hm = listHm.get(position);

        Glide.with(holder.itemView.getContext())
                .load(hm.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(hm.getName());
        holder.tvDesc.setText(hm.getDescription());
        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detail = new Intent(context, DetailListHmb.class);
                detail.putExtra("hm_id", hm.getId());
                context.startActivity(detail);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listHm.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvDesc;
        CardView cv;

        ListViewHolder(View itemView){
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDesc = itemView.findViewById(R.id.tv_item_desc);
            cv = itemView.findViewById(R.id.cardview_item);
        }
    }
}
