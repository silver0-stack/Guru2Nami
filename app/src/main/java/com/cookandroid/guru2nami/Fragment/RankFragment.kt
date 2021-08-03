package com.cookandroid.guru2nami.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cookandroid.guru2nami.Adapters.ListRankAdapter
import com.cookandroid.guru2nami.R
import com.cookandroid.guru2nami.User.Chat
import com.cookandroid.guru2nami.User.UserRank
import com.google.firebase.database.DatabaseReference

//랭킹 화면
//리스트뷰와 카드뷰를 연결함
class RankFragment : Fragment() {
    private lateinit var dbref : DatabaseReference
    private lateinit var userRecyclerView: RecyclerView
    private lateinit var userArrayList : ArrayList<UserRank>
    private lateinit var perView : View

    lateinit var rankView : View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        rankView = inflater.inflate(R.layout.fragment_rank, container, false)

        //userRecyclerView = perView.findViewById(R.id.recycler_rank)
        //userRecyclerView.layoutManager = LinearLayoutManager(activity);
        //userRecyclerView.setHasFixedSize(true)


        return rankView
    }

}