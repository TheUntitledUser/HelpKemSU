package com.example.helpkemsu.botton_navigation

sealed class CardItem (val route: String) {
    object conder: CardItem("conder")
    object infSys: CardItem("infSys")
    object holodos: CardItem("holodos")
    object promOborydovanie: CardItem("promOborydovanie")
    object rastSirie: CardItem("rastSirie")
    object animalProis: CardItem("animalProis")
    object fire: CardItem("fire")
    object animalDoctor: CardItem("animalDoctor")
    object byhYchet: CardItem("byhYchet")
    object yourist: CardItem("yourist")
    object pooovar: CardItem("pooovar")
    object children: CardItem("children")
    object fizruk: CardItem("fizruk")


}