package com.lwinminkhant.uidesign

sealed class LifestyleData(
    val label: String,
    val icon: Int
) {

    object Amenities:LifestyleData(
        label = "Amenities",
        icon = R.drawable.theme
    )

    object Facilities:LifestyleData(
        label = "Amenities",
        icon = R.drawable.workout
    )
    object FnB:LifestyleData(
        label = "F&B",
        icon = R.drawable.fnb
    )
    object KidFamily:LifestyleData(
        label = "KidFamily",
        icon = R.drawable.kidsfamily
    )
    object Wellness:LifestyleData(
        label = "Wellness",
        icon = R.drawable.wellness
    )

    object InclusiveBreakfast:LifestyleData(
        label = "Wellness",
        icon = R.drawable.fnb
    )
    object Discount:LifestyleData(
        label = "20% off \nIn-Room Service",
        icon = R.drawable.discount
    )


}