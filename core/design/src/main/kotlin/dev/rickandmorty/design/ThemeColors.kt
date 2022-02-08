package dev.rickandmorty.design

import androidx.compose.material.Colors
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

internal object ThemeColors {

    val LightThemeColors: Colors = lightColors(
        primary = RickAndMortyColors.primary,
        primaryVariant = RickAndMortyColors.primaryVariant,
        onPrimary = CommonColors.White,
        secondary = RickAndMortyColors.secondary,
        secondaryVariant = ChiliColors.BlueS,
        onSecondary = CommonColors.White,
        background = CommonColors.White,
        onBackground = CommonColors.Black,
        surface = CommonColors.White,
        onSurface = CommonColors.Black,
        error = ChiliColors.RedM,
        onError = CommonColors.White,
    )

    val DarkThemeColors: Colors = darkColors(
        primary = RickAndMortyColors.primary,
        primaryVariant = RickAndMortyColors.primaryVariant,
        onPrimary = RickAndMortyColors.rickHair,
        secondary = RickAndMortyColors.secondary,
        secondaryVariant = ChiliColors.BlueM,
        onSecondary = CommonColors.White,
        background = CommonColors.Black,
        onBackground = RickAndMortyColors.rickHair,
        surface = ChiliColors.GrayXl,
        onSurface = RickAndMortyColors.rickHair,
        error = ChiliColors.RedM,
        onError = CommonColors.White
    )

}

@Suppress("unused")
private object RickAndMortyColors {
    val primary = Color(0xff01B1CA)
    val primaryVariant = Color(0xff2D5EB0)
    val secondary = Color(0xffFFCC00)

    val rickTeeShirt = Color(0xffA5F0E7)
    val mortyTeeShirt = Color(0xffFCFF70)

    val rickHair = Color(0xffB7E5FC)
    val mortyHair = Color(0xff85511F)

    val pickleRickPrimary = Color(0xff659C2C)
    val pickleRickSecondary = Color(0xff4D8024)
}

@Suppress("unused")
private object CommonColors {
    val Black = Color(0xff000000)
    val White = Color(0xffFFFFFF)
}

@Suppress("unused")
private object ChiliColors {
    // Green
    val GreenXxl = Color(0xff0F190B)
    val GreenXl = Color(0xff28431E)
    val GreenL = Color(0xff437132)
    val GreenM = Color(0xff589442)
    val GreenS = Color(0xff83b073)
    val GreenXs = Color(0xffB4CFAA)
    val GreenXxs = Color(0xffE8F0E5)

    // Gray
    val GrayXl = Color(0xff3C4048)
    val GrayXlTransparent = Color(0xB33C4048)
    val GrayL = Color(0xff6F7685)
    val GrayM = Color(0xff959BA7)
    val GrayS = Color(0xffBFC3CA)
    val GrayXs = Color(0xffECEDEF)
    val GrayXxs = Color(0xffF7F7F8)
    val GrayXxsTransparent = Color(0xB3F7F7F8)

    // Red
    val RedXl = Color(0xff5F0D11)
    val RedL = Color(0xff9A141B)
    val RedM = Color(0xffCB1A24)
    val RedS = Color(0xffD9545A)
    val RedXs = Color(0xffE99B9F)
    val RedXxs = Color(0xffF8DEDF)

    // Blue
    val BlueXxl = Color(0xff00111A)
    val BlueXl = Color(0xff002E47)
    val BlueL = Color(0xff004C75)
    val BlueM = Color(0xff006399)
    val BlueS = Color(0xff0082B2)
    val BlueXs = Color(0xff8DBAD3)
    val BlueXxs = Color(0xffDAE9F1)

    // Orange
    val OrangeXl = Color(0xff704A00)
    val OrangeL = Color(0xffBD7D00)
    val OrangeM = Color(0xffF5A100)
    val OrangeS = Color(0xffF9BC43)
    val OrangeXs = Color(0xffFBD78D)
    val OrangeXxs = Color(0xffFEF3DC)
}