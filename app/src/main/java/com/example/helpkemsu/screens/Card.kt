package com.example.helpkemsu.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.helpkemsu.R

@Composable //эксплуатация внутренних сантехнических устройств, кондиционирования воздуха. вентиляции
fun conder(navHostController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    )
    {
        Card( // Название специальности
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
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
                text = "Специальность: 08.02.13\n" + "Эксплуатация внутренних сантехнических " +
                        "устройств, кондиционирования " + "воздуха. Вентиляции", fontSize = 20.sp
            )
        }
        Card( // Изображение
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.4f),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {
            Image(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .clip(RoundedCornerShape(10.dp)),
                painter = painterResource(id = R.drawable.conder),
                contentDescription = "08.02.13",
                contentScale = ContentScale.Crop
            )
        }
        Card(// Описание
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            colors = CardDefaults.cardColors(
                containerColor = Color.White),
        ){
            Text(
                modifier = Modifier
                    .padding(15.dp),
                text = "Квалификация - техник.\n" +
                        "\n" +
                        "Обучение по данной специальности включает в себя изучение:\n\n" +
                        "   - назначение и порядок применения инструментов, приборов, приспособлений, " +
                        "запасных частей и материалов, необходимых для ремонта, применять измерительное " +
                        "оборудование;\n\n" +
                        "   - отключение оборудования для технического обслуживания;\n" +
                        "   - выполнение ремонтных работ, наладку систем, устранении неисправностей;\n\n" +
                        "   - выполнение укрупненной разборки и сборки основного оборудования, монтажных " +
                        "узлов и блоков;\n\n" +
                        "   - проведение диагностики отдельных элементов, узлов и блоков систем вентиляции " +
                        "и кондиционирования;\n\n" +
                        "   - определение перечня необходимых для проведения работ расходных материалов," +
                        " инструментов, контрольно-измерительных приборов, трудоемкости и длительности" +
                        " работ по техническому обслуживанию и ремонту систем вентиляции и кондиционирования.\n" +
                        "\n\n" +
                        "Техник готовится:\n\n" +
                        "   - организовывать и контролировать выполнение работ по техническому обслуживанию " +
                        "и ремонту систем вентиляции и кондиционирования силами подчиненных;\n\n" +
                        "   - разрабатывать сопутствующую техническую документацию при проведении работ по " +
                        "техническому обслуживанию и ремонту систем вентиляции и кондиционирования;\n\n" +
                        "   - оформлять документацию по техническому обслуживанию и эксплуатации, выявлять " +
                        "признаки нештатной работы оборудования.\n" +
                        "\n\n" +
                        "Область профессиональной деятельности:\n\n" +
                        "   - строительство и жилищно-коммунальное хозяйство;\n\n" +
                        "   - сквозные виды профессиональной деятельности в промышленности.\n" +
                        "\n" +
                        "Специальность входит в перечень 50-ти новых, перспективных и наиболее " +
                        "востребованных на рынке труда.\n" +
                        "\n" +
                        "Студенты, желающие продолжить образование, могут это сделать в Кемеровском " +
                        "государственном университете, без обязательной сдачи ЕГЭ. Прием осуществляется" +
                        " по внутренним вступительным испытаниям.\n" +
                        "\n" +
                        "Срок обучения на базе основного общего образования (9 классов) - 2 года 10 " +
                        "месяцев.\n" +
                        "\n" +
                        "Для поступающих медицинская справка не требуется. Абитуриенты предъявляют " +
                        "лишь результаты флюорографии.\n" +
                        "\n" +
                        "Для зачисления учитывается только средний балл аттестата. Вступительные " +
                        "испытания не предусмотрены.", softWrap = true, fontSize = 20.sp)
        }
    }
}

@Composable //Информационные системы и программирование
fun infSys(navHostController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    )
    {
        Card( //Название специальности
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
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
                text = "Специальность: 09.02.07\n" +
                        "Информационные системы и " + "программирование ",
                fontSize = 20.sp
            )
        }
        Card( // Изображение
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.4f)
                .padding(),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {
            Image(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .clip(RoundedCornerShape(10.dp)),
                painter = painterResource(id = R.drawable.infsys),
                contentDescription = "08.02.13",
                contentScale = ContentScale.Crop
            )
        }
        Card(// Описание
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            colors = CardDefaults.cardColors(
                containerColor = Color.White)
        ){
            Text(
                modifier = Modifier
                    .padding(15.dp),
                text = "Квалификация - программист.\n\n" +

                        "Специальность охватывает достаточно широкий спектр сфер профессиональной " +
                        "деятельности. На данном направлении изучают современные технологии " +
                        "проектирования и создания макетов сайтов. Изучаются инструменты 3D " +
                        "моделирования. Разработчики WEB и мультимедийных приложений получают " +
                        "богатый опыт в реализации адаптивной верстки сайтов под мобильные, " +
                        "планшетный и компьютерные устройства. Данная специализация позволяет " +
                        "стать профессиональным программистом для создания Web-приложений, " +
                        "корпоративных сайтов и Интернет-магазинов.\n\n" +
                        "Специальность входит в перечень 50-ти новых, перспективных и наиболее " +
                        "востребованных на рынке труда.\n" +
                        "\n" +
                        "Студенты, желающие продолжить образование, могут это сделать в Кемеровском " +
                        "государственном университете, без обязательной сдачи ЕГЭ. Прием " +
                        "осуществляется по внутренним вступительным испытаниям.\n" +
                        "\n" +
                        "Срок обучения (очная форма): \n" +
                        "   - на базе 9 классов - 3 года 10 месяцев;\n" +
                        "   - на базе 11 классов - 2 года 10 месяцев.\n" +
                        "\n" +
                        "Для поступления учитывается только средний балл аттестата. Вступительные " +
                        "испытания не предусмотрены\n" +
                        "\n" +
                        "Медицинская справка не требуется. Необходимы лишь результаты действующей " +
                        "флюорографии", fontSize = 20.sp)
        }
    }
}

@Composable //Монтаж и техническая эксплуатация холодильно-компрессорных машин и установок (по отраслям)
fun holodos(navHostController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    )
    {
        Card( // Название специальности
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
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
                text = "Специальность: 15.02.06\n" + "Монтаж и техническая эксплуатация " +
                        "холодильно-компрессорных машин и установок (по отраслям)", fontSize = 20.sp
            )
        }
        Card( // Изображение
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.4f)
                .padding(),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {
            Image(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .clip(RoundedCornerShape(10.dp)),
                painter = painterResource(id = R.drawable.holodos),
                contentDescription = "08.02.13",
                contentScale = ContentScale.Crop
            )
        }
        Card(// Описание
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            colors = CardDefaults.cardColors(
                containerColor = Color.White)
        ){
            Text(
                modifier = Modifier
                    .padding(15.dp),
                text = "Квалификация - техник.\n" +
                        "\n" +
                        "Техник по монтажу и технической эксплуатации холодильно-компрессорных и " +
                        "теплонасосных машин и установок это руководитель среднего звена управления " +
                        "производством или специалист по эксплуатации технологического оборудования.\n" +
                        "\n" +
                        "Техник может проводить работы по монтажу, настройке, наладке и обеспечению " +
                        "безаварийной и надёжной работы холодильно-компрессорных машин и установок " +
                        "на предприятиях торговли, общественного питания, агропромышленного комплекса," +
                        " а так же проводить монтаж и обеспечивать безаварийную эксплуатацию систем " +
                        "кондиционирования воздуха, как в промышленных, так и в бытовых помещениях.\n" +
                        "\n" +
                        "Основные практические навыки студенты приобретают на лабораторных и " +
                        "практических занятиях, в учебно-производственных мастерских, на производственной " +
                        "практике, которая проходит на промышленных предприятиях города Кемерово и Кемеровской области.\n" +
                        "\n" +
                        "Сочетание теоретических занятий и практики позволяет выпускникам не " +
                        "только получить квалификацию техника, но и рабочую профессию, что " +
                        "существенно повышает конкурентоспособность выпускника на рынке труда.\n" +
                        "\n" +
                        "Техник может работать бригадиром, начальником участка на промышленном " +
                        "предприятии, а может работать индивидуально по техническому обслуживанию " +
                        "бытовых холодильников и кондиционеров.\n" +
                        "\n" +
                        "Студенты, желающие продолжить образование, могут это сделать в Кемеровском " +
                        "государственном университете, без обязательной сдачи ЕГЭ. Прием осуществляется " +
                        "по внутренним вступительным испытаниям.\n" +
                        "\n" +
                        "Срок обучения на базе основного общего образования (9 классов) - 3 года 10 " +
                        "месяцев.\n" +
                        "\n" +
                        "Для поступающих обязательно наличие справки о прохождении медицинского " +
                        "осмотра как при трудоустройстве.\n" +
                        "\n" +
                        "Для зачисления учитывается только средний балл аттестата. Вступительные " +
                        "испытания не предусмотрены.", fontSize = 20.sp)
        }
    }
}

@Composable //Монтаж, техническое обслуживание, эксплуатация и ремонт промышленного оборудования (по отраслям)
fun promOborydovanie(navHostController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    )
    {
        Card( // Название специальности
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
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
                text = "Специальность: 15.02.17\n" + "Монтаж, техническое обслуживание, " +
                        "эксплуатация и ремонт промышленного оборудования (по отраслям)", fontSize = 20.sp
            )
        }
        Card( // Изображение
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.4f)
                .padding(),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {
            Image(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .clip(RoundedCornerShape(10.dp)),
                painter = painterResource(id = R.drawable.promoborydovanie),
                contentDescription = "08.02.13",
                contentScale = ContentScale.Crop
            )
        }
        Card(// Описание
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            colors = CardDefaults.cardColors(
                containerColor = Color.White)
        ){
            Text(
                modifier = Modifier
                    .padding(15.dp),
                text = "Квалификация - техник-механик.\n" +
                        "\n" +
                        "Техник-механик по монтажу и технической эксплуатации промышленного " +
                        "оборудования это руководитель среднего звена управления производством или " +
                        "специалист по эксплуатации технологического оборудования. Он может работать " +
                        "бригадиром, мастером, начальником участка на промышленном предприятии, а " +
                        "может работать индивидуально по техническому обслуживанию различных агрегатов," +
                        " машин и механизмов.\n" +
                        "\n" +
                        "Специальность входит в перечень 50-ти новых, перспективных и наиболее " +
                        "востребованных на рынке труда.\n" +
                        "\n" +
                        "Студенты, желающие продолжить образование, могут это сделать в Кемеровском " +
                        "государственном университете, без обязательной сдачи ЕГЭ. Прием осуществляется по внутренним вступительным испытаниям.\n" +
                        "\n" +
                        "Срок обучения на базе основного общего образования (9 классов) - 3 года 10 " +
                        "месяцев.\n" +
                        "\n" +
                        "Для поступающих медицинская справка не требуется. Абитуриенты предъявляют " +
                        "лишь результаты флюорографии.\n" +
                        "\n" +
                        "Для зачисления учитывается только средний балл аттестата. Вступительные " +
                        "испытания не предусмотрены.", fontSize = 20.sp)
        }
    }
}

@Composable //Технология продуктов питания из растительного сырья
fun rastSirie(navHostController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    )
    {
        Card( //Название специальности
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
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
                text = "Специальность: 19.02.11\n" + "Технология продуктов питания из " +
                        "растительного сырья", fontSize = 20.sp
            )
        }
        Card( // Изображение
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.4f)
                .padding(),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {
            Image(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .clip(RoundedCornerShape(10.dp)),
                painter = painterResource(id = R.drawable.rastsirie),
                contentDescription = "08.02.13",
                contentScale = ContentScale.Crop
            )
        }
        Card(// Описание
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            colors = CardDefaults.cardColors(
                containerColor = Color.White)
        ){
            Text(
                modifier = Modifier
                    .padding(15.dp),
                text = "Квалификация - техник-технолог\n" +
                        "\n" +
                        "Профессиональные знания и умения, полученные в процессе обучения по " +
                        "специальности помогут построить успешную карьеру в развитии хлебопекарного " +
                        "и макаронного производства, освоить высокоэффективные технологии в данных " +
                        "областях, выполнять элементы дизайна при производстве кондитерских изделий.\n" +
                        "\n" +
                        "Обучение студентов проводится в специально оборудованных лабораториях и " +
                        "аудиториях, в учебно-производственном центре. Кроме изучения образовательных " +
                        "дисциплин и профессиональных модулей, осуществляется прохождение различных " +
                        "видов практик на профильных предприятиях.\n" +
                        "\n" +
                        "Выпускники могут работать на предприятиях хлебопекарного, макаронного и " +
                        "кондитерского производств, на должностях: техник-технолог, начальник цеха, " +
                        "начальник смены, микробиолог, старший мастер, мастер смены, и т.д.\n" +
                        "\n" +
                        "Студенты, желающие продолжить образование, могут это сделать в Кемеровском " +
                        "государственном университете, без обязательной сдачи ЕГЭ. Прием осуществляется" +
                        " по внутренним вступительным испытаниям.\n" +
                        "\n" +
                        "Срок обучения на базе основного общего образования (9 классов) - 3 года 10 " +
                        "месяцев.\n" +
                        "\n" +
                        "Для поступающих обязательно наличие справки о прохождении медицинского " +
                        "осмотра как при трудоустройстве .\n" +
                        "\n" +
                        "Для зачисления учитывается только средний балл аттестата. Вступительные " +
                        "испытания не предусмотрены.", fontSize = 20.sp)
        }
    }
}

@Composable //технология продуктов питания животного происхождения.
fun animalProis(navHostController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    )
    {
        Card( // Название специальности
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
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
                text = "Специальность: 19.02.12\n" + "технология продуктов питания животного " +
                        "происхождения.", fontSize = 20.sp
            )
        }
        Card( // Изображение
            modifier = Modifier //Изображение
                .fillMaxWidth()
                .fillMaxHeight(0.4f)
                .padding(),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {
            Image(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .clip(RoundedCornerShape(10.dp)),
                painter = painterResource(id = R.drawable.animalprois),
                contentDescription = "08.02.13",
                contentScale = ContentScale.Crop
            )
        }
        Card(// Описание
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            colors = CardDefaults.cardColors(
                containerColor = Color.White)
        ){
            Text(
                modifier = Modifier
                    .padding(15.dp),
                text = "Квалификация - техник-технолог.\n" +
                        "\n" +
                        "В процессе обучения будущие техники-технологи осваивают технологические " +
                        "процессы производства мясных и молочных продуктов, контролируют качество " +
                        "сырья и полуфабрикатов, изучают работу технологического оборудования в " +
                        "различных цехах, разрабатывают меры по оптимизации процессов производства " +
                        "продукции и ведут учетно-отчетную документацию.\n" +
                        "\n" +
                        "Студенты специальности стажируются на предприятиях пищевой промышленности," +
                        " где в качестве помощников технологов знакомятся с тонкостями производства," +
                        " учатся наблюдать и контролировать производственные процессы.\n" +
                        "\n" +
                        "После окончания выпускники могут организовывать собственную деятельность," +
                        " определять методы и способы выполнения профессиональных задач, оценивать " +
                        "эффективность и качество, решать проблемы, оценивать и принимать решения в" +
                        " нестандартных ситуациях.\n" +
                        "\n" +
                        "По окончании обучения по данной специальности выпускники могут работать в " +
                        "качестве начальника смены, начальников производственных цехов, мастера смены," +
                        " техника-лаборанта, микробиолога, контролера готовой продукции, сменного " +
                        "технолога, заведующего производством.\n" +
                        "\n" +
                        "Студенты, желающие продолжить образование, могут это сделать в Кемеровском" +
                        " государственном университете, без обязательной сдачи ЕГЭ. Прием осуществляется" +
                        " по внутренним вступительным испытаниям.\n" +
                        "\n" +
                        "Срок обучения на базе основного общего образования (9 классов) - 3 года 10 " +
                        "месяцев.\n" +
                        "\n" +
                        "Для поступающих обязательно наличие справки о прохождении медицинского " +
                        "осмотра как при трудоустройстве.\n" +
                        "\n" +
                        "Для зачисления учитывается только средний балл аттестата. Вступительные " +
                        "испытания не предусмотрены.", fontSize = 20.sp)
        }
    }
}

@Composable //Пожарная безопасность
fun fire(navHostController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    )
    {
        Card( // Название специальности
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
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
                text = "Специальность: 20.02.04\n" + "Пожарная безопасность", fontSize = 20.sp
            )
        }
        Card( // Изображение
            modifier = Modifier //Изображение
                .fillMaxWidth()
                .fillMaxHeight(0.4f)
                .padding(),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {
            Image(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .clip(RoundedCornerShape(10.dp)),
                painter = painterResource(id = R.drawable.fire),
                contentDescription = "08.02.13",
                contentScale = ContentScale.Crop
            )
        }
        Card(// Описание
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            colors = CardDefaults.cardColors(
                containerColor = Color.White)
        ){
            Text(
                modifier = Modifier
                    .padding(15.dp),
                text = "Квалификация - специалист по пожарной безопасности.\n" +
                        "\n" +
                        "Выпускники этой специальности разрабатывают мероприятия по обеспечению " +
                        "пожарной безопасности, проводят обследования и целевые проверки действующих, " +
                        "строящихся и реконструируемых объектов; организуют тушение пожаров и " +
                        "проведение связанных с ними первоочередных аварийно-спасательных работ.\n" +
                        "\n" +
                        "Сочетание теоретических занятий и практики в действующих частях Федеральной " +
                        "противопожарной службы позволяет выпускникам не только получить квалификацию " +
                        "техника в области пожарной безопасности, но и рабочую профессию, что " +
                        "существенно повышает конкурентоспособность выпускника на рынке труда.\n" +
                        "\n" +
                        "Выпускники этой специальности могут работать инспекторами пожарной безопасности, " +
                        "проводить монтаж и обеспечивать эксплуатацию систем пожарной безопасности, " +
                        "служить в частях пожарной охраны.\n" +
                        "\n" +
                        "Студенты, желающие продолжить образование, могут это сделать в Кемеровском " +
                        "государственном университете, без обязательной сдачи ЕГЭ. Прием осуществляется " +
                        "по внутренним вступительным испытаниям.\n" +
                        "\n" +
                        "Срок обучения на базе основного общего образования (9 классов) - 3 года 10 " +
                        "месяцев.\n" +
                        "\n" +
                        "Для поступающих обязательно наличие справки о прохождении медицинского " +
                        "осмотра как при трудоустройстве на работу.\n" +
                        "\n" +
                        "Для зачисления учитывается средний балл аттестата, а также сдача Вступительных " +
                        "испытаний по общей физической подготовке.\n" +
                        "\n" +
                        "По окончании срока обучения каждый выпускник специальности должен иметь " +
                        "водительское удостоверение категории \"В\".\n" +
                        "\n" +
                        "Вступительные испытания проводятся в форме сдачи нормативов по общей " +
                        "физической подготовке:\n" +
                        "1) юноши:\n" +
                        "- подтягивание;\n" +
                        "- бег 100 метров (для абитуриентов младше 16 лет - бег 60 метров);\n" +
                        "- кросс 3000 метров.\n" +
                        "2) девушки:\n" +
                        "- поднимание туловища из положения лежа (количество раз за минуту);\n" +
                        "- бег 100 метров (для абитуриентов младше 16 лет - бег 60 метров);\n" +
                        "- кросс 2000 метров.\n" +
                        "\n" +
                        "Испытания проводятся - 12 августа:\n" +
                        "\n" +
                        "9:00 - консультация, вступительные испытания (юноши);\n" +
                        "14:00 - консультация, вступительные испытания (девушки).\n" +
                        "\n" +
                        "Результаты вступительных испытаний по специальности 20.02.04 «Пожарная " +
                        "безопасность» оцениваются по зачетной системе.\n" +
                        "\n" +
                        "Результаты вступительного испытания объявляются на официальном сайте и на " +
                        "информационном стенде - не позднее следующего рабочего дня после проведения " +
                        "вступительного испытания.", fontSize = 20.sp)
        }
    }
}

@Composable //Ветеринарный фельдшер
fun animalDoctor(navHostController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    )
    {
        Card( // Название специальности
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
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
                text = "Специальность: 36.02.01\n" + "Ветеринарный фельдшер", fontSize = 20.sp
            )
        }
        Card( // Изображение
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.4f)
                .padding(),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {
            Image(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .clip(RoundedCornerShape(10.dp)),
                painter = painterResource(id = R.drawable.animaldoctor),
                contentDescription = "08.02.13",
                contentScale = ContentScale.Crop
            )
        }
        Card(// Описание
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            colors = CardDefaults.cardColors(
                containerColor = Color.White)
        ){
            Text(
                modifier = Modifier
                    .padding(15.dp),
                text = "Квалификация - ветеринарный фельдшер\n" +
                        "\n" +
                        "Ветеринарный фельдшер действует под руководством ветеринара или зоотехника. " +
                        "Его работа может быть очень разнообразна, но в основном он проводит " +
                        "профилактические мероприятия (прививки, контроль санитарного состояния " +
                        "помещений, кормов и т.д.) и оказывает медицинскую помощь самым разным видам " +
                        "животных (в том числе птицам и рыбам). Ветеринарный фельдшер контролирует " +
                        "производство и реализацию продуктов животноводства, проводит предубойный " +
                        "осмотр скота, оказывает акушерскую помощь животным, проводит косметические " +
                        "хирургические операции и выполняет другие действия, которые во многом зависят " +
                        "от его места работы.\n" +
                        "\n" +
                        "Студенты, желающие продолжить образование, могут это сделать в Кемеровском " +
                        "государственном университете, без обязательной сдачи ЕГЭ. Прием осуществляется " +
                        "по внутренним вступительным испытаниям.\n" +
                        "\n" +
                        "Срок обучения на базе полного общего образования (11 классов) - 2 года 10 " +
                        "месяцев.\n" +
                        "\n" +
                        "Для поступающих обязательно наличие справки о прохождении медицинского " +
                        "осмотра как при трудоустройстве.\n" +
                        "\n" +
                        "Для зачисления учитывается только средний балл аттестата. Вступительные " +
                        "испытания не предусмотрены.", fontSize = 20.sp)
        }
    }
}

@Composable //Экономика и бухгалтерский учет
fun byhYchet(navHostController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    )
    {
        Card( // Название специальности
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
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
                text = "Специальность: 38.02.01\n" + "Экономика и бухгалтерский учет",
                fontSize = 20.sp
            )
        }
        Card( // Изображение
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.4f)
                .padding(),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {
            Image(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .clip(RoundedCornerShape(10.dp)),
                painter = painterResource(id = R.drawable.byhychet),
                contentDescription = "08.02.13",
                contentScale = ContentScale.Crop
            )
        }
        Card(// Описание
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.9f),
            colors = CardDefaults.cardColors(
                containerColor = Color.White)
        ){
            Text(
                modifier = Modifier
                    .padding(15.dp),
                text = "Квалификация - бухгалтер.\n" +
                        "\n" +
                        "Эта специальность наиболее современна и практична. Сегодня нужны " +
                        "экономисты, которые могут быстро адаптироваться в нестандартных ситуациях " +
                        "и новых условиях рыночных отношений. Студенты имеют уникальную возможность " +
                        "проходить обучение с использованием современных технических средств " +
                        "обучения. В процессе обучения широко используются профессиональные " +
                        "программы «1С бухгалтерия», правовые программы «Консультант плюс», «Гарант» и др.\n" +
                        "\n" +
                        "Специальность позволяет работать в финансовых подразделениях и организациях " +
                        "всех видов собственности.\n" +
                        "\n" +
                        "Выпускники этого направления могут занимать должности бухгалтеров, " +
                        "экономистов, финансовых аналитиков, налоговых инспекторов, специалистов " +
                        "по бюджетированию, аудиторов.\n" +
                        "\n" +
                        "Студенты, желающие продолжить образование, могут это сделать в Кемеровском " +
                        "технологическом институте пищевой промышленности в рамках системы непрерывного " +
                        "образования.\n" +
                        "\n" +
                        "Срок обучения очная форма обучения:\n" +
                        "- очная форма обучения на базе 11 классов - 1 год 10 месяцев\n" +
                        "\n" +
                        "Срок обучения заочная форма обучения на базе 11 классов - 2 года 10 месяцев\n" +
                        "\n" +
                        "При поступлении учитывается только средний балл аттестата. Вступительные " +
                        "испытания отсутствуют.\n" +
                        "\n" +
                        "Медицинская справка не требуется. Необходимо предъявить действующие " +
                        "результаты флюорографии", fontSize = 20.sp)
        }
    }
}

@Composable //Юриспруденция
fun yourist(navHostController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    )
    {
        Card( // Название специальности
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
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
                text = "Специальность: 40.02.04\n" + "Юриспруденция", fontSize = 20.sp
            )
        }
        Card( // Изображение
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.4f)
                .padding(),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {
            Image(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .clip(RoundedCornerShape(10.dp)),
                painter = painterResource(id = R.drawable.yourist),
                contentDescription = "08.02.13",
                contentScale = ContentScale.Crop
            )
        }
        Card(// Описание
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            colors = CardDefaults.cardColors(
                containerColor = Color.White)
        ){
            Text(
                modifier = Modifier
                    .padding(15.dp),
                text = "Квалификация - юрист.\n" +
                        "\n" +
                        "Выпускники специальности должны быть неравнодушны к проблемам других " +
                        "людей и готовы следовать высоким морально - этическим стандартам " +
                        "поведения. Выпускники специальности могут занимать должности помощника " +
                        "юриста, младшего юриста, специалиста юридического отдела, а также могут " +
                        "работать в комитетах по соцзащите, центрах социального обслуживания, " +
                        "пенсионных фондах, паспортных столах. Также могут работать в правоохранительных " +
                        "органах, органах судебной системы, органах государственной и муниципальной " +
                        "власти, юридических организациях, кадровых службах организаций, исправительных " +
                        "учреждениях Министерства юстиции РФ.\n" +
                        "\n" +
                        "Студенты, желающие продолжить образование, могут это сделать в Кемеровском " +
                        "государственном университете, без обязательной сдачи ЕГЭ. Прием осуществляется " +
                        "по внутренним вступительным испытаниям.\n" +
                        "\n" +
                        "Срок обучения на базе основного общего образования (9 классов) - 2 года 10 " +
                        "месяцев.\n" +
                        "\n" +
                        "Срок обучения на базе среднего общего образования (11 классов) - 1 год 10 " +
                        "месяцев.\n" +
                        "\n" +
                        "Срок обучения на базе среднего общего образования (11 классов) заочной формы " +
                        "обучения - 2 года 10 месяцев.\n" +
                        "\n" +
                        "Для поступающих наличие медицинской справки не требуется. Необходимы " +
                        "действующие результаты флюорографии.\n" +
                        "\n" +
                        "Для зачисления учитывается только средний балл аттестата. " +
                        "Вступительные испытания не предусмотрены.", fontSize = 20.sp)
        }
    }
}

@Composable //Поварское и кондитерское дело
fun pooovar(navHostController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    )
    {
        Card( // Название специальности
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
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
                text = "Специальность: 43.02.15\n" + "Поварское и кондитерское дело",
                fontSize = 20.sp
            )
        }
        Card( // Картинка
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.4f)
                .padding(),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {
            Image(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .clip(RoundedCornerShape(10.dp)),
                painter = painterResource(id = R.drawable.pooovar),
                contentDescription = "08.02.13",
                contentScale = ContentScale.Crop
            )
        }
        Card(// Описание
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            colors = CardDefaults.cardColors(
                containerColor = Color.White)
        ){
            Text(
                modifier = Modifier
                    .padding(15.dp),
                text = "Квалификация - специалист по поварскому и кондитерскому делу.\n" +
                        "\n" +
                        "Область профессиональной деятельности выпускника:\n" +
                        "- сервис, оказание услуг населению (торговля, техническое обслуживание, " +
                        "ремонт, предоставление персональных услуг, услуги гостеприимства, " +
                        "общественное питание и пр.).\n" +
                        "\n" +
                        "Видом профессиональной деятельности в соответствии с профессиональными " +
                        "стандартами «Повар» и «Кондитер» является производство блюд, напитков, " +
                        "кулинарных и кондитерских изделий в организациях питания.\n" +
                        "\n" +
                        "Объектами профессиональной деятельности выпускников являются процессы " +
                        "приготовления, оформления и подготовки к реализации блюд, кулинарных и " +
                        "кондитерских изделий, закусок, напитков сложного ассортимента с учетом " +
                        "потребностей различных категорий потребителей, видов и форм обслуживания.\n" +
                        "\n" +
                        "Возможные наименования должностей выпускников: бригадир поваров, кондитеров, " +
                        "старший повар/кондитер, су-шеф. Возможные места работы: кухни гостиниц, " +
                        "ресторана и других типов организаций питания; специализированные цеха, имеющие " +
                        "функции кулинарного производства и изготовления полуфабрикатов или изготовления " +
                        "хлебобулочных, мучных кондитерских изделий; мучные и кондитерские цеха при " +
                        "организациях питания.\n" +
                        "\n" +
                        "Специальность входит в перечень 50-ти новых, перспективных и наиболее " +
                        "востребованных на рынке труда.\n" +
                        "\n" +
                        "Студенты, желающие продолжить образование, могут это сделать в Кемеровском " +
                        "государственном университете, без обязательной сдачи ЕГЭ. Прием осуществляется " +
                        "по внутренним вступительным испытаниям.\n" +
                        "\n" +
                        "Срок обучения на базе основного общего образования (9 классов) - 3 года 10 " +
                        "месяцев.\n" +
                        "\n" +
                        "Для поступающих обязательно наличие справки о прохождении медицинского " +
                        "осмотра как при трудоустройстве.\n" +
                        "\n" +
                        "Для зачисления учитывается только средний балл аттестата. Вступительные " +
                        "испытания не предусмотрены.", fontSize = 20.sp)
        }
    }
}

@Composable //Специальное дошкольное образование
fun children(navHostController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    )
    {
        Card( // Название специальности
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
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
                text = "Специальность: 44.02.04\n" + "Специальное дошкольное образование.",
                fontSize = 20.sp
            )
        }
        Card( // Изображение
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.4f)
                .padding(),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {
            Image(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .clip(RoundedCornerShape(10.dp)),
                painter = painterResource(id = R.drawable.children),
                contentDescription = "08.02.13",
                contentScale = ContentScale.Crop
            )
        }
        Card(// Описание
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            colors = CardDefaults.cardColors(
                containerColor = Color.White)
        ){
            Text(
                modifier = Modifier
                    .padding(15.dp),
                text = "Квалификация - воспитатель детей дошкольного возраста с отклонениями в" +
                        " развитии и с сохранным развитием.\n" +
                        "\n" +
                        "Воспитатели детей дошкольного возраста со средним профессиональным " +
                        "образованием востребованы в дошкольных образовательных организациях " +
                        "разных видов (общеразвивающие, комбинированные, компенсирующие), в " +
                        "частных детских садах, в детских образовательных и игровых центрах, в " +
                        "учреждениях здравоохранения (санатории, стационары), в которых открыты " +
                        "группы для детей раннего и дошкольного возраста, в санаториях и профилакториях.\n" +
                        "\n" +
                        "Студенты, желающие продолжить образование, могут это сделать в Кемеровском " +
                        "государственном университете, без обязательной сдачи ЕГЭ. Прием осуществляется " +
                        "по внутренним вступительным испытаниям.\n" +
                        "\n" +
                        "Срок обучения на базе основного общего образования (9 классов) - 3 года 10 " +
                        "месяцев.\n" +
                        "\n" +
                        "Для поступающих обязательно наличие справки о прохождении медицинского " +
                        "осмотра как при трудоустройстве.\n" +
                        "\n" +
                        "Для зачисления учитывается средний балл аттестата, а также результаты " +
                        "вступительных испытаний по педагогике (тестирование).\n" +
                        "10 августа в 14:00 консультация.\n" +
                        "12 августа в 9:00 вступительные испытания"
                        ,fontSize = 20.sp)
        }
    }
}

@Composable //Физическая культура
fun fizruk(navHostController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    )
    {
        Card( // Название специальности
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
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
                text = "Специальность: 49.02.01\n" + "Физическая культура", fontSize = 20.sp
            )
        }
        Card( // Изображение
            modifier = Modifier //Изображение
                .fillMaxWidth()
                .fillMaxHeight(0.4f)
                .padding(),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {
            Image(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .clip(RoundedCornerShape(10.dp)),
                painter = painterResource(id = R.drawable.fizruk),
                contentDescription = "08.02.13",
                contentScale = ContentScale.Crop
            )
        }
        Card(// Описание
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            colors = CardDefaults.cardColors(
                containerColor = Color.White)
        ){
            Text(
                modifier = Modifier
                    .padding(15.dp),
                text = "Квалификация - педагог по физической культуре и спорту.\n" +
                        "\n" +
                        "В процессе обучения студенты учатся проводить учебные занятия по физической " +
                        "культуре, а также изучают внеклассную спортивную массовую работу с " +
                        "детьми разного возраста. Особое внимание уделяется умению оценивать " +
                        "физические способности обучающихся и правильно подбирать средства и " +
                        "методы двигательной деятельности, учитывая их индивидуальные особенности. " +
                        "Выпускники данной специальности могут проводить тренировочные занятия по " +
                        "какому-либо виду спорта в детско-юношеском спорте и со спортсменами массовых " +
                        "разрядов.\n" +
                        "\n" +
                        "Сферы возможного трудоустройства: дошкольные и школьные отделения " +
                        "общеобразовательных организаций, образовательные организации, центры " +
                        "развития ребенка, центры игровой поддержки ребенка, детско-юношеские " +
                        "центры, учебно-спортивные центры, спортивные школы, фитнес центры.\n" +
                        "\n" +
                        "Студенты, желающие продолжить образование, могут это сделать в Кемеровском " +
                        "государственном университете, без обязательной сдачи ЕГЭ. Прием осуществляется " +
                        "по внутренним вступительным испытаниям.\n" +
                        "\n" +
                        "Срок обучения на базе основного общего образования (9 классов) - 3 года 10 " +
                        "месяцев.\n" +
                        "\n" +
                        "Для поступающих обязательно наличие справки о прохождении медицинского " +
                        "осмотра как при трудоустройстве.\n" +
                        "\n" +
                        "Для зачисления учитывается средний балл аттестата, а также результаты " +
                        "вступительных испытаний по общей физической подготовке.", fontSize = 20.sp)
        }
    }
}