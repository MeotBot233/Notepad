/* Copyright 2021 Braden Farmer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.farmerbb.notepad.ui

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.farmerbb.notepad.ui.screens.EditNoteRoute
import com.farmerbb.notepad.ui.screens.NoteListRoute
import com.farmerbb.notepad.ui.screens.ViewNoteRoute

@Composable fun NotepadComposeApp() {
  val navController = rememberNavController()
  MaterialTheme {
    NavHost(
      navController = navController,
      startDestination = "NoteList"
    ) {
      NoteListRoute(navController)
      ViewNoteRoute(navController)
      EditNoteRoute(navController)
    }
  }
}