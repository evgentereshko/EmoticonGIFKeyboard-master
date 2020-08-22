/*
 * Copyright 2017 Keval Patel.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.kevalpatel2106.emoticongifkeyboard.internal.stickercon

import android.content.Context
import android.graphics.drawable.Drawable
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.kevalpatel2106.emoticongifkeyboard.R
import com.kevalpatel2106.emoticongifkeyboard.gifs.GifProviderProtocol
import java.util.*


class StickerconAdapter (
    var context: Context , var arrayList: ArrayList<String>
): RecyclerView.Adapter<StickerconAdapter.ItemHolder>() {

    interface ItemSelectListener {
        fun OnListItemSelected(image: Drawable)
    }

   private lateinit var listener : ItemSelectListener

    fun setListener(context: ItemSelectListener){
        listener = context
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {

        val itemHolder = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_sticker,parent,false)
        return ItemHolder(itemHolder,listener)
    }

    override fun getItemCount() = arrayList.size

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {

        val sticker : String = arrayList.get(position)

        Glide.with(context)
//                .asBitmap()
                .load(sticker)
                .into(holder.mImage);

    }

    class ItemHolder(itemview: View,listener: ItemSelectListener) : RecyclerView.ViewHolder(itemview){
        var mImage = itemview.findViewById<ImageView>(R.id.imageView)

        init {
            itemview.setOnClickListener {
                listener.OnListItemSelected(mImage.drawable)
            }
        }
    }

}

