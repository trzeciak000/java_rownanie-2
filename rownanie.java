class rownanie{
  public static void main (String[] args){
    int f = 1;

    for(int i = 0; i < args.length; i++){
      f++;
      try{
        Double.parseDouble(args[i]);
      } catch (NumberFormatException e){
        System.out.println("arg " + (i+1) + " nie jest double.");
        System.exit(0);
      }
    }

  if(f > 4 || f == 1 || f == 2 || f == 3){
    System.out.println("Podaj dokladnie 3 argumenty typu double: a b c. b i c mogą być równe 0.");
    System.exit(0);
  }

  dane dane1 = new dane();
  dane1.a = Double.parseDouble(args[0]);
  dane1.b = Double.parseDouble(args[1]);
  dane1.c = Double.parseDouble(args[2]);
  dane1.obliczDelta(dane1.a, dane1.b, dane1.c);

  dane1.oblicz(dane1.a, dane1.b, dane1.delta);

}
}
