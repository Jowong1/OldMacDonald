class Farm 
{     
  //Cow[] theFarm = new Cow[6];
  //for(int i = 0; i < 5; i++){
  //  theFarm[i] = new Cow();
  //}
  //for(int i = 0; i < 5; i++){
  //  theFarm[i].feed();
  //}
  //theFarm[5] = new Pig();
  private Animal[] aBunchOfAnimals = new Animal[3];
  public Farm(){
    aBunchOfAnimals[0] = new NamedCow("cow", "Elsie", "moo");
    aBunchOfAnimals[1] = new Chick("chick", "cluck", "cheep");
    aBunchOfAnimals[2] = new Pig("pig","oink");
  }
  public void animalSounds(){
    for(int i = 0; i < aBunchOfAnimals.length; i++){
      System.out.println(aBunchOfAnimals[i].getType() + " goes " + aBunchOfAnimals[i].getSound());
    }
    System.out.println("The cow is known as " + ((NamedCow)aBunchOfAnimals[0]).getNamee());
  }
}
