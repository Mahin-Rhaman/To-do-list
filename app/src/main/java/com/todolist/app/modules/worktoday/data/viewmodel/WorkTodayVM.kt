package com.todolist.app.modules.worktoday.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.todolist.app.modules.worktoday.`data`.model.WorkTodayModel
import org.koin.core.KoinComponent

class WorkTodayVM : ViewModel(), KoinComponent {
  val workTodayModel: MutableLiveData<WorkTodayModel> = MutableLiveData(WorkTodayModel())

  var navArguments: Bundle? = null
}
