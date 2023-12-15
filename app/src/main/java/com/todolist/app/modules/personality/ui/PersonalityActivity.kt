package com.todolist.app.modules.personality.ui

import androidx.activity.viewModels
import com.todolist.app.R
import com.todolist.app.appcomponents.base.BaseActivity
import com.todolist.app.databinding.ActivityPersonalityBinding
import com.todolist.app.modules.personality.`data`.viewmodel.PersonalityVM
import com.todolist.app.modules.signup.ui.SignupActivity
import kotlin.String
import kotlin.Unit

class PersonalityActivity : BaseActivity<ActivityPersonalityBinding>(R.layout.activity_personality)
    {
  private val viewModel: PersonalityVM by viewModels<PersonalityVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.personalityVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnChangeSave.setOnClickListener {
      val destIntent = SignupActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnArrowLeft.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
  }

  companion object {
    const val TAG: String = "PERSONALITY_ACTIVITY"

  }
}
