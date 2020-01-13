@file:Suppress("DEPRECATION", "UNCHECKED_CAST", "MemberVisibilityCanBePrivate", "unused")

package dev.inkremental.dsl.google.android.material.bottomnavigation

import com.google.android.material.bottomnavigation.BottomNavigationItemView
import dev.inkremental.dsl.android.widget.FrameLayoutScope
import dev.inkremental.dsl.google.android.material.CustomMaterialSetter
import dev.inkremental.dsl.google.android.material.MaterialSetter
import kotlin.Suppress
import kotlin.Unit
import trikita.anvil.Anvil
import trikita.anvil.bind
import trikita.anvil.v

fun bottomNavigationItemView(configure: BottomNavigationItemViewScope.() -> Unit = {}) =
    v<BottomNavigationItemView>(configure.bind(BottomNavigationItemViewScope))
abstract class BottomNavigationItemViewScope : FrameLayoutScope() {
  companion object : BottomNavigationItemViewScope() {
    init {
      Anvil.registerAttributeSetter(MaterialSetter)
      Anvil.registerAttributeSetter(CustomMaterialSetter)
    }
  }
}
