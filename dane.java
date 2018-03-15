class dane{
  double a;
  double b;
  double c;
  double delta;
  double x1;
  double x2;

  public double obliczDelta(double a, double b, double c){
    delta = b*b - (4*a*c);
    return delta;
  }

  public double oblicz(double a, double b, double delta){
    if (a == 0){
      System.out.println("a nie może być 0.");
      System.exit(0);
    }
    if(delta > 0){
      x1 = (-b+Math.sqrt(delta))/(-2*a);
      x2 = (-b-Math.sqrt(delta))/(-2*a);
      System.out.println("Równanie ma dwa rozwiązania.");
      System.out.println("x1 = " + x1);
      System.out.println("x2 = " + x2);
    }
    else if (delta == 0){
      x1 = (-b)/(-2*a);
      System.out.println("Równanie ma jedno rozwiązanie.");
      System.out.println("x = " + x1);
    }
    else if (delta < 0){
      System.out.println("Brak rozwiązań.");
  }
  return 0;
}

}
