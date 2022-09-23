package com.example.courtcounter

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var teamAscore = 0
    var teamBscore = 0
    var teamAtextscore: TextView? = null
    var teamBtextscore: TextView? = null
    var Athree: Button? = null
    var Atwo: Button? = null
    var Afree: Button? = null
    var Bthree: Button? = null
    var ABwo: Button? = null
    var Bfree: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun displayforteamA(score: Int) {
        teamAtextscore = findViewById<View>(R.id.editableNumberA) as TextView
        teamAtextscore!!.text = score.toString()
    }

    fun displayforteamB(score: Int) {
        teamBtextscore = findViewById<View>(R.id.editableNumberB) as TextView
        teamBtextscore!!.text = score.toString()
    }

    public open fun IncreaseScore(view: View) {
        val buttonId = view.id

        //logic for team a
        if (buttonId == R.id.button_3A) {
            teamAscore = teamAscore + 3
            displayforteamA(teamAscore)
        }
        if (buttonId == R.id.button_2A) {
            teamAscore = teamAscore + 2
            displayforteamA(teamAscore)
        }
        if (buttonId == R.id.button_1A) {
            teamAscore = teamAscore + 1
            displayforteamA(teamAscore)
        }
        //logic for team B
        if (buttonId == R.id.button_3B) {
            teamBscore = teamBscore + 3
            displayforteamB(teamBscore)
        }
        if (buttonId == R.id.button_2B) {
            teamBscore = teamBscore + 2
            displayforteamB(teamBscore)
        }
        if (buttonId == R.id.button_1B) {
            teamBscore = teamBscore + 1
            displayforteamB(teamBscore)
        }
    }

    fun oClear(view: View?) {
        teamAscore = 0
        teamBscore = 0
        displayforteamA(0)
        displayforteamB(0)
    }
}