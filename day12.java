class Student extends Person{
	private int[] testScores;
    
    public Student(String firstName, String lastName, int id, int [] scores){
        super(firstName, lastName, id);
        this.testScores = scores;

    }
    
    public char calculate(){
        int sum = 0;
        for (int score : testScores){
            sum += score;
        }
        double avg = sum/testScores.length;
        char ans;
        if (avg >= 90 && avg <= 100){
            ans = 'O';
        } else if (avg >= 80 && avg < 90){
            ans = 'E';
        } else if (avg >= 70 && avg < 80){
            ans = 'A';            
        } else if (avg >= 55 && avg < 70){
            ans = 'P';            
        } else if (avg >= 40 && avg < 55){
            ans = 'D';
        } else {
            ans = 'T';
        }
        
        return ans;
    }
   
}
