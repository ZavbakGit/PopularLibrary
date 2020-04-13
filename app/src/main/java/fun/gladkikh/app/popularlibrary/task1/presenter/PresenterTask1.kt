package `fun`.gladkikh.app.popularlibrary.task1.presenter

import `fun`.gladkikh.app.popularlibrary.task1.model.ModelTask1
import `fun`.gladkikh.app.popularlibrary.task1.view.Task1View

class PresenterTask1(private val view:Task1View) {
    private val modelTask1 = ModelTask1()

    init {
        view.showMessage(modelTask1.message)
    }

    fun setMessage(message:String){
        modelTask1.message = message
        view.showMessage(modelTask1.message)
    }


}