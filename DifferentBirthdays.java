public class DifferentBirthdays{

    public static void main(String[] args) {
        
        int [] encountered = new int[365];
        int differentBday = 0;
        
        for(int i = 0; i < 365; i++){

            int birthday = (int)(Math.random() * 365);
            System.out.println("birthday " + birthday);

            /*the next line of code tells us if it is the first time we encountered that index (birthday) or not
            if it is (0 means we have not encountered that number before. it is the initial value of the array),
            then we increment differentBday because we have found 1 different number

            example, 3,3,2,4
            encountered[3] (january 4th) -->  how many time = 1  -->  diiferentBday = 1
            encountered[3] (january 4th) -->  how many time = 2  -->  diiferentBday = 1
            encountered[2] (january 3th) -->  how many time = 1  -->  diiferentBday = 2
            encountered[4] (january 5th) -->  how many time = 1  -->  diiferentBday = 3
            therefore encountered [] has 3 different birthdays
             */
            if (encountered[birthday] == 0){
                differentBday++;
            }
            //count the amount of times a certain number came out (refer to ThreeSameBIrthday.java)
            encountered[birthday]++;
        }
        System.out.println("there are " + differentBday + " people with different birthdays");
    }
}