package com.example.bonusaufgabeppy

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.bonusaufgabeppy.movieDetails.MovieDetailsScreen

@Composable
fun ViewModelNavigationGraph(
    globalViewModel: GlobalViewModel,
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = Route.SearchAndResultRoute.route
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    )
    {
        composable(Route.SearchAndResultRoute.route) { SearchAndResultScreen(navController, globalViewModel) }
        composable(Route.MovieDetailsRoute.route, arguments = listOf(navArgument("$MOVIE_ID"){
            type = NavType.IntType
        }))
        {
            var movieID =it.arguments?.getInt(MOVIE_ID).toString()
            MovieDetailsScreen(navController, globalViewModel,movieID)
        }
    }
}