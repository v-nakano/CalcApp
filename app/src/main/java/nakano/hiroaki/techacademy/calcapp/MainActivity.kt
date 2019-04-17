package nakano.hiroaki.techacademy.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import kotlinx.android.synthetic.main.activity_second_calc_app.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {

        var num1 : Double = 0.0
        var num2 : Double = 0.0
        var ans : Double = 0.0

        try {
            num1 = editText1.text.toString().toDouble()
        } catch (e: Exception) {
            editText1.setError("数値を入力してください。")
            return
        }

        try {
            num2 = editText2.text.toString().toDouble()
        } catch (e: Exception) {
            editText2.setError("数値を入力してください。")
            return
        }

        val intent = Intent(this, SecondCalcApp::class.java)
        if (v.id == R.id.button1) {
            ans = num1 + num2
        } else if (v.id == R.id.button2) {
            ans = num1 - num2
        } else if (v.id == R.id.button3) {
            ans = num1 * num2
        } else if (v.id == R.id.button4) {
            if (num2 == 0.0){
                editText2.setError("0では除算できません。")
                return
            } else {
                ans = num1 / num2
            }
        }
        intent.putExtra("VALUE", ans)
        startActivity(intent)
    }

}