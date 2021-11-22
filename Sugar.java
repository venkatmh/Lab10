class Sugar extends Cookie{
  //instance variables
  private String shape;
  private boolean decorated;

  public Sugar(){
    super();
    shape = "";
    decorated = false;
  }

  public Sugar(String ashape){
    shape = ashape;
    decorated = false;
  }

  String getShape()
  {
    return shape;
  }

  void setShape(String ashape)
  {
    shape = ashape;
  }

  void cutShape(String ashape, int anum){
    shape = ashape;
    super.number(anum);

    System.out.println(anum + " cookies were cut into " + ashape);
  }

  void decorate(){
    if(super.isReady() == true){
    System.out.println("The cookies were decorated");
    }else{
      System.out.println("Make sure to bake the cookies first");
    }
  }
}