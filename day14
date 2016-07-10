	// Add your code here
    public Difference(int [] elements){
        this.elements = elements;
    }

    public void computeDifference(){
        int maximumDifference = 0;
        for (int i = 0; i < elements.length; i++){
            for (int j = 0; j < elements.length; j++){
                int difference = Math.abs(elements[i] - elements[j]);   
                if (difference > maximumDifference){
                    maximumDifference = difference;
                }
            }
        }
        this.maximumDifference = maximumDifference;
    }
