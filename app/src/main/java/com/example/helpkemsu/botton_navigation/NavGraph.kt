package com.example.helpkemsu.botton_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.helpkemsu.screens.ChisloFizKachestv
import com.example.helpkemsu.screens.DocumentColledge
import com.example.helpkemsu.screens.Documentdlyapodachi
import com.example.helpkemsu.screens.EndPriemDocumentov
import com.example.helpkemsu.screens.EstLiIspitaniya
import com.example.helpkemsu.screens.IspitaniyaFizKachestv
import com.example.helpkemsu.screens.IspitaniyaPsihKachestv
import com.example.helpkemsu.screens.MedSpravka
import com.example.helpkemsu.screens.NachaloPriemDocumentov
import com.example.helpkemsu.screens.PrikazZachisleniya
import com.example.helpkemsu.screens.ShisloPsihKachestv
import com.example.helpkemsu.screens.SocialNetwork
import com.example.helpkemsu.screens.SpecialnostiCollege
import com.example.helpkemsu.screens.SpecialnostiCollege11klassov
import com.example.helpkemsu.screens.SpisokDocuments
import com.example.helpkemsu.screens.WindowBaseTraining
import com.example.helpkemsu.screens.WindowInfoProgram
import com.example.helpkemsu.screens.WindowShowQuestionsAdmissionsCommittee
import com.example.helpkemsu.screens.WindowShowSpecialtiesForThe11thGrade
import com.example.helpkemsu.screens.WindowShowSpecialtiesForThe9thGrade
import com.example.helpkemsu.screens.animalDoctor
import com.example.helpkemsu.screens.animalProis
import com.example.helpkemsu.screens.byhYchet
import com.example.helpkemsu.screens.children
import com.example.helpkemsu.screens.conder
import com.example.helpkemsu.screens.fire
import com.example.helpkemsu.screens.fizruk
import com.example.helpkemsu.screens.holodos
import com.example.helpkemsu.screens.infSys
import com.example.helpkemsu.screens.pooovar
import com.example.helpkemsu.screens.promOborydovanie
import com.example.helpkemsu.screens.rastSirie
import com.example.helpkemsu.screens.yourist

@Composable
fun NavGraph(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = "WindowInfoProgram") {
        composable("WindowInfoProgram") {
            WindowInfoProgram()
        }
        composable("WindowBaseTraining") {
            WindowBaseTraining(navHostController)

        }
        composable("SocialNetwork") {
            SocialNetwork()
        }
        composable(Screen.WindowBaseTraining.route) {
            WindowBaseTraining(navHostController)
        }
        composable(Screen.WindowShowSpecialtiesForThe9thGrade.route) {
            WindowShowSpecialtiesForThe9thGrade(navHostController)
        }
        composable(Screen.WindowShowSpecialtiesForThe11thGrade.route) {
            WindowShowSpecialtiesForThe11thGrade(navHostController)
        }
        composable(Screen.WindowShowQuestionsAdmissionsCommittee.route) {
            WindowShowQuestionsAdmissionsCommittee(navHostController)
        }

//--------------------AnswerItem------------------
        composable(Answer.DocumentColledge.route){
            DocumentColledge(navHostController)
        }
        composable(Answer.SpisokDocuments.route){
            SpisokDocuments(navHostController)
        }
        composable(Answer.SpecialnostiCollege.route){
            SpecialnostiCollege(navHostController)
        }
        composable(Answer.SpecialnostiCollege11klassov.route){
            SpecialnostiCollege11klassov(navHostController)
        }
        composable(Answer.Documentdlyapodachi.route){
            Documentdlyapodachi(navHostController)
        }
        composable(Answer.MedSpravka.route){
            MedSpravka(navHostController)
        }
        composable(Answer.NachaloPriemDocumentov.route){
            NachaloPriemDocumentov(navHostController)
        }
        composable(Answer.EndPriemDocumentov.route){
            EndPriemDocumentov(navHostController)
        }
        composable(Answer.PrikazZachisleniya.route){
            PrikazZachisleniya(navHostController)
        }
        composable(Answer.EstLiIspitaniya.route){
            EstLiIspitaniya(navHostController)
        }
        composable(Answer.IspitaniyaFizKachestv.route){
            IspitaniyaFizKachestv(navHostController)
        }
        composable(Answer.IspitaniyaPsihKachestv.route){
            IspitaniyaPsihKachestv(navHostController)
        }
        composable(Answer.ChisloFizKachestv.route){
            ChisloFizKachestv(navHostController)
        }
        composable(Answer.ShisloPsihKachestv.route){
            ShisloPsihKachestv(navHostController)
        }
//-------------------------CardItem-----------------------------------
        composable(CardItem.conder.route){
            conder(navHostController)
        }
        composable(CardItem.infSys.route){
            infSys(navHostController)
        }
        composable(CardItem.holodos.route){
            holodos(navHostController)
        }
        composable(CardItem.promOborydovanie.route){
            promOborydovanie(navHostController)
        }
        composable(CardItem.rastSirie.route){
            rastSirie(navHostController)
        }
        composable(CardItem.animalProis.route){
            animalProis(navHostController)
        }
        composable(CardItem.fire.route){
            fire(navHostController)
        }
        composable(CardItem.animalDoctor.route){
            animalDoctor(navHostController)
        }
        composable(CardItem.byhYchet.route){
            byhYchet(navHostController)
        }
        composable(CardItem.yourist.route){
            yourist(navHostController)
        }
        composable(CardItem.pooovar.route){
            pooovar(navHostController)
        }
        composable(CardItem.children.route){
            children(navHostController)
        }
        composable(CardItem.fizruk.route){
            fizruk(navHostController)
        }

    }
}