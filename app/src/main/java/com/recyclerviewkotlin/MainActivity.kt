package com.recyclerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.gord,
                "Gord",
                "Gord has always been the living proof of excellence in the magic academy. He was born with the gift to manipulate the mystic powers which allowed him to master several sophisticated spells at an early age. But this is clearly a double-edged sword as Gord became increasingly arrogant over time. Once he stumbled across a forbidden book in the academy which recorded the method to forge the pure mystic existence out of human body using mystic powers."
            ),
            Superhero(
                R.drawable.harley,
                "Harley",
                "There lived a famous young mage, Harley, in the Lion Academy of Magical City. He is blessed by the Magical Goddess and as the star of the Academy, he is able to learn quickly and master any magical spell."
            ),
            Superhero(
                R.drawable.hylos,
                "Hylos",
                "He lives in the Misty Mountains and belongs to the Centaur race. He has the ability to convert natural magic into life force, and at the same time he can continuously punish any enemy who invades the Misty Mountains by consuming his own life force."
            ),
            Superhero(
                R.drawable.nana,
                "Nana",
                "After the Endless War, the Land of Dawn was covered scars, but the Moonlit Forest of Azrya was still bathed in the light of the Moon Goddess. I addition to the elves, there were various other strange creatures living in this dense forest with a most unrestrained bearing. There were very few disputes."
            ),
            Superhero(
                R.drawable.ruby,
                "Ruby",
                "The village where Ruby lived was attacked by werewolves. At the time of crisis, Roger appeared to help them repel the werewolves. Roger taught Ruby how to fight and gave her a sickle so that she could protect herself and the village."
            ),
            Superhero(
                R.drawable.yss,
                "Yi Sun Shin",
                "Yi Sun-shin is the leader of the City of the Dragon fleet and he is dedicated to his duties. But the ruler of the City of the Dragon believes the false accusations and demoted Yi Sun-shin to a commoner. The fleet, without a leader, was hit hard by pirates. At this moment of crisis, Yi Sun-shin stepped forward and lead the reformed fleet to defend this area of the sea and successfully defeated the strong pirates with remaining naval force."
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rvHero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this,superheroList){
            val intent = Intent(this,DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE,it)
            startActivity(intent)

        }
    }
}