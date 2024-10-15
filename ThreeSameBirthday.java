public class ThreeSameBirthday{

    public static void main(String[] args) {

        int [] encountered = new int[365];

        for(int i = 0; i < 365; i++){

            int birthday = (int)(Math.random() * 365); //generates a random day, for instance 5
            System.out.println("birthday " + birthday); 
            /*the next line of code becomes encountered[5], 5 represents the index of the array
            and the index of that array represent a specific day, in our example index 5 of the
            array means january 6. in index 5, we have encountered once therefore we increment
            that index by 1
            example 3,4,3,5,3
            encountered[3] --> [0,0,0,1,0,0]
            encountered[4] --> [0,0,0,1,1,0]
            encountered[3] --> [0,0,0,2,1,0]
            encountered[5] --> [0,0,0,1,1,1]
            encountered[3] --> [0,0,0,3,1,1] --> therefore index 3 (january 2) came out 3 times
            */
            encountered[birthday]++;

            if ( encountered[birthday] == 3){
                
                System.out.println("it took " + ++i + " tries to find 3 of the same birthday");
                return;
            }
        }
        System.out.println("there is no 3 of the same birthdays");
    }
}