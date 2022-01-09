import java.util.Scanner;

public class TestConjugaisonIndicatif {
    public static void main(String[] args) {
        int lengthArgs = args.length;
        if (lengthArgs == 0) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Veuillez donner le verbe que vous souhaiter conjuguer : ");
            String verbe = sc.nextLine();
            ConjugaisonIndicatif conjugaison = new ConjugaisonIndicatif(verbe);
            String temps = "";
            do {
                System.out.print("Veuillez spécifier le temps(indicatif) : ");
                temps = sc.nextLine();
            } while (!temps.equals("present") && !temps.equals("passe") && !temps.equals("futur") && !temps.equals("imparfait") && !temps.isEmpty());
            switch (temps) {
                case "present" : {
                    System.out.println("---------------------------Présent---------------------------");
                    conjugaison.present();
                    System.out.println("-------------------------------------------------------------");
                    break;
                }
                case "passe" : {
                    System.out.println("---------------------------Passé---------------------------");
                    conjugaison.passe();
                    System.out.println("-----------------------------------------------------------");
                    break;
                }
                case "futur" : {
                    System.out.println("---------------------------Futur---------------------------");
                    conjugaison.futur();
                    System.out.println("-----------------------------------------------------------");
                    break;
                }
                case "imparfait" : {
                    System.out.println("---------------------------Imparfait---------------------------");
                    conjugaison.imparfait();
                    System.out.println("---------------------------------------------------------------");
                    break;
                }
                case "" : {
                    System.out.println("--------------------------Présent---------------------------");
                    conjugaison.present();
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("---------------------------Passé---------------------------");
                    conjugaison.passe();
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("---------------------------Futur---------------------------");
                    conjugaison.futur();
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("---------------------------Imparfait---------------------------");
                    conjugaison.imparfait();
                    System.out.println("---------------------------------------------------------------");
                    break;
                }
            }

        } else if (lengthArgs == 1) {
            if (args[0].equals("-h"))   help();
            else    wrongArguments();
        } else if (lengthArgs == 2 ) {
            if (args[0].equals("-v")) {
                ConjugaisonIndicatif conjugaison = new ConjugaisonIndicatif(args[1]);
                System.out.println("---------------------------Présent---------------------------");
                conjugaison.present();
                System.out.println("-------------------------------------------------------------");

                System.out.println("---------------------------Passé---------------------------");
                conjugaison.passe();
                System.out.println("-----------------------------------------------------------");

                System.out.println("---------------------------Futur---------------------------");
                conjugaison.futur();
                System.out.println("-----------------------------------------------------------");

                System.out.println("---------------------------Imparfait---------------------------");
                conjugaison.imparfait();
                System.out.println("---------------------------------------------------------------");
            } else  wrongArguments();
        } else if (lengthArgs == 4) {
            if (!args[0].equals("-v") || !args[2].equals("-t"))
                wrongArguments();
            switch (args[3]) {
                case "present" : {
                    System.out.println("---------------------------Présent---------------------------");
                    ConjugaisonIndicatif conjugaison = new ConjugaisonIndicatif(args[1]);
                    conjugaison.present();
                    System.out.println("-------------------------------------------------------------");
                    break;
                }
                case "passe" : {
                    System.out.println("---------------------------Passé---------------------------");
                    ConjugaisonIndicatif conjugaison = new ConjugaisonIndicatif(args[1]);
                    conjugaison.passe();
                    System.out.println("-----------------------------------------------------------");
                    break;
                }
                case "futur" : {
                    System.out.println("---------------------------Futur---------------------------");
                    ConjugaisonIndicatif conjugaison = new ConjugaisonIndicatif(args[1]);
                    conjugaison.futur();
                    System.out.println("-----------------------------------------------------------");
                    break;
                }
                case "imparfait" : {
                    System.out.println("---------------------------Imparfait---------------------------");
                    ConjugaisonIndicatif conjugaison = new ConjugaisonIndicatif(args[1]);
                    conjugaison.imparfait();
                    System.out.println("---------------------------------------------------------------");
                    break;
                }
                default : {
                    System.out.println("\tTemps inconnu : veuillez spécifier un temps de l'indicatif !");
                    break;
                }
            }
        } else  wrongArguments();
    }

    public static void help() {
        System.out.println("\tLe verbe doit être un verbe du premier groupe : c'est à dire se terminant par 'er' et le temps doit être un temps de l'indicatif à savoir le present, le passe, le futur et l'imparfait !!!");
        System.exit(0);
    }

    public static void wrongArguments() {
        System.out.println("\tNombre ou format d'arguments invalides !");
        System.exit(0);
    }
}
