package com.example.helpkemsu.screens

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.helpkemsu.R
import com.example.helpkemsu.botton_navigation.Answer
import com.example.helpkemsu.botton_navigation.CardItem
import com.example.helpkemsu.botton_navigation.Screen

@Composable //Экран Сведения
fun WindowInfoProgram() {

    Column(
        modifier = Modifier //Основной контейнер
            .fillMaxSize()
            .padding(30.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Card( //карточка 1
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(20.dp)
        ) {
            Text(
                modifier = Modifier
                    .padding(10.dp),
                text = "Данное мобильное приложение 'Помощник для абитуриентов при поступлении' " +
                        "является дипломной работой. Оно разработано для снижения нагрузки на приемную комиссию, " +
                        "посредством обращения к приложению, где абитуриент сможет просмотреть описание специальностей" +
                        " и часто задаваемые вопросы к приемной комиссии.",
                fontSize = 20.sp
            )
        }

        Card( //карточка 2
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(20.dp)
        ) {
            Text(
                modifier = Modifier
                    .padding(10.dp),
                text = "Данное приложения является тестовым вариантом. При необходимости возможны " +
                        "дальнейшие изменения",
                fontSize = 20.sp
            )
        }
    }
}

@Composable //Экран просмотра базы обучения
fun WindowBaseTraining(navHostController: NavHostController) {

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(30.dp), //расстояние между кнопками
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Button(
            modifier = Modifier
                .height(80.dp)
                .width(350.dp)
                .padding(bottom = 15.dp),
            onClick = { navHostController.navigate(Screen.WindowShowSpecialtiesForThe9thGrade.route) }) {
            Text(text = "На базе 9 классов", fontSize = 20.sp)

        }
        Button(modifier = Modifier
            .height(80.dp)
            .width(350.dp)
            .padding(bottom = 15.dp),
            onClick = { navHostController.navigate(Screen.WindowShowSpecialtiesForThe11thGrade.route) }) {
            Text(text = "На базе 11 классов", fontSize = 20.sp)
        }
        Button(modifier = Modifier
            .height(80.dp)
            .width(350.dp)
            .padding(bottom = 15.dp),
            onClick = { navHostController.navigate(Screen.WindowShowQuestionsAdmissionsCommittee.route) }) {
            Text(text = "Вопросы к приемной комиссии", fontSize = 20.sp)
        }
    }
}

@Composable //Экран соцсети
fun SocialNetwork() {

    val vk = "https://vk.com/kpitp_kemsu"
    val tg = "https://t.me/kpitp"
    val ofsite = "https://kemsu.ru/"
    val context = LocalContext.current
    val vkin = remember { Intent(Intent.ACTION_VIEW, Uri.parse(vk)) }
    val tgin = remember { Intent(Intent.ACTION_VIEW, Uri.parse(tg)) }
    val sitein = remember { Intent(Intent.ACTION_VIEW, Uri.parse(ofsite)) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp), //расстояние между кнопками
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.vk_ico),
            contentDescription = "vk_image"
        )
        Button(modifier = Modifier
            .padding(30.dp),
            //colors = ButtonDefaults.buttonColors(Color.White),
            onClick = { context.startActivity(vkin) }) {
            Text(text = "Мы в ВКонтакте")
        }
        Image(
            painter = painterResource(id = R.drawable.tg_ico),
            contentDescription = "tg_image"
        )
        Button(
            modifier = Modifier
                .padding(30.dp),
            //colors = ButtonDefaults.buttonColors(Color.White),
            onClick = { context.startActivity(tgin) }) {
            Text(text = "Мы в Telegram")
        }
        Image(
            painter = painterResource(id = R.drawable.llogo),
            contentDescription = "KemSu_image")
        Button(
            modifier = Modifier
                .padding(30.dp),
            onClick = { context.startActivity(sitein) }) {
            Text(text = "Официальный сайт")
        }
    }
}

@Composable //Экран просмотра вопросов приемной комиссии
fun WindowShowQuestionsAdmissionsCommittee(navHostController: NavHostController){
    Column(
        horizontalAlignment = Alignment
        .CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(5.dp),
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(70.dp)
            .verticalScroll(rememberScrollState()))
    {
        Button(modifier = Modifier
            //.padding(bottom = 10.dp)
            .width(410.dp)
            .height(80.dp),
            onClick = { navHostController.navigate(Answer.DocumentColledge.route) }) {
            Text(
                modifier = Modifier,
                    //.align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center,
                text = "Где можно подавать документы в колледж?")
        }
        Button(modifier = Modifier
            //.padding(bottom = 10.dp)
            .width(410.dp)
            .height(80.dp),
            onClick = { navHostController.navigate(Answer.SpisokDocuments.route) }) {
            Text(
                textAlign = TextAlign.Center,
                text = "Где можно посмотреть список,подавших документы?")
        }
        Button(modifier = Modifier
            //.padding(bottom = 10.dp)
            .width(410.dp)
            .height(80.dp),onClick = { navHostController.navigate(Answer.SpecialnostiCollege.route) }) {
            Text(
                textAlign = TextAlign.Center,
                text = "Какие специальности есть в колледже?")
        }
        Button(modifier = Modifier
            //.padding(bottom = 10.dp)
            .width(410.dp)
            .height(80.dp),onClick = { navHostController.navigate(Answer.SpecialnostiCollege11klassov.route) }) {
            Text(
                textAlign = TextAlign.Center,
                text = "На какие специальности можно поступить на базе 11 классов?")
        }
        Button(modifier = Modifier
            //.padding(bottom = 10.dp)
            .width(410.dp)
            .height(80.dp),onClick = { navHostController.navigate(Answer.Documentdlyapodachi.route) }) {
            Text(
                textAlign = TextAlign.Center,
                text = "Какие документы необходимы для подачи заявления?")
        }
        Button(modifier = Modifier
            //.padding(bottom = 10.dp)
            .width(410.dp)
            .height(80.dp),onClick = { navHostController.navigate(Answer.MedSpravka.route) }) {
            Text(
                textAlign = TextAlign.Center,
                text = "Для каких специальностей нужна медицинская справка, а для каких только результаты флюрографии?")
        }
        Button(modifier = Modifier
            //.padding(bottom = 10.dp)
            .width(410.dp)
            .height(80.dp),onClick = { navHostController.navigate(Answer.NachaloPriemDocumentov.route) }) {
            Text(
                textAlign = TextAlign.Center,
                text = "В какие даты начинается прием документов?")
        }
        Button(modifier = Modifier
            //.padding(bottom = 10.dp)
            .width(410.dp)
            .height(80.dp),onClick = { navHostController.navigate(Answer.EndPriemDocumentov.route) }) {
            Text(
                textAlign = TextAlign.Center,
                text = "Когда заканчивается прием документов?")
        }
        Button(modifier = Modifier
            //.padding(bottom = 10.dp)
            .width(410.dp)
            .height(80.dp),onClick = { navHostController.navigate(Answer.PrikazZachisleniya.route) }) {
            Text(
                textAlign = TextAlign.Center,
                text = "Когда выходят приказы о зачислении?")
        }
        Button(modifier = Modifier
            //.padding(bottom = 10.dp)
            .width(410.dp)
            .height(80.dp),onClick = { navHostController.navigate(Answer.EstLiIspitaniya.route) }) {
            Text(
                textAlign = TextAlign.Center,
                text = "Есть ли вступительные испытания для поступления?")
        }
        Button(modifier = Modifier
            //.padding(bottom = 10.dp)
            .width(410.dp)
            .height(80.dp),onClick = { navHostController.navigate(Answer.IspitaniyaFizKachestv.route) }) {
            Text(
                textAlign = TextAlign.Center,
                text = "Какие испытания входят для определения физических качеств?")
        }
        Button(modifier = Modifier
            //.padding(bottom = 10.dp)
            .width(410.dp)
            .height(80.dp),onClick = { navHostController.navigate(Answer.IspitaniyaPsihKachestv.route) }) {
            Text(
                textAlign = TextAlign.Center,
                text = "Какие испытания проводятся для определения психологических качеств?")
        }
        Button(modifier = Modifier
            //.padding(bottom = 10.dp)
            .width(410.dp)
            .height(80.dp),onClick = { navHostController.navigate(Answer.ChisloFizKachestv.route) }) {
            Text(
                textAlign = TextAlign.Center,
                text = "Какого числа проходят вступительные испытания для определения физических качеств?")
        }
        Button(modifier = Modifier
            //.padding(bottom = 10.dp)
            .width(410.dp)
            .height(80.dp),onClick = { navHostController.navigate(Answer.ShisloPsihKachestv.route) }) {
            Text(
                textAlign = TextAlign.Center,
                text = "Какого числа проходят вступительные испытания для определения психологических качеств?")
        }

    }
}

@Composable //Экран просмотра специальностей за 9 класс
fun WindowShowSpecialtiesForThe9thGrade(navHostController: NavHostController) {
    Column(
        horizontalAlignment = Alignment
            .CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(50.dp)
            .verticalScroll(rememberScrollState())
    )
    {

        Button(modifier = Modifier
            .padding(10.dp)
            .width(410.dp)
            .height(80.dp),
            onClick = { navHostController.navigate(CardItem.conder.route) }) {
            Text(text = "Монтаж и Эксплуатация внутренних сантехнических устройств, кондиционирования воздуха и вентиляции")
        }

        Button(modifier = Modifier
            .padding(10.dp)
            .width(410.dp)
            .height(80.dp),
            onClick = { navHostController.navigate(CardItem.infSys.route) }) {
            Text(text = "Информационные системы и программирование")
        }

        Button(modifier = Modifier
            .padding(10.dp)
            .width(410.dp)
            .height(80.dp),
            onClick = { navHostController.navigate(CardItem.holodos.route) }) {
            Text(text = "Монтаж и техническая эксплуатация холодильно-компрессорных машин и установок (по отраслям)")
        }

        Button(modifier = Modifier
            .padding(10.dp)
            .width(410.dp)
            .height(80.dp),
            onClick = { navHostController.navigate(CardItem.promOborydovanie.route) }) {
            Text(text = "Монтаж, техническое обслуживание, эксплуатация и ремонт промышленного оборудования (по отраслям)")
        }

        Button(modifier = Modifier
            .padding(10.dp)
            .width(410.dp)
            .height(80.dp),
            onClick = { navHostController.navigate(CardItem.rastSirie.route) }) {
            Text(text = "Технология продуктов питания из растительного сырья")
        }

        Button(modifier = Modifier
            .padding(10.dp)
            .width(410.dp)
            .height(80.dp),
            onClick = { navHostController.navigate(CardItem.animalProis.route) }) {
            Text(text = "Технология продуктов питания животного происхождения")
        }

        Button(modifier = Modifier
            .padding(10.dp)
            .width(410.dp)
            .height(80.dp),
            onClick = { navHostController.navigate(CardItem.fire.route) }) {
            Text(text = "Пожарная безопасность")
        }

        Button(modifier = Modifier
            .padding(10.dp)
            .width(410.dp)
            .height(80.dp),
            onClick = { navHostController.navigate(CardItem.yourist.route) }) {
            Text(text = "Юриспруденция")
        }

        Button(modifier = Modifier
            .padding(10.dp)
            .width(410.dp)
            .height(80.dp),
            onClick = { navHostController.navigate(CardItem.pooovar.route) }) {
            Text(text = "Поварское и кондитерское дело")
        }

        Button(modifier = Modifier
            .padding(10.dp)
            .width(410.dp)
            .height(80.dp),
            onClick = { navHostController.navigate(CardItem.children.route) }) {
            Text(text = "Специальное дошкольное образование")
        }

        Button(modifier = Modifier
            .padding(10.dp)
            .width(410.dp)
            .height(80.dp),
            onClick = { navHostController.navigate(CardItem.fizruk.route) }) {
            Text(text = "Физическая культура")
        }
    }
}

@Composable //Экран просмотра специальностей за 11 класс
fun WindowShowSpecialtiesForThe11thGrade(navHostController: NavHostController) {
    Column(
        horizontalAlignment = Alignment
            .CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(50.dp)
            .verticalScroll(rememberScrollState())
    )
    {

        Button(modifier = Modifier
            .padding(10.dp)
            .width(410.dp)
            .height(80.dp),
            onClick = { navHostController.navigate(CardItem.infSys.route) }) {
            Text(text = "Информационные системы и программирование")
        }

        Button(modifier = Modifier
            .padding(10.dp)
            .width(410.dp)
            .height(80.dp),
            onClick = { navHostController.navigate(CardItem.animalDoctor.route) }) {
            Text(text = "Ветеринарный фельдшер")
        }

        Button(modifier = Modifier
            .padding(10.dp)
            .width(410.dp)
            .height(80.dp),
            onClick = { navHostController.navigate(CardItem.byhYchet.route) }) {
            Text(text = "Экономика и бухгалтерский учет (по отраслям)")
        }

        Button(modifier = Modifier
            .padding(10.dp)
            .width(410.dp)
            .height(80.dp),
            onClick = { navHostController.navigate(CardItem.yourist.route) }) {
            Text(text = "Юриспруденция")
        }

    }
}
