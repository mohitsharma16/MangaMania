package com.example.mangamania.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.text.googlefonts.GoogleFont.Provider
import com.example.mangamania.R

// 1. Provider setup
private val provider = Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

// 2. Google Fonts
private val bangers = GoogleFont("Bangers")
private val anton = GoogleFont("Anton")
private val comicNeue = GoogleFont("Comic Neue")

val BangersFont = FontFamily(Font(bangers, provider))
val AntonFont = FontFamily(Font(anton, provider))
val ComicNeueFont = FontFamily(Font(comicNeue, provider))

// 3. Apply to Material3 Typography
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = BangersFont,
        fontSize = 28.sp,
        lineHeight = 32.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = AntonFont,
        fontSize = 16.sp,
        lineHeight = 24.sp
    ),
    labelLarge = TextStyle(
        fontFamily = ComicNeueFont,
        fontSize = 14.sp,
        lineHeight = 20.sp
    )
)
