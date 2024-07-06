package com.example.helpkemsu.botton_navigation

sealed class Answer(val route: String){
    object DocumentColledge : Answer("DocumentColledge")
    object SpisokDocuments: Answer("SpisokDocuments")
    object SpecialnostiCollege: Answer("SpecialnostiCollege")
    object SpecialnostiCollege11klassov: Answer("SpecialnostiCollege11klassov")
    object Documentdlyapodachi: Answer("Documentdlyapodachi")
    object MedSpravka: Answer("MedSpravka")
    object NachaloPriemDocumentov: Answer("NachaloPriemDocumentov")
    object EndPriemDocumentov: Answer("EndPriemDocumentov")
    object PrikazZachisleniya: Answer("PrikazZachisleniya")
    object EstLiIspitaniya: Answer("EstLiIspitaniya")
    object IspitaniyaFizKachestv: Answer("IspitaniyaFizKachestv")
    object IspitaniyaPsihKachestv: Answer("IspitaniyaPsihKachestv")
    object ChisloFizKachestv: Answer("ChisloFizKachestv")
    object ShisloPsihKachestv: Answer("ShisloPsihKachestv")

}