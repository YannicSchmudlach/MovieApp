package com.example.bonusaufgabeppy

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import coil.compose.rememberAsyncImagePainter
import com.example.bonusaufgabeppy.network.data.movie.Movie
import com.example.bonusaufgabeppy.searchAndResult.SearchAndResultViewModel

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SearchAndResultScreen(navController: NavHostController,
                globalViewModel: GlobalViewModel,
                viewModel: SearchAndResultViewModel = hiltViewModel()
) {
    Scaffold(
        topBar = {
            TopBar()
        },
        content = {
            Content(navController = navController,viewModel)
        }
    )

}


@Composable
fun TopBar() {

    TopAppBar() {
        Text(
            text = "Movie App",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(10.dp)
        )
    }

}

@OptIn(ExperimentalLifecycleComposeApi::class)
@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun Content(navController: NavHostController,viewModel: SearchAndResultViewModel) {
    val movies by viewModel.movie.collectAsStateWithLifecycle()
    Column(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                //.background(Color.Cyan)
                .fillMaxSize()
        )
        {
            Textfield(viewModel)
        }
        Box(
            modifier = Modifier
                .weight(8f)
                //.background(Color.Red)
                .fillMaxSize()
        )
        {
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                //modifier = Modifier.background(Color.Green),
                content = {

                    items(movies.movies.size){
                            i->

                            Box(
                                modifier = Modifier.aspectRatio(1f)
                            ) {

                                MainScreenElements(i, navController, movies.movies.get(i))
                            }
                        }
                    

                }
            )
        }
        Box(
            modifier = Modifier
                .weight(1f)
                //.background(Color.Green)
                .fillMaxSize()
        )
        {
            NiceButton(viewModel)
        }
    }
}
@Composable
fun MainScreenElements(i :Int,navController: NavHostController,movie: Movie) {
        Column(
            modifier = Modifier
                .padding(5.dp)
                .clip(shape = RoundedCornerShape(12.dp))
        ) {
            Box(modifier = Modifier
                .weight(3f)
                .clickable {
                    navController.navigate(route = Route.MovieDetailsRoute.passMovieID(movie.id)) //TODO click on a movie
                }
            ) {
                Image(
                    painter = rememberAsyncImagePainter("https://image.tmdb.org/t/p/original/" + movie.poster_path),
                    contentDescription = stringResource(id = R.string.app_name),
                    contentScale = ContentScale.FillHeight,//vorher fit
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Transparent)
                )
            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .background(Color.Transparent)
                    .wrapContentSize(Alignment.Center)
                    .fillMaxSize()
            )
            {
                movie.title?.let { title ->
                    Text(
                        text = title,
                        modifier = Modifier.align(Alignment.Center),
                        textAlign = TextAlign.Center
                    )
                } ?: run {
                    Text(
                        text = "Default",
                        modifier = Modifier.align(Alignment.Center),
                        textAlign = TextAlign.Center
                    )
                }
            }

    }
}

@Composable
fun Textfield(viewModel: SearchAndResultViewModel) {
    val uiData by viewModel.uiData.collectAsState()
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(100.dp, 10.dp)
    ) {
        OutlinedTextField(
            value = uiData,
            onValueChange = {
                viewModel.searchField(it)
            },
            label = { Text(text = "Type to search") },
            shape = RoundedCornerShape(12.dp),
            maxLines = 1
        )
    }
}

@Composable
fun NiceButton(viewModel: SearchAndResultViewModel) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {
                        viewModel.loadMoreButton()
                      },
            modifier = Modifier.padding(120.dp, 10.dp)
        ) {
            Text(text = "Load more")
        }

    }
}