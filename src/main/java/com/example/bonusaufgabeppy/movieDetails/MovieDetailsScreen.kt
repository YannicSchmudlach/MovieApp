package com.example.bonusaufgabeppy.movieDetails

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import coil.compose.rememberAsyncImagePainter
import com.example.bonusaufgabeppy.GlobalViewModel
import com.example.bonusaufgabeppy.R

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MovieDetailsScreen(navController: NavHostController,
                globalViewModel: GlobalViewModel,
                movieID:String,
                viewModel: MovieDetailsViewModel = hiltViewModel()
){
    viewModel.decideMovieLoad(movieID.toLong())
    MovieDetails(navController,movieID,viewModel)
}
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MovieDetails(navController: NavHostController,movieID: String,viewModel: MovieDetailsViewModel) {
    Scaffold(
        topBar = {
            TopBarWithBack(navController)
        },
        content = {
            ContentDetails(viewModel)
        }
    )
}

@Composable
fun TopBarWithBack(navController: NavHostController) {
    TopAppBar() {
        Row {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = "Back",
                modifier = Modifier
                    .padding(16.dp)
                    .clickable {
                        navController.popBackStack()
                        // Implement back action here
                        //https://stackoverflow.com/questions/69192042/how-to-use-jetpack-compose-app-bar-backbutton
                    }
            )
        }
        Text(
            text = "Movie Details",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(10.dp)
        )
    }
}

@SuppressLint("SuspiciousIndentation")
@Composable
fun ContentDetails(viewModel: MovieDetailsViewModel) {
    val uiData by viewModel.movie.collectAsState()
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .weight(2.5f)
                .fillMaxSize()
        )
        {
            val imageModifier = Modifier
                .fillMaxSize()
            Image(
                painter = rememberAsyncImagePainter("https://image.tmdb.org/t/p/original/"+uiData.backdrop_path),
                contentDescription = stringResource(id = R.string.app_name),
                contentScale = ContentScale.FillHeight,//vorher fit
                modifier = imageModifier
            )
        }
        Box(
            modifier = Modifier
                .weight(0.75f)
                .fillMaxSize()
        )
        {
            uiData.title?.let {
                Text(
                    text = it,
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(20.dp,0.dp)
                )
            }

        }
        Box(
            modifier = Modifier
                .weight(2f)
                .fillMaxSize()
        )
        {
            val txt = uiData.overview
                Text(
                text = "Overview",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(20.dp,0.dp)
            )
            Text(
                text = txt,
                modifier = Modifier.padding(20.dp,25.dp)
            )
        }
        Box(
            modifier = Modifier
                .weight(0.5f)
                .fillMaxSize()
        ){
            val txt = uiData.vote_average
            Text(
                text = "Voter score",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(20.dp,0.dp)
            )
            Text(
                text = txt.toString()+" / 10",
                modifier = Modifier.padding(20.dp,25.dp)
            )
        }

    }
}