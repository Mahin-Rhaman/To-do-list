package com.todolist.app.modules.wishlist.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.todolist.app.modules.wishlist.`data`.model.WishListModel
import org.koin.core.KoinComponent

class WishListVM : ViewModel(), KoinComponent {
  val wishListModel: MutableLiveData<WishListModel> = MutableLiveData(WishListModel())

  var navArguments: Bundle? = null
}
