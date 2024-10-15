public class AllNumberOfYear{

    public static void main(String[] args) {
        
        int [] encountered = new int[365];
        int differentBday = 0;
        int differentPeople = 0;
        
        /*loop to run all 365 unique birthdays
        The number of iterations is determined by the condition that all 365 unique birthdays must be found,
        but you don't know ahead of time how many random birthdays it will take to achieve that.*/
        while(differentBday < 365){

            int birthday = (int)(Math.random() * 365);
            System.out.println("birthday " + birthday);

            //start counting how many people we had to count to find all 365 unique birthdays
            differentPeople++;

            //count how many different birthdays we have encountered (refer to DifferentBirthdays.java)
            if (encountered[birthday] == 0){
                differentBday++;
            }
            //count the amount of times a certain number came out (refer to ThreeSameBIrthday.java)
            encountered[birthday]++;
        }
        System.out.println("it took " + differentPeople + " people to find all 365 days of different birthdays");
    }
}