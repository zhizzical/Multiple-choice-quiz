public class Question {

    //here we use private access modifiers
    private String question;
    private String[] options;  //options are given in string because they may contain numbers or texts
    private char answer; //answers are given in char because we only use A,B,C or D

    //if we don't the constructor we'd have to write the order for each question
    public Question(String question, String[] options, char answer) {  //the constructor sets the order for the object we create in Main
        this.question = question; //the parameter transfers info from Main to the attribute
        this.options = options;
        this.answer = answer;
    }

    public String getQuestion(){  //the getter method
        return question;  //returns the value of question so we can have access to it in Main
    }
    public String[] getOptions(){
        return options; //returns the values of options. allows us to access it in Main
    }
    public char getAnswer(){
        return answer; //return the correct answer. allows us to access it in Main
    }


}
