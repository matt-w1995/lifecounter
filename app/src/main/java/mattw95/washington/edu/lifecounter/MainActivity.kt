package mattw95.washington.edu.lifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Player 1
        btnMinus5Play1.setOnClickListener {
            updateLife(txtPlay1Life, -5, txtPlay1)
        }
        btnMinus1Play1.setOnClickListener {
            updateLife(txtPlay1Life, -1, txtPlay1)
        }
        btnPlus1Play1.setOnClickListener {
            updateLife(txtPlay1Life, +1, txtPlay1)
        }
        btnPlus5Play1.setOnClickListener {
            updateLife(txtPlay1Life, +5, txtPlay1)
        }


        //Player 2
        btnMinus5Play2.setOnClickListener {
            updateLife(txtPlay2Life, -5, txtPlay2)
        }
        btnMinus1Play2.setOnClickListener {
            updateLife(txtPlay2Life, -1, txtPlay2)
        }
        btnPlus1Play2.setOnClickListener {
            updateLife(txtPlay2Life, +1, txtPlay2)
        }
        btnPlus5Play2.setOnClickListener {
            updateLife(txtPlay2Life, +5, txtPlay2)
        }

        //Player 3
        btnMinus5Play3.setOnClickListener {
            updateLife(txtPlay3Life, -5, txtPlay3)
        }
        btnMinus1Play3.setOnClickListener {
            updateLife(txtPlay3Life, -1, txtPlay3)
        }
        btnPlus1Play3.setOnClickListener {
            updateLife(txtPlay3Life, +1, txtPlay3)
        }
        btnPlus5Play3.setOnClickListener {
            updateLife(txtPlay3Life, +5, txtPlay3)
        }

        //Player 4
        btnMinus5Play4.setOnClickListener {
            updateLife(txtPlay4Life, -5, txtPlay4)
        }
        btnMinus1Play4.setOnClickListener {
            updateLife(txtPlay4Life, -1, txtPlay4)
        }
        btnPlus1Play4.setOnClickListener {
            updateLife(txtPlay4Life, +1, txtPlay4)
        }
        btnPlus5Play4.setOnClickListener {
            updateLife(txtPlay4Life, +5, txtPlay4)
        }

    }

    private fun updateLife(playerLife : TextView, change : Int, player : TextView){
        val updatedLife = playerLife.text.toString().toInt() + change
        if(updatedLife <= 0){
            var playerStrg = player.text.toString().toUpperCase()
            playerStrg += " LOSES!"
            txtLoser.text = playerStrg
        }
        playerLife.text = updatedLife.toString()
    }
}
