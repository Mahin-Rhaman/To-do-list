package com.todolist.app.modules.personality.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.todolist.app.modules.personality.`data`.model.PersonalityModel
import org.koin.core.KoinComponent

class PersonalityVM : ViewModel(), KoinComponent {
  val personalityModel: MutableLiveData<PersonalityModel> = MutableLiveData(PersonalityModel())

  var navArguments: Bundle? = null
}
