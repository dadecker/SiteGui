package com.engaged.sitegui;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;


import java.io.File;
import java.io.File;

import static android.app.Activity.RESULT_OK;
import static androidx.core.app.ActivityCompat.startActivityForResult;

public class ImageStorageFunctions
{

    public static final int UPLOAD_REQUEST = 20;
    private Button upload_button;
    private Button download_button;
    private VideoView stream_video;
    public static final int DOWNLOAD_REQUEST = 30;
    public static final int VIDEO_GALLERY_REQUEST = 40;
    String global_path, global_uid, unique_name;
    Uri videoUri, specific_video_uri;
    String specific_video_url;
    public void openGallery() {
        //Intent creates a specific change to a different activity.
        Intent videoGalleryIntent = new Intent(Intent.ACTION_PICK);

        File videoDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES);

        Uri temp = null;

        videoGalleryIntent.setDataAndType(temp, "video/*");

        Log.d("GalleryActivity" , "******BEFORE storageRef is initialized in openGallery*******");

        //recieve something back from this result
    }


}
