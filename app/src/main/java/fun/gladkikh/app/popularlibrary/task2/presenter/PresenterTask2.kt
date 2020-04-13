package `fun`.gladkikh.app.popularlibrary.task2.presenter

import `fun`.gladkikh.app.popularlibrary.task1.model.ModelTask1
import `fun`.gladkikh.app.popularlibrary.task2.view.Task2View
import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter

@InjectViewState
class PresenterTask2: MvpPresenter<Task2View>() {
    private val modelTask1 = ModelTask1()

    init {
        viewState.setMessage(modelTask1.message)
    }

    fun setMessage(message:String){
        modelTask1.message = message
        viewState.setMessage(modelTask1.message)
    }
}