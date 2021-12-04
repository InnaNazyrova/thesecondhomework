package study.innel.act

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


const val TAG1 = "MainActivity"
class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG1,"А жизнь действительно прекрасна и бесценна")
    }

    override fun onStart(){
        super.onStart()
        Log.d(TAG1,"И если кажется, что рухнул потолок")

     }

    override fun onResume() {
    super.onResume()
    Log.d(TAG1,"Тогда ломайте заодно все двери, стены")
}

    override fun onPause() {
    super.onPause()
    Log.d(TAG1, " Все то,что душу закрывало на замок")
}
    override fun onStop() {
    super.onStop()
    Log.d(TAG1, "И оглядитесь , этот шанс дается свыше ")

}
    override fun onRestart() {
        super.onRestart()
         Log.d(TAG1,"Построить то, что раньше видели в мечтах")
     }
    override fun onDestroy(){
        super.onDestroy()
        Log.d(TAG1,"Вперед к мечтам ведь целый мир у вас в руках!")
    }

}




