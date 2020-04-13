package `fun`.gladkikh.app.popularlibrary.task2.view

import `fun`.gladkikh.app.popularlibrary.R
import `fun`.gladkikh.app.popularlibrary.task2.presenter.PresenterTask2
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),Task2View {

    @InjectPresenter
   lateinit var presenter: PresenterTask2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btGeneral.setOnClickListener {
            presenter.setMessage(edMessage.text.toString())
        }
    }

    override fun setMessage(message: String) {
        tvMessage.text = message
    }
}
