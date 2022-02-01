package dev.rickandmorty.design

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

private val RobotoFamily: FontFamily =
    FontFamily(
        Font(R.font.roboto_regular, weight = FontWeight.Normal),

        Font(R.font.roboto_light, weight = FontWeight.Light),
        Font(R.font.roboto_light_italic, weight = FontWeight.Light, style = FontStyle.Italic),

        Font(R.font.roboto_medium, weight = FontWeight.Medium),
        Font(R.font.roboto_medium_italic, weight = FontWeight.Medium, style = FontStyle.Italic),

        Font(R.font.roboto_bold, weight = FontWeight.Bold),
        Font(R.font.roboto_bold_italic, weight = FontWeight.Bold, style = FontStyle.Italic),

        Font(R.font.roboto_black, weight = FontWeight.Black),
        Font(R.font.roboto_black_italic, weight = FontWeight.Black, style = FontStyle.Italic),

        Font(R.font.roboto_thin, weight = FontWeight.Thin),
        Font(R.font.roboto_thin_italic, weight = FontWeight.Thin, style = FontStyle.Italic),
    )

internal val ThemeTypography: Typography =
    Typography(
        defaultFontFamily = RobotoFamily,
        h1 = TextStyle(fontSize = 32.sp, fontWeight = FontWeight.SemiBold, lineHeight = 36.sp),
        h2 = TextStyle(fontSize = 28.sp, fontWeight = FontWeight.SemiBold, lineHeight = 32.sp),
        h3 = TextStyle(fontSize = 22.sp, fontWeight = FontWeight.SemiBold, lineHeight = 28.sp),
        h4 = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.SemiBold, lineHeight = 24.sp),
        subtitle1 = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold, lineHeight = 24.sp),
        subtitle2 = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.SemiBold, lineHeight = 24.sp),
        body1 = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Normal, lineHeight = 24.sp),
        body2 = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Light, lineHeight = 24.sp),
    )