package com.example.story;

import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StoriesDecoration extends RecyclerView.ItemDecoration {

    private int space;

    public StoriesDecoration(int space) {
        this.space = space;
    }


    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        super.getItemOffsets(outRect,view, parent, state);
        outRect.right = space;
        outRect.left = space;
    }
}
