package com.florianwalther.incentivetimer.core.ui.screenspecs

import androidx.annotation.StringRes
import androidx.compose.ui.graphics.vector.ImageVector

sealed interface BottomNavScreenSpec : ScreenSpec {

    companion object {
        val screens: List<BottomNavScreenSpec> = ScreenSpec
            .allScreens
            .values
            .filterIsInstance<BottomNavScreenSpec>()
    }

    val icon: ImageVector

    @get:StringRes
    val label: Int

}