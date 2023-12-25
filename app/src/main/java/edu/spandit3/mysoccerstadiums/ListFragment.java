package edu.spandit3.mysoccerstadiums;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;


import java.util.List;

public class ListFragment extends Fragment {

    public static ListFragment newInstance() {
        return new ListFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        RecyclerView recyclerView = (RecyclerView) inflater.inflate(
                R.layout.recycler_view, container, false);

        ContentAdapter adapter = new ContentAdapter(
                recyclerView.getContext(), DataInitializer.getData());

        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return recyclerView;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
    public static class ContentViewHolder extends RecyclerView.ViewHolder {
        public ImageView image;
        public TextView name, description;

        public ContentViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.list_image);
            name = itemView.findViewById(R.id.list_name);
            description = itemView.findViewById(R.id.list_desc);

            itemView.setOnClickListener(view -> {
                Context context = view.getContext();
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra(DetailActivity.EXTRA_POSITION, getAbsoluteAdapterPosition());
                context.startActivity(intent);
            });
        }
    }

    public static class ContentAdapter extends RecyclerView.Adapter<ContentViewHolder> {

        private final List<Location> locations;
        private final Context context;

        public ContentAdapter(Context context, List<Location> locations) {
            this.context = context;
            this.locations = locations;
        }

        @NonNull
        @Override
        public ContentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(
                    R.layout.item_list, parent, false);
            return new ContentViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ContentViewHolder holder, int position) {
            Location location = locations.get(position);
            holder.name.setText(location.getName());
            holder.description.setText(location.getDescription());
            holder.image.setImageBitmap(BitmapUtil.createCircleBitmap(
                    context, location.getImageID()));
        }

        @Override
        public int getItemCount() {
            return locations.size();
        }
    }
}




