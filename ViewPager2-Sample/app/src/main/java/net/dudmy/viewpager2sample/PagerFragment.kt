package net.dudmy.viewpager2sample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.item_pager.*

class PagerFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.item_pager, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            page_name.text = "FragmentStateAdapter\nPage ${it.getInt("position")}"
            view.setBackgroundColor(ContextCompat.getColor(view.context, it.getInt("bgColor")))
        }
    }

    companion object {
        fun newInstance(@ColorRes bgColor: Int, position: Int): PagerFragment {
            val bundle = Bundle()
            bundle.putInt("bgColor", bgColor)
            bundle.putInt("position", position)
            return PagerFragment().apply { arguments = bundle }
        }
    }
}