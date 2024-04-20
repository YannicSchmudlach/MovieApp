package com.example.bonusaufgabeppy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.bonusaufgabeppy.ui.theme.BonusaufgabePPYTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BonusaufgabePPYTheme {
                // A surface container using the 'background' color from the theme
                Surface {
                    ViewModelStartApp()
                }

            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
@Composable
fun ViewModelStartApp() {

    val globalViewModel: GlobalViewModel = hiltViewModel()

    ViewModelNavigationGraph(globalViewModel = globalViewModel)

}




