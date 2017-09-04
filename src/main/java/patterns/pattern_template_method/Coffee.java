package patterns.pattern_template_method;

public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")){
            return true;
        }
        else {
            return false;
        }

    }

    private String getUserInput(){
        String answer = null;

        System.out.println("Would you like milk and sugar with your coffee (y/n)?");

        /*
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.out.println("IO error trying to read your answer");
        }
        */
        answer = "yes";

        if (answer == null){
            return "no";
        }

        return answer;
    }

}
