package com.example.helpkemsu.botton_navigation

import com.example.helpkemsu.R

sealed class BottomItem(val title: String, val iconId: Int, val route: String){
    object WindowInfoProgram: BottomItem("Сведения", R.drawable.sved, "WindowInfoProgram")
    object WindowBaseTraining: BottomItem("Список", R.drawable.menu, "WindowBaseTraining")
    object SocialNetwork: BottomItem("Социальные сети", R.drawable.soc, "SocialNetwork")
}
sealed class Screen(val route: String){
    object WindowBaseTraining : Screen("windowBaseTraining")
    object WindowShowSpecialtiesForThe9thGrade : Screen("WindowShowSpecialtiesForThe9thGrade")
    object WindowShowSpecialtiesForThe11thGrade : Screen("windowShowSpecialtiesForThe11thGrade")
    object WindowShowQuestionsAdmissionsCommittee : Screen("WindowShowQuestionsAdmissionsCommittee")

}