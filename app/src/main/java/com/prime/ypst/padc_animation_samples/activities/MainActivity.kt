package com.prime.ypst.padc_animation_samples.activities

import android.arch.lifecycle.ViewModelProviders
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v4.app.ActivityOptionsCompat
import android.support.v4.util.Pair
import android.support.v7.widget.LinearLayoutManager
import android.widget.ImageView
import com.prime.ypst.padc_animation_samples.R
import com.prime.ypst.padc_animation_samples.adapters.AttractionsRVAdapter
import com.prime.ypst.padc_animation_samples.data.vos.AttractionVO
import com.prime.ypst.padc_animation_samples.mvp.presenters.AttractionListActivityPresenter
import com.prime.ypst.padc_animation_samples.mvp.views.AttractionListActivityView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AttractionListActivityView {

    override fun navigateToAttractionDetails(data: AttractionVO, imageView: ImageView) {

        val intent = AttractionDetailActivity.getIntent(this, data)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this,
                Pair(imageView, getString(R.string.detail_transition_name))
            )
            ActivityCompat.startActivity(this, intent, activityOptions.toBundle())
        } else {
            startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = prepareDummyData()

        rvList.layoutManager = LinearLayoutManager(this)
        rvList.setHasFixedSize(true)
        rvList.adapter = adapter

    }

    private fun prepareDummyData(): AttractionsRVAdapter {
        val attractionList = arrayListOf<AttractionVO>()
        attractionList.add(
            AttractionVO(
                title = "Mandalay",
                desc = "Mandalay is a city and former royal capital in northern Myanmar (formerly Burma) on the Irrawaddy River. In its center is the restored Mandalay Palace from the Konbaung Dynasty, surrounded by a moat. Mandalay Hill provides views of the city from its summit, which is reached by covered stairway. At its foot, the Kuthodaw Pagoda houses hundreds of Buddhist-scripture-inscribed marble slabs.",
                imageUrl = "http://static.asiawebdirect.com/m/bangkok/portals/myanmar/homepage/mandalay/pagePropertiesImage/mandalay.jpg"
            )
        )
        attractionList.add(
            AttractionVO(
                title = "Yangon",
                desc = "Yangon (formerly known as Rangoon) is the largest city in Myanmar (formerly Burma). A mix of British colonial architecture, modern high-rises and gilded Buddhist pagodas define its skyline. Its famed Shwedagon Paya, a huge, shimmering pagoda complex, draws thousands of pilgrims annually. The city's other notable religious sites include the Botataung and Sule pagodas, both housing Buddhist relics.",
                imageUrl = "https://firebasestorage.googleapis.com/v0/b/mybooks-b2d31.appspot.com/o/brook-yangon-1.jpg?alt=media&token=52b0ee14-b1bb-4662-9de9-f7e84eeafcd1"
            )
        )
        attractionList.add(
            AttractionVO(
                title = "Nay Pyi Daw",
                desc = "Naypyitaw is the modern capital of Myanmar (Burma), north of former capital, Yangon. Traditional tiered roofs crown the buildings of its Parliament (Hluttaw) complex. Exhibits at the National Museum include Burmese art and ancient artifacts. The golden stupa of Uppatasanti Pagoda has an interior carved with stories from Buddhist literature. In a nearby enclosure are white elephants, once prized by Burmese royalty.",
                imageUrl = "https://www.go-myanmar.com/files/destination-photo/1_roads_in_nay_pyi_taw.jpg"
            )
        )


        val presenter = ViewModelProviders.of(this).get(AttractionListActivityPresenter::class.java)
        presenter.initPresenter(this)

        val adapter = AttractionsRVAdapter(presenter)

        adapter.setNewData(attractionList)
        return adapter
    }
}
