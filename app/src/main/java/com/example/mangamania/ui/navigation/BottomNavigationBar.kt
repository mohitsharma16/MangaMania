package com.example.mangamania.ui.components

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.mangamania.ui.navigation.BottomBarItem
import com.example.mangamania.ui.theme.AccentPink

@Composable
fun BottomNavigationBar(
    navController: NavController,
    currentRoute: String?
) {
    NavigationBar(
        containerColor = MaterialTheme.colorScheme.background,
        contentColor = MaterialTheme.colorScheme.onBackground
    ) {
        BottomBarItem.items.forEach { item ->
            val selected = currentRoute == item.route
            NavigationBarItem(
                icon = {
                    Icon(
                        item.icon,
                        contentDescription = item.title,
                        tint = if (selected) AccentPink else MaterialTheme.colorScheme.onBackground
                    )
                },
                label = {
                    Text(
                        item.title,
                        style = MaterialTheme.typography.labelLarge,
                        color = if (selected) AccentPink else MaterialTheme.colorScheme.onBackground
                    )
                },
                selected = selected,
                onClick = {
                    if (!selected) {
                        navController.navigate(item.route) {
                            popUpTo(navController.graph.startDestinationId) { saveState = true }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                },
                colors = NavigationBarItemDefaults.colors(
                    indicatorColor = MaterialTheme.colorScheme.surface
                )
            )
        }
    }
}
