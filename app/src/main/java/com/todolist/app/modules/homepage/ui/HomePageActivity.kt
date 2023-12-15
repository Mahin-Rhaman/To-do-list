package com.todolist.app.modules.homepage.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.todolist.app.R
import com.todolist.app.appcomponents.base.BaseActivity
import com.todolist.app.databinding.ActivityHomePageBinding
import com.todolist.app.modules.homepage.`data`.viewmodel.HomePageVM
import com.todolist.app.modules.loginorsignup.ui.LoginOrSignupActivity
import kotlin.String
import kotlin.Unit

class HomePageActivity : BaseActivity<ActivityHomePageBinding>(R.layout.activity_home_page) {
  private val viewModel: HomePageVM by viewModels<HomePageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homePageVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = LoginOrSignupActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.imageLogo.setOnClickListener {
        val destIntent = LoginOrSignupActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "HOME_PAGE_ACTIVITY"

    }
  }
