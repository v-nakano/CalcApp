package nakano.hiroaki.techacademy.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second_calc_app.*

class SecondCalcApp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_calc_app)

        val value = intent.getDoubleExtra("VALUE", 0.0)
        textView.text = "${value}"
    }
}
