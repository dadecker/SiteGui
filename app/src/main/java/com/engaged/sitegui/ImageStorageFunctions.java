package com.engaged.sitegui;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;


import java.io.File;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import static android.app.Activity.RESULT_OK;
import static androidx.core.app.ActivityCompat.startActivityForResult;

public class ImageStorageFunctions
{

    public static final int UPLOAD_REQUEST = 20;
    public static final int DOWNLOAD_REQUEST = 30;
    public static final int VIDEO_GALLERY_REQUEST = 40;
    String global_path, global_uid, unique_name;
    Uri imageURI, specific_image_uri;
    String specific_image_url;
    public void openGallery() {
        //Intent creates a specific change to a different activity.
        Intent storeImageIntent = new Intent(Intent.ACTION_PICK);



        Uri temp = null;

        storeImageIntent.setDataAndType(temp, "image/*");

    }

    private String saveToInternalStorage(Bitmap bitmapImage, Context context){
        ContextWrapper cw = new ContextWrapper(context);
        // path to /data/data/yourapp/app_data/imageDir
        File imageDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        // Create imageDir


        File mypath=new File(imageDirectory,"profile.jpg");

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(mypath);
            // Use the compress method on the BitMap object to write image to the OutputStream
            bitmapImage.compress(Bitmap.CompressFormat.PNG, 100, fos);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return imageDirectory.getAbsolutePath();
    }


}
