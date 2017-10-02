package com.example.lenovopc.myquiz;

public class Questions {

    public  String  mQuestions[]= {
            "Which retired tennis player is the husband of retired tennis player Steffi Graf ?",
            "Krishna Poonia is associated with ?",
            "Plants receive their nutrients mainly from ?",
            "Who suggested that most of the mass of the atom is located in the nucleus ?",
            "Which planet is known as the Red planet ?",
            "Which player has scored the most runs in a single Test inning ?",
            "Is it possible to have an activity without UI to perform action/actions ?",
            "What is the life cycle of services in android ?",
            "How to stop the services in android ?",
            "What is singleton class in android ?",
            "What is JSON in android ?",
            "Who is the founder of Android ?",
            "Which year Google Accuied Android ?",
            "What  is an android ?",
            "Layouts in Android ?",
            "What are the indirect Direct subclasses of Services ?",
            "Once installed on a device, each Android application lives in_______?",
            "Parent class of Activity ?"

    };

    private String mChoices[][]={
            {"David Wheaton", "Andre Agassi", "Boris Becker", "Pete Sampras"},
            {"Football", "Hockey", "Chess", "Athletics"},
            {"Soil", "Light", "Atmosphere", "Chlorophyll"},
            {"Thomas", "Bohr", "Rutherford", "Einstien"},
            {"Jupiter", "Venus", "Earth", "Mars"},
            {"Graham Gooch", "Matthew Hayden", "Brian Lara", "Ajit Agarkar"},
            {"Not possible","Wrong Question","Yes, possible","None of the above"},
            {"onDestory()","Final()","onReveieve","Same as Activity Cycle"},
            {"finish()","system.exit()","By manually","stopSelf and StopService"},
            {"Class with single object","Anonymous Class","Java Class", "Manifest file"},
            {"Java Script Object Native"," JS Oriented Notation","Java Script Object Notation","None of Above"},
            {"Andy Rubin","Larry Page","Sergey Brin","Eric Schmidt"},
            {"2002","2003","2004","2005"},
            {"OS for winndows","OS for Mac","OS for iphone","Mobile operating System" },
            {"Relaative Layout","Frame Layout","Linear Layout","All of the above"},
            {" recognitionService","remoteViewsService","spellCheckerService","inputMethodService"},
            {"device memory"," external memory","security sandbox","none of the above"},
            {"object"," contextThemeWrapper","context","activityGroup"}
    };


    private String mCorrectAnswers[]= {"Andre Agassi","Athletics","Soil","Rutherford","Mars","Brian Lara","Yes, possible","onDestory()","stopSelf and StopService","Class with single object",
            "JS Object Notation","Andy Rubin","2005","Mobile operating System","All of the above","inputMethodService","security sandbox"," contextThemeWrapper"};

    public String getQuestion(int a){
       String question= mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice=mChoices[a][0];
        return choice;
    }


    public String getChoice2(int a){
        String choice=mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a){
        String choice=mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a){
        String choice=mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
       String answer=mCorrectAnswers[a];
        return answer;

    }
}
