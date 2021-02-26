/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.DogInfo

@Composable
fun DogList(navController: NavController, dataList: List<DogInfo>) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "首页")
                }
            )
        }
    ) {
        LazyColumn(contentPadding = PaddingValues(10.dp)) {
            items(dataList.size) {
                val dog = dataList[it]
                DogItem(data = dog) {
                    navController.navigate("detail/${dog.id}")
                }
            }
        }
    }
}

@Composable
fun DogItem(data: DogInfo, onClick: () -> Unit) {
    Box(
        contentAlignment = Alignment.BottomStart,
        modifier = Modifier
            .padding(bottom = 10.dp)
            .clickable {
                onClick.invoke()
            }
    ) {
        Image(
            painter = painterResource(id = data.image),
            contentDescription = data.title,
            modifier = Modifier
                .requiredHeight(150.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )
        Text(
            text = data.title,
            modifier = Modifier
                .fillMaxWidth()
                .background(color = colorResource(id = R.color.white_B0))
                .padding(4.dp)
        )
    }
}
