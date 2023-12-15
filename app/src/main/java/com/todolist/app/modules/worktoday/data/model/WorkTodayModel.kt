package com.todolist.app.modules.worktoday.`data`.model

import com.todolist.app.R
import com.todolist.app.appcomponents.di.MyApp
import kotlin.String

data class WorkTodayModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMakeAWishList: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_work_today_s2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMakeYourJobEasier: String? =
      MyApp.getInstance().resources.getString(R.string.msg_make_your_job_easier)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtToday: String? = MyApp.getInstance().resources.getString(R.string.lbl_today)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_02_april_2021)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResearchProduct: String? =
      MyApp.getInstance().resources.getString(R.string.msg_research_product)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResearchProduct1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_action_plan)

)
