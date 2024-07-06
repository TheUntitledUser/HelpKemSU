package com.example.helpkemsu.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun HyperLinkText(
    modifier: Modifier = Modifier,
    fullText: String,
    linkText: List<String>,
    linkTextColor: Color = Color.Black,
    linkTextDecoration: TextDecoration = TextDecoration.Underline,
    hyperLinks: List<String>,
    fontSize: TextUnit = TextUnit.Unspecified
    ) {
    val annotatedString = buildAnnotatedString {
        append(fullText)
        linkText.forEachIndexed { index, link ->
            val startIndex = fullText.indexOf(link)
            val endIndex = startIndex + link.length
            addStyle(
                style = SpanStyle(
                    color = linkTextColor,
                    fontSize = fontSize,
                    textDecoration = linkTextDecoration
                ),
                start = startIndex,
                end = endIndex
            )
            addStringAnnotation(
                tag = "URL",
                annotation = hyperLinks[index],
                start = startIndex,
                end = endIndex
            )
        }
        addStyle(
            style = SpanStyle(
                fontSize = fontSize
            ),
            start = 0,
            end = fullText.length
        )
    }

    val uriHandler = LocalUriHandler.current

    ClickableText(
        modifier = Modifier
            .padding(10.dp),
        text = annotatedString,
        onClick = {
            annotatedString
                .getStringAnnotations("URL", it, it)
                .firstOrNull()?.let { stringAnnotation ->
                    uriHandler.openUri(stringAnnotation.item)
                }
        }
    )
}

//Вопросы к приемной комиссии

@Composable
fun DocumentColledge(navHostController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Card( // Вопрос
        modifier = Modifier
            .padding(top = 5.dp)
            .fillMaxWidth()
            .wrapContentHeight(),
            elevation = CardDefaults.cardElevation(5.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
            contentColor = Color.Black
        ),
        shape = RoundedCornerShape(10.dp)
    )
    {
        Text(
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            text = "Где можно подавать документы в колледж?",
            fontSize = 20.sp
        )}
        Card( // Ответ
            modifier = Modifier
                .padding(bottom = 5.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(10.dp)
        )
        {
            Text(
                modifier = Modifier
                    .padding(10.dp),
                text = "Документы в колледж можно подавать в 2-х местах:\n\n" +
                        "   1. колледж, расположеннный по улице Терешковой, 35;\n\n" +
                        "   2. университет, расположенный по улице Красная, 6.",
                fontSize = 20.sp)
        }
    }
}

@Composable
fun SpisokDocuments(navHostController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Card( // Вопрос
            modifier = Modifier
                .padding(top = 5.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(10.dp)
        )
        {
            Text(
                modifier = Modifier
                    .padding(10.dp)
                    .align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center,
                text = "Где можно посмотреть список, подавших документы?",
                fontSize = 20.sp
            )}
        Card( // Ответ
            modifier = Modifier
                .padding(bottom = 5.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(10.dp)
        )
        {
            HyperLinkText(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
                fullText = "Список, подавших документы можно посмотреть на официальном сайте КемГУ в " +
                "разделе 'Абитуриент', 'Online-списки лиц, подавших документы.\n",
                linkText = listOf("официальном сайте КемГУ"),
                hyperLinks = listOf("https://kemsu.ru/abiturient/progress-campaign/lists/"),
                fontSize = 22.sp
            )
        }
    }
}

@Composable
fun SpecialnostiCollege(navHostController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Card( // Вопрос
            modifier = Modifier
                .padding(top = 5.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(10.dp)
        )
        {
            Text(
                modifier = Modifier
                    .padding(10.dp)
                    .align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center,
                text = "Какие специальности есть в колледже?",
                fontSize = 20.sp
            )}
        Card( // Ответ
            modifier = Modifier
                .padding(bottom = 5.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(10.dp)
        )
        {
            Text(
                modifier = Modifier
                    .padding(10.dp),
                text = "В колледже есть следующие специальности:\n\n" +
                        "   1. Специальность 08.02.13 Монтаж и эксплуатация внутренних сантехнических " +
                        "устройств, кондиционирования воздуха и вентиляции;\n\n" +
                        "   2. специальность 09.02.07 Информационные системы и программирование;\n\n" +
                        "   3. специальность 15.02.06 монтаж, техническая эксплуатация и ремонт холодильно-компрессорных " +
                        "и теплонасосных машин и установок (по отраслям);\n\n" +
                        "   4. специальность  15.02.17 монтаж, техническое обслуживание, эксплуатация и " +
                        "ремонт промышленного оборудования \n(по отраслям);\n\n" +
                        "   5. специальность 19.02.11 технология продуктов питания из растительного сырья;\n\n" +
                        "   6. специальность 19.02.12 технология продуктов питания животного происхождения;\n\n" +
                        "   7. специальность 20.02.04 пожарная безопасность;\n\n" +
                        "   8. специальность 36.02.01 ветеринарный фельдшер;\n\n" +
                        "   9. специальность 38.02.01 экономика и бухгалтерский учет \n(по отраслям);\n\n" +
                        "   10. специальность 40.02.04 юриспруденция;\n\n" +
                        "   11. специальность 43.02.15 поварское и кондитерское дело;\n\n" +
                        "   12. специальность 44.02.04 специальное дошкольное образование;\n\n" +
                        "   13. специальность 49.02.01 физическая культура.",
                fontSize = 20.sp)
        }
    }
}

@Composable
fun SpecialnostiCollege11klassov(navHostController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Card( // Вопрос
            modifier = Modifier
                .padding(top = 5.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(10.dp)
        )
        {
            Text(
                modifier = Modifier
                    .padding(10.dp)
                    .align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center,
                text = "На какие специальности можно поступить на базе 11-ти классов?",
                fontSize = 20.sp
            )}
        Card( // Ответ
            modifier = Modifier
                .padding(bottom = 5.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(10.dp)
        )
        {
            Text(
                modifier = Modifier
                    .padding(10.dp),
                text = "На базе 11-ти классов можно поступить на следующие специальности:\n\n" +
                        "   1. специальность 09.02.07 Информационные системы и программирование;\n\n" +
                        "   2. специальность 36.02.01 ветеринарный фельдшер;\n\n" +
                        "   3. специальность 38.02.01 экономика и бухгалтерский учет \n(по отраслям);\n\n" +
                        "   4. специальность 40.02.04 юриспруденция;",
                fontSize = 20.sp)
        }
    }
}

@Composable
fun Documentdlyapodachi(navHostController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Card( // Вопрос
            modifier = Modifier
                .padding(top = 5.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(10.dp)
        )
        {
            Text(
                modifier = Modifier
                    .padding(10.dp)
                    .align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center,
                text = "Какие документы необходимы для поступления?",
                fontSize = 20.sp
            )}
        Card( // Ответ
            modifier = Modifier
                .padding(bottom = 5.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(10.dp)
        )
        {
            Text(
                modifier = Modifier
                    .padding(10.dp),
                text = "Для поступления несовершеннолетних абитуриентов необходимы следующие документы:\n\n" +
                        "   1. Оригинал паспорта, удостоверяющего личность и гражданство абитуриента (паспорт);\n\n" +
                        "   2. Оригинал паспорта, удостоверяющего личность и гражданство родителя / " +
                        "законного представителя (паспорт);\n\n" +
                        "   3. оригинал/копию документа об образовании вместе с приложением (аттестат / диплом);\n\n" +
                        "   4. страховой номер индивидуального страхового счета (СНИЛС);\n\n" +
                        "   5. свидетельство о рождении абитуриента или справка об опекунстве;\n\n" +
                        "   6. 4 фотографии 3х4;\n\n" +
                        "   7. медицинская справка/результаты флюрографии.",
                fontSize = 20.sp)
        }
    }
}

@Composable
fun MedSpravka(navHostController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Card( // Вопрос
            modifier = Modifier
                .padding(top = 5.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(10.dp)
        )
        {
            Text(
                modifier = Modifier
                    .padding(10.dp)
                    .align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center,
                text = "Для каких специальностей нужна медицинская справка, а для каких только " +
                        "результаты флюрографии?",
                fontSize = 20.sp
            )}
        Card( // Ответ
            modifier = Modifier
                .padding(bottom = 5.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(10.dp)
        )
        {
            Text(
                modifier = Modifier
                    .padding(10.dp),
                text = "    1. Полное медицинское освидетельствование необходимо для следующих специальностей:\n\n" +
                        "       1.1. специальность 15.02.06 монтаж, техническая эксплуатация и ремонт холодильно-компрессорных " +
                "и теплонасосных машин и установок (по отраслям);\n\n" +
                        "       1.2. специальность 19.02.11 технология продуктов питания из растительного сырья;\n\n" +
                        "       1.3. специальность 19.02.12 технология продуктов питания животного происхождения;\n\n" +
                        "       1.4. специальность 20.02.04 пожарная безопасность;\n\n" +
                        "       1.5. специальность 36.02.01 ветеринарный фельдшер;\n\n" +
                        "       1.6. специальность 44.02.02 преподавание в начальных классах; \n\n" +
                        "       1.7. специальность 44.02.04 специальное дошкольное образование; \n\n" +
                        "       1.8. специальность 44.02.05 коррекционная педагогика в начальном образовании; \n\n" +
                        "       1.9. специальность 49.02.01 физическая культура; \n\n" +
                        "       1.10. специальность 49.02.02 адаптивная физическая культура.\n\n" +
                        "   2. Только результаты флюрографии необходимы:\n\n" +
                        "       2.1. специальность 09.02.07 Информационные системы и программирование;\n\n" +
                        "       2.2. специальность  15.02.17 монтаж, техническое обслуживание, эксплуатация и " +
                        "ремонт промышленного оборудования (по отраслям);\n\n" +
                        "       2.3. специальность 38.02.01 экономика и бухгалтерский учет (по отраслям);\n\n" +
                        "       2.4. специальность 40.02.04 юриспруденция.",
                fontSize = 20.sp)
        }
    }
}

@Composable
fun NachaloPriemDocumentov(navHostController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Card( // Вопрос
            modifier = Modifier
                .padding(top = 5.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(10.dp)
        )
        {
            Text(
                modifier = Modifier
                    .padding(10.dp)
                    .align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center,

                text = "Когда начинается прием документов?",
                fontSize = 20.sp
            )}
        Card( // Ответ
            modifier = Modifier
                .padding(bottom = 5.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(10.dp)
        )
        {
            Text(
                modifier = Modifier
                    .padding(10.dp),
                text = "Прием документов начинается 20 июня 2024 года (20.06.2024).",
                fontSize = 20.sp)
        }
    }
}

@Composable
fun EndPriemDocumentov(navHostController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Card( // Вопрос
            modifier = Modifier
                .padding(top = 5.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(10.dp)
        )
        {
            Text(
                modifier = Modifier
                    .padding(10.dp)
                    .align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center,
                text = "Когда заканчивается прием документов?",
                fontSize = 20.sp
            )}
        Card( // Ответ
            modifier = Modifier
                .padding(bottom = 5.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(10.dp)
        )
        {
            Text(
                modifier = Modifier
                    .padding(10.dp),
                text = "    На места в рамках контрольных цифр приема 15 августа 2024 года (15.08.2024)" +
                        " до 14:00;\n\n" +
                        "   на места по договорам об оказании платных образовательных услуг 24 августа 2024 года" +
                        " (24.08.2024) до 14:00.",
                fontSize = 20.sp)
        }
    }
}

@Composable
fun PrikazZachisleniya(navHostController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Card( // Вопрос
            modifier = Modifier
                .padding(top = 5.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(10.dp)
        )
        {
            Text(
                modifier = Modifier
                    .padding(10.dp)
                    .align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center,
                text = "Когда выходят приказы об зачислении?",
                fontSize = 20.sp
            )}
        Card( // Ответ
            modifier = Modifier
                .padding(bottom = 5.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(10.dp)
        )
        {
            Text(
                modifier = Modifier
                    .padding(10.dp),
                text = "    В рамках контрольных цифр приема - 16 августа 2024 (16.08.2024) после 12:00;\n\n" +
                        "   на места по договорам об оказании платных образовательных услуг 26 августа 2024 года" +
                        " (26.08.2024) после 12:00.",
                fontSize = 20.sp)
        }
    }
}

@Composable
fun EstLiIspitaniya(navHostController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Card( // Вопрос
            modifier = Modifier
                .padding(top = 5.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(10.dp)
        )
        {
            Text(
                modifier = Modifier
                    .padding(10.dp)
                    .align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center,
                text = "Есть ли вступительные испытания для поступления?",
                fontSize = 20.sp
            )}
        Card( // Ответ
            modifier = Modifier
                .padding(bottom = 5.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(10.dp)
        )
        {
            Text(
                modifier = Modifier
                    .padding(10.dp),
                text = "    1. Вступительные испытания для определения физических качеств абитуриентов:\n\n" +
                        "       1.1. специальность 20.02.04 пожарная безопасность;\n\n" +
                        "       1.2. специальность 49.02.01 физическая культура;\n\n" +
                        "       1.3. специальность 49.02.02 адаптивная физическая культура.\n\n" +
                        "   2. Вступительные испытания для определения психологических качеств абитуриентов:\n\n" +
                        "       2.1. специальность 44.02.02 преподавание в начальных классах;\n\n" +
                        "       2.2. специальность 44.02.04 специальное дошкольное образование;\n\n" +
                        "       2.3. специальность 44.02.05 коррекционная педагогика в начальном образовании.",
                fontSize = 20.sp)
        }
    }
}

@Composable
fun IspitaniyaFizKachestv(navHostController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Card( // Вопрос
            modifier = Modifier
                .padding(top = 5.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(10.dp)
        )
        {
            Text(
                modifier = Modifier
                    .padding(10.dp)
                    .align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center,
                text = "Что входит в испытания для определения физических качеств?",
                fontSize = 20.sp
            )}
        Card( // Ответ
            modifier = Modifier
                .padding(bottom = 5.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(10.dp)
        )
        {
            Text(
                modifier = Modifier
                    .padding(10.dp),
                text = "    1. бег на 100 (60) метров (юноши, девушки);\n\n" +
                        "   2. подтягивания из виса на высокой перекладине (юноши);\n\n" +
                        "   3. поднимание туловища из положения лежа на спине (количество раз в 1 мин.) (девушки);\n\n" +
                        "   4. кросс 2000 м (девушки);\n\n" +
                        "   5. кросс 3000 (2000) м (юноши).\n\n",
                fontSize = 20.sp)
        }
    }
}

@Composable
fun IspitaniyaPsihKachestv(navHostController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Card( // Вопрос
            modifier = Modifier
                .padding(top = 5.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(10.dp)
        )
        {
            Text(
                modifier = Modifier
                    .padding(10.dp)
                    .align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center,
                text = "Что входит в испытания для определения психологических качеств?",
                fontSize = 20.sp
            )}
        Card( // Ответ
            modifier = Modifier
                .padding(bottom = 5.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(10.dp)
        )
        {
            Text(
                modifier = Modifier
                    .padding(10.dp),
                text = "Тестирование по педагогике для определения базовых знаний по " +
                        "педагогической деятельности.",
                fontSize = 20.sp)
        }
    }
}

@Composable
fun ChisloFizKachestv(navHostController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Card( // Вопрос
            modifier = Modifier
                .padding(top = 5.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(10.dp)
        )
        {
            Text(
                modifier = Modifier
                    .padding(10.dp)
                    .align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center,
                text = "Какого числа проходят вступительные испытания для определения физических" +
                        " качеств?",
                fontSize = 20.sp
            )}
        Card( // Ответ
            modifier = Modifier
                .padding(bottom = 5.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(10.dp)
        )
        {
            Text(
                modifier = Modifier
                    .padding(10.dp),
                text = "    1. 12 августа 2024 (12.08.2024) в 9:00 - юноши;\n\n" +
                        "   2. 12 августа 2024 (12.08.2024) в 14:00 - девушки.",
                fontSize = 20.sp)
        }
    }
}

@Composable
fun ShisloPsihKachestv(navHostController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Card( // Вопрос
            modifier = Modifier
                .padding(top = 5.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(10.dp)
        )
        {
            Text(
                modifier = Modifier
                    .padding(10.dp)
                    .align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center,
                text = "Какого числа проходят вступительные испытания для определения психологических" +
                        " качеств?",
                fontSize = 20.sp
            )}
        Card( // Ответ
            modifier = Modifier
                .padding(bottom = 5.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(10.dp)
        )
        {
            Text(
                modifier = Modifier
                    .padding(10.dp),
                text = "12 августа 2024 (12.08.2024) в 9:00.",
                fontSize = 20.sp)
        }
    }
}