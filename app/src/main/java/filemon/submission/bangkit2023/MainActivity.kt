package filemon.submission.bangkit2023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvHeroes: RecyclerView
    private val list = ArrayList<Hero>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvHeroes =findViewById(R.id.rv_heroes)
        rvHeroes.setHasFixedSize(true)

        list.addAll(getListHeroes())
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvHeroes.layoutManager = LinearLayoutManager(this)
        val AdapterV = AdapterLV(list)
        rvHeroes.adapter= AdapterV

    }

    private fun getListHeroes(): ArrayList<Hero> {
        val name = resources.getStringArray(R.array.Judul)
        val desc = resources.getStringArray(R.array.Subtitle)
        val img = resources.obtainTypedArray(R.array.photos_cv)
        val listHero= ArrayList<Hero>()
        for (i in name.indices){
            val hero = Hero(name[i],desc[i],img.getResourceId(i,-1))
            listHero.add(hero)
        }
        return listHero
    }
}