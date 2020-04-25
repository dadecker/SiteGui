package com.engaged.sitegui;

import android.content.Context;
import android.media.Image;
import android.os.Environment;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;



@GlideModule
public class ImageAdapter extends AppGlideModule
{
    public static void ResizeImage(ImageView imageView, String url)
    {

        Glide.with(imageView.getContext()).load(url).into(imageView);
    }


}
