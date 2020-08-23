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

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kevalpatel2106.emoticongifkeyboard.R
import com.kevalpatel2106.emoticongifkeyboard.gifs.GifProviderProtocol
import com.kevalpatel2106.emoticongifkeyboard.stickercon.StickerconSelectListener
import java.util.*

class StickerconFragment(): Fragment(),StickerconAdapter.ItemSelectListener {

    var mRecyclerView: RecyclerView? = null
    var mGridLayoutManager : GridLayoutManager? = null
    var arrayList : ArrayList<String>? = null
    var mEmojiAdapter : StickerconAdapter? = null
    var mStickerProvider:String = ""

    private  var mStickerSelectListener: StickerconSelectListener? = null

    fun setStickersProvider(stickersProvider: String) {
        mStickerProvider = stickersProvider
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mRecyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)

        mGridLayoutManager = GridLayoutManager(
                requireContext(),
                5,
                LinearLayoutManager.VERTICAL,
                false
        )

        mRecyclerView?.layoutManager = mGridLayoutManager
        mRecyclerView?.setHasFixedSize(true)

        arrayList = ArrayList()
        arrayList = setDataInList()
        mEmojiAdapter = StickerconAdapter(requireContext(), arrayList!!)
        mEmojiAdapter!!.setListener(this)
        mRecyclerView?.adapter = mEmojiAdapter

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_sticker, container, false)
    }

    fun setStickerSelectListener(stickerSelectListener: StickerconSelectListener?) {
        mStickerSelectListener = stickerSelectListener
    }

    fun setDataInList() : ArrayList<String>{
        var items: ArrayList<String> = ArrayList()

        items.add(mStickerProvider+"1.png")
        items.add(mStickerProvider+"2.png")
        items.add(mStickerProvider+"3.png")
        items.add(mStickerProvider+"4.png")
        items.add(mStickerProvider+"5.png")
        items.add(mStickerProvider+"6.png")
        items.add(mStickerProvider+"7.png")
        items.add(mStickerProvider+"8.png")
        items.add(mStickerProvider+"11.png")
        items.add(mStickerProvider+"12.png")
        items.add(mStickerProvider+"13.png")
        items.add(mStickerProvider+"14.png")
        items.add(mStickerProvider+"15.png")
        items.add(mStickerProvider+"16.png")
        items.add(mStickerProvider+"17.png")
        items.add(mStickerProvider+"18.png")
        items.add(mStickerProvider+"19.png")
        items.add(mStickerProvider+"20.png")
        items.add(mStickerProvider+"21.png")
        items.add(mStickerProvider+"22.png")
        items.add(mStickerProvider+"23.png")
        items.add(mStickerProvider+"24.png")
        items.add(mStickerProvider+"25.png")
        items.add(mStickerProvider+"26.png")
        items.add(mStickerProvider+"27.png")
        items.add(mStickerProvider+"28.png")
        items.add(mStickerProvider+"29.png")
        items.add(mStickerProvider+"30.png")
        items.add(mStickerProvider+"31.png")
        items.add(mStickerProvider+"32.png")
        items.add(mStickerProvider+"33.png")
        items.add(mStickerProvider+"34.png")
        items.add(mStickerProvider+"35.png")
        items.add(mStickerProvider+"36.png")
        items.add(mStickerProvider+"37.png")
        items.add(mStickerProvider+"38.png")
        items.add(mStickerProvider+"39.png")
        items.add(mStickerProvider+"40.png")
        items.add(mStickerProvider+"41.png")
        items.add(mStickerProvider+"42.png")
        items.add(mStickerProvider+"43.png")
        items.add(mStickerProvider+"44.png")
        items.add(mStickerProvider+"45.png")
        items.add(mStickerProvider+"46.png")
        items.add(mStickerProvider+"47.png")
        items.add(mStickerProvider+"48.png")
        items.add(mStickerProvider+"49.png")
        items.add(mStickerProvider+"50.png")
        items.add(mStickerProvider+"51.png")
        items.add(mStickerProvider+"52.png")
        items.add(mStickerProvider+"53.png")
        items.add(mStickerProvider+"54.png")
        items.add(mStickerProvider+"55.png")
        items.add(mStickerProvider+"56.png")
        items.add(mStickerProvider+"57.png")
        items.add(mStickerProvider+"58.png")
        items.add(mStickerProvider+"59.png")
        items.add(mStickerProvider+"61.png")
        items.add(mStickerProvider+"62.png")
        items.add(mStickerProvider+"63.png")
        items.add(mStickerProvider+"64.png")
        items.add(mStickerProvider+"65.png")
        items.add(mStickerProvider+"66.png")
        items.add(mStickerProvider+"67.png")
        items.add(mStickerProvider+"68.png")
        items.add(mStickerProvider+"69.png")
        items.add(mStickerProvider+"70.png")
        items.add(mStickerProvider+"71.png")
        items.add(mStickerProvider+"73.png")
        items.add(mStickerProvider+"74.png")
        items.add(mStickerProvider+"75.png")
        items.add(mStickerProvider+"76.png")
        items.add(mStickerProvider+"77.png")
        items.add(mStickerProvider+"78.png")
        items.add(mStickerProvider+"79.png")
        items.add(mStickerProvider+"80.png")
        items.add(mStickerProvider+"81.png")
        items.add(mStickerProvider+"82.png")
        items.add(mStickerProvider+"83.png")
        items.add(mStickerProvider+"84.png")
        items.add(mStickerProvider+"85.png")
        items.add(mStickerProvider+"86.png")
        items.add(mStickerProvider+"87.png")
        items.add(mStickerProvider+"88.png")

        return items
    }

    override fun OnListItemSelected(image: String) {
        mStickerSelectListener?.onStickerSelected(image)
    }
}