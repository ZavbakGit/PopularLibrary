package `fun`.gladkikh.app.popularlibrary.task1.view

import `fun`.gladkikh.app.popularlibrary.R
import `fun`.gladkikh.app.popularlibrary.task1.presenter.PresenterTask1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),Task1View {

    private lateinit var presenterTask1: PresenterTask1

    private val KEY_MESSAGE = "key_Message"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenterTask1 = PresenterTask1(this)
        btGeneral.setOnClickListener {
            presenterTask1.setMessage(edMessage.text.toString())
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(KEY_MESSAGE, tvMessage.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        presenterTask1.setMessage(savedInstanceState.getString(KEY_MESSAGE)?:"")
    }

    override fun showMessage(message: String) {
        tvMessage.text = message
    }

}
