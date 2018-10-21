class Chick implements Animal//implements Animal 
{
  private String myType;
  private String mySound;
  public Chick(String type, String sound, String sound2){
    int r = (int)(Math.random()*2);
    if(r == 1){
      mySound = sound;
    }else if(r == 0){
      mySound = sound2;
    }
    myType = type;
    //mySound = sound;
  }
  public Chick(){
    myType = "unknown";
    mySound = "unknown";
  }
  public String getSound(){
    return mySound;
  }
  public String getType(){
    return myType;
  }
}
