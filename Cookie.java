class Cookie {
    //instance variables
    int count;
    int temp;
    int minutes;
    boolean baked;

    //constructors
    Cookie(){
      count = 0;
      temp = 0;
      minutes = 0;
      baked = false;
    }

    Cookie(int number, int bakeTemp, int bakeTime){
      count = number;
      temp = bakeTemp;
      minutes = bakeTime;
      baked = false;
    }

    //accessor
    boolean isReady(){
      return baked;
    }

    //mutator
    void number(int anum){
      count = anum;
    }

    //bake
    void bake(int bakeTemp, int bakeTime){
      System.out.println(count + " cookies were baked at " + bakeTemp + " degrees F for " + bakeTime + " minutes");
      baked = true;
    }
}