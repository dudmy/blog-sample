package net.dudmy.itemtouchhelper

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.helper.ItemTouchHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ItemDragListener {

    private val items: MutableList<Artist> = mutableListOf(
            Artist("방탄소년단", "빅히트 엔터테인먼트", "2013. 06. 12"),
            Artist("트와이스", "JYP 엔터테인먼트", "2015. 10. 20"),
            Artist("아이유", "로엔 엔터테인먼트", "2008. 09. 18"),
            Artist("윤종신", "미스틱 엔터테인먼트", "1990. 07. 15"),
            Artist("BIGBANG", "YG 엔터테인먼트", "2006. 08. 19"),
            Artist("레드벨벳", "SM 엔터테인먼트", "2014. 08. 01"),
            Artist("버스커 버스커", "청춘뮤직", "2011. 10. 03"),
            Artist("어반자카파", "메이크어스 엔터테인먼트", "2009. 07. 02"),
            Artist("Wanna One", "YMC 엔터테인먼트", "2017. 08. 07")
    )

    private lateinit var mainAdapter: MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainAdapter = MainAdapter(items, this)

        recycler_view.apply {
            adapter = mainAdapter
            layoutManager = LinearLayoutManager(context)
            addItemDecoration(DividerItemDecoration(context, LinearLayoutManager.VERTICAL))
        }

        itemTouchHelper.attachToRecyclerView(recycler_view)
    }

    override fun onStartDrag(viewHolder: RecyclerView.ViewHolder) {
        itemTouchHelper.startDrag(viewHolder)
    }

    private val itemTouchHelper = ItemTouchHelper(object : ItemTouchHelper.Callback() {
        override fun getMovementFlags(recyclerView: RecyclerView?, viewHolder: RecyclerView.ViewHolder?): Int {
            val dragFlags = ItemTouchHelper.DOWN or ItemTouchHelper.UP
            val swipeFlags = ItemTouchHelper.START or ItemTouchHelper.END
            return makeMovementFlags(dragFlags, swipeFlags)
        }

        override fun onMove(recyclerView: RecyclerView?, viewHolder: RecyclerView.ViewHolder?, target: RecyclerView.ViewHolder?): Boolean {
            mainAdapter.onItemMoved(viewHolder!!.adapterPosition, target!!.adapterPosition)
            return true
        }

        override fun onSwiped(viewHolder: RecyclerView.ViewHolder?, direction: Int) {
            mainAdapter.onItemSwiped(viewHolder!!.adapterPosition)
        }

        override fun isLongPressDragEnabled(): Boolean = false
    })
}
