package com.cmaye.quickfeatureportal.o01_Camera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cmaye.quickfeatureportal.databinding.ActivityCameraPhotoBinding

class CameraActivity : AppCompatActivity() {
    private lateinit var binding : ActivityCameraPhotoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCameraPhotoBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}