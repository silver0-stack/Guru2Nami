package com.cookandroid.guru2nami.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.cookandroid.guru2nami.MapMenu.MapActivity
import com.cookandroid.guru2nami.MypageContent.BuyHistoryActivity
import com.cookandroid.guru2nami.MypageContent.LikeHistoryActivity
import com.cookandroid.guru2nami.MypageContent.SalesHistoryActivity
import com.cookandroid.guru2nami.R

//마이페이지 화면
class MyPageFragment : Fragment() {

    lateinit var myPageView: View
    lateinit var listView : ListView

    lateinit var soldListBtn :Button
    lateinit var buyListBtn :Button
    lateinit var likeListBtn :Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        myPageView =  inflater.inflate(R.layout.fragment_my_page, container, false)

        //판매내역 버튼 + 화면 이동
        soldListBtn = myPageView.findViewById(R.id.soldListBtn)
        soldListBtn.setOnClickListener {
            val intent = Intent(activity, SalesHistoryActivity ::class.java)
            startActivity(intent)
        }

        //주문내역 버튼 + 화면 이동
        buyListBtn = myPageView.findViewById(R.id.buyListBtn)
        buyListBtn.setOnClickListener {
            val intent = Intent(activity, BuyHistoryActivity ::class.java)
            startActivity(intent)
        }

        //찜 내역 버튼 + 화면 이동
        likeListBtn = myPageView.findViewById(R.id.likeListBtn)
        likeListBtn.setOnClickListener {
            val intent = Intent(activity, LikeHistoryActivity ::class.java)
            startActivity(intent)
        }

        return myPageView
    }


//        //View로 전환
//        val view:View = inflater.inflate(R.layout.fragment_my_page, container, false);
//
//        val listView:ListView = view.findViewById<ListView>(R.id.myPageListView)
//
//        myPage_List.add("동네 설정하기")
//        myPage_List.add("내 글 관리")
//        myPage_List.add("고객 센터")
//        myPage_List.add("환경 설정")
//        myPage_List.add("내 글 관리")

//        //어댑터 생성(data와 view를 연결해주는 관리자)
//        val listAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,myPage_List)
//        listView.adapter = listAdapter  //어댑터 붙이기
//
//        listView.choiceMode = ListView.CHOICE_MODE_SINGLE  //단일 선택 모드

//        listView.setOnItemClickListener{parent, view, position, id ->
//            Toast.makeText(this, myPage_List.get(position) + "를 클릭하셨습니다.",
//                    Toast.LENGTH_SHORT).show() //선택한 데이터 출력
//        }


}