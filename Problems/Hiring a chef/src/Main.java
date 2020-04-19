// Posted from EduTools plugin
//put imports you need here

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String name = scn.next();
    scn.next();
    scn.next();
    scn.next();
    String cus = scn.next();
    System.out.println("The form for " + name + " is completed. We will contact you if we need a chef that cooks " + cus + " dishes.");
  }
}
