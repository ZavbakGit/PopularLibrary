package `fun`.gladkikh.app.popularlibrary.task2.view

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType

interface Task2View:MvpView {
    @StateStrategyType(AddToEndSingleStrategy::class)
    fun setMessage(message:String)
}