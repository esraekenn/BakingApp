package com.example.bakingapp.ui

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.bakingapp.R
import com.example.bakingapp.databinding.FragmentRecipeVideoBinding
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.SimpleExoPlayer

class RecipeVideoFragment : Fragment() {
    private lateinit var binding: FragmentRecipeVideoBinding
    private lateinit var player: SimpleExoPlayer


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_recipe_video, container, false)
        return binding.root
        initializeExoPlayer()

    }

    fun initializeExoPlayer() {
        player = SimpleExoPlayer.Builder(context!!).build()
        binding.playerView.player = player
        val uri = Uri.parse(getString(R.string.media_url_mp4))
        val mediaItem = MediaItem.fromUri(uri)
        player.setMediaItem(mediaItem)  //henüz oynamıyor
        player.prepare() //hazırla
        player.play() //başlat

    }


}