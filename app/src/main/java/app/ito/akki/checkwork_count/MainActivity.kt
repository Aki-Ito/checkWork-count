package app.ito.akki.checkwork_count

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var number:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plusButton.setOnClickListener {
            number = number + 1
            textView.text = number.toString()
        }

        minusButton.setOnClickListener {
            number = number -1
            textView.text = number.toString()
        }

        clearButton.setOnClickListener {
            number = 0
            textView.text = number.toString()
        }

        if (number == 3){
            textView.setTextColor(Color.RED)
        }else if (number == 5){
            textView.setTextColor(Color.GREEN)
        }else if (number ==15){
            textView.setTextColor(Color.BLUE)
        }
    }
}