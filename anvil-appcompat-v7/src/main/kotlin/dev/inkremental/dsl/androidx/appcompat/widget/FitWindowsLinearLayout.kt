@file:Suppress("DEPRECATION", "UNCHECKED_CAST", "MemberVisibilityCanBePrivate", "unused")

package dev.inkremental.dsl.androidx.appcompat.widget

import android.graphics.Rect
import androidx.appcompat.widget.FitWindowsLinearLayout
import dev.inkremental.dsl.android.widget.LinearLayoutScope
import dev.inkremental.dsl.androidx.appcompat.AppCompatv7Setter
import dev.inkremental.dsl.androidx.appcompat.CustomAppCompatv7Setter
import kotlin.Suppress
import kotlin.Unit
import trikita.anvil.Anvil
import trikita.anvil.attr
import trikita.anvil.bind
import trikita.anvil.v

fun fitWindowsLinearLayout(configure: FitWindowsLinearLayoutScope.() -> Unit = {}) =
    v<FitWindowsLinearLayout>(configure.bind(FitWindowsLinearLayoutScope))
abstract class FitWindowsLinearLayoutScope : LinearLayoutScope() {
  fun onFitSystemWindows(arg: ((arg0: Rect) -> Unit)?): Unit = attr("onFitSystemWindows", arg)
  companion object : FitWindowsLinearLayoutScope() {
    init {
      Anvil.registerAttributeSetter(AppCompatv7Setter)
      Anvil.registerAttributeSetter(CustomAppCompatv7Setter)
    }
  }
}
